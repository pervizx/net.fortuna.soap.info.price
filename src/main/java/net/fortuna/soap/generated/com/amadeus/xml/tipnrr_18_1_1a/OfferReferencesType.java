
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * convey offer references
 * 
 * <p>Java class for OfferReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerIdentifier" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}OfferType"/>
 *         &lt;element name="references" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}ReferenceInfoType_218150S" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferReferencesType", propOrder = {
    "offerIdentifier",
    "references"
})
public class OfferReferencesType {

    @XmlElement(required = true)
    protected OfferType offerIdentifier;
    protected List<ReferenceInfoType218150S> references;

    /**
     * Gets the value of the offerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getOfferIdentifier() {
        return offerIdentifier;
    }

    /**
     * Sets the value of the offerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setOfferIdentifier(OfferType value) {
        this.offerIdentifier = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the references property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType218150S }
     * 
     * 
     */
    public List<ReferenceInfoType218150S> getReferences() {
        if (references == null) {
            references = new ArrayList<ReferenceInfoType218150S>();
        }
        return this.references;
    }

}
