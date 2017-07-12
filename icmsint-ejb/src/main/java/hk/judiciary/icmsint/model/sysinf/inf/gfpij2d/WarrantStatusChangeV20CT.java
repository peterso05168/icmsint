//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 	Non-Payment/Non-Appearance/Committal warrant status change details 
 * 				a) Record Prefix
 * 				b) Case Number
 * 				c) Prosecution Department Code
 * 				d) Department Reference Number /
 *                                     Demand Note Number
 * 				e) Record Sequence Number in the given batch
 * 				f) Warrant Status
 * 				g) Warrant Issue Date
 * 				h) Warrant Writ Number (Non-Payment/Non-Appearance warrant only)
 * 				i) Committal Writ Number (Committal warrant only)
 * 				j) Bail Amount
 * 				k) Record Status
 * 				l) Rollback from state
 * 				m) Rollack to state
 *             
 * 
 * <p>WarrantStatusChange.V2.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WarrantStatusChange.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;choice>
 *           &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *           &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;/choice>
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="WarrantStatus" type="{}WarrantStatus.V1.1.CT"/>
 *         &lt;element name="WarrantIssueDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="WarrantWritNumber" type="{}WarrantWritNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CommittalWritNumber" type="{}CommittalWritNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="BailAmount" type="{}Amount.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.2.CT"/>
 *         &lt;element name="RollbackFromState" type="{}RollbackFromState.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="RollbackToState" type="{}RollbackToState.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarrantStatusChange.V2.0.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "departmentReferenceNumber",
    "demandNoteNumber",
    "recordSequenceNumber",
    "warrantStatus",
    "warrantIssueDate",
    "warrantWritNumber",
    "committalWritNumber",
    "bailAmount",
    "recordStatus",
    "rollbackFromState",
    "rollbackToState"
})
public class WarrantStatusChangeV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "DepartmentReferenceNumber")
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "DemandNoteNumber")
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "WarrantStatus", required = true)
    protected WarrantStatusV11CT warrantStatus;
    @XmlElement(name = "WarrantIssueDate")
    protected DateCT warrantIssueDate;
    @XmlElement(name = "WarrantWritNumber")
    protected WarrantWritNumberV10CT warrantWritNumber;
    @XmlElement(name = "CommittalWritNumber")
    protected CommittalWritNumberV10CT committalWritNumber;
    @XmlElement(name = "BailAmount")
    protected AmountV10CT bailAmount;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV12CT recordStatus;
    @XmlElement(name = "RollbackFromState")
    protected RollbackFromStateV10CT rollbackFromState;
    @XmlElement(name = "RollbackToState")
    protected RollbackToStateV10CT rollbackToState;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
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
     * ����recordPrefix���Ե�ֵ��
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
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public ProsecutionDepartmentCodeV11CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * ����prosecutionDepartmentCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public void setProsecutionDepartmentCode(ProsecutionDepartmentCodeV11CT value) {
        this.prosecutionDepartmentCode = value;
    }

    /**
     * ��ȡdepartmentReferenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public DepartmentReferenceNumberV10CT getDepartmentReferenceNumber() {
        return departmentReferenceNumber;
    }

    /**
     * ����departmentReferenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public void setDepartmentReferenceNumber(DepartmentReferenceNumberV10CT value) {
        this.departmentReferenceNumber = value;
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
     * ��ȡrecordSequenceNumber���Ե�ֵ��
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
     * ����recordSequenceNumber���Ե�ֵ��
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
     * ��ȡwarrantStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public WarrantStatusV11CT getWarrantStatus() {
        return warrantStatus;
    }

    /**
     * ����warrantStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public void setWarrantStatus(WarrantStatusV11CT value) {
        this.warrantStatus = value;
    }

    /**
     * ��ȡwarrantIssueDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getWarrantIssueDate() {
        return warrantIssueDate;
    }

    /**
     * ����warrantIssueDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setWarrantIssueDate(DateCT value) {
        this.warrantIssueDate = value;
    }

    /**
     * ��ȡwarrantWritNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WarrantWritNumberV10CT }
     *     
     */
    public WarrantWritNumberV10CT getWarrantWritNumber() {
        return warrantWritNumber;
    }

    /**
     * ����warrantWritNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantWritNumberV10CT }
     *     
     */
    public void setWarrantWritNumber(WarrantWritNumberV10CT value) {
        this.warrantWritNumber = value;
    }

    /**
     * ��ȡcommittalWritNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommittalWritNumberV10CT }
     *     
     */
    public CommittalWritNumberV10CT getCommittalWritNumber() {
        return committalWritNumber;
    }

    /**
     * ����committalWritNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommittalWritNumberV10CT }
     *     
     */
    public void setCommittalWritNumber(CommittalWritNumberV10CT value) {
        this.committalWritNumber = value;
    }

    /**
     * ��ȡbailAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getBailAmount() {
        return bailAmount;
    }

    /**
     * ����bailAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setBailAmount(AmountV10CT value) {
        this.bailAmount = value;
    }

    /**
     * ��ȡrecordStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordStatusV12CT }
     *     
     */
    public RecordStatusV12CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * ����recordStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV12CT }
     *     
     */
    public void setRecordStatus(RecordStatusV12CT value) {
        this.recordStatus = value;
    }

    /**
     * ��ȡrollbackFromState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RollbackFromStateV10CT }
     *     
     */
    public RollbackFromStateV10CT getRollbackFromState() {
        return rollbackFromState;
    }

    /**
     * ����rollbackFromState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RollbackFromStateV10CT }
     *     
     */
    public void setRollbackFromState(RollbackFromStateV10CT value) {
        this.rollbackFromState = value;
    }

    /**
     * ��ȡrollbackToState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RollbackToStateV10CT }
     *     
     */
    public RollbackToStateV10CT getRollbackToState() {
        return rollbackToState;
    }

    /**
     * ����rollbackToState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RollbackToStateV10CT }
     *     
     */
    public void setRollbackToState(RollbackToStateV10CT value) {
        this.rollbackToState = value;
    }

}
