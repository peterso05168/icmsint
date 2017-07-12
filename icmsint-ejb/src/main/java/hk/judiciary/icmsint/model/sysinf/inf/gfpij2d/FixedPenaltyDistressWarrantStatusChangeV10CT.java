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
 * Distress warrant status change details consists of
 * 				a) Record Prefix
 * 				b) Interface Date
 * 				c) Department Reference Number
 * 				d) Distress Warrant Case Number Object
 * 				e) Case Sequence Number in a batch
 * 				f) Distress Warrant Status
 * 				g) Distress Warrant Issue Date
 * 				h) Record Status
 * 				i) Distress Warrant Costs
 * 				j) Rollback from state
 * 				k) Rollack to state 
 *             
 * 
 * <p>FixedPenaltyDistressWarrantStatusChange.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyDistressWarrantStatusChange.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.1.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *         &lt;element name="DistressWarrantNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="CaseRowSequenceNumber" type="{}CaseRowSequenceNumber.V1.0.CT"/>
 *         &lt;element name="DistressWarrantStatus" type="{}WarrantStatus.V1.1.CT"/>
 *         &lt;element name="DistressWarrantIssueDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="DistressWarrantCosts" type="{}Amount.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.1.CT"/>
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
@XmlType(name = "FixedPenaltyDistressWarrantStatusChange.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceDate",
    "departmentReferenceNumber",
    "distressWarrantNumber",
    "caseRowSequenceNumber",
    "distressWarrantStatus",
    "distressWarrantIssueDate",
    "distressWarrantCosts",
    "recordStatus",
    "rollbackFromState",
    "rollbackToState"
})
public class FixedPenaltyDistressWarrantStatusChangeV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV11CT recordPrefix;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "DepartmentReferenceNumber", required = true)
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "DistressWarrantNumber", required = true)
    protected CaseNumberV10CT distressWarrantNumber;
    @XmlElement(name = "CaseRowSequenceNumber", required = true)
    protected CaseRowSequenceNumberV10CT caseRowSequenceNumber;
    @XmlElement(name = "DistressWarrantStatus", required = true)
    protected WarrantStatusV11CT distressWarrantStatus;
    @XmlElement(name = "DistressWarrantIssueDate")
    protected DateCT distressWarrantIssueDate;
    @XmlElement(name = "DistressWarrantCosts")
    protected AmountV11CT distressWarrantCosts;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV11CT recordStatus;
    @XmlElement(name = "RollbackFromState")
    protected WarrantStatusV11CT rollbackFromState;
    @XmlElement(name = "RollbackToState")
    protected WarrantStatusV11CT rollbackToState;

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
     * 获取distressWarrantNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getDistressWarrantNumber() {
        return distressWarrantNumber;
    }

    /**
     * 设置distressWarrantNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setDistressWarrantNumber(CaseNumberV10CT value) {
        this.distressWarrantNumber = value;
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
     * 获取distressWarrantStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public WarrantStatusV11CT getDistressWarrantStatus() {
        return distressWarrantStatus;
    }

    /**
     * 设置distressWarrantStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public void setDistressWarrantStatus(WarrantStatusV11CT value) {
        this.distressWarrantStatus = value;
    }

    /**
     * 获取distressWarrantIssueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getDistressWarrantIssueDate() {
        return distressWarrantIssueDate;
    }

    /**
     * 设置distressWarrantIssueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setDistressWarrantIssueDate(DateCT value) {
        this.distressWarrantIssueDate = value;
    }

    /**
     * 获取distressWarrantCosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV11CT }
     *     
     */
    public AmountV11CT getDistressWarrantCosts() {
        return distressWarrantCosts;
    }

    /**
     * 设置distressWarrantCosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV11CT }
     *     
     */
    public void setDistressWarrantCosts(AmountV11CT value) {
        this.distressWarrantCosts = value;
    }

    /**
     * 获取recordStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordStatusV11CT }
     *     
     */
    public RecordStatusV11CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置recordStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV11CT }
     *     
     */
    public void setRecordStatus(RecordStatusV11CT value) {
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
