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
 * <p>WarrantStatusChange.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取recordPrefix属性的值。
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
     * 设置recordPrefix属性的值。
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
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public ProsecutionDepartmentCodeV11CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * 设置prosecutionDepartmentCode属性的值。
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
     * 获取departmentReferenceNumber属性的值。
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
     * 设置departmentReferenceNumber属性的值。
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
     * 获取recordSequenceNumber属性的值。
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
     * 设置recordSequenceNumber属性的值。
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
     * 获取warrantStatus属性的值。
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
     * 设置warrantStatus属性的值。
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
     * 获取warrantIssueDate属性的值。
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
     * 设置warrantIssueDate属性的值。
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
     * 获取warrantWritNumber属性的值。
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
     * 设置warrantWritNumber属性的值。
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
     * 获取committalWritNumber属性的值。
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
     * 设置committalWritNumber属性的值。
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
     * 获取bailAmount属性的值。
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
     * 设置bailAmount属性的值。
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
     * 获取recordStatus属性的值。
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
     * 设置recordStatus属性的值。
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
     * 获取rollbackFromState属性的值。
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
     * 设置rollbackFromState属性的值。
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
     * 获取rollbackToState属性的值。
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
     * 设置rollbackToState属性的值。
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
