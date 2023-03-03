
package net.fortuna.soap.generated.org.opentravel.ota._2003._05.ota2010b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information associated with a specific restaurant.
 * 
 * <p>Java class for RestaurantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestaurantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultimediaDescriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}MultimediaDescriptionsType">
 *                 &lt;attribute name="Attire" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}RelativePositionType" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OperationSchedulesPlusChargeType" minOccurs="0"/>
 *         &lt;element name="InfoCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InfoCode" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeInfoGroup"/>
 *                           &lt;attribute name="Name">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32">
 *                                 &lt;enumeration value="SrvcInfo"/>
 *                                 &lt;enumeration value="Beverage"/>
 *                                 &lt;enumeration value="AvailableMealCategory"/>
 *                                 &lt;enumeration value="RestaurantCategory"/>
 *                                 &lt;enumeration value="RestaurantPolicy"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CuisineCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CuisineCode" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeInfoGroup"/>
 *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
 *                           &lt;attribute name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DescriptiveText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Za-z0-9]{1,500}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}ID_OptionalGroup"/>
 *       &lt;attribute name="RestaurantName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxSingleParty" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfferBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferLunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferDinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferBrunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
 *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestaurantType", propOrder = {
    "multimediaDescriptions",
    "relativePosition",
    "operationSchedules",
    "infoCodes",
    "cuisineCodes",
    "descriptiveText"
})
public class RestaurantType {

    @XmlElement(name = "MultimediaDescriptions")
    protected RestaurantType.MultimediaDescriptions multimediaDescriptions;
    @XmlElement(name = "RelativePosition")
    protected RelativePositionType relativePosition;
    @XmlElement(name = "OperationSchedules")
    protected OperationSchedulesPlusChargeType operationSchedules;
    @XmlElement(name = "InfoCodes")
    protected RestaurantType.InfoCodes infoCodes;
    @XmlElement(name = "CuisineCodes")
    protected RestaurantType.CuisineCodes cuisineCodes;
    @XmlElement(name = "DescriptiveText")
    protected String descriptiveText;
    @XmlAttribute(name = "RestaurantName")
    protected String restaurantName;
    @XmlAttribute(name = "MaxSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSeatingCapacity;
    @XmlAttribute(name = "MaxSingleParty")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSingleParty;
    @XmlAttribute(name = "InvCode")
    protected String invCode;
    @XmlAttribute(name = "OfferBreakfast")
    protected Boolean offerBreakfast;
    @XmlAttribute(name = "OfferLunch")
    protected Boolean offerLunch;
    @XmlAttribute(name = "OfferDinner")
    protected Boolean offerDinner;
    @XmlAttribute(name = "OfferBrunch")
    protected Boolean offerBrunch;
    @XmlAttribute(name = "ProximityCode")
    protected String proximityCode;
    @XmlAttribute(name = "Sort")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sort;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the multimediaDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType.MultimediaDescriptions }
     *     
     */
    public RestaurantType.MultimediaDescriptions getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * Sets the value of the multimediaDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType.MultimediaDescriptions }
     *     
     */
    public void setMultimediaDescriptions(RestaurantType.MultimediaDescriptions value) {
        this.multimediaDescriptions = value;
    }

    /**
     * Gets the value of the relativePosition property.
     * 
     * @return
     *     possible object is
     *     {@link RelativePositionType }
     *     
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * Sets the value of the relativePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePositionType }
     *     
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * Gets the value of the operationSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesPlusChargeType }
     *     
     */
    public OperationSchedulesPlusChargeType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * Sets the value of the operationSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesPlusChargeType }
     *     
     */
    public void setOperationSchedules(OperationSchedulesPlusChargeType value) {
        this.operationSchedules = value;
    }

    /**
     * Gets the value of the infoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType.InfoCodes }
     *     
     */
    public RestaurantType.InfoCodes getInfoCodes() {
        return infoCodes;
    }

    /**
     * Sets the value of the infoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType.InfoCodes }
     *     
     */
    public void setInfoCodes(RestaurantType.InfoCodes value) {
        this.infoCodes = value;
    }

    /**
     * Gets the value of the cuisineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType.CuisineCodes }
     *     
     */
    public RestaurantType.CuisineCodes getCuisineCodes() {
        return cuisineCodes;
    }

    /**
     * Sets the value of the cuisineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType.CuisineCodes }
     *     
     */
    public void setCuisineCodes(RestaurantType.CuisineCodes value) {
        this.cuisineCodes = value;
    }

    /**
     * Gets the value of the descriptiveText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveText() {
        return descriptiveText;
    }

    /**
     * Sets the value of the descriptiveText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveText(String value) {
        this.descriptiveText = value;
    }

    /**
     * Gets the value of the restaurantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * Sets the value of the restaurantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantName(String value) {
        this.restaurantName = value;
    }

    /**
     * Gets the value of the maxSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSeatingCapacity() {
        return maxSeatingCapacity;
    }

    /**
     * Sets the value of the maxSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSeatingCapacity(BigInteger value) {
        this.maxSeatingCapacity = value;
    }

    /**
     * Gets the value of the maxSingleParty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSingleParty() {
        return maxSingleParty;
    }

    /**
     * Sets the value of the maxSingleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSingleParty(BigInteger value) {
        this.maxSingleParty = value;
    }

    /**
     * Gets the value of the invCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvCode() {
        return invCode;
    }

    /**
     * Sets the value of the invCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvCode(String value) {
        this.invCode = value;
    }

    /**
     * Gets the value of the offerBreakfast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferBreakfast() {
        return offerBreakfast;
    }

    /**
     * Sets the value of the offerBreakfast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferBreakfast(Boolean value) {
        this.offerBreakfast = value;
    }

    /**
     * Gets the value of the offerLunch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferLunch() {
        return offerLunch;
    }

    /**
     * Sets the value of the offerLunch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferLunch(Boolean value) {
        this.offerLunch = value;
    }

    /**
     * Gets the value of the offerDinner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferDinner() {
        return offerDinner;
    }

    /**
     * Sets the value of the offerDinner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferDinner(Boolean value) {
        this.offerDinner = value;
    }

    /**
     * Gets the value of the offerBrunch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferBrunch() {
        return offerBrunch;
    }

    /**
     * Sets the value of the offerBrunch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferBrunch(Boolean value) {
        this.offerBrunch = value;
    }

    /**
     * Gets the value of the proximityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProximityCode() {
        return proximityCode;
    }

    /**
     * Sets the value of the proximityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProximityCode(String value) {
        this.proximityCode = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSort(BigInteger value) {
        this.sort = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     *         &lt;element name="CuisineCode" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeInfoGroup"/>
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
     *                 &lt;attribute name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
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
        "cuisineCode"
    })
    public static class CuisineCodes {

        @XmlElement(name = "CuisineCode", required = true)
        protected List<RestaurantType.CuisineCodes.CuisineCode> cuisineCode;

        /**
         * Gets the value of the cuisineCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cuisineCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCuisineCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RestaurantType.CuisineCodes.CuisineCode }
         * 
         * 
         */
        public List<RestaurantType.CuisineCodes.CuisineCode> getCuisineCode() {
            if (cuisineCode == null) {
                cuisineCode = new ArrayList<RestaurantType.CuisineCodes.CuisineCode>();
            }
            return this.cuisineCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeInfoGroup"/>
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
         *       &lt;attribute name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CuisineCode {

            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "IsMain")
            protected Boolean isMain;
            @XmlAttribute(name = "ExistsCode")
            protected String existsCode;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the isMain property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsMain() {
                return isMain;
            }

            /**
             * Sets the value of the isMain property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsMain(Boolean value) {
                this.isMain = value;
            }

            /**
             * Gets the value of the existsCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * Sets the value of the existsCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * Gets the value of the codeDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * Sets the value of the codeDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

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
     *         &lt;element name="InfoCode" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeInfoGroup"/>
     *                 &lt;attribute name="Name">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32">
     *                       &lt;enumeration value="SrvcInfo"/>
     *                       &lt;enumeration value="Beverage"/>
     *                       &lt;enumeration value="AvailableMealCategory"/>
     *                       &lt;enumeration value="RestaurantCategory"/>
     *                       &lt;enumeration value="RestaurantPolicy"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
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
        "infoCode"
    })
    public static class InfoCodes {

        @XmlElement(name = "InfoCode", required = true)
        protected List<RestaurantType.InfoCodes.InfoCode> infoCode;

        /**
         * Gets the value of the infoCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RestaurantType.InfoCodes.InfoCode }
         * 
         * 
         */
        public List<RestaurantType.InfoCodes.InfoCode> getInfoCode() {
            if (infoCode == null) {
                infoCode = new ArrayList<RestaurantType.InfoCodes.InfoCode>();
            }
            return this.infoCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeInfoGroup"/>
         *       &lt;attribute name="Name">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32">
         *             &lt;enumeration value="SrvcInfo"/>
         *             &lt;enumeration value="Beverage"/>
         *             &lt;enumeration value="AvailableMealCategory"/>
         *             &lt;enumeration value="RestaurantCategory"/>
         *             &lt;enumeration value="RestaurantPolicy"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InfoCode {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the codeDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * Sets the value of the codeDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * Gets the value of the removal property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRemoval() {
                return removal;
            }

            /**
             * Sets the value of the removal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}MultimediaDescriptionsType">
     *       &lt;attribute name="Attire" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MultimediaDescriptions
        extends MultimediaDescriptionsType
    {

        @XmlAttribute(name = "Attire")
        protected String attire;

        /**
         * Gets the value of the attire property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttire() {
            return attire;
        }

        /**
         * Sets the value of the attire property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttire(String value) {
            this.attire = value;
        }

    }

}
