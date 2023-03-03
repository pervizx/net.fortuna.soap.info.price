
package net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="originatorGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="additionalBusinessInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="passengersGroup" maxOccurs="198">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}SegmentRepetitionControlTypeI"/>
 *                   &lt;element name="travellersID" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}SpecificTravellerTypeI" minOccurs="0"/>
 *                   &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}FareInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="segmentGroup" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}TravelProductInformationTypeI"/>
 *                   &lt;element name="additionnalSegmentDetails" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="inventory" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}ProductInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pricingOptionGroup" maxOccurs="999" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}PricingOptionKey"/>
 *                   &lt;element name="optionDetail" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AttributeType" minOccurs="0"/>
 *                   &lt;element name="carrierInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}TransportIdentifierType" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}CurrenciesType" minOccurs="0"/>
 *                   &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
 *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}MonetaryInformationType" minOccurs="0"/>
 *                   &lt;element name="taxInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}DutyTaxFeeDetailsType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="dateInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="frequentFlyerInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
 *                   &lt;element name="formOfPaymentInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}FormOfPaymentType" minOccurs="0"/>
 *                   &lt;element name="locationInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}PlaceLocationIdentificationType" minOccurs="0"/>
 *                   &lt;element name="paxSegTstReference" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}ReferenceInfoType" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "originatorGroup",
    "passengersGroup",
    "segmentGroup",
    "pricingOptionGroup"
})
@XmlRootElement(name = "Fare_InformativePricingWithoutPNR")
public class FareInformativePricingWithoutPNR {

    protected OriginatorGroup originatorGroup;
    @XmlElement(required = true)
    protected List<PassengersGroup> passengersGroup;
    @XmlElement(required = true)
    protected List<SegmentGroup> segmentGroup;
    protected List<PricingOptionGroup> pricingOptionGroup;

    /**
     * Gets the value of the originatorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorGroup }
     *     
     */
    public OriginatorGroup getOriginatorGroup() {
        return originatorGroup;
    }

    /**
     * Sets the value of the originatorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorGroup }
     *     
     */
    public void setOriginatorGroup(OriginatorGroup value) {
        this.originatorGroup = value;
    }

    /**
     * Gets the value of the passengersGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengersGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengersGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengersGroup }
     * 
     * 
     */
    public List<PassengersGroup> getPassengersGroup() {
        if (passengersGroup == null) {
            passengersGroup = new ArrayList<PassengersGroup>();
        }
        return this.passengersGroup;
    }

    /**
     * Gets the value of the segmentGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentGroup }
     * 
     * 
     */
    public List<SegmentGroup> getSegmentGroup() {
        if (segmentGroup == null) {
            segmentGroup = new ArrayList<SegmentGroup>();
        }
        return this.segmentGroup;
    }

    /**
     * Gets the value of the pricingOptionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingOptionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingOptionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingOptionGroup }
     * 
     * 
     */
    public List<PricingOptionGroup> getPricingOptionGroup() {
        if (pricingOptionGroup == null) {
            pricingOptionGroup = new ArrayList<PricingOptionGroup>();
        }
        return this.pricingOptionGroup;
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
     *         &lt;element name="additionalBusinessInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
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
        "additionalBusinessInformation"
    })
    public static class OriginatorGroup {

        protected AdditionalBusinessSourceInformationTypeI additionalBusinessInformation;

        /**
         * Gets the value of the additionalBusinessInformation property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalBusinessSourceInformationTypeI }
         *     
         */
        public AdditionalBusinessSourceInformationTypeI getAdditionalBusinessInformation() {
            return additionalBusinessInformation;
        }

        /**
         * Sets the value of the additionalBusinessInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalBusinessSourceInformationTypeI }
         *     
         */
        public void setAdditionalBusinessInformation(AdditionalBusinessSourceInformationTypeI value) {
            this.additionalBusinessInformation = value;
        }

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
     *         &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}SegmentRepetitionControlTypeI"/>
     *         &lt;element name="travellersID" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}SpecificTravellerTypeI" minOccurs="0"/>
     *         &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}FareInformationTypeI" minOccurs="0"/>
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
        "segmentRepetitionControl",
        "travellersID",
        "discountPtc"
    })
    public static class PassengersGroup {

        @XmlElement(required = true)
        protected SegmentRepetitionControlTypeI segmentRepetitionControl;
        protected SpecificTravellerTypeI travellersID;
        protected FareInformationTypeI discountPtc;

        /**
         * Gets the value of the segmentRepetitionControl property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentRepetitionControlTypeI }
         *     
         */
        public SegmentRepetitionControlTypeI getSegmentRepetitionControl() {
            return segmentRepetitionControl;
        }

        /**
         * Sets the value of the segmentRepetitionControl property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentRepetitionControlTypeI }
         *     
         */
        public void setSegmentRepetitionControl(SegmentRepetitionControlTypeI value) {
            this.segmentRepetitionControl = value;
        }

        /**
         * Gets the value of the travellersID property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificTravellerTypeI }
         *     
         */
        public SpecificTravellerTypeI getTravellersID() {
            return travellersID;
        }

        /**
         * Sets the value of the travellersID property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificTravellerTypeI }
         *     
         */
        public void setTravellersID(SpecificTravellerTypeI value) {
            this.travellersID = value;
        }

        /**
         * Gets the value of the discountPtc property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationTypeI }
         *     
         */
        public FareInformationTypeI getDiscountPtc() {
            return discountPtc;
        }

        /**
         * Sets the value of the discountPtc property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationTypeI }
         *     
         */
        public void setDiscountPtc(FareInformationTypeI value) {
            this.discountPtc = value;
        }

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
     *         &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}PricingOptionKey"/>
     *         &lt;element name="optionDetail" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AttributeType" minOccurs="0"/>
     *         &lt;element name="carrierInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}TransportIdentifierType" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}CurrenciesType" minOccurs="0"/>
     *         &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
     *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}MonetaryInformationType" minOccurs="0"/>
     *         &lt;element name="taxInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}DutyTaxFeeDetailsType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="dateInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="frequentFlyerInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
     *         &lt;element name="formOfPaymentInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}FormOfPaymentType" minOccurs="0"/>
     *         &lt;element name="locationInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}PlaceLocationIdentificationType" minOccurs="0"/>
     *         &lt;element name="paxSegTstReference" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}ReferenceInfoType" minOccurs="0"/>
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
        "pricingOptionKey",
        "optionDetail",
        "carrierInformation",
        "currency",
        "penDisInformation",
        "monetaryInformation",
        "taxInformation",
        "dateInformation",
        "frequentFlyerInformation",
        "formOfPaymentInformation",
        "locationInformation",
        "paxSegTstReference"
    })
    public static class PricingOptionGroup {

        @XmlElement(required = true)
        protected PricingOptionKey pricingOptionKey;
        protected AttributeType optionDetail;
        protected TransportIdentifierType carrierInformation;
        protected CurrenciesType currency;
        protected DiscountAndPenaltyInformationType penDisInformation;
        protected MonetaryInformationType monetaryInformation;
        protected List<DutyTaxFeeDetailsType> taxInformation;
        protected List<StructuredDateTimeInformationType> dateInformation;
        protected FrequentTravellerIdentificationCodeType frequentFlyerInformation;
        protected FormOfPaymentType formOfPaymentInformation;
        protected PlaceLocationIdentificationType locationInformation;
        protected ReferenceInfoType paxSegTstReference;

        /**
         * Gets the value of the pricingOptionKey property.
         * 
         * @return
         *     possible object is
         *     {@link PricingOptionKey }
         *     
         */
        public PricingOptionKey getPricingOptionKey() {
            return pricingOptionKey;
        }

        /**
         * Sets the value of the pricingOptionKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingOptionKey }
         *     
         */
        public void setPricingOptionKey(PricingOptionKey value) {
            this.pricingOptionKey = value;
        }

        /**
         * Gets the value of the optionDetail property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType }
         *     
         */
        public AttributeType getOptionDetail() {
            return optionDetail;
        }

        /**
         * Sets the value of the optionDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType }
         *     
         */
        public void setOptionDetail(AttributeType value) {
            this.optionDetail = value;
        }

        /**
         * Gets the value of the carrierInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TransportIdentifierType }
         *     
         */
        public TransportIdentifierType getCarrierInformation() {
            return carrierInformation;
        }

        /**
         * Sets the value of the carrierInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportIdentifierType }
         *     
         */
        public void setCarrierInformation(TransportIdentifierType value) {
            this.carrierInformation = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrenciesType }
         *     
         */
        public CurrenciesType getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrenciesType }
         *     
         */
        public void setCurrency(CurrenciesType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the penDisInformation property.
         * 
         * @return
         *     possible object is
         *     {@link DiscountAndPenaltyInformationType }
         *     
         */
        public DiscountAndPenaltyInformationType getPenDisInformation() {
            return penDisInformation;
        }

        /**
         * Sets the value of the penDisInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscountAndPenaltyInformationType }
         *     
         */
        public void setPenDisInformation(DiscountAndPenaltyInformationType value) {
            this.penDisInformation = value;
        }

        /**
         * Gets the value of the monetaryInformation property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType }
         *     
         */
        public MonetaryInformationType getMonetaryInformation() {
            return monetaryInformation;
        }

        /**
         * Sets the value of the monetaryInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType }
         *     
         */
        public void setMonetaryInformation(MonetaryInformationType value) {
            this.monetaryInformation = value;
        }

        /**
         * Gets the value of the taxInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DutyTaxFeeDetailsType }
         * 
         * 
         */
        public List<DutyTaxFeeDetailsType> getTaxInformation() {
            if (taxInformation == null) {
                taxInformation = new ArrayList<DutyTaxFeeDetailsType>();
            }
            return this.taxInformation;
        }

        /**
         * Gets the value of the dateInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType> getDateInformation() {
            if (dateInformation == null) {
                dateInformation = new ArrayList<StructuredDateTimeInformationType>();
            }
            return this.dateInformation;
        }

        /**
         * Gets the value of the frequentFlyerInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public FrequentTravellerIdentificationCodeType getFrequentFlyerInformation() {
            return frequentFlyerInformation;
        }

        /**
         * Sets the value of the frequentFlyerInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public void setFrequentFlyerInformation(FrequentTravellerIdentificationCodeType value) {
            this.frequentFlyerInformation = value;
        }

        /**
         * Gets the value of the formOfPaymentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentType }
         *     
         */
        public FormOfPaymentType getFormOfPaymentInformation() {
            return formOfPaymentInformation;
        }

        /**
         * Sets the value of the formOfPaymentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentType }
         *     
         */
        public void setFormOfPaymentInformation(FormOfPaymentType value) {
            this.formOfPaymentInformation = value;
        }

        /**
         * Gets the value of the locationInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PlaceLocationIdentificationType }
         *     
         */
        public PlaceLocationIdentificationType getLocationInformation() {
            return locationInformation;
        }

        /**
         * Sets the value of the locationInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlaceLocationIdentificationType }
         *     
         */
        public void setLocationInformation(PlaceLocationIdentificationType value) {
            this.locationInformation = value;
        }

        /**
         * Gets the value of the paxSegTstReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType }
         *     
         */
        public ReferenceInfoType getPaxSegTstReference() {
            return paxSegTstReference;
        }

        /**
         * Sets the value of the paxSegTstReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType }
         *     
         */
        public void setPaxSegTstReference(ReferenceInfoType value) {
            this.paxSegTstReference = value;
        }

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
     *         &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}TravelProductInformationTypeI"/>
     *         &lt;element name="additionnalSegmentDetails" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="inventory" type="{http://xml.amadeus.com/TIPNRQ_18_1_1A}ProductInformationTypeI" minOccurs="0"/>
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
        "segmentInformation",
        "additionnalSegmentDetails",
        "inventory"
    })
    public static class SegmentGroup {

        @XmlElement(required = true)
        protected TravelProductInformationTypeI segmentInformation;
        protected AdditionalProductDetailsTypeI additionnalSegmentDetails;
        protected ProductInformationTypeI inventory;

        /**
         * Gets the value of the segmentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public TravelProductInformationTypeI getSegmentInformation() {
            return segmentInformation;
        }

        /**
         * Sets the value of the segmentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public void setSegmentInformation(TravelProductInformationTypeI value) {
            this.segmentInformation = value;
        }

        /**
         * Gets the value of the additionnalSegmentDetails property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public AdditionalProductDetailsTypeI getAdditionnalSegmentDetails() {
            return additionnalSegmentDetails;
        }

        /**
         * Sets the value of the additionnalSegmentDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public void setAdditionnalSegmentDetails(AdditionalProductDetailsTypeI value) {
            this.additionnalSegmentDetails = value;
        }

        /**
         * Gets the value of the inventory property.
         * 
         * @return
         *     possible object is
         *     {@link ProductInformationTypeI }
         *     
         */
        public ProductInformationTypeI getInventory() {
            return inventory;
        }

        /**
         * Sets the value of the inventory property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductInformationTypeI }
         *     
         */
        public void setInventory(ProductInformationTypeI value) {
            this.inventory = value;
        }

    }

}
