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
 * 	Witness Summons Allocation 
 * 							a) Record Prefix
 * 							b) Case Number
 * 							c) Prosecution Department Code
 * 							d) Department Reference Number /
 * 								Demand Note Number
 * 							e) Witness Summons Number (Writ No.)
 * 							f) Witness Sequence Number
 * 							g) Witness Summons Generation Date
 * 							h) Witness English Surname, Given Name
 * 							i) Witness Chinese Surname, Given Name
 * 							j) Witness Identification Type
 * 							k) Witness Identification Number
 * 							l) Hearing Date
 * 							m) Hearing Time
 * 							n) Application Status
 * 							o) Witness Summons Allocation Remark			
 * 			
 * 
 * <p>WitnessSummonsAllocation.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WitnessSummonsAllocation.V2.0.CT">
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
 *         &lt;element name="WitnessSummonsNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessSequenceNumber" type="{}WitnessSequenceNumber.V1.0.CT"/>
 *         &lt;element name="WitnessSummonsGenerationDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="WitnessEnglishSurname" type="{}PartyEnglishSurname.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessEnglishGivenName" type="{}PartyEnglishGivenName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessChineseSurname" type="{}PartyChineseSurname.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessChineseGivenName" type="{}PartyChineseGivenName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessIdentificationType" type="{}IdentificationType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessIdentificationNumber" type="{}IdentificationNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/>
 *         &lt;element name="WitnessSummonsAllocationRemark" type="{}WitnessSummonsAllocationRemark.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WitnessSummonsAllocation.V2.0.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "departmentReferenceNumber",
    "demandNoteNumber",
    "witnessSummonsNumber",
    "witnessSequenceNumber",
    "witnessSummonsGenerationDate",
    "witnessEnglishSurname",
    "witnessEnglishGivenName",
    "witnessChineseSurname",
    "witnessChineseGivenName",
    "witnessIdentificationType",
    "witnessIdentificationNumber",
    "hearingDate",
    "hearingTime",
    "applicationStatus",
    "witnessSummonsAllocationRemark"
})
public class WitnessSummonsAllocationV20CT {

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
    @XmlElement(name = "WitnessSummonsNumber")
    protected CaseNumberV10CT witnessSummonsNumber;
    @XmlElement(name = "WitnessSequenceNumber", required = true)
    protected WitnessSequenceNumberV10CT witnessSequenceNumber;
    @XmlElement(name = "WitnessSummonsGenerationDate")
    protected DateCT witnessSummonsGenerationDate;
    @XmlElement(name = "WitnessEnglishSurname")
    protected PartyEnglishSurnameV10CT witnessEnglishSurname;
    @XmlElement(name = "WitnessEnglishGivenName")
    protected PartyEnglishGivenNameV10CT witnessEnglishGivenName;
    @XmlElement(name = "WitnessChineseSurname")
    protected PartyChineseSurnameV10CT witnessChineseSurname;
    @XmlElement(name = "WitnessChineseGivenName")
    protected PartyChineseGivenNameV10CT witnessChineseGivenName;
    @XmlElement(name = "WitnessIdentificationType")
    protected IdentificationTypeV10CT witnessIdentificationType;
    @XmlElement(name = "WitnessIdentificationNumber")
    protected IdentificationNumberV11CT witnessIdentificationNumber;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "WitnessSummonsAllocationRemark")
    protected WitnessSummonsAllocationRemarkV10CT witnessSummonsAllocationRemark;

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
     * 获取witnessSummonsNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getWitnessSummonsNumber() {
        return witnessSummonsNumber;
    }

    /**
     * 设置witnessSummonsNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setWitnessSummonsNumber(CaseNumberV10CT value) {
        this.witnessSummonsNumber = value;
    }

    /**
     * 获取witnessSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WitnessSequenceNumberV10CT }
     *     
     */
    public WitnessSequenceNumberV10CT getWitnessSequenceNumber() {
        return witnessSequenceNumber;
    }

    /**
     * 设置witnessSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessSequenceNumberV10CT }
     *     
     */
    public void setWitnessSequenceNumber(WitnessSequenceNumberV10CT value) {
        this.witnessSequenceNumber = value;
    }

    /**
     * 获取witnessSummonsGenerationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getWitnessSummonsGenerationDate() {
        return witnessSummonsGenerationDate;
    }

    /**
     * 设置witnessSummonsGenerationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setWitnessSummonsGenerationDate(DateCT value) {
        this.witnessSummonsGenerationDate = value;
    }

    /**
     * 获取witnessEnglishSurname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyEnglishSurnameV10CT }
     *     
     */
    public PartyEnglishSurnameV10CT getWitnessEnglishSurname() {
        return witnessEnglishSurname;
    }

    /**
     * 设置witnessEnglishSurname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnglishSurnameV10CT }
     *     
     */
    public void setWitnessEnglishSurname(PartyEnglishSurnameV10CT value) {
        this.witnessEnglishSurname = value;
    }

    /**
     * 获取witnessEnglishGivenName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyEnglishGivenNameV10CT }
     *     
     */
    public PartyEnglishGivenNameV10CT getWitnessEnglishGivenName() {
        return witnessEnglishGivenName;
    }

    /**
     * 设置witnessEnglishGivenName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnglishGivenNameV10CT }
     *     
     */
    public void setWitnessEnglishGivenName(PartyEnglishGivenNameV10CT value) {
        this.witnessEnglishGivenName = value;
    }

    /**
     * 获取witnessChineseSurname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyChineseSurnameV10CT }
     *     
     */
    public PartyChineseSurnameV10CT getWitnessChineseSurname() {
        return witnessChineseSurname;
    }

    /**
     * 设置witnessChineseSurname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyChineseSurnameV10CT }
     *     
     */
    public void setWitnessChineseSurname(PartyChineseSurnameV10CT value) {
        this.witnessChineseSurname = value;
    }

    /**
     * 获取witnessChineseGivenName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyChineseGivenNameV10CT }
     *     
     */
    public PartyChineseGivenNameV10CT getWitnessChineseGivenName() {
        return witnessChineseGivenName;
    }

    /**
     * 设置witnessChineseGivenName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyChineseGivenNameV10CT }
     *     
     */
    public void setWitnessChineseGivenName(PartyChineseGivenNameV10CT value) {
        this.witnessChineseGivenName = value;
    }

    /**
     * 获取witnessIdentificationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentificationTypeV10CT }
     *     
     */
    public IdentificationTypeV10CT getWitnessIdentificationType() {
        return witnessIdentificationType;
    }

    /**
     * 设置witnessIdentificationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationTypeV10CT }
     *     
     */
    public void setWitnessIdentificationType(IdentificationTypeV10CT value) {
        this.witnessIdentificationType = value;
    }

    /**
     * 获取witnessIdentificationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumberV11CT }
     *     
     */
    public IdentificationNumberV11CT getWitnessIdentificationNumber() {
        return witnessIdentificationNumber;
    }

    /**
     * 设置witnessIdentificationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberV11CT }
     *     
     */
    public void setWitnessIdentificationNumber(IdentificationNumberV11CT value) {
        this.witnessIdentificationNumber = value;
    }

    /**
     * 获取hearingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getHearingDate() {
        return hearingDate;
    }

    /**
     * 设置hearingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setHearingDate(DateCT value) {
        this.hearingDate = value;
    }

    /**
     * 获取hearingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getHearingTime() {
        return hearingTime;
    }

    /**
     * 设置hearingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setHearingTime(TimeCT value) {
        this.hearingTime = value;
    }

    /**
     * 获取applicationStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApplicationStatusV10CT }
     *     
     */
    public ApplicationStatusV10CT getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * 设置applicationStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationStatusV10CT }
     *     
     */
    public void setApplicationStatus(ApplicationStatusV10CT value) {
        this.applicationStatus = value;
    }

    /**
     * 获取witnessSummonsAllocationRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WitnessSummonsAllocationRemarkV10CT }
     *     
     */
    public WitnessSummonsAllocationRemarkV10CT getWitnessSummonsAllocationRemark() {
        return witnessSummonsAllocationRemark;
    }

    /**
     * 设置witnessSummonsAllocationRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessSummonsAllocationRemarkV10CT }
     *     
     */
    public void setWitnessSummonsAllocationRemark(WitnessSummonsAllocationRemarkV10CT value) {
        this.witnessSummonsAllocationRemark = value;
    }

}
