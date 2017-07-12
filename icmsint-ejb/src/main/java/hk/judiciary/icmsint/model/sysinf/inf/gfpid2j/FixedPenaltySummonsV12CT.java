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
 * 								g) FPN Dispute Date								
 * 								h) Manual Schedule Indicator
 * 								i) Informant Details
 * 								j) Defendant Details
 * 								k) SOD Details
 * 								l) Case Offence
 * 								m) Dispute from Notice of Order 
 * 								n) Rescind to Dispute Order Date
 *             
 * 
 * <p>FixedPenaltySummons.V1.2.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltySummons.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.0.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="DemandNoteIssueDate" type="{CCT}Date.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="FPNDisputeDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="ManualScheduleIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.1.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.2.CT"/>
 *         &lt;element name="CaseSODDetails" type="{}CaseSOD.V1.1.CT"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CaseOffence" type="{}CaseOffence.V1.0.CT"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="CaseOffenceExtended" type="{}CaseOffence.V1.1.CT"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="DisputeFromNoticeOfOrder" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="RescindToDisputeOrderDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="RescindToDisputeOrderTime" type="{CCT}Time.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltySummons.V1.2.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "demandNoteNumber",
    "demandNoteIssueDate",
    "interfaceDate",
    "fpnDisputeDate",
    "manualScheduleIndicator",
    "informantDetails",
    "defendantDetails",
    "caseSODDetails",
    "caseOffence",
    "caseOffenceExtended",
    "disputeFromNoticeOfOrder",
    "rescindToDisputeOrderDate",
    "rescindToDisputeOrderTime"
})
public class FixedPenaltySummonsV12CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV10CT prosecutionDepartmentCode;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "DemandNoteIssueDate", required = true)
    protected DateCT demandNoteIssueDate;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "FPNDisputeDate")
    protected DateCT fpnDisputeDate;
    @XmlElement(name = "ManualScheduleIndicator", required = true)
    protected FieldIndicatorV10CT manualScheduleIndicator;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV11CT informantDetails;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV12CT defendantDetails;
    @XmlElement(name = "CaseSODDetails", required = true)
    protected CaseSODV11CT caseSODDetails;
    @XmlElement(name = "CaseOffence")
    protected CaseOffenceV10CT caseOffence;
    @XmlElement(name = "CaseOffenceExtended")
    protected CaseOffenceV11CT caseOffenceExtended;
    @XmlElement(name = "DisputeFromNoticeOfOrder", required = true)
    protected FieldIndicatorV10CT disputeFromNoticeOfOrder;
    @XmlElement(name = "RescindToDisputeOrderDate")
    protected DateCT rescindToDisputeOrderDate;
    @XmlElement(name = "RescindToDisputeOrderTime")
    protected TimeCT rescindToDisputeOrderTime;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
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
     * ����recordPrefix���Ե�ֵ��
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
     *     {@link DemandNoteNumberV11CT }
     *     
     */
    public DemandNoteNumberV11CT getDemandNoteNumber() {
        return demandNoteNumber;
    }

    /**
     * ����demandNoteNumber���Ե�ֵ��
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
     * ��ȡfpnDisputeDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFPNDisputeDate() {
        return fpnDisputeDate;
    }

    /**
     * ����fpnDisputeDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFPNDisputeDate(DateCT value) {
        this.fpnDisputeDate = value;
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
     *     {@link InformantV11CT }
     *     
     */
    public InformantV11CT getInformantDetails() {
        return informantDetails;
    }

    /**
     * ����informantDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InformantV11CT }
     *     
     */
    public void setInformantDetails(InformantV11CT value) {
        this.informantDetails = value;
    }

    /**
     * ��ȡdefendantDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DefendantV12CT }
     *     
     */
    public DefendantV12CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * ����defendantDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantV12CT }
     *     
     */
    public void setDefendantDetails(DefendantV12CT value) {
        this.defendantDetails = value;
    }

    /**
     * ��ȡcaseSODDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CaseSODV11CT }
     *     
     */
    public CaseSODV11CT getCaseSODDetails() {
        return caseSODDetails;
    }

    /**
     * ����caseSODDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CaseSODV11CT }
     *     
     */
    public void setCaseSODDetails(CaseSODV11CT value) {
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
     * ��ȡcaseOffenceExtended���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CaseOffenceV11CT }
     *     
     */
    public CaseOffenceV11CT getCaseOffenceExtended() {
        return caseOffenceExtended;
    }

    /**
     * ����caseOffenceExtended���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CaseOffenceV11CT }
     *     
     */
    public void setCaseOffenceExtended(CaseOffenceV11CT value) {
        this.caseOffenceExtended = value;
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
     * ��ȡrescindToDisputeOrderDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getRescindToDisputeOrderDate() {
        return rescindToDisputeOrderDate;
    }

    /**
     * ����rescindToDisputeOrderDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setRescindToDisputeOrderDate(DateCT value) {
        this.rescindToDisputeOrderDate = value;
    }

    /**
     * ��ȡrescindToDisputeOrderTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getRescindToDisputeOrderTime() {
        return rescindToDisputeOrderTime;
    }

    /**
     * ����rescindToDisputeOrderTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setRescindToDisputeOrderTime(TimeCT value) {
        this.rescindToDisputeOrderTime = value;
    }

}
