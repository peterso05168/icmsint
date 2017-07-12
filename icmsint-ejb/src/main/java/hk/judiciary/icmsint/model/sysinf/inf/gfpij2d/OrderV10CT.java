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
 * order details consists of 
 *                                a) Hearing Internal Number
 *                                b) Order Internal Number
 *                                c) Order Code
 *                                d) Start Date
 *                                e) Year
 *                                f) Month
 *                                g) Week
 *                                h) Day
 *                                i) Hour
 *                                j) Currency Code
 *                                k) Order Amount
 *             
 * 
 * <p>Order.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Order.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HearingInternalNumber" type="{}HearingInternalNumber.V1.0.CT"/>
 *         &lt;element name="OrderInternalNumber" type="{}OrderInternalNumber.V1.0.CT"/>
 *         &lt;element name="OrderCode" type="{}OrderCode.V1.0.CT"/>
 *         &lt;element name="StartDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="Year" type="{}Year.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Month" type="{}Month.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Week" type="{}Week.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Day" type="{}Day.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Hour" type="{}Hour.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{}CurrencyCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Amount" type="{}Amount.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order.V1.0.CT", propOrder = {
    "hearingInternalNumber",
    "orderInternalNumber",
    "orderCode",
    "startDate",
    "year",
    "month",
    "week",
    "day",
    "hour",
    "currencyCode",
    "amount"
})
public class OrderV10CT {

    @XmlElement(name = "HearingInternalNumber", required = true)
    protected HearingInternalNumberV10CT hearingInternalNumber;
    @XmlElement(name = "OrderInternalNumber", required = true)
    protected OrderInternalNumberV10CT orderInternalNumber;
    @XmlElement(name = "OrderCode", required = true)
    protected OrderCodeV10CT orderCode;
    @XmlElement(name = "StartDate")
    protected DateCT startDate;
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
    @XmlElement(name = "CurrencyCode")
    protected CurrencyCodeV10CT currencyCode;
    @XmlElement(name = "Amount")
    protected AmountV10CT amount;

    /**
     * 获取hearingInternalNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public HearingInternalNumberV10CT getHearingInternalNumber() {
        return hearingInternalNumber;
    }

    /**
     * 设置hearingInternalNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public void setHearingInternalNumber(HearingInternalNumberV10CT value) {
        this.hearingInternalNumber = value;
    }

    /**
     * 获取orderInternalNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderInternalNumberV10CT }
     *     
     */
    public OrderInternalNumberV10CT getOrderInternalNumber() {
        return orderInternalNumber;
    }

    /**
     * 设置orderInternalNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInternalNumberV10CT }
     *     
     */
    public void setOrderInternalNumber(OrderInternalNumberV10CT value) {
        this.orderInternalNumber = value;
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

}
