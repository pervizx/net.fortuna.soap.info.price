
package net.fortuna.soap.generated.com.amadeus.xml._2010._06.types_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of errors that occurred during the processing of a message.
 * 
 * <p>Java class for GenericErrorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericErrorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://xml.amadeus.com/2010/06/Types_v1}ErrorsType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}Errors" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/2007/00/IATA2010.1}Errors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericErrorsType", propOrder = {
    "content"
})
public class GenericErrorsType {

    @XmlElementRefs({
        @XmlElementRef(name = "Errors", namespace = "http://xml.amadeus.com/2010/06/Types_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Errors", namespace = "http://www.iata.org/IATA/2007/00/IATA2010.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Errors", namespace = "http://www.opentravel.org/OTA/2003/05/OTA2010B", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Errors" is used by two different parts of a schema. See: 
     * line 151 of file:/D:/Azal/projects/New_folder/net.fortuna.soap/src/main/resources/wsdl/booking/AMA/2011Y/AMA_CommonTypes_Proxy.xsd
     * line 150 of file:/D:/Azal/projects/New_folder/net.fortuna.soap/src/main/resources/wsdl/booking/AMA/2011Y/AMA_CommonTypes_Proxy.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link net.fortuna.soap.generated.org.iata.iata._2007._00.iata2010.ErrorsType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.fortuna.soap.generated.org.opentravel.ota._2003._05.ota2010b.ErrorsType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.fortuna.soap.generated.com.amadeus.xml._2010._06.types_v1.ErrorsType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
