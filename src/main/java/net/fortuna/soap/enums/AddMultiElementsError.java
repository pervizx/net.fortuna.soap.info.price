package net.fortuna.soap.enums;

public enum AddMultiElementsError {

    CHECK_ARRIVAL_DEPARTURE_DATE("103", "Qalxma və enmə vaxtlarını yoxlayın", "CHECK ARRIVAL/DEPARTURE DATE"),
    CHECK_DATE("102", "Tarixləri yoxlayın", "CHECK DATE"),
    FLIGHT_CANCELLED("303", "Uçuş ləğv edilib", "FLIGHT CANCELLED"),
    FLIGHT_NOT_FOUND("114", "Uçuş tapılmadı", "FLIGHT NOT FOUND"),
    NOT_AVAILABLE_BUT_WAITLIST_OPEN("420", "Uçuş mövcud deyil amma gözləmə siyahısı aşıqdır", "NOT AVAILABLE BUT WAITLIST OPEN"),
    NOT_AVAILABLE_AND_WAITLIST_CLOSED("421", "Uçuş mövcud deyil və gözləmə siyahısı bağlıdır", "NOT AVAILABLE AND WAITLIST CLOSED"),
    NOT_AVAILABLE_DUE_TO_TRAFFIC_RESTRICTION("421", "Uçuş hərəkət məhdudiyyətinə görə mövcud deyil", "NOT AVAILABLE DUE TO TRAFFIC RESTRICTION"),
    FQTV_NUMBER_NOT_FOUND("9253", "Miles kart nömrəsi tapılmadı", "FREQUENT FLYER NUMBER NOT FOUND"),
    CHECK_AGES("34198", "Sərnişinlərin yaşlarını yoxlayın", "CHECK AGES"),
    CHECK_AIRLINE_CODE("1920", "Aviaşirkət kodunu yoxlayın", "CHECK AIRLINE CODE"),
    CHECK_DATE_OF_BIRTH("4759", "Sərnişinlərin doğum tarixlərini yoxlayın", "CHECK DATE OF BIRTH"),
    INPUT_TOO_LONG("1891", "Daxil edilən məlumatların uzunluğu çoxdur", "INPUT TOO LONG"),
    PASSENGER_SEGMENT_DATA_NOT_VALID("1949", "Sərnişin və/və ya uçuş məlumatları doğru deyil", "PASSENGER AND/OR SEGMENT DATA NOT VALID"),
    ITEM_TOO_LONG_OR_NOT_ENTERED ("1902", "Sərnişinlərin ad və soyadları ya çox uzundur ya da daxil edilməyib", "ITEM TOO LONG / NOT ENTERED"),
    INVALID_MEAL_CODE ("2300", "Yemək kodu doğru deyil", "INVALID MEAL CODE"),
    INVALID_SSR ("8110", "Yanlış servis kodu", "INVALID SSR"),
    RESTRICTED_NAME ("9410", "Ada məhdudiyyət qoyulub", "RESTRICTED NAME"),
    RESTRICTED ("20", "Daxil etdiyiniz məlumatlardan her hansina məhdudiyyət qoyulub.Zəhmət olmasa məlumatları yoxlayın.", "RESTRICTED"),
    SEAT_REQUEST_NOT_AVAILABLE ("23004", "Oturacaq üçün müraciət mövcud deyil", "SEAT REQUEST NOT AVAILABLE. REQUEST SEAT AT CHECK-IN"),
    TELEPHONE_FIELD_REQUIRED ("977", "Telefon xanasını doldurmaq vacibdir", "TELEPHONE FIELD REQUIRED"),
    NO_AIR_SEGMENTS("251", "Bu marşrutlar üzrə uçuşlar yoxdur", "NO AIR SEGMENTS"),
    FQTV_NO_MATCH_FOR_NAME("39", "Miles kart nömrəsi və ya sərnişinin ad və soyadı doğru deyil", "NO MATCH FOR NAME");

    private String code;
    private String nameAz;
    private String nameEn;

    private AddMultiElementsError(String code, String nameAz, String nameEn) {
        this.code = code;
        this.nameAz = nameAz;
        this.nameEn = nameEn;
    }

    public static String getCode(AddMultiElementsError as) {
        return as == null ? null : as.code;
    }

    public static AddMultiElementsError lookup(String code) {
        if (code == null) {
            return null;
        } else {
            AddMultiElementsError[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                AddMultiElementsError as = var1[var3];
                if (as.code.equals(code)) {
                    return as;
                }
            }

            return null;
        }
    }

    public String getCode() {
        return this.code;
    }

    public String getNameAz() {
        return this.nameAz;
    }

    public String getNameEn() {
        return this.nameEn;
    }
}
