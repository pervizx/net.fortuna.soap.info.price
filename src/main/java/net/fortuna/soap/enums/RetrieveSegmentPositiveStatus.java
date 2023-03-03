package net.fortuna.soap.enums;

public enum RetrieveSegmentPositiveStatus {

    STATUS_CODE_HK("HK", "Xidmət seqmenti təsdiq edildi", "Service Segment Confirmed"),
    STATUS_CODE_KK("KK", "Təsdiq edilir", "Confirming"),
    STATUS_CODE_KL("KL", "Gözləmə siyahısından təsdiqlənir", "Confirming From Waitlist"),
    STATUS_CODE_RR("RR", "Yenidən təsdiqləndi", "Reconfirmed"),
    STATUS_CODE_TK("TK", "Təsdiqləyərək, Sərnişinə yeni tarixləri məsləhət bilin", "Confirming, Advise Passenger New Times");

    private String code;
    private String nameAz;
    private String nameEn;

    private RetrieveSegmentPositiveStatus(String code, String nameAz, String nameEn) {
        this.code = code;
        this.nameAz = nameAz;
        this.nameEn = nameEn;
    }

    public static String getCode(RetrieveSegmentPositiveStatus as) {
        return as == null ? null : as.code;
    }

    public static RetrieveSegmentPositiveStatus lookup(String code) {
        if (code == null) {
            return null;
        } else {
            RetrieveSegmentPositiveStatus[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                RetrieveSegmentPositiveStatus as = var1[var3];
                if (as.code.equals(code)) {
                    return as;
                }
            }

            throw new IllegalArgumentException("No matching constant for " + RetrieveSegmentPositiveStatus.class.getSimpleName() + " code =" + code);
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
