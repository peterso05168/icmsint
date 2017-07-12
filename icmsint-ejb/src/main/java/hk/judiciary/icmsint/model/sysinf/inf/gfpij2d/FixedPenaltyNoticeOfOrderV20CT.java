//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import java.util.ArrayList;
import java.util.List;
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
 * 				f) Informant Details
 * 				g) Defendant Details
 * 				h) SOD Details
 * 				i) Case Offence
 * 				j) Number of MWIS notice
 * 				k) Date of MWIS notice
 * 				l) Additional Section
 *                                 m) Preferred Warrant Type
 *                                 n) Offence Variable Object(s)
 *                                 o) Fixed Penalty Application Nature
 *             
 * 
 * <p>FixedPenaltyNoticeOfOrder.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyNoticeOfOrder.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="DemandNoteIssueDate" type="{CCT}Date.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.2.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.3.CT"/>
 *         &lt;element name="CaseSODDetails" type="{}CaseSOD.V1.2.CT"/>
 *         &lt;choice>
 *           &lt;element name="CaseOffence" type="{}CaseOffence.V1.0.CT"/>
 *           &lt;element name="CaseOffenceExtended" type="{}CaseOffence.V1.1.CT"/>
 *         &lt;/choice>
 *         &lt;element name="MWISNoticeNumber" type="{}MWISNoticeNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="MWISNoticeDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="AdditionalSection" type="{}AdditionalSection.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PreferredWarrantType" type="{}PreferredWarrantType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceVariable" type="{}OffenceVariable.V1.0.CT" maxOccurs="52" minOccurs="0"/>
 *         &lt;element name="FixedPenaltyApplicationNature" type="{}FixedPenaltyApplicationNature.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyNoticeOfOrder.V2.0.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "demandNoteNumber",
    "demandNoteIssueDate",
    "informantDetails",
    "defendantDetails",
    "caseSODDetails",
    "caseOffence",
    "caseOffenceExtended",
    "mwisNoticeNumber",
    "mwisNoticeDate",
    "additionalSection",
    "preferredWarrantType",
    "offenceVariable",
    "fixedPenaltyApplicationNature"
})
public class FixedPenaltyNoticeOfOrderV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "CaseNumber")
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "DemandNoteIssueDate", required = true)
    protected DateCT demandNoteIssueDate;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV12CT informantDetails;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV13CT defendantDetails;
    @XmlElement(name = "CaseSODDetails", required = true)
    protected CaseSODV12CT caseSODDetails;
    @XmlElement(name = "CaseOffence")
    protected CaseOffenceV10CT caseOffence;
    @XmlElement(name = "CaseOffenceExtended")
    protected CaseOffenceV11CT caseOffenceExtended;
    @XmlElement(name = "MWISNoticeNumber")
    protected MWISNoticeNumberV10CT mwisNoticeNumber;
    @XmlElement(name = "MWISNoticeDate")
    protected DateCT mwisNoticeDate;
    @XmlElement(name = "AdditionalSection")
    protected AdditionalSectionV10CT additionalSection;
    @XmlElement(name = "PreferredWarrantType")
    protected PreferredWarrantTypeV10CT preferredWarrantType;
    @XmlElement(name = "OffenceVariable")
    protected List<OffenceVariableV10CT> offenceVariable;
    @XmlElement(name = "FixedPenaltyApplicationNature", required = true)
    protected FixedPenaltyApplicationNatureV10CT fixedPenaltyApplicationNature;

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
     * 获取informantDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InformantV12CT }
     *     
     */
    public InformantV12CT getInformantDetails() {
        return informantDetails;
    }

    /**
     * 设置informantDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InformantV12CT }
     *     
     */
    public void setInformantDetails(InformantV12CT value) {
        this.informantDetails = value;
    }

    /**
     * 获取defendantDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefendantV13CT }
     *     
     */
    public DefendantV13CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * 设置defendantDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantV13CT }
     *     
     */
    public void setDefendantDetails(DefendantV13CT value) {
        this.defendantDetails = value;
    }

    /**
     * 获取caseSODDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseSODV12CT }
     *     
     */
    public CaseSODV12CT getCaseSODDetails() {
        return caseSODDetails;
    }

    /**
     * 设置caseSODDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseSODV12CT }
     *     
     */
    public void setCaseSODDetails(CaseSODV12CT value) {
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
     * 获取caseOffenceExtended属性的值。
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
     * 设置caseOffenceExtended属性的值。
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
     * 获取mwisNoticeNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MWISNoticeNumberV10CT }
     *     
     */
    public MWISNoticeNumberV10CT getMWISNoticeNumber() {
        return mwisNoticeNumber;
    }

    /**
     * 设置mwisNoticeNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MWISNoticeNumberV10CT }
     *     
     */
    public void setMWISNoticeNumber(MWISNoticeNumberV10CT value) {
        this.mwisNoticeNumber = value;
    }

    /**
     * 获取mwisNoticeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getMWISNoticeDate() {
        return mwisNoticeDate;
    }

    /**
     * 设置mwisNoticeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setMWISNoticeDate(DateCT value) {
        this.mwisNoticeDate = value;
    }

    /**
     * 获取additionalSection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdditionalSectionV10CT }
     *     
     */
    public AdditionalSectionV10CT getAdditionalSection() {
        return additionalSection;
    }

    /**
     * 设置additionalSection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalSectionV10CT }
     *     
     */
    public void setAdditionalSection(AdditionalSectionV10CT value) {
        this.additionalSection = value;
    }

    /**
     * 获取preferredWarrantType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferredWarrantTypeV10CT }
     *     
     */
    public PreferredWarrantTypeV10CT getPreferredWarrantType() {
        return preferredWarrantType;
    }

    /**
     * 设置preferredWarrantType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredWarrantTypeV10CT }
     *     
     */
    public void setPreferredWarrantType(PreferredWarrantTypeV10CT value) {
        this.preferredWarrantType = value;
    }

    /**
     * Gets the value of the offenceVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offenceVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffenceVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffenceVariableV10CT }
     * 
     * 
     */
    public List<OffenceVariableV10CT> getOffenceVariable() {
        if (offenceVariable == null) {
            offenceVariable = new ArrayList<OffenceVariableV10CT>();
        }
        return this.offenceVariable;
    }

    /**
     * 获取fixedPenaltyApplicationNature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltyApplicationNatureV10CT }
     *     
     */
    public FixedPenaltyApplicationNatureV10CT getFixedPenaltyApplicationNature() {
        return fixedPenaltyApplicationNature;
    }

    /**
     * 设置fixedPenaltyApplicationNature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltyApplicationNatureV10CT }
     *     
     */
    public void setFixedPenaltyApplicationNature(FixedPenaltyApplicationNatureV10CT value) {
        this.fixedPenaltyApplicationNature = value;
    }

}
