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
 * <p>OrderByCharge.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderByCharge.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyType" type="{}PartyType.V1.0.CT"/>
 *         &lt;element name="PartySequenceNumber" type="{}BasicSequenceNumber.V1.0.CT"/>
 *         &lt;element name="OffenceSequenceNumber" type="{}OffenceSequenceNumber.V1.0.CT"/>
 *         &lt;element name="JJO" type="{}PartyEnglishName.V1.0.CT"/>
 *         &lt;element name="PleaType" type="{}PleaType.V1.0.CT"/>
 *         &lt;element name="HearingResultCode" type="{}OrderCode.V1.0.CT"/>
 *         &lt;element name="SentenceType" type="{}OrderCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}gMonth" minOccurs="0"/>
 *         &lt;element name="Week" type="{}Week.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}gDay" minOccurs="0"/>
 *         &lt;element name="PaymentOrder" type="{}PaymentOrder.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * 获取partyType属性的值。
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
     * 设置partyType属性的值。
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
     * 获取partySequenceNumber属性的值。
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
     * 设置partySequenceNumber属性的值。
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
     * 获取offenceSequenceNumber属性的值。
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
     * 设置offenceSequenceNumber属性的值。
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
     * 获取jjo属性的值。
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
     * 设置jjo属性的值。
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
     * 获取pleaType属性的值。
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
     * 设置pleaType属性的值。
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
     * 获取hearingResultCode属性的值。
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
     * 设置hearingResultCode属性的值。
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
     * 获取sentenceType属性的值。
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
     * 设置sentenceType属性的值。
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
