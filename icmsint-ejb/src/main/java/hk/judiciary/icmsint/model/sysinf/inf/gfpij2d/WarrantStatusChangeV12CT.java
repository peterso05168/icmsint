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
 * Non-Payment/Non-Appearance/Committal warrant status change details consists of
 * 				a) Record Prefix
 * 				b) Interface Date
 * 				c) Demand Note Number
 * 				d) Case Number Object
 * 				e) Case Sequence Number in a batch
 * 				f) Warrant Status (v1.1)
 * 				g) Warrant Issue Date
 * 				h) Warrant Writ Number (Non-Payment/Non-Appearance warrant only)
 * 				i) Committal Writ Number (Committal warrant only)
 * 				j) Record Status
 * 				k) Rollback from state
 * 				l) Rollack to state 
 *             
 * 
 * <p>WarrantStatusChange.V1.2.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WarrantStatusChange.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="CaseRowSequenceNumber" type="{}CaseRowSequenceNumber.V1.0.CT"/>
 *         &lt;element name="WarrantStatus" type="{}WarrantStatus.V1.1.CT"/>
 *         &lt;element name="WarrantIssueDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="WarrantWritNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CommittalWritNumber" type="{}CommittalWritNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.2.CT"/>
 *         &lt;element name="RollbackFromState" type="{}WarrantStatus.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="RollbackToState" type="{}WarrantStatus.V1.1.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarrantStatusChange.V1.2.CT", propOrder = {
    "recordPrefix",
    "interfaceDate",
    "demandNoteNumber",
    "caseNumber",
    "caseRowSequenceNumber",
    "warrantStatus",
    "warrantIssueDate",
    "warrantWritNumber",
    "committalWritNumber",
    "recordStatus",
    "rollbackFromState",
    "rollbackToState"
})
public class WarrantStatusChangeV12CT {

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
    @XmlElement(name = "WarrantStatus", required = true)
    protected WarrantStatusV11CT warrantStatus;
    @XmlElement(name = "WarrantIssueDate")
    protected DateCT warrantIssueDate;
    @XmlElement(name = "WarrantWritNumber")
    protected CaseNumberV10CT warrantWritNumber;
    @XmlElement(name = "CommittalWritNumber")
    protected CommittalWritNumberV11CT committalWritNumber;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV12CT recordStatus;
    @XmlElement(name = "RollbackFromState")
    protected WarrantStatusV11CT rollbackFromState;
    @XmlElement(name = "RollbackToState")
    protected WarrantStatusV11CT rollbackToState;

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
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getWarrantWritNumber() {
        return warrantWritNumber;
    }

    /**
     * 设置warrantWritNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setWarrantWritNumber(CaseNumberV10CT value) {
        this.warrantWritNumber = value;
    }

    /**
     * 获取committalWritNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommittalWritNumberV11CT }
     *     
     */
    public CommittalWritNumberV11CT getCommittalWritNumber() {
        return committalWritNumber;
    }

    /**
     * 设置committalWritNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommittalWritNumberV11CT }
     *     
     */
    public void setCommittalWritNumber(CommittalWritNumberV11CT value) {
        this.committalWritNumber = value;
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
     *     {@link WarrantStatusV11CT }
     *     
     */
    public WarrantStatusV11CT getRollbackFromState() {
        return rollbackFromState;
    }

    /**
     * 设置rollbackFromState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public void setRollbackFromState(WarrantStatusV11CT value) {
        this.rollbackFromState = value;
    }

    /**
     * 获取rollbackToState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public WarrantStatusV11CT getRollbackToState() {
        return rollbackToState;
    }

    /**
     * 设置rollbackToState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public void setRollbackToState(WarrantStatusV11CT value) {
        this.rollbackToState = value;
    }

}
