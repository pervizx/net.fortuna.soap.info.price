package net.fortuna.soap.enums;

public enum CPRIdentificationRestrictedServices {

    AOXY("AOXY", "Oksigen istehlakı ilə bağlı təlimatlar üçün kodu tələb edin", "Kод запроса на инструкции по потреблению кислорода"),
    AVIH("AVIH", "Hava gəmisinin baqaj hissəsində heyvanın daşınması üçün kodu tələb edin", "Kод запроса на перевозку животного в багажном отделении ВС"),
    BIKE("BIKE", "Velosiped nəqliyyatı tələbi", "Запрос на перевозку велосипеда"),
    PETC("PETC", "Təyyarənin salonunda bir heyvanın daşınması üçün kodu tələb edin", "Код запроса на перевозку животного в салоне воздушного судна"),
    UMNR("UMNR", "Uçuş mövcud deyil amma gözləmə siyahısı aşıqdır", "Kод запроса, информирующий о несопровождаемом ребенке на рейсе"),
    WEAP("WEAP", "Silah daşınması sorğu kodu", "Kод запроса на перевозку оружия"),
    CBBG("CBBG", "Hava gəmisinin salonundakı sərnişin oturacağında baqajın daşınması üçün kodu tələb edin", "Kод запроса на перевозку багажа на пассажирском кресле в салоне ВС"),
    OXYG("OXYG", "Oksigen çənindən istifadə edən sərnişin haqqında məlumat verən sorğu kodu", "Kод запроса, информирующий о пассажире, использующим кислородный баллон"),
    DEPU("DEPU", "Deportasiya edilmiş sərnişin məlumat sorğusu kodu", "Kод информационного запроса о депортированном пассажире"),
    DEPA("DEPA", "Deportasiya edilmiş, müşayiət olunan sərnişin haqqında məlumat sorğusu kodu", "Kод информационного запроса о депортированном, сопровождаемом пассажире"),
    DPNA("DPNA", "Yardıma ehtiyacı olan əlil sərnişin haqqında məlumat sorğusu kodu", "Kод информационного запроса о пассажире с ограниченными возможностями требующего помощь"),
    ESAN("ESAN", "Emosional heyvanları müşayiət etmək istəyi ilə sərnişin haqqında məlumat sorğusu kodu", "Kод информационного запроса о пассажире с запросом на сопровождение эмоциональных животных"),
    MEDA("MEDA", "Daşıması tibbi icazə tələb olunmayan sərnişinlər üçün məlumat sorğusu kodu", "Kод информационного запроса о пассажирах, для перевозки которых не обязательно наличие медицинского разрешения"),
    MAAS("MAAS", "Sərnişinlə görüşmək və ona kömək etmək zərurəti haqqında məlumat sorğusu kodu", "Kод информационного запроса о необходимости встретить и помочь пассажиру"),
    POXY("POXY", "Başqa şəxsi oksigen çənini istifadə edən sərnişin haqqında məlumat verən kodu tələb edin", "Kод запроса, информирующий о пассажире, использующим другой собственный кислородный баллон"),
    PPOC("PPOC", "Portativ oksigen çənindən istifadə edən sərnişin haqqında məlumat verən kodu tələb edin", "Kод запроса, информирующий о пассажире, использующим переносной кислородный баллон"),
    STCR("STCR", "Xərəyə qoyulmuş sərnişinin daşınması üçün kodu tələb edin", "Kод запроса на перевозку пассажира с размещением на носилках"),
    SVAN("SVAN", "Xidmət heyvanı sorğu kodu", "Kод запроса на перевозку служебного животного"),
    TWOV("TWOV", "Vizasız tranzit keçən sərnişin haqqında məlumat verən kodu tələb edin", "Kод запроса, информирующий о пассажире имеющего транзит без визы"),
    BLND("BLND", "Tam və ya qismən kor sərnişin üçün məlumat sorğusu kodu", "Kод информационного запроса о полностью или частично незрячем пассажире"),
    DEAF("DEAF", "Tam və ya qismən kar olan sərnişin üçün məlumat sorğusu kodu", "Kод информационного запроса о полностью или частично глухом пассажире"),
    WCHR("WCHR", "Hava gəmisinə/yerdən hərəkəti üçün əlil arabası tələb olunan sərnişin üçün sorğu kodu", "Kод запроса о пассажире, для передвижения которого к/от ВС требуется инвалидное кресло"),
    WCHS("WCHS", "Hərəkəti üçün əlil arabası hava gəmisinə/təyyarədən tələb olunan və keçid yolu ilə aparılmalı olan sərnişin üçün kodu tələb edin", "Kод запроса о пассажире, для передвижения которого требуется инвалидное кресло к/от самолета и его нужно переносить по трапу"),
    WCLB("WCLB", "Litium-ion batareyaları ilə təchiz edilmiş öz oturacağından istifadə edən sərnişin üçün məlumat sorğusu kodu", "Kод информационного запроса о пассажире, использующем собственное кресло с питанием от литий-ионных аккумуляторных батарей"),
    WCOB("WCOB", "Təyyarənin göyərtəsində əlil arabasına ehtiyacı olan sərnişin üçün kodu tələb edin", "Kод запроса о пассажире, которому необходимо инвалидное кресло на борту ВС"),
    WCHC("WCHC", "Təyyarəyə / təyyarədən hərəkət etmək üçün əlil arabasına ehtiyacı olan bir sərnişin üçün kodu tələb edin, o, nərdivanla və oturacağından / yerindən aparılmalıdır", "Kод запроса о пассажире, которому требуется инвалидное кресло для передвижения к/от самолета, его нужно переносить по трапу и к/от его места"),
    WCBD("WCBD", "Quru batareyalarla təchiz edilmiş öz oturacağından istifadə edən sərnişin üçün məlumat sorğusu kodu", "Kод информационного запроса о пассажире, использующем собственное кресло с питанием от сухих аккумуляторных батарей"),
    WCBW("WCBW", "Öz oturacağından istifadə edən sərnişin üçün məlumat sorğusu kodu", "Kод информационного запроса о пассажире, использующем собственное кресло с питанием от кислотно-щелочных аккумуляторных батарей"),
    WCMP("WCMP", "Sərnişin tərəfindən daşınması üçün öz əl oturacağından istifadə edən sərnişin üçün məlumat sorğusu kodu", "Kод информационного запроса о пассажире, использующем собственное кресло с ручным управлением для транспортировки самим пассажиром"),
    EXST("EXST", "Təyyarə salonunda əlavə oturacaq üçün kod tələb edin", "Kод запроса на дополнительное место в салоне ВС");

    private String code;
    private String nameAz;
    private String nameRu;

    CPRIdentificationRestrictedServices(String code, String nameAz, String nameRu) {
        this.code = code;
        this.nameAz = nameAz;
        this.nameRu = nameRu;
    }

    public static String getCode(CPRIdentificationRestrictedServices as) {
        return as == null ? null : as.code;
    }

    public static CPRIdentificationRestrictedServices lookup(String code) {
        if (code == null) {
            return null;
        } else {
            CPRIdentificationRestrictedServices[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                CPRIdentificationRestrictedServices as = var1[var3];
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

    public String getNameRu() {
        return nameRu;
    }
}
