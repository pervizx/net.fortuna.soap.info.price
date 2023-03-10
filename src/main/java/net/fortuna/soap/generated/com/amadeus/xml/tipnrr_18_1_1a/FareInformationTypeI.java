
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * To specify fare details.
 * 
 * <p>Java class for FareInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueQualifier" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="value" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}FareDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="identityNumber" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="fareTypeGrouping" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}FareTypeGroupingInformationTypeI" minOccurs="0"/>
 *         &lt;element name="rateCategory" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To35" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInformationTypeI", propOrder = {
    "valueQualifier",
    "value",
    "fareDetails",
    "identityNumber",
    "fareTypeGrouping",
    "rateCategory"
})
public class FareInformationTypeI {

    protected String valueQualifier;
    protected BigInteger value;
    protected FareDetailsTypeI fareDetails;
    protected String identityNumber;
    protected FareTypeGroupingInformationTypeI fareTypeGrouping;
    protected List<String> rateCategory;

    /**
     * Gets the value of the valueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueQualifier() {
        return valueQualifier;
    }

    /**
     * Sets the value of the valueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueQualifier(String value) {
        this.valueQualifier = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsTypeI }
     *     
     */
    public FareDetailsTypeI getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsTypeI }
     *     
     */
    public void setFareDetails(FareDetailsTypeI value) {
        this.fareDetails = value;
    }

    /**
     * Gets the value of the identityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * Sets the value of the identityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityNumber(String value) {
        this.identityNumber = value;
    }

    /**
     * Gets the value of the fareTypeGrouping property.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeGroupingInformationTypeI }
     *     
     */
    public FareTypeGroupingInformationTypeI getFareTypeGrouping() {
        return fareTypeGrouping;
    }

    /**
     * Sets the value of the fareTypeGrouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeGroupingInformationTypeI }
     *     
     */
    public void setFareTypeGrouping(FareTypeGroupingInformationTypeI value) {
        this.fareTypeGrouping = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRateCategory() {
        if (rateCategory == null) {
            rateCategory = new ArrayList<String>();
        }
        return this.rateCategory;
    }

}
