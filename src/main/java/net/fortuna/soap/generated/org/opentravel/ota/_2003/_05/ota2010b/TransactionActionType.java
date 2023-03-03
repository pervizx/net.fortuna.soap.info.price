
package net.fortuna.soap.generated.org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Book"/>
 *     &lt;enumeration value="Quote"/>
 *     &lt;enumeration value="Hold"/>
 *     &lt;enumeration value="Initiate"/>
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Commit"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="CommitOverrideEdits"/>
 *     &lt;enumeration value="VerifyPrice"/>
 *     &lt;enumeration value="Ticket"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionActionType")
@XmlEnum
public enum TransactionActionType {

    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Quote")
    QUOTE("Quote"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     * Commit the transaction and override the end transaction edits.
     * 
     */
    @XmlEnumValue("CommitOverrideEdits")
    COMMIT_OVERRIDE_EDITS("CommitOverrideEdits"),

    /**
     * Perform a price verification.
     * 
     */
    @XmlEnumValue("VerifyPrice")
    VERIFY_PRICE("VerifyPrice"),

    /**
     * A ticket for an event, such as a show or theme park.
     * 
     */
    @XmlEnumValue("Ticket")
    TICKET("Ticket");
    private final String value;

    TransactionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionActionType fromValue(String v) {
        for (TransactionActionType c: TransactionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
