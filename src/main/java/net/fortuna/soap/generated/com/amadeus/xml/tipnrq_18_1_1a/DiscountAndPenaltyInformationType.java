
package net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DiscountAndPenaltyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountPenaltyQualifier" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="discountPenaltyDetails" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}DiscountPenaltyMonetaryInformationType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationType", propOrder = {
    "discountPenaltyQualifier",
    "discountPenaltyDetails"
})
public class DiscountAndPenaltyInformationType {

    protected String discountPenaltyQualifier;
    protected List<DiscountPenaltyMonetaryInformationType> discountPenaltyDetails;

    /**
     * Gets the value of the discountPenaltyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPenaltyQualifier() {
        return discountPenaltyQualifier;
    }

    /**
     * Sets the value of the discountPenaltyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPenaltyQualifier(String value) {
        this.discountPenaltyQualifier = value;
    }

    /**
     * Gets the value of the discountPenaltyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountPenaltyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountPenaltyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountPenaltyMonetaryInformationType }
     * 
     * 
     */
    public List<DiscountPenaltyMonetaryInformationType> getDiscountPenaltyDetails() {
        if (discountPenaltyDetails == null) {
            discountPenaltyDetails = new ArrayList<DiscountPenaltyMonetaryInformationType>();
        }
        return this.discountPenaltyDetails;
    }

}
