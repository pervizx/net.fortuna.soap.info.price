package net.fortuna.soap.configuration;

import net.fortuna.common.enums.MediaFormat;
import net.fortuna.soap.helper.DefaultRequestResponseSearchListener;
import net.fortuna.soap.helper.RequestResponseListener;
import net.fortuna.soap.helper.ServiceProperties;
import net.fortuna.soap.helper.SessionState;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.support.MarshallingUtils;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class SoapHeaderManager implements WebServiceMessageCallback {

    private static final String NS_ADDRESSING = "http://www.w3.org/2005/08/addressing";
    private static final String NS_SECURITY = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final String NS_USERNAME_TOKEN = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
    private static final String NS_ENCODING_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary";
    private static final String NS_PASSWORD_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest";
    private static final String NS_CREATED = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
    private static final String NS_SECURITY_HOSTED_USER = "http://xml.amadeus.com/2010/06/Security_v1";

    SessionState sessionStateSearch;

    private ServiceProperties properties;

    private Object requestPayload;

    private WebServiceTemplate webServiceTemplate;

    public SoapHeaderManager(SessionState sessionStateSearch, ServiceProperties properties, Object requestPayload, WebServiceTemplate webServiceTemplate, boolean listenRequestResponse) {
        this.sessionStateSearch = sessionStateSearch;
        this.properties = properties;
        this.requestPayload = requestPayload;
        this.webServiceTemplate = webServiceTemplate;
        if (listenRequestResponse) {
            RequestResponseListener listener = new DefaultRequestResponseSearchListener();
            sessionStateSearch.setRequestResponseListener(listener);
        }
    }

    public SoapHeaderManager(SessionState sessionStateSearch, ServiceProperties properties, boolean listenRequestResponse) {
        this.sessionStateSearch = sessionStateSearch;
        this.properties = properties;
        if (listenRequestResponse) {
            RequestResponseListener listener = new DefaultRequestResponseSearchListener();
            sessionStateSearch.setRequestResponseListener(listener);
        }
    }

    @Override
    public void doWithMessage(WebServiceMessage message) {
        try {
            if (requestPayload != null) {
                if (webServiceTemplate.getMarshaller() == null) {
                    throw new IllegalStateException("No marshaller registered. Check configuration of WebServiceTemplate.");
                }
                MarshallingUtils.marshal(webServiceTemplate.getMarshaller(), requestPayload, message);
            }

            SoapMessage soapMessage = (SoapMessage) message;
            soapMessage.setSoapAction(properties.getSoapAction(sessionStateSearch.getSoapAction()));
            SOAPMessage soapSaajMessage = ((SaajSoapMessage) message).getSaajMessage();
            soapSaajMessage.setContentDescription("text/xml;charset=UTF-8");
            SOAPHeader header = soapSaajMessage.getSOAPHeader();
            String sessionDescription = null;


            if (sessionStateSearch.isKeepSessionAlive()) {
                sessionDescription = (sessionStateSearch.isSessionAlive()) ? "InSeries" : "Start";
            } else {
                if (sessionStateSearch.isSessionAlive())
                    sessionDescription = "End";
            }
            if (!sessionStateSearch.isSessionAlive() &&  (!sessionStateSearch.isKeepSessionAlive() || "Start".equals(sessionDescription))) { // means stateless or statefull with TransactionStatusCode="Start"
                // I use equal method of "Start", not sessionDescription, because sessionDescription can be null

                String timeStamp = currentTimeInUtc();
                byte[] nonce = generateNonce();
                String nonce64 = base64(nonce);
                String encryptedPwd;

                encryptedPwd = encryptPassword(properties.getPassword(), timeStamp, nonce);

                header.addChildElement(new QName(NS_ADDRESSING, "MessageID"))
                        .addTextNode(getMessageId(sessionStateSearch));
                header.addChildElement(new QName(NS_ADDRESSING, "Action"))
                        .addTextNode(properties.getSoapAction(sessionStateSearch.getSoapAction()));
                header.addChildElement(new QName(NS_ADDRESSING, "To"))
                        .addTextNode(properties.getWsdl());


                SOAPElement security = header.addChildElement(new QName(NS_SECURITY, "Security"));
                SOAPElement usernameToken = security.addChildElement("UsernameToken");
                usernameToken.addAttribute(new QName(NS_USERNAME_TOKEN, "Id", "oasid"), "UsernameToken-1");
                usernameToken.addChildElement("Username")
                        .addTextNode(properties.getUserId());
                usernameToken.addChildElement("Nonce")
                        .addAttribute(new QName("EncodingType"), NS_ENCODING_TYPE)
                        .addTextNode(nonce64);
                usernameToken.addChildElement("Password")
                        .addAttribute(new QName("Type"), NS_PASSWORD_TYPE)
                        .addTextNode(encryptedPwd);
                usernameToken.addChildElement(new QName(NS_CREATED, "Created"))
                        .addTextNode(timeStamp);


                SOAPElement securityHostedUser = header.addChildElement(new QName(NS_SECURITY_HOSTED_USER, "AMA_SecurityHostedUser"));
                SOAPElement userId = securityHostedUser.addChildElement("UserID");
                userId.addAttribute(new QName("POS_Type"), "1");
                if (sessionStateSearch.getOfficeId() == null || sessionStateSearch.getOfficeId().trim().isEmpty())
                    userId.addAttribute(new QName("PseudoCityCode"), properties.getOfficeIdAzn());
                else
                    userId.addAttribute(new QName("PseudoCityCode"), sessionStateSearch.getOfficeId());
                userId.addAttribute(new QName("AgentDutyCode"), "SU");
                userId.addAttribute(new QName("RequestorType"), "U");

                TransportContext context = TransportContextHolder.getTransportContext();
                HttpUrlConnection connection = (HttpUrlConnection) context.getConnection();
                connection.addRequestHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE);
            }
            if (sessionDescription != null) {
                // this part works for Security_Authenticate, Security_SignOut and all methods
                SOAPElement session = header.addChildElement(new QName("http://xml.amadeus.com/2010/06/Session_v3", "Session"));
                session.addAttribute(new QName("TransactionStatusCode"), sessionDescription);
                if (!"Start".equals(sessionDescription) && sessionStateSearch.getSessionId() != null) {
                    session.addChildElement("SessionId").addTextNode(sessionStateSearch.getSessionId());
                    session.addChildElement("SequenceNumber").addTextNode(sessionStateSearch.getSequenceNumber());
                    session.addChildElement("SecurityToken").addTextNode(sessionStateSearch.getSecurityToken());
                }
            }
            RequestResponseListener rrListener = sessionStateSearch.getRequestResponseListener();
            if (rrListener != null) {
                rrListener.setUUID(getMessageId(sessionStateSearch));
                rrListener.setFormat(MediaFormat.XML);
                rrListener.setRequestTimeUTC(currentTimeInUtc());
                rrListener.setRequest(getXml(message));
                rrListener.setResponse(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String base64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    private byte[] sha1(byte[] arr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA1").digest(arr);
    }

    private byte[] sha1(String plainPwd) throws NoSuchAlgorithmException {
        return sha1(plainPwd.getBytes());
    }

    public byte[] generateNonce() {
        Random rnd = new Random();
        int arrSize = rnd.nextInt(17);
        byte[] randomBytes = new byte[arrSize]; // create random sized bytes array
        rnd.nextBytes(randomBytes); // fill them with random bytes
        byte[] timeBytes = String.valueOf(new Date().getTime()).getBytes();
        return ByteBuffer.allocate(randomBytes.length + timeBytes.length).put(randomBytes).put(timeBytes).array();
    }

    private String encryptPassword(String plainPwd, String timeStamp, byte[] nonce) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (plainPwd == null || plainPwd.trim().isEmpty() || nonce == null || timeStamp == null) return null;
        byte[] pwdSha1 = sha1(plainPwd);
        //String timeStamp = new Date()
        byte[] time = timeStamp.getBytes("US-ASCII");
        // concat byte arrays
        byte[] concatenated = ByteBuffer.allocate(nonce.length + time.length + pwdSha1.length).put(nonce).put(time).put(pwdSha1).array();
        return base64(sha1(concatenated));
    }

    public String currentTimeInUtc() {
        return Instant.now().toString().replaceAll("\\.\\d\\d\\dZ", "Z");
    }

    private String getXml(WebServiceMessage message) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        message.writeTo(buffer);
        String payload = buffer.toString(java.nio.charset.StandardCharsets.UTF_8.name());
        return payload;
    }

    private String getMessageId(SessionState ss) {
        if (ss == null) return null;
        if (ss.getUuid() == null || ss.getUuid().trim().isEmpty())
            ss.setUuid(UUID.randomUUID().toString());
        return ss.getUuid();
    }
}
