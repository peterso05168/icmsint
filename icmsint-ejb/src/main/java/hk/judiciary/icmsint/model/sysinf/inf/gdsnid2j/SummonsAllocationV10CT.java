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
 * 	Summons Allocation
 * 								Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Interface ID	
 * 				c) First Hearing Date
 * 				d) First Hearing Time
 * 				e) Hearing Court Number	(v1.1)
 * 				f) Application Status (A-Accept, J-Reject)
 * 				g) Summons Allocation Remark			
 * 			
 * 
 * <p>Java class for SummonsAllocation.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummonsAllocation.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="FirstHearingDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="FirstHearingTime" type="{CCT}Time.CT" minOccurs="0"/>
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/>
 *         &lt;element name="SummonsAllocationRemark" type="{}SummonsAllocationRemark.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummonsAllocation.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "firstHearingDate",
    "firstHearingTime",
    "hearingCourtNumber",
    "applicationStatus",
    "summonsAllocationRemark"
})
public class SummonsAllocationV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "FirstHearingDate")
    protected DateCT firstHearingDate;
    @XmlElement(name = "FirstHearingTime")
    protected TimeCT firstHearingTime;
    @XmlElement(name = "HearingCourtNumber")
    protected HearingCourtNumberV11CT hearingCourtNumber;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "SummonsAllocationRemark")
    protected SummonsAllocationRemarkV10CT summonsAllocationRemark;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV10CT }
     *     
     */
    public PrefixV10CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV10CT }
     *     
     */
    public void setRecordPrefix(PrefixV10CT value) {
        this.recordPrefix = value;
    }

    /**
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public InterfaceIDV10CT getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public void setInterfaceID(InterfaceIDV10CT value) {
        this.interfaceID = value;
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
     * Gets the value of the summonsAllocationRemark property.
     * 
     * @return
     *     possible object is
     *     {@link SummonsAllocationRemarkV10CT }
     *     
     */
    public SummonsAllocationRemarkV10CT getSummonsAllocationRemark() {
        return summonsAllocationRemark;
    }

    /**
     * Sets the value of the summonsAllocationRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummonsAllocationRemarkV10CT }
     *     
     */
    public void setSummonsAllocationRemark(SummonsAllocationRemarkV10CT value) {
        this.summonsAllocationRemark = value;
    }

}
