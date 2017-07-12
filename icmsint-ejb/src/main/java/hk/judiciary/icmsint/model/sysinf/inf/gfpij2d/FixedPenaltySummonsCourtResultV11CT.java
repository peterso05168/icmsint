//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

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
 * <p>FixedPenaltySummonsCourtResult.V1.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltySummonsCourtResult.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="CaseRowSequenceNumber" type="{}CaseRowSequenceNumber.V1.0.CT"/>
 *         &lt;element name="FixedPenaltySummonsCourtResultType" type="{}FixedPenaltySummonsCourtResultType.V1.0.CT"/>
 *         &lt;element name="FixedPenaltySummonsCourtResultCode" type="{}FixedPenaltySummonsCourtResultCode.V1.0.1.CT"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="CourtNumber" type="{}HearingCourtNumber.V1.0.CT"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Penalty" type="{}Amount.V1.0.CT"/>
 *             &lt;element name="AdditionalPenalty" type="{}Amount.V1.0.CT"/>
 *             &lt;element name="CourtCosts" type="{}Amount.V1.0.CT"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="HearingOrder" type="{}HearingOrder.V1.0.CT" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * 获取recordPrefix属性的值。
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
     * 设置recordPrefix属性的值。
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
     * 获取interfaceDate属性的值。
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
     * 设置interfaceDate属性的值。
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
     * 获取demandNoteNumber属性的值。
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
     * 设置demandNoteNumber属性的值。
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
     * 获取caseNumber属性的值。
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
     * 设置caseNumber属性的值。
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
     * 获取caseRowSequenceNumber属性的值。
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
     * 设置caseRowSequenceNumber属性的值。
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
     * 获取fixedPenaltySummonsCourtResultType属性的值。
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
     * 设置fixedPenaltySummonsCourtResultType属性的值。
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
     * 获取fixedPenaltySummonsCourtResultCode属性的值。
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
     * 设置fixedPenaltySummonsCourtResultCode属性的值。
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
     * 获取hearingDate属性的值。
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
     * 设置hearingDate属性的值。
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
     * 获取hearingTime属性的值。
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
     * 设置hearingTime属性的值。
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
     * 获取courtNumber属性的值。
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
     * 设置courtNumber属性的值。
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
     * 获取penalty属性的值。
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
     * 设置penalty属性的值。
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
     * 获取additionalPenalty属性的值。
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
     * 设置additionalPenalty属性的值。
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
     * 获取courtCosts属性的值。
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
     * 设置courtCosts属性的值。
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
     * 获取hearingOrder属性的值。
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
     * 设置hearingOrder属性的值。
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
