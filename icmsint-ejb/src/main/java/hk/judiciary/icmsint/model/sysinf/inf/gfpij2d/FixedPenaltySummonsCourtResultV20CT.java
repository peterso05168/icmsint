//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
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
 * <p>FixedPenaltySummonsCourtResult.V2.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrecordPrefix���Ե�ֵ��
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
     * ����recordPrefix���Ե�ֵ��
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
     * ��ȡcaseNumber���Ե�ֵ��
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
     * ����caseNumber���Ե�ֵ��
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
     * ��ȡdemandNoteNumber���Ե�ֵ��
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
     * ����demandNoteNumber���Ե�ֵ��
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
     * ��ȡrecordSequenceNumber���Ե�ֵ��
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
     * ����recordSequenceNumber���Ե�ֵ��
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
     * ��ȡfixedPenaltySummonsCourtResultType���Ե�ֵ��
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
     * ����fixedPenaltySummonsCourtResultType���Ե�ֵ��
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
     * ��ȡfixedPenaltySummonsCourtResultCode���Ե�ֵ��
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
     * ����fixedPenaltySummonsCourtResultCode���Ե�ֵ��
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
     * ��ȡhearingDate���Ե�ֵ��
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
     * ����hearingDate���Ե�ֵ��
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
     * ��ȡhearingTime���Ե�ֵ��
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
     * ����hearingTime���Ե�ֵ��
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
     * ��ȡcourtNumber���Ե�ֵ��
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
     * ����courtNumber���Ե�ֵ��
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
     * ��ȡpenalty���Ե�ֵ��
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
     * ����penalty���Ե�ֵ��
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
     * ��ȡadditionalPenalty���Ե�ֵ��
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
     * ����additionalPenalty���Ե�ֵ��
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
     * ��ȡcourtCosts���Ե�ֵ��
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
     * ����courtCosts���Ե�ֵ��
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
     * ��ȡyear���Ե�ֵ��
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
     * ����year���Ե�ֵ��
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
     * ��ȡmonth���Ե�ֵ��
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
     * ����month���Ե�ֵ��
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
     * ��ȡweek���Ե�ֵ��
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
     * ����week���Ե�ֵ��
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
     * ��ȡday���Ե�ֵ��
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
     * ����day���Ե�ֵ��
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
     * ��ȡhour���Ե�ֵ��
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
     * ����hour���Ե�ֵ��
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
     * ��ȡhearingOrder���Ե�ֵ��
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
     * ����hearingOrder���Ե�ֵ��
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
