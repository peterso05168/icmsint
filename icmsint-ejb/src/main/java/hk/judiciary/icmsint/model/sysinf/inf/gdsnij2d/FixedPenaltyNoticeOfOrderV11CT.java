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
 * <p>Java class for FixedPenaltyNoticeOfOrder.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyNoticeOfOrder.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.1.CT"/&gt;
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.0.CT"/&gt;
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.0.CT"/&gt;
 *         &lt;element name="DemandNoteIssueDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="InformantDetails" type="{}Informant.V1.0.CT"/&gt;
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.0.CT"/&gt;
 *         &lt;element name="CaseSODDetails" type="{}CaseSOD.V1.0.CT"/&gt;
 *         &lt;element name="CaseOffence" type="{}CaseOffence.V1.1.CT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Gets the value of the recordPrefix property.
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
     * Sets the value of the recordPrefix property.
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
     *     {@link DemandNoteNumberV10CT }
     *     
     */
    public DemandNoteNumberV10CT getDemandNoteNumber() {
        return demandNoteNumber;
    }

    /**
     * Sets the value of the demandNoteNumber property.
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
     * Gets the value of the informantDetails property.
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
     * Sets the value of the informantDetails property.
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
     * Gets the value of the defendantDetails property.
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
     * Sets the value of the defendantDetails property.
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
     * Gets the value of the caseSODDetails property.
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
     * Sets the value of the caseSODDetails property.
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
     * Gets the value of the caseOffence property.
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
     * Sets the value of the caseOffence property.
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
