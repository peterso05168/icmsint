//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 05:38:22 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 	Next Hearing Date
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Interface ID
 * 				c) Record Sequence Number
 * 				d) Hearing Internal Number
 * 				e) Record Status
 * 				f) Next Hearing Date
 * 				g) Next Hearing Time
 * 				h) Hearing Type
 * 				i) Court Number (v1.1)
 * 			
 * 
 * <p>Java class for NextHearing.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextHearing.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Case.V1.0.CT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/&gt;
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/&gt;
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="HearingInternalNumber" type="{}HearingInternalNumber.V1.0.CT"/&gt;
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.0.CT"/&gt;
 *         &lt;element name="NextHearingDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="NextHearingTime" type="{CCT}Time.CT"/&gt;
 *         &lt;element name="HearingType" type="{}HearingType.V1.0.CT"/&gt;
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextHearing.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "recordSequenceNumber",
    "hearingInternalNumber",
    "recordStatus",
    "nextHearingDate",
    "nextHearingTime",
    "hearingType",
    "hearingCourtNumber"
})
public class NextHearingV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "HearingInternalNumber", required = true)
    protected HearingInternalNumberV10CT hearingInternalNumber;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV10CT recordStatus;
    @XmlElement(name = "NextHearingDate", required = true)
    protected DateCT nextHearingDate;
    @XmlElement(name = "NextHearingTime", required = true)
    protected TimeCT nextHearingTime;
    @XmlElement(name = "HearingType", required = true)
    protected HearingTypeV10CT hearingType;
    @XmlElement(name = "HearingCourtNumber", required = true)
    protected HearingCourtNumberV11CT hearingCourtNumber;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV10CT }
     *     
     */
    public PrefixV10CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV10CT }
     *     
     */
    public void setRecordPrefix(PrefixV10CT value) {
        this.recordPrefix = value;
    }

    /**
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public InterfaceIDV10CT getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public void setInterfaceID(InterfaceIDV10CT value) {
        this.interfaceID = value;
    }

    /**
     * Gets the value of the recordSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public RecordSequenceNumberV10CT getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * Sets the value of the recordSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public void setRecordSequenceNumber(RecordSequenceNumberV10CT value) {
        this.recordSequenceNumber = value;
    }

    /**
     * Gets the value of the hearingInternalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public HearingInternalNumberV10CT getHearingInternalNumber() {
        return hearingInternalNumber;
    }

    /**
     * Sets the value of the hearingInternalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public void setHearingInternalNumber(HearingInternalNumberV10CT value) {
        this.hearingInternalNumber = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordStatusV10CT }
     *     
     */
    public RecordStatusV10CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV10CT }
     *     
     */
    public void setRecordStatus(RecordStatusV10CT value) {
        this.recordStatus = value;
    }

    /**
     * Gets the value of the nextHearingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getNextHearingDate() {
        return nextHearingDate;
    }

    /**
     * Sets the value of the nextHearingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setNextHearingDate(DateCT value) {
        this.nextHearingDate = value;
    }

    /**
     * Gets the value of the nextHearingTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getNextHearingTime() {
        return nextHearingTime;
    }

    /**
     * Sets the value of the nextHearingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setNextHearingTime(TimeCT value) {
        this.nextHearingTime = value;
    }

    /**
     * Gets the value of the hearingType property.
     * 
     * @return
     *     possible object is
     *     {@link HearingTypeV10CT }
     *     
     */
    public HearingTypeV10CT getHearingType() {
        return hearingType;
    }

    /**
     * Sets the value of the hearingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingTypeV10CT }
     *     
     */
    public void setHearingType(HearingTypeV10CT value) {
        this.hearingType = value;
    }

    /**
     * Gets the value of the hearingCourtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public HearingCourtNumberV11CT getHearingCourtNumber() {
        return hearingCourtNumber;
    }

    /**
     * Sets the value of the hearingCourtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public void setHearingCourtNumber(HearingCourtNumberV11CT value) {
        this.hearingCourtNumber = value;
    }

}
