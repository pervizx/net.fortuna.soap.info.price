
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * To specify additional details about a particular traveller.
 * 
 * <p>Java class for SpecificTravellerDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificTravellerDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="measurementValue" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}NumericInteger_Length1To18" minOccurs="0"/>
 *         &lt;element name="firstDate" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificTravellerDetailsTypeI", propOrder = {
    "referenceNumber",
    "measurementValue",
    "firstDate",
    "surname",
    "firstName"
})
public class SpecificTravellerDetailsTypeI {

    protected String referenceNumber;
    protected BigInteger measurementValue;
    protected String firstDate;
    protected String surname;
    protected String firstName;

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the measurementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementValue() {
        return measurementValue;
    }

    /**
     * Sets the value of the measurementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementValue(BigInteger value) {
        this.measurementValue = value;
    }

    /**
     * Gets the value of the firstDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstDate() {
        return firstDate;
    }

    /**
     * Sets the value of the firstDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstDate(String value) {
        this.firstDate = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

}
