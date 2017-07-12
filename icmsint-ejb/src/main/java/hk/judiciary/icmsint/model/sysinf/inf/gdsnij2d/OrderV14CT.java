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
 * order details version 1.4 consists of
 * 								a) Link Serial Number (v1.1)								
 * 								b) Order Code
 * 								c) Start Date
 * 								d) Deadline Date
 * 								e) Year
 * 								f) Month
 * 								g) Week
 * 								h) Day
 * 								i) Hour
 * 								j) Other Year
 * 								k) Other Month
 * 								l) Other Week
 * 								m) Other Day
 * 								n) Other Hour
 * 								o) Currency Code
 * 								p) Order Amount
 * 								r) DIC Type
 * 								s) Dqr Till DIC completion Indicator
 * 								t) Dqr After Imprisonment Indicator
 *                                                                 u) Dqr AFter Dqr Indicator
 *                                                                 v) Dqr Until Retest Indicator
 * 								w) Life Dqr 
 * 								x) Dqr entitlement indicator
 * 								y) Dqr entitlement list
 * 
 *             
 * 
 * <p>Java class for Order.V1.4.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order.V1.4.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkSerialNumber" type="{}LinkSerialNumber.V1.1.CT"/&gt;
 *         &lt;element name="OrderCode" type="{}OrderCode.V1.0.CT"/&gt;
 *         &lt;element name="StartDate" type="{CCT}Date.CT" minOccurs="0"/&gt;
 *         &lt;element name="DeadlineDate" type="{CCT}Date.CT" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{}Year.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Month" type="{}Month.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Week" type="{}Week.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Day" type="{}Day.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Hour" type="{}Hour.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="OtherYear" type="{}Year.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="OtherMonth" type="{}Month.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="OtherWeek" type="{}Week.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="OtherDay" type="{}Day.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="OtherHour" type="{}Hour.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{}CurrencyCode.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{}Amount.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="DICType" type="{}DICType.V1.1.CT" minOccurs="0"/&gt;
 *         &lt;element name="DqrTillDIC" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="DqrAfterImp" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="DqrAfterDqr" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="DqrUntilRetest" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="LifeDqr" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="DqrEntitlementInd" type="{}DqrEntitlementInd.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="DqrEntitlementList" type="{}DqrEntitlementList.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order.V1.4.CT", propOrder = {
    "linkSerialNumber",
    "orderCode",
    "startDate",
    "deadlineDate",
    "year",
    "month",
    "week",
    "day",
    "hour",
    "otherYear",
    "otherMonth",
    "otherWeek",
    "otherDay",
    "otherHour",
    "currencyCode",
    "amount",
    "dicType",
    "dqrTillDIC",
    "dqrAfterImp",
    "dqrAfterDqr",
    "dqrUntilRetest",
    "lifeDqr",
    "dqrEntitlementInd",
    "dqrEntitlementList"
})
public class OrderV14CT {

    @XmlElement(name = "LinkSerialNumber", required = true)
    protected LinkSerialNumberV11CT linkSerialNumber;
    @XmlElement(name = "OrderCode", required = true)
    protected OrderCodeV10CT orderCode;
    @XmlElement(name = "StartDate")
    protected DateCT startDate;
    @XmlElement(name = "DeadlineDate")
    protected DateCT deadlineDate;
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
    @XmlElement(name = "OtherYear")
    protected YearV10CT otherYear;
    @XmlElement(name = "OtherMonth")
    protected MonthV10CT otherMonth;
    @XmlElement(name = "OtherWeek")
    protected WeekV10CT otherWeek;
    @XmlElement(name = "OtherDay")
    protected DayV10CT otherDay;
    @XmlElement(name = "OtherHour")
    protected HourV10CT otherHour;
    @XmlElement(name = "CurrencyCode")
    protected CurrencyCodeV10CT currencyCode;
    @XmlElement(name = "Amount")
    protected AmountV10CT amount;
    @XmlElement(name = "DICType")
    protected DICTypeV11CT dicType;
    @XmlElement(name = "DqrTillDIC")
    protected FieldIndicatorV10CT dqrTillDIC;
    @XmlElement(name = "DqrAfterImp")
    protected FieldIndicatorV10CT dqrAfterImp;
    @XmlElement(name = "DqrAfterDqr")
    protected FieldIndicatorV10CT dqrAfterDqr;
    @XmlElement(name = "DqrUntilRetest")
    protected FieldIndicatorV10CT dqrUntilRetest;
    @XmlElement(name = "LifeDqr")
    protected FieldIndicatorV10CT lifeDqr;
    @XmlElement(name = "DqrEntitlementInd")
    protected DqrEntitlementIndV10CT dqrEntitlementInd;
    @XmlElement(name = "DqrEntitlementList")
    protected DqrEntitlementListV10CT dqrEntitlementList;

    /**
     * Gets the value of the linkSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link LinkSerialNumberV11CT }
     *     
     */
    public LinkSerialNumberV11CT getLinkSerialNumber() {
        return linkSerialNumber;
    }

    /**
     * Sets the value of the linkSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkSerialNumberV11CT }
     *     
     */
    public void setLinkSerialNumber(LinkSerialNumberV11CT value) {
        this.linkSerialNumber = value;
    }

    /**
     * Gets the value of the orderCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCodeV10CT }
     *     
     */
    public OrderCodeV10CT getOrderCode() {
        return orderCode;
    }

    /**
     * Sets the value of the orderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCodeV10CT }
     *     
     */
    public void setOrderCode(OrderCodeV10CT value) {
        this.orderCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setStartDate(DateCT value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the deadlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * Sets the value of the deadlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setDeadlineDate(DateCT value) {
        this.deadlineDate = value;
    }

    /**
     * Gets the value of the year property.
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
     * Sets the value of the year property.
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
     * Gets the value of the month property.
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
     * Sets the value of the month property.
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
     * Gets the value of the week property.
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
     * Sets the value of the week property.
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
     * Gets the value of the day property.
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
     * Sets the value of the day property.
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
     * Gets the value of the hour property.
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
     * Sets the value of the hour property.
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
     * Gets the value of the otherYear property.
     * 
     * @return
     *     possible object is
     *     {@link YearV10CT }
     *     
     */
    public YearV10CT getOtherYear() {
        return otherYear;
    }

    /**
     * Sets the value of the otherYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearV10CT }
     *     
     */
    public void setOtherYear(YearV10CT value) {
        this.otherYear = value;
    }

    /**
     * Gets the value of the otherMonth property.
     * 
     * @return
     *     possible object is
     *     {@link MonthV10CT }
     *     
     */
    public MonthV10CT getOtherMonth() {
        return otherMonth;
    }

    /**
     * Sets the value of the otherMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthV10CT }
     *     
     */
    public void setOtherMonth(MonthV10CT value) {
        this.otherMonth = value;
    }

    /**
     * Gets the value of the otherWeek property.
     * 
     * @return
     *     possible object is
     *     {@link WeekV10CT }
     *     
     */
    public WeekV10CT getOtherWeek() {
        return otherWeek;
    }

    /**
     * Sets the value of the otherWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekV10CT }
     *     
     */
    public void setOtherWeek(WeekV10CT value) {
        this.otherWeek = value;
    }

    /**
     * Gets the value of the otherDay property.
     * 
     * @return
     *     possible object is
     *     {@link DayV10CT }
     *     
     */
    public DayV10CT getOtherDay() {
        return otherDay;
    }

    /**
     * Sets the value of the otherDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayV10CT }
     *     
     */
    public void setOtherDay(DayV10CT value) {
        this.otherDay = value;
    }

    /**
     * Gets the value of the otherHour property.
     * 
     * @return
     *     possible object is
     *     {@link HourV10CT }
     *     
     */
    public HourV10CT getOtherHour() {
        return otherHour;
    }

    /**
     * Sets the value of the otherHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link HourV10CT }
     *     
     */
    public void setOtherHour(HourV10CT value) {
        this.otherHour = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeV10CT }
     *     
     */
    public CurrencyCodeV10CT getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeV10CT }
     *     
     */
    public void setCurrencyCode(CurrencyCodeV10CT value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setAmount(AmountV10CT value) {
        this.amount = value;
    }

    /**
     * Gets the value of the dicType property.
     * 
     * @return
     *     possible object is
     *     {@link DICTypeV11CT }
     *     
     */
    public DICTypeV11CT getDICType() {
        return dicType;
    }

    /**
     * Sets the value of the dicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DICTypeV11CT }
     *     
     */
    public void setDICType(DICTypeV11CT value) {
        this.dicType = value;
    }

    /**
     * Gets the value of the dqrTillDIC property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getDqrTillDIC() {
        return dqrTillDIC;
    }

    /**
     * Sets the value of the dqrTillDIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setDqrTillDIC(FieldIndicatorV10CT value) {
        this.dqrTillDIC = value;
    }

    /**
     * Gets the value of the dqrAfterImp property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getDqrAfterImp() {
        return dqrAfterImp;
    }

    /**
     * Sets the value of the dqrAfterImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setDqrAfterImp(FieldIndicatorV10CT value) {
        this.dqrAfterImp = value;
    }

    /**
     * Gets the value of the dqrAfterDqr property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getDqrAfterDqr() {
        return dqrAfterDqr;
    }

    /**
     * Sets the value of the dqrAfterDqr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setDqrAfterDqr(FieldIndicatorV10CT value) {
        this.dqrAfterDqr = value;
    }

    /**
     * Gets the value of the dqrUntilRetest property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getDqrUntilRetest() {
        return dqrUntilRetest;
    }

    /**
     * Sets the value of the dqrUntilRetest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setDqrUntilRetest(FieldIndicatorV10CT value) {
        this.dqrUntilRetest = value;
    }

    /**
     * Gets the value of the lifeDqr property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getLifeDqr() {
        return lifeDqr;
    }

    /**
     * Sets the value of the lifeDqr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setLifeDqr(FieldIndicatorV10CT value) {
        this.lifeDqr = value;
    }

    /**
     * Gets the value of the dqrEntitlementInd property.
     * 
     * @return
     *     possible object is
     *     {@link DqrEntitlementIndV10CT }
     *     
     */
    public DqrEntitlementIndV10CT getDqrEntitlementInd() {
        return dqrEntitlementInd;
    }

    /**
     * Sets the value of the dqrEntitlementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DqrEntitlementIndV10CT }
     *     
     */
    public void setDqrEntitlementInd(DqrEntitlementIndV10CT value) {
        this.dqrEntitlementInd = value;
    }

    /**
     * Gets the value of the dqrEntitlementList property.
     * 
     * @return
     *     possible object is
     *     {@link DqrEntitlementListV10CT }
     *     
     */
    public DqrEntitlementListV10CT getDqrEntitlementList() {
        return dqrEntitlementList;
    }

    /**
     * Sets the value of the dqrEntitlementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DqrEntitlementListV10CT }
     *     
     */
    public void setDqrEntitlementList(DqrEntitlementListV10CT value) {
        this.dqrEntitlementList = value;
    }

}
