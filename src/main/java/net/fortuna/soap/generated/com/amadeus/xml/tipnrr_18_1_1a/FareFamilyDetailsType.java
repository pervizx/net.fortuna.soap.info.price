
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * NEW FARE SEARCH
 * 
 * <p>Java class for FareFamilyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commercialFamily" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To30"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyDetailsType", propOrder = {
    "commercialFamily"
})
public class FareFamilyDetailsType {

    @XmlElement(required = true)
    protected String commercialFamily;

    /**
     * Gets the value of the commercialFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialFamily() {
        return commercialFamily;
    }

    /**
     * Sets the value of the commercialFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialFamily(String value) {
        this.commercialFamily = value;
    }

}
