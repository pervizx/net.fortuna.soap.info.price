
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a selected option and associated information.
 * 
 * <p>Java class for SelectionDetailsInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="option" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="optionInformation" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsInformationTypeI", propOrder = {
    "option",
    "optionInformation"
})
public class SelectionDetailsInformationTypeI {

    @XmlElement(required = true)
    protected String option;
    protected String optionInformation;

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption(String value) {
        this.option = value;
    }

    /**
     * Gets the value of the optionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionInformation() {
        return optionInformation;
    }

    /**
     * Sets the value of the optionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionInformation(String value) {
        this.optionInformation = value;
    }

}
