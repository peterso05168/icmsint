//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:51:00 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccid2j;

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
 * <p>Java class for WitnessSummonsAllocation.V2.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WitnessSummonsAllocation.V2.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/&gt;
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/&gt;
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/&gt;
 *           &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="WitnessSummonsNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="WitnessSequenceNumber" type="{}WitnessSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="WitnessSummonsGenerationDate" type="{CCT}Date.CT" minOccurs="0"/&gt;
 *         &lt;element name="WitnessEnglishSurname" type="{}PartyEnglishSurname.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="WitnessEnglishGivenName" type="{}PartyEnglishGivenName.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="WitnessChineseSurname" type="{}PartyChineseSurname.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="WitnessChineseGivenName" type="{}PartyChineseGivenName.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="WitnessIdentificationType" type="{}IdentificationType.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="WitnessIdentificationNumber" type="{}IdentificationNumber.V1.1.CT" minOccurs="0"/&gt;
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/&gt;
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/&gt;
 *         &lt;element name="WitnessSummonsAllocationRemark" type="{}WitnessSummonsAllocationRemark.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Gets the value of the recordPrefix property.
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
     * Sets the value of the recordPrefix property.
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
     * Gets the value of the caseNumber property.
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
     * Sets the value of the caseNumber property.
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
     * Gets the value of the prosecutionDepartmentCode property.
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
     * Sets the value of the prosecutionDepartmentCode property.
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
     * Gets the value of the departmentReferenceNumber property.
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
     * Sets the value of the departmentReferenceNumber property.
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
     * Gets the value of the demandNoteNumber property.
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
     * Sets the value of the demandNoteNumber property.
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
     * Gets the value of the witnessSummonsNumber property.
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
     * Sets the value of the witnessSummonsNumber property.
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
     * Gets the value of the witnessSequenceNumber property.
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
     * Sets the value of the witnessSequenceNumber property.
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
     * Gets the value of the witnessSummonsGenerationDate property.
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
     * Sets the value of the witnessSummonsGenerationDate property.
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
     * Gets the value of the witnessEnglishSurname property.
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
     * Sets the value of the witnessEnglishSurname property.
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
     * Gets the value of the witnessEnglishGivenName property.
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
     * Sets the value of the witnessEnglishGivenName property.
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
     * Gets the value of the witnessChineseSurname property.
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
     * Sets the value of the witnessChineseSurname property.
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
     * Gets the value of the witnessChineseGivenName property.
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
     * Sets the value of the witnessChineseGivenName property.
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
     * Gets the value of the witnessIdentificationType property.
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
     * Sets the value of the witnessIdentificationType property.
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
     * Gets the value of the witnessIdentificationNumber property.
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
     * Sets the value of the witnessIdentificationNumber property.
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
     * Gets the value of the hearingDate property.
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
     * Sets the value of the hearingDate property.
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
     * Gets the value of the hearingTime property.
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
     * Sets the value of the hearingTime property.
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
     * Gets the value of the applicationStatus property.
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
     * Sets the value of the applicationStatus property.
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
     * Gets the value of the witnessSummonsAllocationRemark property.
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
     * Sets the value of the witnessSummonsAllocationRemark property.
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
