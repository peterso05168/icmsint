//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 05:38:22 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fixed Penalty Witness Summons consists of
 * 				a) Record Prefix
 * 				b) Case Number Object
 * 				c) Prosecution Department Code
 * 				d) Demand Note Number
 * 				e) Interface Date
 * 				f) Hearing Date/Time
 * 				g) Apply Party
 * 				h) Witness Details
 * 				i) Bailiff District
 * 				j) Informant Details
 *             
 * 
 * <p>Java class for FixedPenaltyWitnessSummonsApplication.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyWitnessSummonsApplication.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/&gt;
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/&gt;
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.0.CT"/&gt;
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/&gt;
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/&gt;
 *         &lt;element name="ApplyParty" type="{}ApplyParty.V1.0.CT"/&gt;
 *         &lt;element name="WitnessDetails" type="{}Witness.V1.1.CT"/&gt;
 *         &lt;element name="BailiffDistrict" type="{}BailiffDistrict.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="InformantDetails" type="{}Informant.V1.1.CT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyWitnessSummonsApplication.V1.1.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "demandNoteNumber",
    "interfaceDate",
    "hearingDate",
    "hearingTime",
    "applyParty",
    "witnessDetails",
    "bailiffDistrict",
    "informantDetails"
})
public class FixedPenaltyWitnessSummonsApplicationV11CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV10CT prosecutionDepartmentCode;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "ApplyParty", required = true)
    protected ApplyPartyV10CT applyParty;
    @XmlElement(name = "WitnessDetails", required = true)
    protected WitnessV11CT witnessDetails;
    @XmlElement(name = "BailiffDistrict")
    protected BailiffDistrictV10CT bailiffDistrict;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV11CT informantDetails;

    /**
     * Gets the value of the recordPrefix property.
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
     * Sets the value of the recordPrefix property.
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
     *     {@link ProsecutionDepartmentCodeV10CT }
     *     
     */
    public ProsecutionDepartmentCodeV10CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * Sets the value of the prosecutionDepartmentCode property.
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
     * Gets the value of the interfaceDate property.
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
     * Sets the value of the interfaceDate property.
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
     * Gets the value of the witnessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WitnessV11CT }
     *     
     */
    public WitnessV11CT getWitnessDetails() {
        return witnessDetails;
    }

    /**
     * Sets the value of the witnessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessV11CT }
     *     
     */
    public void setWitnessDetails(WitnessV11CT value) {
        this.witnessDetails = value;
    }

    /**
     * Gets the value of the bailiffDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link BailiffDistrictV10CT }
     *     
     */
    public BailiffDistrictV10CT getBailiffDistrict() {
        return bailiffDistrict;
    }

    /**
     * Sets the value of the bailiffDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link BailiffDistrictV10CT }
     *     
     */
    public void setBailiffDistrict(BailiffDistrictV10CT value) {
        this.bailiffDistrict = value;
    }

    /**
     * Gets the value of the informantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InformantV11CT }
     *     
     */
    public InformantV11CT getInformantDetails() {
        return informantDetails;
    }

    /**
     * Sets the value of the informantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformantV11CT }
     *     
     */
    public void setInformantDetails(InformantV11CT value) {
        this.informantDetails = value;
    }

}
