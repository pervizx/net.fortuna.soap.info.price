package net.fortuna.soap.configuration;

import net.fortuna.soap.helper.SessionState;
import org.springframework.ws.FaultAwareWebServiceMessage;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.support.MarshallingUtils;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.TransformerException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

public class SoapMessageExtractor implements WebServiceMessageExtractor<Object> {

    private final WebServiceTemplate webServiceTemplate;

    private final SessionState sessionStateSearch;

    public SoapMessageExtractor(WebServiceTemplate webServiceTemplate, SessionState sessionStateSearch) {
        this.webServiceTemplate = webServiceTemplate;
        this.sessionStateSearch = sessionStateSearch;
    }

    @Override
    public Object extractData(WebServiceMessage response) throws IOException, TransformerException {
        try {
            if (webServiceTemplate.getUnmarshaller() == null) {
                throw new IllegalStateException("No unmarshaller registered. Check configuration of WebServiceTemplate.");
            }

            String uuid = getMessageId(sessionStateSearch); // I must call getMessageId() to provide uuid if it is not set
            // add response only if it's the same request
            // I use uuid to prevent erroneous data in case of service call collision
            if (sessionStateSearch.getRequestResponseListener() != null && uuid.equals(sessionStateSearch.getRequestResponseListener().getUUID())) {
                sessionStateSearch.getRequestResponseListener().setResponse(getXml(response));
            }

            SoapMessage soapMessage = (SoapMessage) response;
            soapMessage.setSoapAction(sessionStateSearch.getSoapAction());
            SOAPMessage soapSaajMessage = ((SaajSoapMessage) response).getSaajMessage();
            soapSaajMessage.setContentDescription("text/xml;charset=UTF-8");
            SOAPHeader header = soapSaajMessage.getSOAPHeader();
            // SessionId, SequenceNumber, SecurityToken returns with any method
            if (header.getChildNodes().getLength() > 0) {
                NodeList nList = header.getChildNodes();
                Node sessionNode = null;
                for (int i = 0; i < nList.getLength(); i++) {
                    if (nList.item(i).getLocalName().equalsIgnoreCase("Session")) {
                        sessionNode = nList.item(i);
                        break;
                    }
                }
                if (sessionNode != null) {
                    NamedNodeMap attributes = sessionNode.getAttributes();
                    Node transactionStatus = attributes.getNamedItem("TransactionStatusCode");
                    if (transactionStatus != null && transactionStatus.getNodeValue() != null) {
                        sessionStateSearch.setSessionAlive(transactionStatus.getNodeValue().equals("InSeries"));
                        if (sessionStateSearch.isSessionAlive())
                            sessionStateSearch.setKeepSessionAlive(true); // but keepSessionAlive is not equal to sessionAlive
                    }
                    NodeList childNodes = sessionNode.getChildNodes();
                    if (childNodes != null && childNodes.getLength() > 0) {
                        for (int i = 0; i < childNodes.getLength(); i++) {
                            Node node = childNodes.item(i);
                            if (node.getNodeName().contains("SessionId")) {
                                sessionStateSearch.setSessionId(node.getTextContent());
                            } else if (node.getNodeName().contains("SequenceNumber")) {
                                sessionStateSearch.setSequenceNumber(node.getTextContent());
                            } else if (node.getNodeName().contains("SecurityToken")) {
                                sessionStateSearch.setSecurityToken(node.getTextContent());
                            }
                        }
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (hasFault(response)) {
            throw new SoapFaultClientException((SoapMessage) response);
        } else {
            return MarshallingUtils.unmarshal(webServiceTemplate.getUnmarshaller(), response);
        }
    }

    private String getMessageId(SessionState ss) {
        if (ss == null) return null;
        if (ss.getUuid() == null || ss.getUuid().trim().isEmpty())
            ss.setUuid(UUID.randomUUID().toString());
        return ss.getUuid();
    }

    private String getXml(WebServiceMessage message) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        message.writeTo(buffer);
        String payload = buffer.toString(java.nio.charset.StandardCharsets.UTF_8.name());
        return payload;
    }

    protected boolean hasFault(final WebServiceMessage response) {
        if (response instanceof FaultAwareWebServiceMessage) {
            FaultAwareWebServiceMessage faultMessage = (FaultAwareWebServiceMessage) response;
            return faultMessage.hasFault();
        }
        return false;
    }
}
