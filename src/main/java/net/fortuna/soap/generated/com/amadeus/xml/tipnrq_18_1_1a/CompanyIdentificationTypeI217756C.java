
package net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code or name to identify a company and any associated companies.
 * 
 * <p>Java class for CompanyIdentificationTypeI_217756C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationTypeI_217756C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketingCompany" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="operatingCompany" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationTypeI_217756C", propOrder = {
    "marketingCompany",
    "operatingCompany"
})
public class CompanyIdentificationTypeI217756C {

    protected String marketingCompany;
    protected String operatingCompany;

    /**
     * Gets the value of the marketingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCompany() {
        return marketingCompany;
    }

    /**
     * Sets the value of the marketingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCompany(String value) {
        this.marketingCompany = value;
    }

    /**
     * Gets the value of the operatingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * Sets the value of the operatingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCompany(String value) {
        this.operatingCompany = value;
    }

}
