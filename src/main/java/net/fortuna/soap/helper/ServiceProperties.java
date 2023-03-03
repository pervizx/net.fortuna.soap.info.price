package net.fortuna.soap.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:soap.properties"})
public class ServiceProperties {

    public static final String SIGNIN = "VLSSLQ_06_1_1A";
    public static final String SIGNOUT = "VLSSOQ_04_1_1A";
    public static final String AIRFLINFO = "FLIREQ_07_1_1A"; // Air Flight Info
    public static final String CURCONVERT = "FCUQCR_08_1_1A"; // fare Convert Currency
    public static final String CRYPTIC = "HSFREQ_07_3_1A"; // fare Convert Currency
    public static final String AIR_MULTI_AVAILABILITY = "SATRQT_16_1_1A";
    public static final String FARE_CONVERT_CURRENCY = "FCUQCQ_08_1_1A"; // fare Convert Currency
    public static final String INFO_PRICING_WITHOUT_PNR = "TIPNRQ_18_1_1A"; // fare Informative Pricing Without PNR
    public static final String FARE_DISPLAY_CITY_PAIR = "FQDREQ_12_1_1A"; // fare Convert Currency
    public static final String ADD_MULTI_ELEMENTS = "PNRADD_17_1_1A"; // Add Multi Elements
    public static final String RETRIEVE_SEAT_MAP = "SMPREQ_17_1_1A"; // Air retrieve seat map
    public static final String PNR_RETRIEVE = "PNRRET_17_1_1A"; // PNR retrieve
    public static final String PNR_SEARCH = "PAUSRQ_16_1_1A"; // PNR search
    public static final String PNR_CANCEL = "PNRXCL_17_2_1A"; // PNR cancel
    public static final String PNR_PRICE_WITH_BOOKING_CLASS = "TPCBRQ_18_1_1A"; // Fare prive with booking class
    public static final String TICKET_CREATE_TST_FROM_PRICING = "TAUTCQ_04_1_1A"; // Ticket create TST from pricing
    public static final String SERVICE_INTEQRATED_PRICING = "TPISGQ_17_1_1A"; // Service Integrated Pricing
    public static final String TICKET_CREATE_TSM_FROM_PRICING = "TAUSCQ_09_1_1A"; // Ticket Create TSM From Pricing
    public static final String FOP_CREATE_FORM_OF_PAYMENT = "TFOPCQ_15_4_1A"; // FOP Create Form Of Payment
    public static final String DOC_ISSUANCE_ISSUE_COMBINED = "TCTMIQ_15_1_1A"; // Doc Issuance Issue Combined
    public static final String DOC_ISSUANCE_ISSUE_TICKET = "TTKTIQ_15_1_1A"; // Doc Issuance Issue Ticket
    public static final String DOC_ISSUANCE_ISSUE_MISCELLANEOUS_DOCUMENTS = "TMDSIQ_15_1_1A"; // Doc Issuance Issue Miscellaneous Documents
    public static final String TICKET_RETRIEVE_LIST_OF_TSM = "TTSLRQ_09_1_1A";
    public static final String TICKET_PROCESS_EDOC = "TATREQ_15_2_1A";
    private static final String soapActionPrefix = "http://webservices.amadeus.com";

    @Value("${amad.soap.service.wsap}")
    private String wsap;
    @Value("${amad.soap.service.dcs.wsap}")
    private String wsapDCS;
    @Value("${amad.soap.service.wsdl}")
    private String wsdl;
    @Value("${amad.soap.service.dcs.wsdl}")
    private String wsdlDCS;
    @Value("${amad.soap.service.dcs.user-id}")
    private String dcsUserId;
    @Value("${amad.soap.service.user-id}")
    private String userId;
    @Value("${amad.soap.service.password}")
    private String password;
    @Value("${amad.soap.service.dcs.password}")
    private String dcsPassword;
    @Value("${amad.soap.service.office-id-azn}")
    private String officeIdAzn;
    @Value("${amad.soap.service.office-id-eur}")
    private String officeIdEur;
    @Value("${amad.soap.service.office-id-usd}")
    private String officeIdUsd;
    @Value("${amad.soap.service.office-id-rub}")
    private String officeIdRub;
    @Value("${amad.soap.service.organization-id}")
    private String organizationId;
    @Value("${amad.soap.service.duty-code}")
    private String agentDutyCode;

    public String getSoapAction(String actionSuffix){
        String soapAction = String.format("%s/%s/", soapActionPrefix, wsap);
        return soapAction+actionSuffix;
    }

    public String getWsap() {
        return wsap;
    }

    public void setWsap(String wsap) {
        this.wsap = wsap;
    }

    public String getWsdl() {
        return wsdl;
    }

    public void setWsdl(String wsdl) {
        this.wsdl = wsdl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWsapDCS() {
        return wsapDCS;
    }

    public void setWsapDCS(String wsapDCS) {
        this.wsapDCS = wsapDCS;
    }

    public String getWsdlDCS() {
        return wsdlDCS;
    }

    public void setWsdlDCS(String wsdlDCS) {
        this.wsdlDCS = wsdlDCS;
    }

    public String getDcsUserId() {
        return dcsUserId;
    }

    public void setDcsUserId(String dcsUserId) {
        this.dcsUserId = dcsUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDcsPassword() {
        return dcsPassword;
    }

    public void setDcsPassword(String dcsPassword) {
        this.dcsPassword = dcsPassword;
    }

    public String getOfficeIdAzn() {
        return officeIdAzn;
    }

    public void setOfficeIdAzn(String officeIdAzn) {
        this.officeIdAzn = officeIdAzn;
    }

    public String getOfficeIdEur() {
        return officeIdEur;
    }

    public void setOfficeIdEur(String officeIdEur) {
        this.officeIdEur = officeIdEur;
    }

    public String getOfficeIdUsd() {
        return officeIdUsd;
    }

    public void setOfficeIdUsd(String officeIdUsd) {
        this.officeIdUsd = officeIdUsd;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    public void setAgentDutyCode(String agentDutyCode) {
        this.agentDutyCode = agentDutyCode;
    }

    public String getOfficeIdRub() {
        return officeIdRub;
    }

    public void setOfficeIdRub(String officeIdRub) {
        this.officeIdRub = officeIdRub;
    }
}
