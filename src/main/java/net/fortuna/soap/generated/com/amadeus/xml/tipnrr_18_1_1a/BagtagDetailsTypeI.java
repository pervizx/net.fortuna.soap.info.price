
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * To identify baggage by company identification, serial numbers, and destination.
 * 
 * <p>Java class for BagtagDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagtagDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="company" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="number" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="companyNumber" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="characteristic" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="specialRequirement" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="measurement" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}NumericInteger_Length1To18" minOccurs="0"/>
 *         &lt;element name="unitQualifier" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagtagDetailsTypeI", propOrder = {
    "company",
    "identifier",
    "number",
    "location",
    "companyNumber",
    "indicator",
    "characteristic",
    "specialRequirement",
    "measurement",
    "unitQualifier",
    "description"
})
public class BagtagDetailsTypeI {

    protected String company;
    protected String identifier;
    protected BigInteger number;
    protected String location;
    protected String companyNumber;
    protected String indicator;
    protected String characteristic;
    protected String specialRequirement;
    protected BigInteger measurement;
    protected String unitQualifier;
    protected String description;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristic() {
        return characteristic;
    }

    /**
     * Sets the value of the characteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristic(String value) {
        this.characteristic = value;
    }

    /**
     * Gets the value of the specialRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirement() {
        return specialRequirement;
    }

    /**
     * Sets the value of the specialRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirement(String value) {
        this.specialRequirement = value;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurement(BigInteger value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the unitQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /**
     * Sets the value of the unitQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitQualifier(String value) {
        this.unitQualifier = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
