//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:51:00 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * order details per charge version 1.0 consists of
 * 								a) Party Type
 * 								b) Party Sequence Number
 * 								c) Offence Sequence Number
 * 								d) JJO Name
 * 								e) Plea Type
 * 								f) Hearing Result Code
 * 								g) Hearing Result Description
 * 								h) Sentence Period Year
 * 								i) Sentence Period Month
 * 								j) Sentence Period Week
 * 								k) Sentence Period Day
 * 								l) Payment Order Details Object
 *             
 * 
 * <p>Java class for OrderByCharge.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderByCharge.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyType" type="{}PartyType.V1.0.CT"/&gt;
 *         &lt;element name="PartySequenceNumber" type="{}BasicSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="OffenceSequenceNumber" type="{}OffenceSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="JJO" type="{}PartyEnglishName.V1.0.CT"/&gt;
 *         &lt;element name="PleaType" type="{}PleaType.V1.0.CT"/&gt;
 *         &lt;element name="HearingResultCode" type="{}OrderCode.V1.0.CT"/&gt;
 *         &lt;element name="SentenceType" type="{}OrderCode.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}gMonth" minOccurs="0"/&gt;
 *         &lt;element name="Week" type="{}Week.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}gDay" minOccurs="0"/&gt;
 *         &lt;element name="PaymentOrder" type="{}PaymentOrder.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderByCharge.V1.0.CT", propOrder = {
    "partyType",
    "partySequenceNumber",
    "offenceSequenceNumber",
    "jjo",
    "pleaType",
    "hearingResultCode",
    "sentenceType",
    "year",
    "month",
    "week",
    "day",
    "paymentOrder"
})
public class OrderByChargeV10CT {

    @XmlElement(name = "PartyType", required = true)
    protected PartyTypeV10CT partyType;
    @XmlElement(name = "PartySequenceNumber", required = true)
    protected BasicSequenceNumberV10CT partySequenceNumber;
    @XmlElement(name = "OffenceSequenceNumber", required = true)
    protected OffenceSequenceNumberV10CT offenceSequenceNumber;
    @XmlElement(name = "JJO", required = true)
    protected PartyEnglishNameV10CT jjo;
    @XmlElement(name = "PleaType", required = true)
    protected PleaTypeV10CT pleaType;
    @XmlElement(name = "HearingResultCode", required = true)
    protected OrderCodeV10CT hearingResultCode;
    @XmlElement(name = "SentenceType")
    protected OrderCodeV10CT sentenceType;
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
    @XmlElement(name = "PaymentOrder")
    protected List<PaymentOrderV10CT> paymentOrder;

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTypeV10CT }
     *     
     */
    public PartyTypeV10CT getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTypeV10CT }
     *     
     */
    public void setPartyType(PartyTypeV10CT value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the partySequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BasicSequenceNumberV10CT }
     *     
     */
    public BasicSequenceNumberV10CT getPartySequenceNumber() {
        return partySequenceNumber;
    }

    /**
     * Sets the value of the partySequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicSequenceNumberV10CT }
     *     
     */
    public void setPartySequenceNumber(BasicSequenceNumberV10CT value) {
        this.partySequenceNumber = value;
    }

    /**
     * Gets the value of the offenceSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceSequenceNumberV10CT }
     *     
     */
    public OffenceSequenceNumberV10CT getOffenceSequenceNumber() {
        return offenceSequenceNumber;
    }

    /**
     * Sets the value of the offenceSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceSequenceNumberV10CT }
     *     
     */
    public void setOffenceSequenceNumber(OffenceSequenceNumberV10CT value) {
        this.offenceSequenceNumber = value;
    }

    /**
     * Gets the value of the jjo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyEnglishNameV10CT }
     *     
     */
    public PartyEnglishNameV10CT getJJO() {
        return jjo;
    }

    /**
     * Sets the value of the jjo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnglishNameV10CT }
     *     
     */
    public void setJJO(PartyEnglishNameV10CT value) {
        this.jjo = value;
    }

    /**
     * Gets the value of the pleaType property.
     * 
     * @return
     *     possible object is
     *     {@link PleaTypeV10CT }
     *     
     */
    public PleaTypeV10CT getPleaType() {
        return pleaType;
    }

    /**
     * Sets the value of the pleaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PleaTypeV10CT }
     *     
     */
    public void setPleaType(PleaTypeV10CT value) {
        this.pleaType = value;
    }

    /**
     * Gets the value of the hearingResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCodeV10CT }
     *     
     */
    public OrderCodeV10CT getHearingResultCode() {
        return hearingResultCode;
    }

    /**
     * Sets the value of the hearingResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCodeV10CT }
     *     
     */
    public void setHearingResultCode(OrderCodeV10CT value) {
        this.hearingResultCode = value;
    }

    /**
     * Gets the value of the sentenceType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCodeV10CT }
     *     
     */
    public OrderCodeV10CT getSentenceType() {
        return sentenceType;
    }

    /**
     * Sets the value of the sentenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCodeV10CT }
     *     
     */
    public void setSentenceType(OrderCodeV10CT value) {
        this.sentenceType = value;
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

}
