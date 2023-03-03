
package net.fortuna.soap.generated.com.amadeus.wsdl._2010._06.ws.link_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the server
 * 
 * <p>Java class for ReceiverType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServerID" type="{http://wsdl.amadeus.com/2010/06/ws/Link_v1}UniqueIdType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverType", propOrder = {
    "serverID"
})
public class ReceiverType {

    @XmlElement(name = "ServerID", required = true)
    protected String serverID;

    /**
     * Gets the value of the serverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerID() {
        return serverID;
    }

    /**
     * Sets the value of the serverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerID(String value) {
        this.serverID = value;
    }

}
