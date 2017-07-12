//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * court order result details for Charge Case
 *                                Derived from Case.V1.0.CT
 *                                Extension consists of
 * 								a) Record Prefix
 * 								b) Court Result Type
 *                                                                 c) Hearing Date
 * 								d) Hearing Time
 *                                                                 e) Hearing Court Number
 *                                                                 f) Hearing Type
 *                                                                 g) Hearing Elapsed Time
 * 								h) Hearing Sequence Number
 * 								i) Order by Charge Details Object
 *                                                                 j) Consolidated Order by Defendant Details Object
 *                                                                 k) Bail/Remand Details Object
 *             
 * 
 * <p>ChargeCaseHearingResult.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ChargeCaseHearingResult.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="CourtResultType" type="{}RecordType.V1.0.CT"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="CourtNumber" type="{}HearingCourtNumber.V1.0.CT"/>
 *         &lt;element name="HearingType" type="{}HearingType.V1.0.CT"/>
 *         &lt;element name="HearingElapsedTime" type="{}HearingElapsedTime.V1.0.CT"/>
 *         &lt;element name="HearingSequenceNumber" type="{}HearingInternalNumber.V1.0.CT"/>
 *         &lt;element name="OrderByCharge" type="{}OrderByCharge.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderByDefendant" type="{}OrderByDefendant.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BailRemand" type="{}BailRemand.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCaseHearingResult.V1.0.CT", propOrder = {
    "recordPrefix",
    "courtResultType",
    "hearingDate",
    "hearingTime",
    "courtNumber",
    "hearingType",
    "hearingElapsedTime",
    "hearingSequenceNumber",
    "orderByCharge",
    "orderByDefendant",
    "bailRemand"
})
public class ChargeCaseHearingResultV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "CourtResultType", required = true)
    protected RecordTypeV10CT courtResultType;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "CourtNumber", required = true)
    protected HearingCourtNumberV10CT courtNumber;
    @XmlElement(name = "HearingType", required = true)
    protected HearingTypeV10CT hearingType;
    @XmlElement(name = "HearingElapsedTime", required = true)
    protected HearingElapsedTimeV10CT hearingElapsedTime;
    @XmlElement(name = "HearingSequenceNumber", required = true)
    protected HearingInternalNumberV10CT hearingSequenceNumber;
    @XmlElement(name = "OrderByCharge")
    protected List<OrderByChargeV10CT> orderByCharge;
    @XmlElement(name = "OrderByDefendant")
    protected List<OrderByDefendantV10CT> orderByDefendant;
    @XmlElement(name = "BailRemand")
    protected List<BailRemandV10CT> bailRemand;

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
     * 获取courtResultType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordTypeV10CT }
     *     
     */
    public RecordTypeV10CT getCourtResultType() {
        return courtResultType;
    }

    /**
     * 设置courtResultType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypeV10CT }
     *     
     */
    public void setCourtResultType(RecordTypeV10CT value) {
        this.courtResultType = value;
    }

    /**
     * 获取hearingDate属性的值。
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
     * 设置hearingDate属性的值。
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
     * 获取hearingTime属性的值。
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
     * 设置hearingTime属性的值。
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
     * 获取courtNumber属性的值。
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
     * 设置courtNumber属性的值。
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
     * 获取hearingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HearingTypeV10CT }
     *     
     */
    public HearingTypeV10CT getHearingType() {
        return hearingType;
    }

    /**
     * 设置hearingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HearingTypeV10CT }
     *     
     */
    public void setHearingType(HearingTypeV10CT value) {
        this.hearingType = value;
    }

    /**
     * 获取hearingElapsedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HearingElapsedTimeV10CT }
     *     
     */
    public HearingElapsedTimeV10CT getHearingElapsedTime() {
        return hearingElapsedTime;
    }

    /**
     * 设置hearingElapsedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HearingElapsedTimeV10CT }
     *     
     */
    public void setHearingElapsedTime(HearingElapsedTimeV10CT value) {
        this.hearingElapsedTime = value;
    }

    /**
     * 获取hearingSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public HearingInternalNumberV10CT getHearingSequenceNumber() {
        return hearingSequenceNumber;
    }

    /**
     * 设置hearingSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public void setHearingSequenceNumber(HearingInternalNumberV10CT value) {
        this.hearingSequenceNumber = value;
    }

    /**
     * Gets the value of the orderByCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderByCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderByCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderByChargeV10CT }
     * 
     * 
     */
    public List<OrderByChargeV10CT> getOrderByCharge() {
        if (orderByCharge == null) {
            orderByCharge = new ArrayList<OrderByChargeV10CT>();
        }
        return this.orderByCharge;
    }

    /**
     * Gets the value of the orderByDefendant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderByDefendant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderByDefendant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderByDefendantV10CT }
     * 
     * 
     */
    public List<OrderByDefendantV10CT> getOrderByDefendant() {
        if (orderByDefendant == null) {
            orderByDefendant = new ArrayList<OrderByDefendantV10CT>();
        }
        return this.orderByDefendant;
    }

    /**
     * Gets the value of the bailRemand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bailRemand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBailRemand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BailRemandV10CT }
     * 
     * 
     */
    public List<BailRemandV10CT> getBailRemand() {
        if (bailRemand == null) {
            bailRemand = new ArrayList<BailRemandV10CT>();
        }
        return this.bailRemand;
    }

}
