
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FareComponentDtlsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentDtlsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareComponentID" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}ItemNumberType"/>
 *         &lt;element name="marketFareComponent" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}TravelProductInformationTypeI" minOccurs="0"/>
 *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}MonetaryInformationType_199044S" minOccurs="0"/>
 *         &lt;element name="componentClassInfo" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
 *         &lt;element name="fareQualifiersDetail" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}FareQualifierDetailsType" minOccurs="0"/>
 *         &lt;element name="fareFamilyDetails" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}FareFamilyType" minOccurs="0"/>
 *         &lt;element name="fareFamilyOwner" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}TransportIdentifierType" minOccurs="0"/>
 *         &lt;element name="couponDetailsGroup" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}CouponDetailsType" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentDtlsType", propOrder = {
    "fareComponentID",
    "marketFareComponent",
    "monetaryInformation",
    "componentClassInfo",
    "fareQualifiersDetail",
    "fareFamilyDetails",
    "fareFamilyOwner",
    "couponDetailsGroup"
})
public class FareComponentDtlsType {

    @XmlElement(required = true)
    protected ItemNumberType fareComponentID;
    protected TravelProductInformationTypeI marketFareComponent;
    protected MonetaryInformationType199044S monetaryInformation;
    protected PricingOrTicketingSubsequentType componentClassInfo;
    protected FareQualifierDetailsType fareQualifiersDetail;
    protected FareFamilyType fareFamilyDetails;
    protected TransportIdentifierType fareFamilyOwner;
    @XmlElement(required = true)
    protected List<CouponDetailsType> couponDetailsGroup;

    /**
     * Gets the value of the fareComponentID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberType }
     *     
     */
    public ItemNumberType getFareComponentID() {
        return fareComponentID;
    }

    /**
     * Sets the value of the fareComponentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberType }
     *     
     */
    public void setFareComponentID(ItemNumberType value) {
        this.fareComponentID = value;
    }

    /**
     * Gets the value of the marketFareComponent property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationTypeI }
     *     
     */
    public TravelProductInformationTypeI getMarketFareComponent() {
        return marketFareComponent;
    }

    /**
     * Sets the value of the marketFareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationTypeI }
     *     
     */
    public void setMarketFareComponent(TravelProductInformationTypeI value) {
        this.marketFareComponent = value;
    }

    /**
     * Gets the value of the monetaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType199044S }
     *     
     */
    public MonetaryInformationType199044S getMonetaryInformation() {
        return monetaryInformation;
    }

    /**
     * Sets the value of the monetaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType199044S }
     *     
     */
    public void setMonetaryInformation(MonetaryInformationType199044S value) {
        this.monetaryInformation = value;
    }

    /**
     * Gets the value of the componentClassInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricingOrTicketingSubsequentType }
     *     
     */
    public PricingOrTicketingSubsequentType getComponentClassInfo() {
        return componentClassInfo;
    }

    /**
     * Sets the value of the componentClassInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingOrTicketingSubsequentType }
     *     
     */
    public void setComponentClassInfo(PricingOrTicketingSubsequentType value) {
        this.componentClassInfo = value;
    }

    /**
     * Gets the value of the fareQualifiersDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareQualifierDetailsType }
     *     
     */
    public FareQualifierDetailsType getFareQualifiersDetail() {
        return fareQualifiersDetail;
    }

    /**
     * Sets the value of the fareQualifiersDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQualifierDetailsType }
     *     
     */
    public void setFareQualifiersDetail(FareQualifierDetailsType value) {
        this.fareQualifiersDetail = value;
    }

    /**
     * Gets the value of the fareFamilyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyType }
     *     
     */
    public FareFamilyType getFareFamilyDetails() {
        return fareFamilyDetails;
    }

    /**
     * Sets the value of the fareFamilyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyType }
     *     
     */
    public void setFareFamilyDetails(FareFamilyType value) {
        this.fareFamilyDetails = value;
    }

    /**
     * Gets the value of the fareFamilyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link TransportIdentifierType }
     *     
     */
    public TransportIdentifierType getFareFamilyOwner() {
        return fareFamilyOwner;
    }

    /**
     * Sets the value of the fareFamilyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportIdentifierType }
     *     
     */
    public void setFareFamilyOwner(TransportIdentifierType value) {
        this.fareFamilyOwner = value;
    }

    /**
     * Gets the value of the couponDetailsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponDetailsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponDetailsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponDetailsType }
     * 
     * 
     */
    public List<CouponDetailsType> getCouponDetailsGroup() {
        if (couponDetailsGroup == null) {
            couponDetailsGroup = new ArrayList<CouponDetailsType>();
        }
        return this.couponDetailsGroup;
    }

}
