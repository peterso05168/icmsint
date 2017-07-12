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
 * 				b) Department Reference Number
 * 				c) Distress Warrant Case Number Object
 * 				d) Case Sequence Number in a batch
 * 				e) Distress Warrant Status
 * 				f) Distress Warrant Issue Date
 * 				g) Record Status
 * 				h) Distress Warrant Costs
 * 				i) Rollback from state
 * 				j) Rollack to state 
 *             
 * 
 * <p>FixedPenaltyDistressWarrantStatusChange.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyDistressWarrantStatusChange.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *         &lt;element name="DistressWarrantNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="DistressWarrantStatus" type="{}WarrantStatus.V1.1.CT"/>
 *         &lt;element name="DistressWarrantIssueDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="DistressWarrantCosts" type="{}Amount.V1.1.CT" minOccurs="0"/>
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
@XmlType(name = "FixedPenaltyDistressWarrantStatusChange.V2.0.CT", propOrder = {
    "recordPrefix",
    "departmentReferenceNumber",
    "distressWarrantNumber",
    "recordSequenceNumber",
    "distressWarrantStatus",
    "distressWarrantIssueDate",
    "distressWarrantCosts",
    "recordStatus",
    "rollbackFromState",
    "rollbackToState"
})
public class FixedPenaltyDistressWarrantStatusChangeV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "DepartmentReferenceNumber", required = true)
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "DistressWarrantNumber", required = true)
    protected CaseNumberV10CT distressWarrantNumber;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "DistressWarrantStatus", required = true)
    protected WarrantStatusV11CT distressWarrantStatus;
    @XmlElement(name = "DistressWarrantIssueDate")
    protected DateCT distressWarrantIssueDate;
    @XmlElement(name = "DistressWarrantCosts")
    protected AmountV11CT distressWarrantCosts;
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
