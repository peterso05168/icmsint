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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * consolidated order details per defendant version 1.0 consists of
 * 								a) Defendant Sequence Number
 * 								b) Sentence Period Year
 * 								c) Sentence Period Month
 * 								d) Sentence Period Week
 * 								e) Sentence Period Day
 *                                                                 f) Suspended Sentence Period Year
 * 								g) Suspended Sentence Period Month
 * 								h) Suspended Sentence Period Week
 * 								i) Suspended Sentence Period Day
 * 								j) Payment Order Details Object
 * 								k) Start Date
 * 								l) End Date
 *             
 * 
 * <p>OrderByDefendant.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderByDefendant.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefendantSequenceNumber" type="{}DefendantSequenceNumber.V1.0.CT"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}gMonth" minOccurs="0"/>
 *         &lt;element name="Week" type="{}Week.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}gDay" minOccurs="0"/>
 *         &lt;element name="SuspendedYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="SuspendedMonth" type="{http://www.w3.org/2001/XMLSchema}gMonth" minOccurs="0"/>
 *         &lt;element name="SuspendedWeek" type="{}Week.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="SuspendedDay" type="{http://www.w3.org/2001/XMLSchema}gDay" minOccurs="0"/>
 *         &lt;element name="PaymentOrder" type="{}PaymentOrder.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{CCT}Date.CT"/>
 *         &lt;element name="EndDate" type="{CCT}Date.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderByDefendant.V1.0.CT", propOrder = {
    "defendantSequenceNumber",
    "year",
    "month",
    "week",
    "day",
    "suspendedYear",
    "suspendedMonth",
    "suspendedWeek",
    "suspendedDay",
    "paymentOrder",
    "startDate",
    "endDate"
})
public class OrderByDefendantV10CT {

    @XmlElement(name = "DefendantSequenceNumber", required = true)
    protected DefendantSequenceNumberV10CT defendantSequenceNumber;
    @XmlElement(name = "Year")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;
    @XmlElement(name = "Month")
    @XmlSchemaType(name = "gMonth")
    protected XMLGregorianCalendar month;
    @XmlElement(name = "Week")
    protected WeekV10CT week;
    @XmlElement(name = "Day")
    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar day;
    @XmlElement(name = "SuspendedYear")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar suspendedYear;
    @XmlElement(name = "SuspendedMonth")
    @XmlSchemaType(name = "gMonth")
    protected XMLGregorianCalendar suspendedMonth;
    @XmlElement(name = "SuspendedWeek")
    protected WeekV10CT suspendedWeek;
    @XmlElement(name = "SuspendedDay")
    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar suspendedDay;
    @XmlElement(name = "PaymentOrder")
    protected List<PaymentOrderV10CT> paymentOrder;
    @XmlElement(name = "StartDate", required = true)
    protected DateCT startDate;
    @XmlElement(name = "EndDate")
    protected DateCT endDate;

    /**
     * 获取defendantSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefendantSequenceNumberV10CT }
     *     
     */
    public DefendantSequenceNumberV10CT getDefendantSequenceNumber() {
        return defendantSequenceNumber;
    }

    /**
     * 设置defendantSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantSequenceNumberV10CT }
     *     
     */
    public void setDefendantSequenceNumber(DefendantSequenceNumberV10CT value) {
        this.defendantSequenceNumber = value;
    }

    /**
     * 获取year属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    /**
     * 获取month属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonth() {
        return month;
    }

    /**
     * 设置month属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonth(XMLGregorianCalendar value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDay() {
        return day;
    }

    /**
     * 设置day属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDay(XMLGregorianCalendar value) {
        this.day = value;
    }

    /**
     * 获取suspendedYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendedYear() {
        return suspendedYear;
    }

    /**
     * 设置suspendedYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendedYear(XMLGregorianCalendar value) {
        this.suspendedYear = value;
    }

    /**
     * 获取suspendedMonth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendedMonth() {
        return suspendedMonth;
    }

    /**
     * 设置suspendedMonth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendedMonth(XMLGregorianCalendar value) {
        this.suspendedMonth = value;
    }

    /**
     * 获取suspendedWeek属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeekV10CT }
     *     
     */
    public WeekV10CT getSuspendedWeek() {
        return suspendedWeek;
    }

    /**
     * 设置suspendedWeek属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeekV10CT }
     *     
     */
    public void setSuspendedWeek(WeekV10CT value) {
        this.suspendedWeek = value;
    }

    /**
     * 获取suspendedDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendedDay() {
        return suspendedDay;
    }

    /**
     * 设置suspendedDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendedDay(XMLGregorianCalendar value) {
        this.suspendedDay = value;
    }

    /**
     * Gets the value of the paymentOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentOrderV10CT }
     * 
     * 
     */
    public List<PaymentOrderV10CT> getPaymentOrder() {
        if (paymentOrder == null) {
            paymentOrder = new ArrayList<PaymentOrderV10CT>();
        }
        return this.paymentOrder;
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
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setEndDate(DateCT value) {
        this.endDate = value;
    }

}
