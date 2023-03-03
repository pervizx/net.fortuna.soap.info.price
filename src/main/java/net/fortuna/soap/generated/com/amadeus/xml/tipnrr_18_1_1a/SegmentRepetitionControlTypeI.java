
package net.fortuna.soap.generated.com.amadeus.xml.tipnrr_18_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * To indicate the number of segment group repetitions.
 * 
 * <p>Java class for SegmentRepetitionControlTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentRepetitionControlTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmentControlDetails" type="{http://xml.amadeus.com/TIPNRR_18_1_1A}SegmentRepetitionControlDetailsTypeI" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentRepetitionControlTypeI", propOrder = {
    "segmentControlDetails"
})
public class SegmentRepetitionControlTypeI {

    protected List<SegmentRepetitionControlDetailsTypeI> segmentControlDetails;

    /**
     * Gets the value of the segmentControlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentControlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentControlDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentRepetitionControlDetailsTypeI }
     * 
     * 
     */
    public List<SegmentRepetitionControlDetailsTypeI> getSegmentControlDetails() {
        if (segmentControlDetails == null) {
            segmentControlDetails = new ArrayList<SegmentRepetitionControlDetailsTypeI>();
        }
        return this.segmentControlDetails;
    }

}
