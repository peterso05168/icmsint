//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.03 at 10:31:06 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * case number and first hearing date allocation details for fixed penalty 
 *                                notice/ summons sent from CASEMAN to TCO.  Message consists of
 * 								a) Record Prefix
 * 								b) Interface Date
 * 								c) Demand Note Number
 * 								d) Case Number Object
 * 								e) First Hearing Date/Time
 * 								f) Hearing Court Number
 * 								g) Application Status
 * 								h) Rejection Details
 *            
 * 
 * <p>Java class for FixedPenaltyNoticeSummonsAllocation.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyNoticeSummonsAllocation.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="FirstHearingDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="FirstHearingTime" type="{CCT}Time.CT" minOccurs="0"/>
 *         &lt;element name="CourtNumber" type="{}HearingCourtNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/>
 *         &lt;element name="RejectionDetails" type="{}ErrorDetails.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyNoticeSummonsAllocation.V1.1.CT", propOrder = {
    "recordPrefix",
    "interfaceDate",
    "demandNoteNumber",
    "caseNumber",
    "firstHearingDate",
    "firstHearingTime",
    "courtNumber",
    "applicationStatus",
    "rejectionDetails"
})
public class FixedPenaltyNoticeSummonsAllocationV11CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "CaseNumber")
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "FirstHearingDate")
    protected DateCT firstHearingDate;
    @XmlElement(name = "FirstHearingTime")
    protected TimeCT firstHearingTime;
    @XmlElement(name = "CourtNumber")
    protected HearingCourtNumberV10CT courtNumber;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "RejectionDetails")
    protected List<ErrorDetailsV10CT> rejectionDetails;

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
     * Gets the value of the firstHearingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFirstHearingDate() {
        return firstHearingDate;
    }

    /**
     * Sets the value of the firstHearingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFirstHearingDate(DateCT value) {
        this.firstHearingDate = value;
    }

    /**
     * Gets the value of the firstHearingTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getFirstHearingTime() {
        return firstHearingTime;
    }

    /**
     * Sets the value of the firstHearingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setFirstHearingTime(TimeCT value) {
        this.firstHearingTime = value;
    }

    /**
     * Gets the value of the courtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV10CT }
     *     
     */
    public HearingCourtNumberV10CT getCourtNumber() {
        return courtNumber;
    }

    /**
     * Sets the value of the courtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV10CT }
     *     
     */
    public void setCourtNumber(HearingCourtNumberV10CT value) {
        this.courtNumber = value;
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
     * Gets the value of the rejectionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetailsV10CT }
     * 
     * 
     */
    public List<ErrorDetailsV10CT> getRejectionDetails() {
        if (rejectionDetails == null) {
            rejectionDetails = new ArrayList<ErrorDetailsV10CT>();
        }
        return this.rejectionDetails;
    }

}
