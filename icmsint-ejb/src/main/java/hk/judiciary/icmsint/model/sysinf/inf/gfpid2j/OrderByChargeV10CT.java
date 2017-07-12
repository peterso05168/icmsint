//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
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
 * <p>OrderByCharge.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpartyType���Ե�ֵ��
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
     * ����partyType���Ե�ֵ��
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
     * ��ȡpartySequenceNumber���Ե�ֵ��
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
     * ����partySequenceNumber���Ե�ֵ��
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
     * ��ȡoffenceSequenceNumber���Ե�ֵ��
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
     * ����offenceSequenceNumber���Ե�ֵ��
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
     * ��ȡjjo���Ե�ֵ��
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
     * ����jjo���Ե�ֵ��
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
     * ��ȡpleaType���Ե�ֵ��
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
     * ����pleaType���Ե�ֵ��
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
     * ��ȡhearingResultCode���Ե�ֵ��
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
     * ����hearingResultCode���Ե�ֵ��
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
     * ��ȡsentenceType���Ե�ֵ��
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
     * ����sentenceType���Ե�ֵ��
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
     * ��ȡyear���Ե�ֵ��
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
     * ����year���Ե�ֵ��
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
     * ��ȡmonth���Ե�ֵ��
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
     * ����month���Ե�ֵ��
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDay() {
        return day;
    }

    /**
     * ����day���Ե�ֵ��
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
