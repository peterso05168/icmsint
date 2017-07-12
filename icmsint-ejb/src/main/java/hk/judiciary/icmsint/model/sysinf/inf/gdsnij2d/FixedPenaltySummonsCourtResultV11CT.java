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
 * court order result details for Fixed Penalty Summons sent from
 *                                CASEMAN to TCO.  Message consists of
 * 								a) Record Prefix
 * 								b) Interface Date
 * 								c) Demand Note Number
 * 								d) Case Number Object
 * 								e) Case Sequence Number in a Batch
 * 								f) Court Result Type
 * 								g) Court Result Code
 * 								h) Hearing Date
 * 								i) Hearing Time
 * 								j) Hearing Court Number
 * 								k) Court Fine Amount (for normal FP Summons)
 * 								l) Additional Penalty Amount (for normal FP Summons)
 * 								m) Court Costs Amount (for normal FP Summons)
 * 								n) Hearing Order (for extended FP Summons)
 *             
 * 
 * <p>Java class for FixedPenaltySummonsCourtResult.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltySummonsCourtResult.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/&gt;
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/&gt;
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/&gt;
 *         &lt;element name="CaseRowSequenceNumber" type="{}CaseRowSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="FixedPenaltySummonsCourtResultType" type="{}FixedPenaltySummonsCourtResultType.V1.0.CT"/&gt;
 *         &lt;element name="FixedPenaltySummonsCourtResultCode" type="{}FixedPenaltySummonsCourtResultCode.V1.0.1.CT"/&gt;
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/&gt;
 *         &lt;element name="CourtNumber" type="{}HearingCourtNumber.V1.0.CT"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Penalty" type="{}Amount.V1.0.CT"/&gt;
 *             &lt;element name="AdditionalPenalty" type="{}Amount.V1.0.CT"/&gt;
 *             &lt;element name="CourtCosts" type="{}Amount.V1.0.CT"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="HearingOrder" type="{}HearingOrder.V1.0.CT" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltySummonsCourtResult.V1.1.CT", propOrder = {
    "recordPrefix",
    "interfaceDate",
    "demandNoteNumber",
    "caseNumber",
    "caseRowSequenceNumber",
    "fixedPenaltySummonsCourtResultType",
    "fixedPenaltySummonsCourtResultCode",
    "hearingDate",
    "hearingTime",
    "courtNumber",
    "penalty",
    "additionalPenalty",
    "courtCosts",
    "hearingOrder"
})
public class FixedPenaltySummonsCourtResultV11CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "CaseRowSequenceNumber", required = true)
    protected CaseRowSequenceNumberV10CT caseRowSequenceNumber;
    @XmlElement(name = "FixedPenaltySummonsCourtResultType", required = true)
    protected FixedPenaltySummonsCourtResultTypeV10CT fixedPenaltySummonsCourtResultType;
    @XmlElement(name = "FixedPenaltySummonsCourtResultCode", required = true)
    protected FixedPenaltySummonsCourtResultCodeV101CT fixedPenaltySummonsCourtResultCode;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "CourtNumber", required = true)
    protected HearingCourtNumberV10CT courtNumber;
    @XmlElement(name = "Penalty")
    protected AmountV10CT penalty;
    @XmlElement(name = "AdditionalPenalty")
    protected AmountV10CT additionalPenalty;
    @XmlElement(name = "CourtCosts")
    protected AmountV10CT courtCosts;
    @XmlElement(name = "HearingOrder")
    protected HearingOrderV10CT hearingOrder;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV12CT }
     *     
     */
    public PrefixV12CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV12CT }
     *     
     */
    public void setRecordPrefix(PrefixV12CT value) {
        this.recordPrefix = value;
    }

    /**
     * Gets the value of the interfaceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getInterfaceDate() {
        return interfaceDate;
    }

    /**
     * Sets the value of the interfaceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setInterfaceDate(DateCT value) {
        this.interfaceDate = value;
    }

    /**
     * Gets the value of the demandNoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DemandNoteNumberV11CT }
     *     
     */
    public DemandNoteNumberV11CT getDemandNoteNumber() {
        return demandNoteNumber;
    }

    /**
     * Sets the value of the demandNoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandNoteNumberV11CT }
     *     
     */
    public void setDemandNoteNumber(DemandNoteNumberV11CT value) {
        this.demandNoteNumber = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setCaseNumber(CaseNumberV10CT value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the caseRowSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CaseRowSequenceNumberV10CT }
     *     
     */
    public CaseRowSequenceNumberV10CT getCaseRowSequenceNumber() {
        return caseRowSequenceNumber;
    }

    /**
     * Sets the value of the caseRowSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseRowSequenceNumberV10CT }
     *     
     */
    public void setCaseRowSequenceNumber(CaseRowSequenceNumberV10CT value) {
        this.caseRowSequenceNumber = value;
    }

    /**
     * Gets the value of the fixedPenaltySummonsCourtResultType property.
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltySummonsCourtResultTypeV10CT }
     *     
     */
    public FixedPenaltySummonsCourtResultTypeV10CT getFixedPenaltySummonsCourtResultType() {
        return fixedPenaltySummonsCourtResultType;
    }

    /**
     * Sets the value of the fixedPenaltySummonsCourtResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltySummonsCourtResultTypeV10CT }
     *     
     */
    public void setFixedPenaltySummonsCourtResultType(FixedPenaltySummonsCourtResultTypeV10CT value) {
        this.fixedPenaltySummonsCourtResultType = value;
    }

    /**
     * Gets the value of the fixedPenaltySummonsCourtResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltySummonsCourtResultCodeV101CT }
     *     
     */
    public FixedPenaltySummonsCourtResultCodeV101CT getFixedPenaltySummonsCourtResultCode() {
        return fixedPenaltySummonsCourtResultCode;
    }

    /**
     * Sets the value of the fixedPenaltySummonsCourtResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltySummonsCourtResultCodeV101CT }
     *     
     */
    public void setFixedPenaltySummonsCourtResultCode(FixedPenaltySummonsCourtResultCodeV101CT value) {
        this.fixedPenaltySummonsCourtResultCode = value;
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
     * Gets the value of the courtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV10CT }
     *     
     */
    public HearingCourtNumberV10CT getCourtNumber() {
        return courtNumber;
    }

    /**
     * Sets the value of the courtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV10CT }
     *     
     */
    public void setCourtNumber(HearingCourtNumberV10CT value) {
        this.courtNumber = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setPenalty(AmountV10CT value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the additionalPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getAdditionalPenalty() {
        return additionalPenalty;
    }

    /**
     * Sets the value of the additionalPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setAdditionalPenalty(AmountV10CT value) {
        this.additionalPenalty = value;
    }

    /**
     * Gets the value of the courtCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getCourtCosts() {
        return courtCosts;
    }

    /**
     * Sets the value of the courtCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setCourtCosts(AmountV10CT value) {
        this.courtCosts = value;
    }

    /**
     * Gets the value of the hearingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link HearingOrderV10CT }
     *     
     */
    public HearingOrderV10CT getHearingOrder() {
        return hearingOrder;
    }

    /**
     * Sets the value of the hearingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingOrderV10CT }
     *     
     */
    public void setHearingOrder(HearingOrderV10CT value) {
        this.hearingOrder = value;
    }

}