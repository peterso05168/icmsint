//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:32:28 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdnid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 	Witness Summons Application Message
 * 				a) Record Prefix
 * 				b) Case Number
 * 				c) Prosecution Department Code
 * 				d) Department Reference Number
 * 				e) Demand Note Number
 * 				f) Hearing Date
 * 				g) Hearing Time
 * 				h) Apply Party
 * 				i) Defendant Sequence Number
 * 				j) Witness Object (v1.2)
 * 				k) Bailiff District
 * 				l) Informant Details Object (v1.2)
 * 				m) Additional Section
 * 			
 * 
 * <p>Java class for WitnessSummonsApplication.V2.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WitnessSummonsApplication.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="ApplyParty" type="{}ApplyParty.V1.0.CT"/>
 *         &lt;element name="DefendantSequenceNumber" type="{}DefendantSequenceNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessDetails" type="{}Witness.V1.2.CT"/>
 *         &lt;element name="BailiffDistrict" type="{}BailiffDistrictCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.2.CT"/>
 *         &lt;element name="AdditionalSection" type="{}AdditionalSection.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WitnessSummonsApplication.V2.0.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "departmentReferenceNumber",
    "demandNoteNumber",
    "hearingDate",
    "hearingTime",
    "applyParty",
    "defendantSequenceNumber",
    "witnessDetails",
    "bailiffDistrict",
    "informantDetails",
    "additionalSection"
})
public class WitnessSummonsApplicationV20CT {

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
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "ApplyParty", required = true)
    protected ApplyPartyV10CT applyParty;
    @XmlElement(name = "DefendantSequenceNumber")
    protected DefendantSequenceNumberV10CT defendantSequenceNumber;
    @XmlElement(name = "WitnessDetails", required = true)
    protected WitnessV12CT witnessDetails;
    @XmlElement(name = "BailiffDistrict")
    protected BailiffDistrictCodeV10CT bailiffDistrict;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV12CT informantDetails;
    @XmlElement(name = "AdditionalSection")
    protected AdditionalSectionV10CT additionalSection;

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
     * Gets the value of the applyParty property.
     * 
     * @return
     *     possible object is
     *     {@link ApplyPartyV10CT }
     *     
     */
    public ApplyPartyV10CT getApplyParty() {
        return applyParty;
    }

    /**
     * Sets the value of the applyParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyPartyV10CT }
     *     
     */
    public void setApplyParty(ApplyPartyV10CT value) {
        this.applyParty = value;
    }

    /**
     * Gets the value of the defendantSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DefendantSequenceNumberV10CT }
     *     
     */
    public DefendantSequenceNumberV10CT getDefendantSequenceNumber() {
        return defendantSequenceNumber;
    }

    /**
     * Sets the value of the defendantSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantSequenceNumberV10CT }
     *     
     */
    public void setDefendantSequenceNumber(DefendantSequenceNumberV10CT value) {
        this.defendantSequenceNumber = value;
    }

    /**
     * Gets the value of the witnessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WitnessV12CT }
     *     
     */
    public WitnessV12CT getWitnessDetails() {
        return witnessDetails;
    }

    /**
     * Sets the value of the witnessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessV12CT }
     *     
     */
    public void setWitnessDetails(WitnessV12CT value) {
        this.witnessDetails = value;
    }

    /**
     * Gets the value of the bailiffDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link BailiffDistrictCodeV10CT }
     *     
     */
    public BailiffDistrictCodeV10CT getBailiffDistrict() {
        return bailiffDistrict;
    }

    /**
     * Sets the value of the bailiffDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link BailiffDistrictCodeV10CT }
     *     
     */
    public void setBailiffDistrict(BailiffDistrictCodeV10CT value) {
        this.bailiffDistrict = value;
    }

    /**
     * Gets the value of the informantDetails property.
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
     * Sets the value of the informantDetails property.
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
     * Gets the value of the additionalSection property.
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
     * Sets the value of the additionalSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalSectionV10CT }
     *     
     */
    public void setAdditionalSection(AdditionalSectionV10CT value) {
        this.additionalSection = value;
    }

}
