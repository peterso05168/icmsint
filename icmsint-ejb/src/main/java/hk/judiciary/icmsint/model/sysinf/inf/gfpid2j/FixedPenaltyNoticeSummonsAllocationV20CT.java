//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * case number and first hearing date allocation details 
 *                                for fixed penalty notice/ summons.  Message consists of
 * 								a) Record Prefix
 * 								b) Demand Note Number
 * 								c) Case Number Object
 * 								d) First Hearing Date/Time
 * 								e) Hearing Court Number
 * 								f) Application Status
 * 								g) Rejection Details
 *            
 * 
 * <p>FixedPenaltyNoticeSummonsAllocation.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyNoticeSummonsAllocation.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="FirstHearingDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="FirstHearingTime" type="{CCT}Time.CT" minOccurs="0"/>
 *         &lt;element name="CourtNumber" type="{}HearingCourtNumber.V1.1.CT" minOccurs="0"/>
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
@XmlType(name = "FixedPenaltyNoticeSummonsAllocation.V2.0.CT", propOrder = {
    "recordPrefix",
    "demandNoteNumber",
    "caseNumber",
    "firstHearingDate",
    "firstHearingTime",
    "courtNumber",
    "applicationStatus",
    "rejectionDetails"
})
public class FixedPenaltyNoticeSummonsAllocationV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "CaseNumber")
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "FirstHearingDate")
    protected DateCT firstHearingDate;
    @XmlElement(name = "FirstHearingTime")
    protected TimeCT firstHearingTime;
    @XmlElement(name = "CourtNumber")
    protected HearingCourtNumberV11CT courtNumber;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "RejectionDetails")
    protected List<ErrorDetailsV10CT> rejectionDetails;

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
     * 获取firstHearingDate属性的值。
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
     * 设置firstHearingDate属性的值。
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
     * 获取firstHearingTime属性的值。
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
     * 设置firstHearingTime属性的值。
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
     * 获取courtNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public HearingCourtNumberV11CT getCourtNumber() {
        return courtNumber;
    }

    /**
     * 设置courtNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public void setCourtNumber(HearingCourtNumberV11CT value) {
        this.courtNumber = value;
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
