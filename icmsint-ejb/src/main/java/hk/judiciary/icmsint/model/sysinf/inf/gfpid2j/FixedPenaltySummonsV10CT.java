//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
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
 * <p>FixedPenaltySummons.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrecordPrefix���Ե�ֵ��
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
     * ����recordPrefix���Ե�ֵ��
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
     * ��ȡcaseNumber���Ե�ֵ��
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
     * ����caseNumber���Ե�ֵ��
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
     * ��ȡprosecutionDepartmentCode���Ե�ֵ��
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
     * ����prosecutionDepartmentCode���Ե�ֵ��
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
     * ��ȡdemandNoteNumber���Ե�ֵ��
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
     * ����demandNoteNumber���Ե�ֵ��
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
     * ��ȡdemandNoteIssueDate���Ե�ֵ��
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
     * ����demandNoteIssueDate���Ե�ֵ��
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
     * ��ȡinterfaceDate���Ե�ֵ��
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
     * ����interfaceDate���Ե�ֵ��
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
     * ��ȡmanualScheduleIndicator���Ե�ֵ��
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
     * ����manualScheduleIndicator���Ե�ֵ��
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
     * ��ȡinformantDetails���Ե�ֵ��
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
     * ����informantDetails���Ե�ֵ��
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
     * ��ȡdefendantDetails���Ե�ֵ��
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
     * ����defendantDetails���Ե�ֵ��
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
     * ��ȡcaseSODDetails���Ե�ֵ��
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
     * ����caseSODDetails���Ե�ֵ��
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
     * ��ȡcaseOffence���Ե�ֵ��
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
     * ����caseOffence���Ե�ֵ��
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
     * ��ȡdisputeFromNoticeOfOrder���Ե�ֵ��
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
     * ����disputeFromNoticeOfOrder���Ե�ֵ��
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
     * ��ȡrecindToDisputeOrderDate���Ե�ֵ��
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
     * ����recindToDisputeOrderDate���Ե�ֵ��
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
     * ��ȡrecindToDisputeOrderTime���Ե�ֵ��
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
     * ����recindToDisputeOrderTime���Ե�ֵ��
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
