//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notice Of Order Application Message
 *                                                                 Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Defendant Details Object (v1.3)
 * 				c) Offence Date,Time
 *                                 d) Offence Description Format
 * 				e) Offence Location
 * 				f) SOD Details
 * 				g) Offence Description Object
 * 				h) Informant Details Object (v1.2)
 * 				i) Issue Date
 * 				j) Hearing Court Number
 *                                 k) First Hearing Date,Time
 *                         
 * 
 * <p>DeptNoticeOfOrder.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeptNoticeOfOrder.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.3.CT"/>
 *         &lt;element name="OffenceDateTime" type="{}OffenceDateTime.V1.0.CT"/>
 *         &lt;element name="OffenceDescFormat" type="{}OffenceDescFormat.V1.0.CT"/>
 *         &lt;element name="OffenceLocation" type="{}Address.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="SODDetails" type="{}SODKey.V1.1.CT"/>
 *         &lt;element name="OffenceDesc" type="{}OffenceDesc.V1.2.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.2.CT"/>
 *         &lt;element name="IssueDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT"/>
 *         &lt;element name="FirstHearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="FirstHearingTime" type="{CCT}Time.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeptNoticeOfOrder.V2.0.CT", propOrder = {
    "recordPrefix",
    "defendantDetails",
    "offenceDateTime",
    "offenceDescFormat",
    "offenceLocation",
    "sodDetails",
    "offenceDesc",
    "informantDetails",
    "issueDate",
    "hearingCourtNumber",
    "firstHearingDate",
    "firstHearingTime"
})
public class DeptNoticeOfOrderV20CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV13CT defendantDetails;
    @XmlElement(name = "OffenceDateTime", required = true)
    protected OffenceDateTimeV10CT offenceDateTime;
    @XmlElement(name = "OffenceDescFormat", required = true)
    protected OffenceDescFormatV10CT offenceDescFormat;
    @XmlElement(name = "OffenceLocation")
    protected AddressV12CT offenceLocation;
    @XmlElement(name = "SODDetails", required = true)
    protected SODKeyV11CT sodDetails;
    @XmlElement(name = "OffenceDesc", required = true)
    protected OffenceDescV12CT offenceDesc;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV12CT informantDetails;
    @XmlElement(name = "IssueDate", required = true)
    protected DateCT issueDate;
    @XmlElement(name = "HearingCourtNumber", required = true)
    protected HearingCourtNumberV11CT hearingCourtNumber;
    @XmlElement(name = "FirstHearingDate", required = true)
    protected DateCT firstHearingDate;
    @XmlElement(name = "FirstHearingTime", required = true)
    protected TimeCT firstHearingTime;

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
     * 获取defendantDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefendantV13CT }
     *     
     */
    public DefendantV13CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * 设置defendantDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantV13CT }
     *     
     */
    public void setDefendantDetails(DefendantV13CT value) {
        this.defendantDetails = value;
    }

    /**
     * 获取offenceDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceDateTimeV10CT }
     *     
     */
    public OffenceDateTimeV10CT getOffenceDateTime() {
        return offenceDateTime;
    }

    /**
     * 设置offenceDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDateTimeV10CT }
     *     
     */
    public void setOffenceDateTime(OffenceDateTimeV10CT value) {
        this.offenceDateTime = value;
    }

    /**
     * 获取offenceDescFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescFormatV10CT }
     *     
     */
    public OffenceDescFormatV10CT getOffenceDescFormat() {
        return offenceDescFormat;
    }

    /**
     * 设置offenceDescFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescFormatV10CT }
     *     
     */
    public void setOffenceDescFormat(OffenceDescFormatV10CT value) {
        this.offenceDescFormat = value;
    }

    /**
     * 获取offenceLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressV12CT }
     *     
     */
    public AddressV12CT getOffenceLocation() {
        return offenceLocation;
    }

    /**
     * 设置offenceLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV12CT }
     *     
     */
    public void setOffenceLocation(AddressV12CT value) {
        this.offenceLocation = value;
    }

    /**
     * 获取sodDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SODKeyV11CT }
     *     
     */
    public SODKeyV11CT getSODDetails() {
        return sodDetails;
    }

    /**
     * 设置sodDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SODKeyV11CT }
     *     
     */
    public void setSODDetails(SODKeyV11CT value) {
        this.sodDetails = value;
    }

    /**
     * 获取offenceDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescV12CT }
     *     
     */
    public OffenceDescV12CT getOffenceDesc() {
        return offenceDesc;
    }

    /**
     * 设置offenceDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescV12CT }
     *     
     */
    public void setOffenceDesc(OffenceDescV12CT value) {
        this.offenceDesc = value;
    }

    /**
     * 获取informantDetails属性的值。
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
     * 设置informantDetails属性的值。
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
     * 获取issueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getIssueDate() {
        return issueDate;
    }

    /**
     * 设置issueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setIssueDate(DateCT value) {
        this.issueDate = value;
    }

    /**
     * 获取hearingCourtNumber属性的值。
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
     * 设置hearingCourtNumber属性的值。
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

}
