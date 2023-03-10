
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * To specify the conversion rate and the monetary amount.
 * 
 * <p>Java class for ConversionRateDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionType" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="pricingAmount" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="convertedValueAmount" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}NumericInteger_Length1To18" minOccurs="0"/>
 *         &lt;element name="dutyTaxFeeType" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="measurementValue" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}NumericInteger_Length1To18" minOccurs="0"/>
 *         &lt;element name="measurementSignificance" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateDetailsTypeI", propOrder = {
    "conversionType",
    "currency",
    "rateType",
    "pricingAmount",
    "convertedValueAmount",
    "dutyTaxFeeType",
    "measurementValue",
    "measurementSignificance"
})
public class ConversionRateDetailsTypeI {

    protected String conversionType;
    protected String currency;
    protected String rateType;
    protected BigDecimal pricingAmount;
    protected BigInteger convertedValueAmount;
    protected String dutyTaxFeeType;
    protected BigInteger measurementValue;
    protected String measurementSignificance;

    /**
     * Gets the value of the conversionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionType() {
        return conversionType;
    }

    /**
     * Sets the value of the conversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionType(String value) {
        this.conversionType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the pricingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingAmount() {
        return pricingAmount;
    }

    /**
     * Sets the value of the pricingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingAmount(BigDecimal value) {
        this.pricingAmount = value;
    }

    /**
     * Gets the value of the convertedValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConvertedValueAmount() {
        return convertedValueAmount;
    }

    /**
     * Sets the value of the convertedValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConvertedValueAmount(BigInteger value) {
        this.convertedValueAmount = value;
    }

    /**
     * Gets the value of the dutyTaxFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyTaxFeeType() {
        return dutyTaxFeeType;
    }

    /**
     * Sets the value of the dutyTaxFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyTaxFeeType(String value) {
        this.dutyTaxFeeType = value;
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
     * Gets the value of the measurementSignificance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSignificance() {
        return measurementSignificance;
    }

    /**
     * Sets the value of the measurementSignificance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSignificance(String value) {
        this.measurementSignificance = value;
    }

}
