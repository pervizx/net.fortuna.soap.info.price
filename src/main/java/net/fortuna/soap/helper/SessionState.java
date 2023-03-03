package net.fortuna.soap.helper;

public class SessionState implements Cloneable {
    private String sessionId = null;
    private String sequenceNumber = null;
    private String securityToken = null;
    private String soapAction = null;
    private String officeId = null;
    private String uuid = null; //if uuid is null or empty string method will generate the new uuid, if set it'll use em
    private int poolSize;
    private RequestResponseListener requestResponseListenerSearch;
    private boolean keepSessionAlive = false;
    private boolean sessionAlive = false;

    public SessionState(String id, String sequenceNumber, String token) {
        this.sessionId = id;
        this.sequenceNumber = sequenceNumber;
        this.securityToken = token;
    }

    public SessionState(String officeId, String soapAction) {
        this.officeId = officeId;
        this.soapAction = soapAction;
    }

    public SessionState(String officeId) {
        this.officeId = officeId;
    }

    public SessionState() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SessionState cloned = (SessionState) super.clone();
        cloned.setRequestResponseListener((RequestResponseListener) ((DefaultRequestResponseSearchListener) cloned.getRequestResponseListener()).clone());
        return cloned;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getSoapAction() {
        return soapAction;
    }

    // it will be set inside of Amadhelper, but not by caller
    public void setSoapAction(String soapAction) {
        this.soapAction = soapAction;
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public boolean isKeepSessionAlive() {
        return keepSessionAlive;
    }

    public void setKeepSessionAlive(boolean keepSessionAlive) {
        this.keepSessionAlive = keepSessionAlive;
    }

    public RequestResponseListener getRequestResponseListener() {
        return requestResponseListenerSearch;
    }

    public void setRequestResponseListener(RequestResponseListener requestResponseListenerSearch) {
        this.requestResponseListenerSearch = requestResponseListenerSearch;
    }

    public void setSessionAlive(boolean sessionAlive) {
        this.sessionAlive = sessionAlive;
    }

    // thes field can't be changed outside of HeaderHandlerAuth.handleMessage
    public boolean isSessionAlive() {
        return sessionAlive;
    }
}

