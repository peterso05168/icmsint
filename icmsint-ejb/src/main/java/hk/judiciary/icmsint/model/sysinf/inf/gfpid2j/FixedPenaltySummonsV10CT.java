//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fixed Penalty Summons message consists of 
 * 								a) Record Prefix
 * 								b) Case Number Object
 * 								c) Prosecution Department Code
 * 								d) Demand Note Number
 * 								e) Demand Note Issue Date
 * 								f) Interface Date
 * 								g) Manual Schedule Indicator
 * 								h) Informant Details
 * 								i) Defendant Details
 * 								j) SOD Details
 * 								k) Case Offence
 * 								l) Dispute from Notice of Order 
 * 								m) Rescind to Dispute Order Date
 *             
 * 
 * <p>FixedPenaltySummons.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltySummons.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.1.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.0.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.0.CT"/>
 *         &lt;element name="DemandNoteIssueDate" type="{CCT}Date.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="ManualScheduleIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.0.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.0.CT"/>
 *         &lt;element name="CaseSODDetails" type="{}CaseSOD.V1.0.CT"/>
 *         &lt;element name="CaseOffence" type="{}CaseOffence.V1.0.CT"/>
 *         &lt;element name="DisputeFromNoticeOfOrder" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="RecindToDisputeOrderDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="RecindToDisputeOrderTime" type="{CCT}Time.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltySummons.V1.0.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "demandNoteNumber",
    "demandNoteIssueDate",
    "interfaceDate",
    "manualScheduleIndicator",
    "informantDetails",
    "defendantDetails",
    "caseSODDetails",
    "caseOffence",
    "disputeFromNoticeOfOrder",
    "recindToDisputeOrderDate",
    "recindToDisputeOrderTime"
})
public class FixedPenaltySummonsV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV11CT recordPrefix;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV10CT prosecutionDepartmentCode;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV10CT demandNoteNumber;
    @XmlElement(name = "DemandNoteIssueDate", required = true)
    protected DateCT demandNoteIssueDate;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "ManualScheduleIndicator", required = true)
    protected FieldIndicatorV10CT manualScheduleIndicator;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV10CT informantDetails;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV10CT defendantDetails;
    @XmlElement(name = "CaseSODDetails", required = true)
    protected CaseSODV10CT caseSODDetails;
    @XmlElement(name = "CaseOffence", required = true)
    protected CaseOffenceV10CT caseOffence;
    @XmlElement(name = "DisputeFromNoticeOfOrder", required = true)
    protected FieldIndicatorV10CT disputeFromNoticeOfOrder;
    @XmlElement(name = "RecindToDisputeOrderDate")
    protected DateCT recindToDisputeOrderDate;
    @XmlElement(name = "RecindToDisputeOrderTime")
    protected TimeCT recindToDisputeOrderTime;

    /**
     * 获取recordPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixV11CT }
     *     
     */
    public PrefixV11CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * 设置recordPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV11CT }
     *     
     */
    public void setRecordPrefix(PrefixV11CT value) {
        this.recordPrefix = value;
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
     * 获取prosecutionDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentCodeV10CT }
     *     
     */
    public ProsecutionDepartmentCodeV10CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * 设置prosecutionDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentCodeV10CT }
     *     
     */
    public void setProsecutionDepartmentCode(ProsecutionDepartmentCodeV10CT value) {
        this.prosecutionDepartmentCode = value;
    }

    /**
     * 获取demandNoteNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DemandNoteNumberV10CT }
     *     
     */
    public DemandNoteNumberV10CT getDemandNoteNumber() {
        return demandNoteNumber;
    }

    /**
     * 设置demandNoteNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DemandNoteNumberV10CT }
     *     
     */
    public void setDemandNoteNumber(DemandNoteNumberV10CT value) {
        this.demandNoteNumber = value;
    }

    /**
     * 获取demandNoteIssueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getDemandNoteIssueDate() {
        return demandNoteIssueDate;
    }

    /**
     * 设置demandNoteIssueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setDemandNoteIssueDate(DateCT value) {
        this.demandNoteIssueDate = value;
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
     * 获取manualScheduleIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getManualScheduleIndicator() {
        return manualScheduleIndicator;
    }

    /**
     * 设置manualScheduleIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setManualScheduleIndicator(FieldIndicatorV10CT value) {
        this.manualScheduleIndicator = value;
    }

    /**
     * 获取informantDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InformantV10CT }
     *     
     */
    public InformantV10CT getInformantDetails() {
        return informantDetails;
    }

    /**
     * 设置informantDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InformantV10CT }
     *     
     */
    public void setInformantDetails(InformantV10CT value) {
        this.informantDetails = value;
    }

    /**
     * 获取defendantDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefendantV10CT }
     *     
     */
    public DefendantV10CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * 设置defendantDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantV10CT }
     *     
     */
    public void setDefendantDetails(DefendantV10CT value) {
        this.defendantDetails = value;
    }

    /**
     * 获取caseSODDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseSODV10CT }
     *     
     */
    public CaseSODV10CT getCaseSODDetails() {
        return caseSODDetails;
    }

    /**
     * 设置caseSODDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseSODV10CT }
     *     
     */
    public void setCaseSODDetails(CaseSODV10CT value) {
        this.caseSODDetails = value;
    }

    /**
     * 获取caseOffence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseOffenceV10CT }
     *     
     */
    public CaseOffenceV10CT getCaseOffence() {
        return caseOffence;
    }

    /**
     * 设置caseOffence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseOffenceV10CT }
     *     
     */
    public void setCaseOffence(CaseOffenceV10CT value) {
        this.caseOffence = value;
    }

    /**
     * 获取disputeFromNoticeOfOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getDisputeFromNoticeOfOrder() {
        return disputeFromNoticeOfOrder;
    }

    /**
     * 设置disputeFromNoticeOfOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setDisputeFromNoticeOfOrder(FieldIndicatorV10CT value) {
        this.disputeFromNoticeOfOrder = value;
    }

    /**
     * 获取recindToDisputeOrderDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getRecindToDisputeOrderDate() {
        return recindToDisputeOrderDate;
    }

    /**
     * 设置recindToDisputeOrderDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setRecindToDisputeOrderDate(DateCT value) {
        this.recindToDisputeOrderDate = value;
    }

    /**
     * 获取recindToDisputeOrderTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getRecindToDisputeOrderTime() {
        return recindToDisputeOrderTime;
    }

    /**
     * 设置recindToDisputeOrderTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setRecindToDisputeOrderTime(TimeCT value) {
        this.recindToDisputeOrderTime = value;
    }

}
