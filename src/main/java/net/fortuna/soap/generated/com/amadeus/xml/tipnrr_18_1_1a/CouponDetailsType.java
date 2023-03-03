
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CouponDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}ReferenceInfoType"/>
 *         &lt;element name="flightConnectionType" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}TravelProductInformationType" minOccurs="0"/>
 *         &lt;element name="couponTaxDetailsGroup" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="taxTriggerInfo" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}DutyTaxFeeDetailsType"/>
 *                   &lt;element name="taxDetails" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}TaxType" minOccurs="0"/>
 *                   &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}MonetaryInformationType" minOccurs="0"/>
 *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}PlaceLocationIdentificationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponDetailsType", propOrder = {
    "productId",
    "flightConnectionType",
    "couponTaxDetailsGroup"
})
public class CouponDetailsType {

    @XmlElement(required = true)
    protected ReferenceInfoType productId;
    protected TravelProductInformationType flightConnectionType;
    protected List<CouponTaxDetailsGroup> couponTaxDetailsGroup;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setProductId(ReferenceInfoType value) {
        this.productId = value;
    }

    /**
     * Gets the value of the flightConnectionType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType }
     *     
     */
    public TravelProductInformationType getFlightConnectionType() {
        return flightConnectionType;
    }

    /**
     * Sets the value of the flightConnectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType }
     *     
     */
    public void setFlightConnectionType(TravelProductInformationType value) {
        this.flightConnectionType = value;
    }

    /**
     * Gets the value of the couponTaxDetailsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponTaxDetailsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponTaxDetailsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponTaxDetailsGroup }
     * 
     * 
     */
    public List<CouponTaxDetailsGroup> getCouponTaxDetailsGroup() {
        if (couponTaxDetailsGroup == null) {
            couponTaxDetailsGroup = new ArrayList<CouponTaxDetailsGroup>();
        }
        return this.couponTaxDetailsGroup;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="taxTriggerInfo" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}DutyTaxFeeDetailsType"/>
     *         &lt;element name="taxDetails" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}TaxType" minOccurs="0"/>
     *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}MonetaryInformationType" minOccurs="0"/>
     *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}PlaceLocationIdentificationType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxTriggerInfo",
        "taxDetails",
        "monetaryInfo",
        "locationInfo"
    })
    public static class CouponTaxDetailsGroup {

        @XmlElement(required = true)
        protected DutyTaxFeeDetailsType taxTriggerInfo;
        protected TaxType taxDetails;
        protected MonetaryInformationType monetaryInfo;
        protected PlaceLocationIdentificationType locationInfo;

        /**
         * Gets the value of the taxTriggerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DutyTaxFeeDetailsType }
         *     
         */
        public DutyTaxFeeDetailsType getTaxTriggerInfo() {
            return taxTriggerInfo;
        }

        /**
         * Sets the value of the taxTriggerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DutyTaxFeeDetailsType }
         *     
         */
        public void setTaxTriggerInfo(DutyTaxFeeDetailsType value) {
            this.taxTriggerInfo = value;
        }

        /**
         * Gets the value of the taxDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TaxType }
         *     
         */
        public TaxType getTaxDetails() {
            return taxDetails;
        }

        /**
         * Sets the value of the taxDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxType }
         *     
         */
        public void setTaxDetails(TaxType value) {
            this.taxDetails = value;
        }

        /**
         * Gets the value of the monetaryInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType }
         *     
         */
        public MonetaryInformationType getMonetaryInfo() {
            return monetaryInfo;
        }

        /**
         * Sets the value of the monetaryInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType }
         *     
         */
        public void setMonetaryInfo(MonetaryInformationType value) {
            this.monetaryInfo = value;
        }

        /**
         * Gets the value of the locationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PlaceLocationIdentificationType }
         *     
         */
        public PlaceLocationIdentificationType getLocationInfo() {
            return locationInfo;
        }

        /**
         * Sets the value of the locationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlaceLocationIdentificationType }
         *     
         */
        public void setLocationInfo(PlaceLocationIdentificationType value) {
            this.locationInfo = value;
        }

    }

}
