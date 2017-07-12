//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * order details version 1.3 consists of
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
 * 								s) TCO DIC
 * 								t) Dqr After Imprisonment Indicator
 * 								u) Life Dqr 
 * 								v) Dqr entitlement indicator
 * 								w) Dqr entitlement list
 * 
 *             
 * 
 * <p>Order.V1.3.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Order.V1.3.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkSerialNumber" type="{}LinkSerialNumber.V1.1.CT"/>
 *         &lt;element name="OrderCode" type="{}OrderCode.V1.0.CT"/>
 *         &lt;element name="StartDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="DeadlineDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="Year" type="{}Year.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Month" type="{}Month.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Week" type="{}Week.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Day" type="{}Day.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Hour" type="{}Hour.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OtherYear" type="{}Year.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OtherMonth" type="{}Month.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OtherWeek" type="{}Week.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OtherDay" type="{}Day.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OtherHour" type="{}Hour.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{}CurrencyCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Amount" type="{}Amount.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DICType" type="{}DICType.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="TCODIC" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DqrAfterImp" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="LifeDqr" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DqrEntitlementInd" type="{}DqrEntitlementInd.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DqrEntitlementList" type="{}DqrEntitlementList.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order.V1.3.CT", propOrder = {
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
    "tcodic",
    "dqrAfterImp",
    "lifeDqr",
    "dqrEntitlementInd",
    "dqrEntitlementList"
})
public class OrderV13CT {

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
    @XmlElement(name = "TCODIC")
    protected FieldIndicatorV10CT tcodic;
    @XmlElement(name = "DqrAfterImp")
    protected FieldIndicatorV10CT dqrAfterImp;
    @XmlElement(name = "LifeDqr")
    protected FieldIndicatorV10CT lifeDqr;
    @XmlElement(name = "DqrEntitlementInd")
    protected DqrEntitlementIndV10CT dqrEntitlementInd;
    @XmlElement(name = "DqrEntitlementList")
    protected DqrEntitlementListV10CT dqrEntitlementList;

    /**
     * 获取linkSerialNumber属性的值。
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
     * 设置linkSerialNumber属性的值。
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
     * 获取orderCode属性的值。
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
     * 设置orderCode属性的值。
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
     * 获取startDate属性的值。
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
     * 设置startDate属性的值。
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
     * 获取deadlineDate属性的值。
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
     * 设置deadlineDate属性的值。
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
     * 获取otherYear属性的值。
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
     * 设置otherYear属性的值。
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
     * 获取otherMonth属性的值。
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
     * 设置otherMonth属性的值。
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
     * 获取otherWeek属性的值。
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
     * 设置otherWeek属性的值。
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
     * 获取otherDay属性的值。
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
     * 设置otherDay属性的值。
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
     * 获取otherHour属性的值。
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
     * 设置otherHour属性的值。
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
     * 获取currencyCode属性的值。
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
     * 设置currencyCode属性的值。
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
     * 获取amount属性的值。
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
     * 设置amount属性的值。
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
     * 获取dicType属性的值。
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
     * 设置dicType属性的值。
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
     * 获取tcodic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getTCODIC() {
        return tcodic;
    }

    /**
     * 设置tcodic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setTCODIC(FieldIndicatorV10CT value) {
        this.tcodic = value;
    }

    /**
     * 获取dqrAfterImp属性的值。
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
     * 设置dqrAfterImp属性的值。
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
     * 获取lifeDqr属性的值。
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
     * 设置lifeDqr属性的值。
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
     * 获取dqrEntitlementInd属性的值。
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
     * 设置dqrEntitlementInd属性的值。
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
     * 获取dqrEntitlementList属性的值。
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
     * 设置dqrEntitlementList属性的值。
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
