//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.03 at 10:31:06 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j;

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
 * <p>Java class for OrderByDefendant.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the defendantSequenceNumber property.
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
     * Sets the value of the defendantSequenceNumber property.
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
     * Gets the value of the year property.
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
     * Sets the value of the year property.
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
     * Gets the value of the month property.
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
     * Sets the value of the month property.
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
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
     * Gets the value of the suspendedYear property.
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
     * Sets the value of the suspendedYear property.
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
     * Gets the value of the suspendedMonth property.
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
     * Sets the value of the suspendedMonth property.
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
     * Gets the value of the suspendedWeek property.
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
     * Sets the value of the suspendedWeek property.
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
     * Gets the value of the suspendedDay property.
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
     * Sets the value of the suspendedDay property.
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
     * Gets the value of the endDate property.
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
     * Sets the value of the endDate property.
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
