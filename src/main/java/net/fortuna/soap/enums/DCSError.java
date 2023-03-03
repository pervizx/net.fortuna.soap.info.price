package net.fortuna.soap.enums;

public enum DCSError {

    PASSENGER_NUMBER_MORE_THAN_9("100", "Sərnişin sayı 9-dan çoxdur.Xahiş olunur bilet nömrəsi ilə axtarın.", "The number of passengers is more than 9. Please search by ticket number."),
    PASSENGER_NOT_FOUND_BY_TICKET("101", "Bu soyad və bilet nömrəsinə uyğun sərnişin tapılmadı", "No passenger matching this surname and ticket number was found."),
    PASSENGER_NOT_FOUND_BY_CONTROL_NUMBER("102", "Bu soyad və brona uyğun sərnişin tapılmadı", "No passenger matching this surname and control number was found."),
    CUSTOMER_NOT_FOUND_IN_SEAT_MAP("103", "Seçilmiş yerlər arasında bu sərnişinə aid yer tapılmadı.", "No seat was found for this passenger among the selected seats"),
    PASSENGER_TICKET_SEQ_CHECK_FAILED("104", "Elektron bilet ardıcıllığının yoxlanılması uğursuz oldu. Zəhmət olmasa zəng mərkəzinə müraciət edin.", "E-ticket sequence checks failed. Please contact call center."),
    DO_NOT_BOARD("105", "Hörmətli sərnişin, sizin səyahət sənədinizin yoxlanışı zamanı xəta baş verdi. Xahiş olunur, aviaşirkətin hava limanındakı nümayəndəsinə müraciət edəsiniz.", "Dear passenger, an error occurred during travel document check. Please contact airline representative at the airport.");

    private String code;
    private String nameAz;
    private String nameEn;

    DCSError(String code, String nameAz, String nameEn) {
        this.code = code;
        this.nameAz = nameAz;
        this.nameEn = nameEn;
    }

    public static String getCode(DCSError as) {
        return as == null ? null : as.code;
    }

    public static DCSError lookup(String code) {
        if (code == null) {
            return null;
        } else {
            DCSError[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                DCSError as = var1[var3];
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
