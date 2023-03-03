package net.fortuna.soap.services.booking;

import net.fortuna.common.dto.*;
import net.fortuna.common.enums.PassengerCategory;
import net.fortuna.common.enums.RequestAction;
import net.fortuna.soap.configuration.SoapHeaderManager;
import net.fortuna.soap.configuration.SoapMessageExtractor;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.*;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.FareInformationTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.ProductDateTimeTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.ProductIdentificationDetailsTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.ProductTypeDetailsTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.ReferenceInfoType;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.ReferencingDetailsType;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.SegmentRepetitionControlDetailsTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.SegmentRepetitionControlTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.SpecificTravellerDetailsTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.SpecificTravellerTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrq_18_1_1a.TravelProductInformationTypeI;
import net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a.*;
import net.fortuna.soap.helper.AmadException;
import net.fortuna.soap.helper.ServiceProperties;
import net.fortuna.soap.helper.SessionState;
import net.fortuna.soap.services.common.LoggerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FareInfoPricingWithoutPNRService extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(FareInfoPricingWithoutPNRService.class);

    @Autowired
    private ServiceProperties properties;

    @Autowired
    private LoggerService loggerService;

    private FareInformativePricingWithoutPNR.PassengersGroup createPassengerGroup(int segmentQuantity, int measurementValue, String passengerType) {
        FareInformativePricingWithoutPNR.PassengersGroup passengersGroup = new FareInformativePricingWithoutPNR.PassengersGroup();
        SegmentRepetitionControlTypeI segmentRepetitionControl = new SegmentRepetitionControlTypeI();
        SegmentRepetitionControlDetailsTypeI segmentRepetitionControlDetail = new SegmentRepetitionControlDetailsTypeI();
        segmentRepetitionControlDetail.setQuantity(BigInteger.valueOf(segmentQuantity));
        segmentRepetitionControlDetail.setNumberOfUnits(BigInteger.ONE);
        segmentRepetitionControl.getSegmentControlDetails().add(segmentRepetitionControlDetail);
        passengersGroup.setSegmentRepetitionControl(segmentRepetitionControl);

        SpecificTravellerTypeI travellersID = new SpecificTravellerTypeI();
        SpecificTravellerDetailsTypeI specificTravellerDetailsType = new SpecificTravellerDetailsTypeI();
        specificTravellerDetailsType.setMeasurementValue(BigInteger.valueOf(measurementValue));
        travellersID.getTravellerDetails().add(specificTravellerDetailsType);
        passengersGroup.setTravellersID(travellersID);

        FareInformationTypeI discountPtc = new FareInformationTypeI();
        discountPtc.setValueQualifier(passengerType);
        passengersGroup.setDiscountPtc(discountPtc);

        return passengersGroup;
    }

    private FareInformativePricingWithoutPNR.SegmentGroup createSegmentGroup(int segmentItemNumber, SegmentDTO segmentDTO) {
        FareInformativePricingWithoutPNR.SegmentGroup segmentGroup = new FareInformativePricingWithoutPNR.SegmentGroup();
        TravelProductInformationTypeI segmentInformation = new TravelProductInformationTypeI();

        ProductDateTimeTypeI flightDate = new ProductDateTimeTypeI();
        String departureDate = segmentDTO.getDepartureDate().toLocalDate().format(DateTimeFormatter.ofPattern("ddMMyy"));
        String departureTime = segmentDTO.getDepartureDate().toLocalTime() != null ? segmentDTO.getDepartureDate().toLocalTime().format(DateTimeFormatter.ofPattern("HHmm")) : null;
        if (segmentDTO.getArrivalDate() != null) {
            String arrivalDate = segmentDTO.getArrivalDate().toLocalDate().format(DateTimeFormatter.ofPattern("ddMMyy"));
            String arrivalTime = segmentDTO.getArrivalDate().toLocalTime().format(DateTimeFormatter.ofPattern("HHmm"));
            flightDate.setArrivalDate(arrivalDate);
            flightDate.setArrivalTime(arrivalTime);
        }
        flightDate.setDepartureDate(departureDate);
        flightDate.setDepartureTime(departureTime);
        segmentInformation.setFlightDate(flightDate);

        LocationTypeI217754C boardPointDetails = new LocationTypeI217754C();
        boardPointDetails.setTrueLocationId(segmentDTO.getBoardPoint());
        segmentInformation.setBoardPointDetails(boardPointDetails);
        LocationTypeI217754C offPointDetails = new LocationTypeI217754C();
        offPointDetails.setTrueLocationId(segmentDTO.getOffPoint());
        segmentInformation.setOffpointDetails(offPointDetails);

        CompanyIdentificationTypeI217756C companyDetails = new CompanyIdentificationTypeI217756C();
        companyDetails.setMarketingCompany(segmentDTO.getMarketingCompany());
        companyDetails.setOperatingCompany(segmentDTO.getOperatingCompany());
        segmentInformation.setCompanyDetails(companyDetails);

        ProductIdentificationDetailsTypeI flightIdentification = new ProductIdentificationDetailsTypeI();
        flightIdentification.setFlightNumber(segmentDTO.getFlightNumber());
        flightIdentification.setBookingClass(segmentDTO.getRateClass().substring(0, 1));
        segmentInformation.setFlightIdentification(flightIdentification);

        ProductTypeDetailsTypeI flightTypeDetails = new ProductTypeDetailsTypeI();
        flightTypeDetails.getFlightIndicator().add("1");
        segmentInformation.setFlightTypeDetails(flightTypeDetails);

        segmentInformation.setItemNumber(BigInteger.valueOf(segmentItemNumber));
        segmentGroup.setSegmentInformation(segmentInformation);
        return segmentGroup;
    }

    private FareInformativePricingWithoutPNR.PricingOptionGroup createPriceOptionGroup(int segmentItemNumber, SegmentDTO segmentDTO) {
        FareInformativePricingWithoutPNR.PricingOptionGroup pricingOptionGroup = new FareInformativePricingWithoutPNR.PricingOptionGroup();
        PricingOptionKey pricingOptionKey = new PricingOptionKey();
        pricingOptionKey.setPricingOptionKey("FBA");
        pricingOptionGroup.setPricingOptionKey(pricingOptionKey);

        AttributeType optionDetail = new AttributeType();
        AttributeInformationTypeU attributeType = new AttributeInformationTypeU();
        attributeType.setAttributeType(segmentDTO.getRateClass());
        optionDetail.getCriteriaDetails().add(attributeType);
        pricingOptionGroup.setOptionDetail(optionDetail);

        ReferenceInfoType paxSegTstReference = new ReferenceInfoType();
        ReferencingDetailsType referencingDetails = new ReferencingDetailsType();
        referencingDetails.setType("S");
        referencingDetails.setValue(String.valueOf(segmentItemNumber));
        paxSegTstReference.getReferenceDetails().add(referencingDetails);
        pricingOptionGroup.setPaxSegTstReference(paxSegTstReference);

        return pricingOptionGroup;
    }

    private FareInformativePricingWithoutPNR.PricingOptionGroup createPriceOptionGroupForFBLTax(int segmentItemNumber, SegmentDTO segmentDTO) {
        FareInformativePricingWithoutPNR.PricingOptionGroup pricingOptionGroup = new FareInformativePricingWithoutPNR.PricingOptionGroup();
        PricingOptionKey pricingOptionKey = new PricingOptionKey();
        pricingOptionKey.setPricingOptionKey("FBL");
        pricingOptionGroup.setPricingOptionKey(pricingOptionKey);

        AttributeType optionDetail = new AttributeType();
        AttributeInformationTypeU attributeType = new AttributeInformationTypeU();
        attributeType.setAttributeType(segmentDTO.getRateClass());
        optionDetail.getCriteriaDetails().add(attributeType);
        pricingOptionGroup.setOptionDetail(optionDetail);

        ReferenceInfoType paxSegTstReference = new ReferenceInfoType();
        ReferencingDetailsType referencingDetails = new ReferencingDetailsType();
        referencingDetails.setType("S");
        referencingDetails.setValue(String.valueOf(segmentItemNumber));
        paxSegTstReference.getReferenceDetails().add(referencingDetails);
        pricingOptionGroup.setPaxSegTstReference(paxSegTstReference);

        return pricingOptionGroup;
    }

    private FareInformativePricingWithoutPNR.PricingOptionGroup createPriceOptionGroupForTax(int segmentItemNumber, SegmentDTO segmentDTO) {
        FareInformativePricingWithoutPNR.PricingOptionGroup pricingOptionGroup = new FareInformativePricingWithoutPNR.PricingOptionGroup();
        PricingOptionKey pricingOptionKey = new PricingOptionKey();
        pricingOptionKey.setPricingOptionKey("STO");
        pricingOptionGroup.setPricingOptionKey(pricingOptionKey);

        ReferenceInfoType paxSegTstReference = new ReferenceInfoType();
        ReferencingDetailsType referencingDetails = new ReferencingDetailsType();
        referencingDetails.setType("S");
        referencingDetails.setValue(String.valueOf(segmentItemNumber));
        paxSegTstReference.getReferenceDetails().add(referencingDetails);
        pricingOptionGroup.setPaxSegTstReference(paxSegTstReference);

        return pricingOptionGroup;
    }

    public FareInfoPricingWithoutPNRResDTO fareInfoPricingWithoutPNR(FareInfoPricingWithoutPNRReqDTO reqDTO) throws AmadException {
        return getResponse(reqDTO, false);
    }

    public List<FareInfoForPassengerDTO> fareInfoPricingWithoutPNRTax(FareInfoPricingWithoutPNRReqDTO reqDTO) throws AmadException {
        FareInfoPricingWithoutPNRResDTO resDTO = getResponse(reqDTO, true);
        if (resDTO != null) {
            return resDTO.getFareInfoForPassengerDTOList();
        }
        return null;
    }

    private FareInfoPricingWithoutPNRResDTO getResponse(FareInfoPricingWithoutPNRReqDTO reqDTO, boolean forGettingTax) {
        if (reqDTO.isAdultAvailable() || reqDTO.isChildAvailable()) {
            FareInformativePricingWithoutPNRReply fareInformativePricingWithoutPNRReply;
            FareInformativePricingWithoutPNR fareInformativePricingWithoutPNR = new FareInformativePricingWithoutPNR();
            int segmentQuantity = 1;
            int measurementValue = 1;
            if (reqDTO.isAdultAvailable()) {
                fareInformativePricingWithoutPNR.getPassengersGroup().add(createPassengerGroup(segmentQuantity, measurementValue, "ADT"));
                segmentQuantity++;
                if (reqDTO.isInfantAvailable()) {
                    fareInformativePricingWithoutPNR.getPassengersGroup().add(createPassengerGroup(segmentQuantity, measurementValue, "INF"));
                    segmentQuantity++;
                }
                measurementValue++;
            }
            if (reqDTO.isChildAvailable()) {
                fareInformativePricingWithoutPNR.getPassengersGroup().add(createPassengerGroup(segmentQuantity, measurementValue, "CH"));
            }

            FareInformativePricingWithoutPNR.PricingOptionGroup pricingOption = new FareInformativePricingWithoutPNR.PricingOptionGroup();
            PricingOptionKey pricingOptionKey = new PricingOptionKey();
            pricingOptionKey.setPricingOptionKey("FCO");
            pricingOption.setPricingOptionKey(pricingOptionKey);

            CurrenciesType currency = new CurrenciesType();
            CurrencyDetailsTypeU firstCurrencyDetails = new CurrencyDetailsTypeU();
            firstCurrencyDetails.setCurrencyQualifier("FCO");
            firstCurrencyDetails.setCurrencyIsoCode(reqDTO.getCurrency());
            currency.setFirstCurrencyDetails(firstCurrencyDetails);
            pricingOption.setCurrency(currency);
            fareInformativePricingWithoutPNR.getPricingOptionGroup().add(pricingOption);

            String rateClass = reqDTO.getSegmentGroup().get(0).getRateClass();
            String subClassCode = rateClass.substring(rateClass.length() - 2);
            if (subClassCode.equals("BA") || subClassCode.equals("BB") || subClassCode.equals("SD")) {
                FareInformativePricingWithoutPNR.PricingOptionGroup pricingOptionGroupButa = new FareInformativePricingWithoutPNR.PricingOptionGroup();
                PricingOptionKey pricingOptionKeyButa = new PricingOptionKey();
                pricingOptionKeyButa.setPricingOptionKey("RW");
                pricingOptionGroupButa.setPricingOptionKey(pricingOptionKeyButa);

                AttributeType optionDetail = new AttributeType();
                AttributeInformationTypeU attributeType = new AttributeInformationTypeU();
                if (subClassCode.equals("BA") || subClassCode.equals("BB"))
                    attributeType.setAttributeType("WEB");
                else
                    attributeType.setAttributeType("829669");
                optionDetail.getCriteriaDetails().add(attributeType);
                pricingOptionGroupButa.setOptionDetail(optionDetail);

                fareInformativePricingWithoutPNR.getPricingOptionGroup().add(pricingOptionGroupButa);
            }


            int segmentItemNumber = 1;
            for (SegmentDTO segment : reqDTO.getSegmentGroup()) {
                fareInformativePricingWithoutPNR.getSegmentGroup().add(createSegmentGroup(segmentItemNumber, segment));
                if (!forGettingTax)
                    fareInformativePricingWithoutPNR.getPricingOptionGroup().add(createPriceOptionGroup(segmentItemNumber, segment));
                else if (segment.getBoardPoint().equals("FRA") || segment.getOffPoint().equals("FRA"))
                    fareInformativePricingWithoutPNR.getPricingOptionGroup().add(createPriceOptionGroupForFBLTax(segmentItemNumber, segment));
                else
                    fareInformativePricingWithoutPNR.getPricingOptionGroup().add(createPriceOptionGroupForTax(segmentItemNumber, segment));
                segmentItemNumber++;
            }

            SessionState sessionState = new SessionState(reqDTO.getSourceOfficeCode(), ServiceProperties.INFO_PRICING_WITHOUT_PNR);
            sessionState.setUuid(reqDTO.getUuid());
            sessionState.setKeepSessionAlive(false);
            try {
                getWebServiceTemplate().setCheckConnectionForFault(true);
                SoapHeaderManager soapHeaderManager = new SoapHeaderManager(sessionState, properties, fareInformativePricingWithoutPNR, getWebServiceTemplate(), true);
                SoapMessageExtractor soapMessageExtractor = new SoapMessageExtractor(getWebServiceTemplate(), sessionState);
                fareInformativePricingWithoutPNRReply = (FareInformativePricingWithoutPNRReply) getWebServiceTemplate().sendAndReceive(soapHeaderManager, soapMessageExtractor);
                loggerService.saveRequestResponseLog(sessionState.getRequestResponseListener(), sessionState.getSessionId(), null, null, RequestAction.BOOKING, "FareInformativePricingWithoutPNR");

                if (fareInformativePricingWithoutPNRReply != null && fareInformativePricingWithoutPNRReply.getMainGroup() != null) {
                    FareInfoPricingWithoutPNRResDTO resDTO = new FareInfoPricingWithoutPNRResDTO();
                    FareInformativePricingWithoutPNRReply.MainGroup resMainGroup = fareInformativePricingWithoutPNRReply.getMainGroup();
                    ConversionRateDetailsTypeI conversionRateDetailsType = resMainGroup.getConvertionRate().getConversionRateDetails();
                    resDTO.setPricingRate(conversionRateDetailsType != null ? conversionRateDetailsType.getPricingAmount() : BigDecimal.ONE);
                    resDTO.setConvertedCurrencyType(reqDTO.getCurrency());

                    List<FareInfoForPassengerDTO> fareInfoForPassengerDTOList = new ArrayList<>();
                    List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup> pricingGroupLevelGroup = resMainGroup.getPricingGroupLevelGroup();
                    for (FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup levelGroup : pricingGroupLevelGroup) {
                        FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup segmentLevelGroup = levelGroup.getFareInfoGroup().getSegmentLevelGroup().get(0);
                        String unitQualifier = segmentLevelGroup.getPtcSegment().getQuantityDetails().getUnitQualifier();
                        FareInfoForPassengerDTO fareInfoForPassengerDTO = new FareInfoForPassengerDTO();
                        fareInfoForPassengerDTO.setPassengerCategory(PassengerCategory.lookupBySoapCode(unitQualifier));

                        FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup fareInfoGroup = levelGroup.getFareInfoGroup();
                        MonetaryInformationType199043S fareAmount = fareInfoGroup.getFareAmount();
                        MonetaryDetailDTO baseFare = new MonetaryDetailDTO(fareAmount.getMonetaryDetails().getAmount(), fareAmount.getMonetaryDetails().getCurrency());
                        fareInfoForPassengerDTO.setBaseFare(baseFare);
                        resDTO.setBaseCurrencyType(baseFare.getCurrency());

                        List<MonetaryInformationDetailsType262584C> otherMonetaryDetails = fareAmount.getOtherMonetaryDetails();
                        MonetaryInformationDetailsType262584C resFare = otherMonetaryDetails.stream().filter(omt -> omt.getTypeQualifier().equals("E")).findAny().orElse(null);
                        if (resFare == null) {
                            fareInfoForPassengerDTO.setFare(baseFare);
                        } else {
                            fareInfoForPassengerDTO.setFare(new MonetaryDetailDTO(resFare.getAmount(), resFare.getCurrency()));
                        }

                        MonetaryInformationDetailsType262584C resTotalFare = otherMonetaryDetails.stream().filter(omt -> omt.getTypeQualifier().equals("712")).findAny().orElse(null);
                        if (resTotalFare != null) {
                            fareInfoForPassengerDTO.setTotalFare(new MonetaryDetailDTO(resTotalFare.getAmount(), resTotalFare.getCurrency()));
                        }

                        FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SurchargesGroup surchargesGroup = levelGroup.getFareInfoGroup().getSurchargesGroup();
                        if (surchargesGroup != null) {
                            TaxTypeI taxesAmount = surchargesGroup.getTaxesAmount();
                            if (taxesAmount != null) {
                                List<TaxDetailsTypeI> taxDetails = taxesAmount.getTaxDetails();
                                List<TaxPriceDTO> taxPriceDTOList = new ArrayList<>();
                                BigDecimal tax = BigDecimal.ZERO;
                                if (taxDetails != null) {
                                    for (TaxDetailsTypeI taxAmount : taxDetails) {
                                        tax = tax.add(new BigDecimal(taxAmount.getRate()));
                                        taxPriceDTOList.add(new TaxPriceDTO(new MonetaryDetailDTO(taxAmount.getRate(), reqDTO.getCurrency()), taxAmount.getCountryCode(), taxAmount.getType().get(0)));
                                    }
                                }
                                MonetaryDetailDTO taxAmount = new MonetaryDetailDTO(tax.toString(), reqDTO.getCurrency());
                                fareInfoForPassengerDTO.setTaxPriceDTOList(taxPriceDTOList);
                                fareInfoForPassengerDTO.setTaxes(taxAmount);
                            }
                        }

                        fareInfoForPassengerDTOList.add(fareInfoForPassengerDTO);
                    }
                    resDTO.setFareInfoForPassengerDTOList(fareInfoForPassengerDTOList);

                    return resDTO;
                }
            } catch (Exception e) {
                loggerService.saveRequestResponseLog(sessionState.getRequestResponseListener(), sessionState.getSessionId(), null, e.toString(), RequestAction.BOOKING, "FareInformativePricingWithoutPNR");

                e.printStackTrace();
                logger.error(e.toString());
                throw e;
            }
        }

        return null;
    }
}
