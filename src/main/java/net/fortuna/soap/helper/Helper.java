/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fortuna.soap.helper;

import java.io.StringWriter;
import java.time.Instant;
import java.util.logging.Level;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Helper {
    private static Helper helperSearch = null;
    private Transformer transformer;
    private SimpleLogger logger = null;
   
    public static Helper getInstance(SimpleLogger logger) throws TransformerConfigurationException {
        if (helperSearch ==null) helperSearch = new Helper(logger);
        return helperSearch;
    }
    
    private Helper(SimpleLogger logger) throws TransformerConfigurationException {
        this.transformer = TransformerFactory.newInstance().newTransformer();
        this.logger = logger;
    }
    
    public String currentTimeInUtc() {
         return Instant.now().toString().replaceAll("\\.\\d\\d\\dZ", "Z");
    }
    
    public String parseXmlToString(SOAPMessage soapMessage) {
        try {
            if ( soapMessage==null || soapMessage.getSOAPPart()==null)
                return null;

            StringWriter sw = new StringWriter();            
            transformer.transform(
                    new DOMSource(soapMessage.getSOAPPart()),
                    new StreamResult(sw));
            return (sw!=null) ?sw.toString().replace("&lt;", "<").replace("&gt;", ">") : null;
        } catch (TransformerException e) {
            logger.logStack(e);
            logger.flush(Level.SEVERE);
        }
        return null;
    }
}
