//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:47:35 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 	Departmental Notices Court Hearing Result
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Record Sequence Number of the given batch
 * 				e) Hearing Internal Number
 * 				f) Hearing Date
 * 				g) Hearing Time
 * 				h) Court Number (v1.1)
 * 				i) Record Type (Normal, Rollback, Chang of Order Detail)
 * 				k) Hearing Outcome
 * 				l) Master/Judge  (v1.1)
 * 				m) Plea Indicator
 * 				p) Hearing Order Object
 * 			
 * 
 * <p>Java class for NoticeHearingResult.V2.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeHearingResult.V2.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Case.V1.0.CT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/&gt;
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="HearingInternalNumber" type="{}HearingInternalNumber.V1.0.CT"/&gt;
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/&gt;
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT"/&gt;
 *         &lt;element name="RecordType" type="{}RecordType.V1.0.CT"/&gt;
 *         &lt;element name="HearingOutcome" type="{}HearingOutcome.V1.0.CT"/&gt;
 *         &lt;element name="MasterJudgeCode" type="{}HearingMagistrateCode.V1.1.CT"/&gt;
 *         &lt;element name="PleaType" type="{}PleaType.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="HearingOrder" type="{}HearingOrder.V1.1.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeHearingResult.V2.0.CT", propOrder = {
    "recordPrefix",
    "recordSequenceNumber",
    "hearingInternalNumber",
    "hearingDate",
    "hearingTime",
    "hearingCourtNumber",
    "recordType",
    "hearingOutcome",
    "masterJudgeCode",
    "pleaType",
    "hearingOrder"
})
public class NoticeHearingResultV20CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "HearingInternalNumber", required = true)
    protected HearingInternalNumberV10CT hearingInternalNumber;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "HearingCourtNumber", required = true)
    protected HearingCourtNumberV11CT hearingCourtNumber;
    @XmlElement(name = "RecordType", required = true)
    protected RecordTypeV10CT recordType;
    @XmlElement(name = "HearingOutcome", required = true)
    protected HearingOutcomeV10CT hearingOutcome;
    @XmlElement(name = "MasterJudgeCode", required = true)
    protected HearingMagistrateCodeV11CT masterJudgeCode;
    @XmlElement(name = "PleaType")
    protected PleaTypeV10CT pleaType;
    @XmlElement(name = "HearingOrder")
    protected HearingOrderV11CT hearingOrder;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV13CT }
     *     
     */
    public PrefixV13CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV13CT }
     *     
     */
    public void setRecordPrefix(PrefixV13CT value) {
        this.recordPrefix = value;
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
     * Gets the value of the hearingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getHearingDate() {
        return hearingDate;
    }

    /**
     * Sets the value of the hearingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setHearingDate(DateCT value) {
        this.hearingDate = value;
    }

    /**
     * Gets the value of the hearingTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getHearingTime() {
        return hearingTime;
    }

    /**
     * Sets the value of the hearingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setHearingTime(TimeCT value) {
        this.hearingTime = value;
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

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTypeV10CT }
     *     
     */
    public RecordTypeV10CT getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypeV10CT }
     *     
     */
    public void setRecordType(RecordTypeV10CT value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the hearingOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link HearingOutcomeV10CT }
     *     
     */
    public HearingOutcomeV10CT getHearingOutcome() {
        return hearingOutcome;
    }

    /**
     * Sets the value of the hearingOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingOutcomeV10CT }
     *     
     */
    public void setHearingOutcome(HearingOutcomeV10CT value) {
        this.hearingOutcome = value;
    }

    /**
     * Gets the value of the masterJudgeCode property.
     * 
     * @return
     *     possible object is
     *     {@link HearingMagistrateCodeV11CT }
     *     
     */
    public HearingMagistrateCodeV11CT getMasterJudgeCode() {
        return masterJudgeCode;
    }

    /**
     * Sets the value of the masterJudgeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingMagistrateCodeV11CT }
     *     
     */
    public void setMasterJudgeCode(HearingMagistrateCodeV11CT value) {
        this.masterJudgeCode = value;
    }

    /**
     * Gets the value of the pleaType property.
     * 
     * @return
     *     possible object is
     *     {@link PleaTypeV10CT }
     *     
     */
    public PleaTypeV10CT getPleaType() {
        return pleaType;
    }

    /**
     * Sets the value of the pleaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PleaTypeV10CT }
     *     
     */
    public void setPleaType(PleaTypeV10CT value) {
        this.pleaType = value;
    }

    /**
     * Gets the value of the hearingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link HearingOrderV11CT }
     *     
     */
    public HearingOrderV11CT getHearingOrder() {
        return hearingOrder;
    }

    /**
     * Sets the value of the hearingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingOrderV11CT }
     *     
     */
    public void setHearingOrder(HearingOrderV11CT value) {
        this.hearingOrder = value;
    }

}
