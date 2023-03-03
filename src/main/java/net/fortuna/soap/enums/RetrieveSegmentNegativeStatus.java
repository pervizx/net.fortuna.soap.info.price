package net.fortuna.soap.enums;

public enum RetrieveSegmentNegativeStatus {

    STATUS_CODE_HL("HL", "Siyahıya salındı", "Have Listed"),
    STATUS_CODE_HN("HN", "Gözləmə ehtiyacı", "Holding Need"),
    STATUS_CODE_HS("HS", "Satılıb", "Have Sold"),
    STATUS_CODE_HX("HX", "Gözləmə ləğv edildi", "Holding Canceled"),
    STATUS_CODE_LK("LK", "Gözləmə təsdiq edildi - Birbaşa giriş", "Holding Confirmed - Direct Access"),
    STATUS_CODE_LL("LL", "Gözləmə siyahısı (Amadeus daşıyıcıları olmayan)", "Waitlist (non Amadeus Carriers)"),
    STATUS_CODE_NN("NN", "Seqment lazımdır", "Need Segment"),
    STATUS_CODE_NO("NO", "Heç bir tədbir görülməmişdir", "No Action Taken"),
    STATUS_CODE_NS("NS", "Oturacaq tələb olunmur (TST-də körpə üçün)", "No Seat Required (for infant in TST)"),
    STATUS_CODE_TL("TL", "Gözləmə siyahısındadır, sərnişinə yeni vaxtları məsləhət görür", "Waitlisted, Advise Passenger New Times"),
    STATUS_CODE_UC("UC", "Mümkün olmayan uçuş bağlandı, gözləmə siyahısına daxil edilmədi", "Unable Flight Closed, Have Not Waitlisted"),
    STATUS_CODE_UN("UN", "Mümkün deyil, fəaliyyət göstərmir", "Unable, Does Not Operate"),
    STATUS_CODE_US("US", "Satışı qəbul edə bilmir, gözləmə siyahısındadır", "Unable to Accept Sale, Have Waitlisted");

    private String code;
    private String nameAz;
    private String nameEn;

    private RetrieveSegmentNegativeStatus(String code, String nameAz, String nameEn) {
        this.code = code;
        this.nameAz = nameAz;
        this.nameEn = nameEn;
    }

    public static String getCode(RetrieveSegmentNegativeStatus as) {
        return as == null ? null : as.code;
    }

    public static RetrieveSegmentNegativeStatus lookup(String code) {
        if (code == null) {
            return null;
        } else {
            RetrieveSegmentNegativeStatus[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                RetrieveSegmentNegativeStatus as = var1[var3];
                if (as.code.equals(code)) {
                    return as;
                }
            }

            throw new IllegalArgumentException("No matching constant for " + RetrieveSegmentNegativeStatus.class.getSimpleName() + " code =" + code);
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
