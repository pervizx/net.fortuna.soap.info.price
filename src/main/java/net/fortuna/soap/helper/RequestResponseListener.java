/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fortuna.soap.helper;


import net.fortuna.common.enums.MediaFormat;

public interface RequestResponseListener {

    String getRequestTimeUtc();

    void setRequestTimeUTC(String timeStamp);

    String getUUID();

    void setUUID(String id);

    String getRequest();

    void setRequest(String body);

    String getResponse();

    void setResponse(String body);

    MediaFormat getFormat();

    void setFormat(MediaFormat format);

}
