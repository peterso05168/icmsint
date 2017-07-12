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
 *  Charge Case Allocation Message
 *                               Derived from Case.V1.0.CT
 *                               Extension consists of
 * 								a) Record Prefix
 * 								b) First Hearing Date
 * 								c) First Hearing Time
 * 								d) Magistrates' Courts Code
 * 								e) Hearing Court Number	(v1.1)
 * 								f) Application Status (A-Accept, J-Reject)
 * 								g) Charge Case Allocation Remark
 * 			
 * 
 * <p>Java class for ChargeCaseAllocation.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeCaseAllocation.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Case.V1.0.CT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/&gt;
 *         &lt;element name="FirstHearingDate" type="{CCT}Date.CT" minOccurs="0"/&gt;
 *         &lt;element name="FirstHearingTime" type="{CCT}Time.CT" minOccurs="0"/&gt;
 *         &lt;element name="HearingCourtSys" type="{}CourtSys.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/&gt;
 *         &lt;element name="ChargeCaseAllocationRemark" type="{}ChargeCaseAllocationRemark.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCaseAllocation.V1.0.CT", propOrder = {
    "recordPrefix",
    "firstHearingDate",
    "firstHearingTime",
    "hearingCourtSys",
    "hearingCourtNumber",
    "applicationStatus",
    "chargeCaseAllocationRemark"
})
public class ChargeCaseAllocationV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "FirstHearingDate")
    protected DateCT firstHearingDate;
    @XmlElement(name = "FirstHearingTime")
    protected TimeCT firstHearingTime;
    @XmlElement(name = "HearingCourtSys")
    protected CourtSysV10CT hearingCourtSys;
    @XmlElement(name = "HearingCourtNumber")
    protected HearingCourtNumberV11CT hearingCourtNumber;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "ChargeCaseAllocationRemark")
    protected ChargeCaseAllocationRemarkV10CT chargeCaseAllocationRemark;

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
     * Gets the value of the hearingCourtSys property.
     * 
     * @return
     *     possible object is
     *     {@link CourtSysV10CT }
     *     
     */
    public CourtSysV10CT getHearingCourtSys() {
        return hearingCourtSys;
    }

    /**
     * Sets the value of the hearingCourtSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtSysV10CT }
     *     
     */
    public void setHearingCourtSys(CourtSysV10CT value) {
        this.hearingCourtSys = value;
    }

    /**
     * Gets the value of the hearingCourtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public HearingCourtNumberV11CT getHearingCourtNumber() {
        return hearingCourtNumber;
    }

    /**
     * Sets the value of the hearingCourtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public void setHearingCourtNumber(HearingCourtNumberV11CT value) {
        this.hearingCourtNumber = value;
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
     * Gets the value of the chargeCaseAllocationRemark property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeCaseAllocationRemarkV10CT }
     *     
     */
    public ChargeCaseAllocationRemarkV10CT getChargeCaseAllocationRemark() {
        return chargeCaseAllocationRemark;
    }

    /**
     * Sets the value of the chargeCaseAllocationRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeCaseAllocationRemarkV10CT }
     *     
     */
    public void setChargeCaseAllocationRemark(ChargeCaseAllocationRemarkV10CT value) {
        this.chargeCaseAllocationRemark = value;
    }

}