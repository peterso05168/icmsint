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
 * Fixed Penalty Notice of Order message consists of
 * 				a) Record Prefix
 * 				b) Case Number Object
 * 				c) Prosecution Department Code
 * 				d) Demand Note Number
 * 				e) Demand Note Issue Date
 * 				f) Interface Date
 * 				g) Informant Details
 * 				h) Defendant Details
 * 				i) SOD Details
 * 				j) Case Offence
 *             
 * 
 * <p>FixedPenaltyNoticeOfOrder.V1.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyNoticeOfOrder.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.1.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.0.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.0.CT"/>
 *         &lt;element name="DemandNoteIssueDate" type="{CCT}Date.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.0.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.0.CT"/>
 *         &lt;element name="CaseSODDetails" type="{}CaseSOD.V1.0.CT"/>
 *         &lt;element name="CaseOffence" type="{}CaseOffence.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyNoticeOfOrder.V1.1.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "demandNoteNumber",
    "demandNoteIssueDate",
    "interfaceDate",
    "informantDetails",
    "defendantDetails",
    "caseSODDetails",
    "caseOffence"
})
public class FixedPenaltyNoticeOfOrderV11CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV11CT recordPrefix;
    @XmlElement(name = "CaseNumber")
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV10CT prosecutionDepartmentCode;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV10CT demandNoteNumber;
    @XmlElement(name = "DemandNoteIssueDate", required = true)
    protected DateCT demandNoteIssueDate;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV10CT informantDetails;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV10CT defendantDetails;
    @XmlElement(name = "CaseSODDetails", required = true)
    protected CaseSODV10CT caseSODDetails;
    @XmlElement(name = "CaseOffence", required = true)
    protected CaseOffenceV11CT caseOffence;

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
     *     {@link CaseOffenceV11CT }
     *     
     */
    public CaseOffenceV11CT getCaseOffence() {
        return caseOffence;
    }

    /**
     * 设置caseOffence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseOffenceV11CT }
     *     
     */
    public void setCaseOffence(CaseOffenceV11CT value) {
        this.caseOffence = value;
    }

}
