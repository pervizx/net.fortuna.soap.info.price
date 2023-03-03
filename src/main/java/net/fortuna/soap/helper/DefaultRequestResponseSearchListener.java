/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fortuna.soap.helper;

import net.fortuna.common.enums.MediaFormat;

public class DefaultRequestResponseSearchListener implements RequestResponseListener, Cloneable{
    private String uuid;
    private String sessionId;
    private String requestTimeUtc;
    private String request;
    private String response;
    private MediaFormat format;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String getUUID() {
        return uuid;
    }

    @Override
    public MediaFormat getFormat() {
        return format;
    }

    @Override
    public String getRequestTimeUtc() {
        return requestTimeUtc;
    }

    @Override
    public String getRequest(){
        return request;
    }

    @Override
    public String getResponse(){
        return response;
    }

    @Override
    public void setRequest(String xml) {
        this.request = xml;
    }

    @Override
    public void setResponse(String xml) {
        this.response = xml;
    }

    @Override
    public void setRequestTimeUTC(String timeStamp) {
        this.requestTimeUtc = timeStamp;
    }

    @Override
    public void setUUID(String id) {
        this.uuid = id;
    }

    @Override
    public void setFormat(MediaFormat format) {
        this.format = format;
    }

}
