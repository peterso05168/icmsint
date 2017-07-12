//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.03 at 10:31:06 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fixed Penalty Summons message consists of 
 * 								a) Record Prefix
 * 								b) Case Number Object
 * 								c) Prosecution Department Code
 * 								d) Demand Note Number
 * 								e) Demand Note Issue Date
 * 								f) Interface Date
 * 								g) FPN Dispute Date								
 * 								h) Manual Schedule Indicator
 * 								i) Informant Details
 * 								j) Defendant Details
 * 								k) SOD Details
 * 								l) Case Offence
 * 								m) Dispute from Notice of Order 
 * 								n) Rescind to Dispute Order Date
 *                                                 o) Additional Section
 *             
 * 
 * <p>Java class for FixedPenaltySummons.V1.3.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltySummons.V1.3.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.0.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="DemandNoteIssueDate" type="{CCT}Date.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="FPNDisputeDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="ManualScheduleIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.1.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.2.CT"/>
 *         &lt;element name="CaseSODDetails" type="{}CaseSOD.V1.1.CT"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CaseOffence" type="{}CaseOffence.V1.0.CT"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="CaseOffenceExtended" type="{}CaseOffence.V1.1.CT"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="DisputeFromNoticeOfOrder" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="RescindToDisputeOrderDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="RescindToDisputeOrderTime" type="{CCT}Time.CT" minOccurs="0"/>
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
@XmlType(name = "FixedPenaltySummons.V1.3.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "prosecutionDepartmentCode",
    "demandNoteNumber",
    "demandNoteIssueDate",
    "interfaceDate",
    "fpnDisputeDate",
    "manualScheduleIndicator",
    "informantDetails",
    "defendantDetails",
    "caseSODDetails",
    "caseOffence",
    "caseOffenceExtended",
    "disputeFromNoticeOfOrder",
    "rescindToDisputeOrderDate",
    "rescindToDisputeOrderTime",
    "additionalSection"
})
public class FixedPenaltySummonsV13CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV10CT prosecutionDepartmentCode;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "DemandNoteIssueDate", required = true)
    protected DateCT demandNoteIssueDate;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "FPNDisputeDate")
    protected DateCT fpnDisputeDate;
    @XmlElement(name = "ManualScheduleIndicator", required = true)
    protected FieldIndicatorV10CT manualScheduleIndicator;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV11CT informantDetails;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV12CT defendantDetails;
    @XmlElement(name = "CaseSODDetails", required = true)
    protected CaseSODV11CT caseSODDetails;
    @XmlElement(name = "CaseOffence")
    protected CaseOffenceV10CT caseOffence;
    @XmlElement(name = "CaseOffenceExtended")
    protected CaseOffenceV11CT caseOffenceExtended;
    @XmlElement(name = "DisputeFromNoticeOfOrder", required = true)
    protected FieldIndicatorV10CT disputeFromNoticeOfOrder;
    @XmlElement(name = "RescindToDisputeOrderDate")
    protected DateCT rescindToDisputeOrderDate;
    @XmlElement(name = "RescindToDisputeOrderTime")
    protected TimeCT rescindToDisputeOrderTime;
    @XmlElement(name = "AdditionalSection")
    protected AdditionalSectionV10CT additionalSection;

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
     * Gets the value of the demandNoteIssueDate property.
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
     * Sets the value of the demandNoteIssueDate property.
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
     * Gets the value of the fpnDisputeDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFPNDisputeDate() {
        return fpnDisputeDate;
    }

    /**
     * Sets the value of the fpnDisputeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFPNDisputeDate(DateCT value) {
        this.fpnDisputeDate = value;
    }

    /**
     * Gets the value of the manualScheduleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getManualScheduleIndicator() {
        return manualScheduleIndicator;
    }

    /**
     * Sets the value of the manualScheduleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setManualScheduleIndicator(FieldIndicatorV10CT value) {
        this.manualScheduleIndicator = value;
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

    /**
     * Gets the value of the defendantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DefendantV12CT }
     *     
     */
    public DefendantV12CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * Sets the value of the defendantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantV12CT }
     *     
     */
    public void setDefendantDetails(DefendantV12CT value) {
        this.defendantDetails = value;
    }

    /**
     * Gets the value of the caseSODDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CaseSODV11CT }
     *     
     */
    public CaseSODV11CT getCaseSODDetails() {
        return caseSODDetails;
    }

    /**
     * Sets the value of the caseSODDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseSODV11CT }
     *     
     */
    public void setCaseSODDetails(CaseSODV11CT value) {
        this.caseSODDetails = value;
    }

    /**
     * Gets the value of the caseOffence property.
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
     * Sets the value of the caseOffence property.
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
     * Gets the value of the caseOffenceExtended property.
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
     * Sets the value of the caseOffenceExtended property.
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
     * Gets the value of the disputeFromNoticeOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getDisputeFromNoticeOfOrder() {
        return disputeFromNoticeOfOrder;
    }

    /**
     * Sets the value of the disputeFromNoticeOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setDisputeFromNoticeOfOrder(FieldIndicatorV10CT value) {
        this.disputeFromNoticeOfOrder = value;
    }

    /**
     * Gets the value of the rescindToDisputeOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getRescindToDisputeOrderDate() {
        return rescindToDisputeOrderDate;
    }

    /**
     * Sets the value of the rescindToDisputeOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setRescindToDisputeOrderDate(DateCT value) {
        this.rescindToDisputeOrderDate = value;
    }

    /**
     * Gets the value of the rescindToDisputeOrderTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getRescindToDisputeOrderTime() {
        return rescindToDisputeOrderTime;
    }

    /**
     * Sets the value of the rescindToDisputeOrderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setRescindToDisputeOrderTime(TimeCT value) {
        this.rescindToDisputeOrderTime = value;
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
