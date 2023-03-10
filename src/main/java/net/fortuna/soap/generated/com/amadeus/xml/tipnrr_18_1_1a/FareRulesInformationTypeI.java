
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * To specify the tariff, fare supplier, and paragraph number for a fare rule.
 * 
 * <p>Java class for FareRulesInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRulesInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffClassId" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *         &lt;element name="ruleSectionId" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}AlphaNumericString_Length1To7" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRulesInformationTypeI", propOrder = {
    "tariffClassId",
    "companyDetails",
    "ruleSectionId"
})
public class FareRulesInformationTypeI {

    protected String tariffClassId;
    protected CompanyIdentificationTypeI companyDetails;
    protected List<String> ruleSectionId;

    /**
     * Gets the value of the tariffClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffClassId() {
        return tariffClassId;
    }

    /**
     * Sets the value of the tariffClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffClassId(String value) {
        this.tariffClassId = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the ruleSectionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleSectionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleSectionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRuleSectionId() {
        if (ruleSectionId == null) {
            ruleSectionId = new ArrayList<String>();
        }
        return this.ruleSectionId;
    }

}
