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
 * court order result details for Fixed Penalty Summons
 * 							Message consists of
 * 							a) Record Prefix
 * 							b) Case Number Object
 * 							c) Demand Note Number
 * 							d) Record Sequence Number in a Batch
 * 							e) Court Result Type
 * 							f) Court Result Code
 * 							g) Hearing Date
 * 							h) Hearing Time
 * 							i) Hearing Court Number
 * 							(for normal FP Summons)
 * 								j) Court Fine Amount
 * 								k) Additional Penalty Amount
 * 								l) Court Costs Amount
 * 								m) Year
 * 								n) Month
 * 								o) Week
 * 								p) Day
 * 								q) Hour
 * 							or (for extended FP Summons)
 * 								j) Hearing Order 
 * 			
 * 
 * <p>FixedPenaltySummonsCourtResult.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltySummonsCourtResult.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="FixedPenaltySummonsCourtResultType" type="{}FixedPenaltySummonsCourtResultType.V1.0.CT"/>
 *         &lt;element name="FixedPenaltySummonsCourtResultCode" type="{}FixedPenaltySummonsCourtResultCode.V1.0.1.CT"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="CourtNumber" type="{}HearingCourtNumber.V1.0.CT"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Penalty" type="{}Amount.V1.0.CT"/>
 *             &lt;element name="AdditionalPenalty" type="{}Amount.V1.0.CT"/>
 *             &lt;element name="CourtCosts" type="{}Amount.V1.0.CT"/>
 *             &lt;element name="Year" type="{}Year.V1.0.CT" minOccurs="0"/>
 *             &lt;element name="Month" type="{}Month.V1.0.CT" minOccurs="0"/>
 *             &lt;element name="Week" type="{}Week.V1.0.CT" minOccurs="0"/>
 *             &lt;element name="Day" type="{}Day.V1.0.CT" minOccurs="0"/>
 *             &lt;element name="Hour" type="{}Hour.V1.0.CT" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="HearingOrder" type="{}HearingOrder.V1.1.CT" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltySummonsCourtResult.V2.0.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "demandNoteNumber",
    "recordSequenceNumber",
    "fixedPenaltySummonsCourtResultType",
    "fixedPenaltySummonsCourtResultCode",
    "hearingDate",
    "hearingTime",
    "courtNumber",
    "penalty",
    "additionalPenalty",
    "courtCosts",
    "year",
    "month",
    "week",
    "day",
    "hour",
    "hearingOrder"
})
public class FixedPenaltySummonsCourtResultV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "FixedPenaltySummonsCourtResultType", required = true)
    protected FixedPenaltySummonsCourtResultTypeV10CT fixedPenaltySummonsCourtResultType;
    @XmlElement(name = "FixedPenaltySummonsCourtResultCode", required = true)
    protected FixedPenaltySummonsCourtResultCodeV101CT fixedPenaltySummonsCourtResultCode;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "CourtNumber", required = true)
    protected HearingCourtNumberV10CT courtNumber;
    @XmlElement(name = "Penalty")
    protected AmountV10CT penalty;
    @XmlElement(name = "AdditionalPenalty")
    protected AmountV10CT additionalPenalty;
    @XmlElement(name = "CourtCosts")
    protected AmountV10CT courtCosts;
    @XmlElement(name = "Year")
    protected YearV10CT year;
    @XmlElement(name = "Month")
    protected MonthV10CT month;
    @XmlElement(name = "Week")
    protected WeekV10CT week;
    @XmlElement(name = "Day")
    protected DayV10CT day;
    @XmlElement(name = "Hour")
    protected HourV10CT hour;
    @XmlElement(name = "HearingOrder")
    protected HearingOrderV11CT hearingOrder;

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
     * 获取recordSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public RecordSequenceNumberV10CT getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * 设置recordSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public void setRecordSequenceNumber(RecordSequenceNumberV10CT value) {
        this.recordSequenceNumber = value;
    }

    /**
     * 获取fixedPenaltySummonsCourtResultType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltySummonsCourtResultTypeV10CT }
     *     
     */
    public FixedPenaltySummonsCourtResultTypeV10CT getFixedPenaltySummonsCourtResultType() {
        return fixedPenaltySummonsCourtResultType;
    }

    /**
     * 设置fixedPenaltySummonsCourtResultType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltySummonsCourtResultTypeV10CT }
     *     
     */
    public void setFixedPenaltySummonsCourtResultType(FixedPenaltySummonsCourtResultTypeV10CT value) {
        this.fixedPenaltySummonsCourtResultType = value;
    }

    /**
     * 获取fixedPenaltySummonsCourtResultCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltySummonsCourtResultCodeV101CT }
     *     
     */
    public FixedPenaltySummonsCourtResultCodeV101CT getFixedPenaltySummonsCourtResultCode() {
        return fixedPenaltySummonsCourtResultCode;
    }

    /**
     * 设置fixedPenaltySummonsCourtResultCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltySummonsCourtResultCodeV101CT }
     *     
     */
    public void setFixedPenaltySummonsCourtResultCode(FixedPenaltySummonsCourtResultCodeV101CT value) {
        this.fixedPenaltySummonsCourtResultCode = value;
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
     * 获取penalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getPenalty() {
        return penalty;
    }

    /**
     * 设置penalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setPenalty(AmountV10CT value) {
        this.penalty = value;
    }

    /**
     * 获取additionalPenalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getAdditionalPenalty() {
        return additionalPenalty;
    }

    /**
     * 设置additionalPenalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setAdditionalPenalty(AmountV10CT value) {
        this.additionalPenalty = value;
    }

    /**
     * 获取courtCosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getCourtCosts() {
        return courtCosts;
    }

    /**
     * 设置courtCosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setCourtCosts(AmountV10CT value) {
        this.courtCosts = value;
    }

    /**
     * 获取year属性的值。
     * 
     * @return
     *     possible object is
     *     {@link YearV10CT }
     *     
     */
    public YearV10CT getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link YearV10CT }
     *     
     */
    public void setYear(YearV10CT value) {
        this.year = value;
    }

    /**
     * 获取month属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MonthV10CT }
     *     
     */
    public MonthV10CT getMonth() {
        return month;
    }

    /**
     * 设置month属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MonthV10CT }
     *     
     */
    public void setMonth(MonthV10CT value) {
        this.month = value;
    }

    /**
     * 获取week属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeekV10CT }
     *     
     */
    public WeekV10CT getWeek() {
        return week;
    }

    /**
     * 设置week属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeekV10CT }
     *     
     */
    public void setWeek(WeekV10CT value) {
        this.week = value;
    }

    /**
     * 获取day属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DayV10CT }
     *     
     */
    public DayV10CT getDay() {
        return day;
    }

    /**
     * 设置day属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DayV10CT }
     *     
     */
    public void setDay(DayV10CT value) {
        this.day = value;
    }

    /**
     * 获取hour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HourV10CT }
     *     
     */
    public HourV10CT getHour() {
        return hour;
    }

    /**
     * 设置hour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HourV10CT }
     *     
     */
    public void setHour(HourV10CT value) {
        this.hour = value;
    }

    /**
     * 获取hearingOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HearingOrderV11CT }
     *     
     */
    public HearingOrderV11CT getHearingOrder() {
        return hearingOrder;
    }

    /**
     * 设置hearingOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HearingOrderV11CT }
     *     
     */
    public void setHearingOrder(HearingOrderV11CT value) {
        this.hearingOrder = value;
    }

}
