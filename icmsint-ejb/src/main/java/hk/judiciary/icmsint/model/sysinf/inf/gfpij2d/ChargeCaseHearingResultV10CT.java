//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * court order result details for Charge Case
 *                                Derived from Case.V1.0.CT
 *                                Extension consists of
 * 								a) Record Prefix
 * 								b) Court Result Type
 *                                                                 c) Hearing Date
 * 								d) Hearing Time
 *                                                                 e) Hearing Court Number
 *                                                                 f) Hearing Type
 *                                                                 g) Hearing Elapsed Time
 * 								h) Hearing Sequence Number
 * 								i) Order by Charge Details Object
 *                                                                 j) Consolidated Order by Defendant Details Object
 *                                                                 k) Bail/Remand Details Object
 *             
 * 
 * <p>ChargeCaseHearingResult.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChargeCaseHearingResult.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="CourtResultType" type="{}RecordType.V1.0.CT"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="CourtNumber" type="{}HearingCourtNumber.V1.0.CT"/>
 *         &lt;element name="HearingType" type="{}HearingType.V1.0.CT"/>
 *         &lt;element name="HearingElapsedTime" type="{}HearingElapsedTime.V1.0.CT"/>
 *         &lt;element name="HearingSequenceNumber" type="{}HearingInternalNumber.V1.0.CT"/>
 *         &lt;element name="OrderByCharge" type="{}OrderByCharge.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderByDefendant" type="{}OrderByDefendant.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BailRemand" type="{}BailRemand.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCaseHearingResult.V1.0.CT", propOrder = {
    "recordPrefix",
    "courtResultType",
    "hearingDate",
    "hearingTime",
    "courtNumber",
    "hearingType",
    "hearingElapsedTime",
    "hearingSequenceNumber",
    "orderByCharge",
    "orderByDefendant",
    "bailRemand"
})
public class ChargeCaseHearingResultV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "CourtResultType", required = true)
    protected RecordTypeV10CT courtResultType;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "CourtNumber", required = true)
    protected HearingCourtNumberV10CT courtNumber;
    @XmlElement(name = "HearingType", required = true)
    protected HearingTypeV10CT hearingType;
    @XmlElement(name = "HearingElapsedTime", required = true)
    protected HearingElapsedTimeV10CT hearingElapsedTime;
    @XmlElement(name = "HearingSequenceNumber", required = true)
    protected HearingInternalNumberV10CT hearingSequenceNumber;
    @XmlElement(name = "OrderByCharge")
    protected List<OrderByChargeV10CT> orderByCharge;
    @XmlElement(name = "OrderByDefendant")
    protected List<OrderByDefendantV10CT> orderByDefendant;
    @XmlElement(name = "BailRemand")
    protected List<BailRemandV10CT> bailRemand;

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
     * ��ȡcourtResultType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordTypeV10CT }
     *     
     */
    public RecordTypeV10CT getCourtResultType() {
        return courtResultType;
    }

    /**
     * ����courtResultType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypeV10CT }
     *     
     */
    public void setCourtResultType(RecordTypeV10CT value) {
        this.courtResultType = value;
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
     * ��ȡhearingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingTypeV10CT }
     *     
     */
    public HearingTypeV10CT getHearingType() {
        return hearingType;
    }

    /**
     * ����hearingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingTypeV10CT }
     *     
     */
    public void setHearingType(HearingTypeV10CT value) {
        this.hearingType = value;
    }

    /**
     * ��ȡhearingElapsedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingElapsedTimeV10CT }
     *     
     */
    public HearingElapsedTimeV10CT getHearingElapsedTime() {
        return hearingElapsedTime;
    }

    /**
     * ����hearingElapsedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingElapsedTimeV10CT }
     *     
     */
    public void setHearingElapsedTime(HearingElapsedTimeV10CT value) {
        this.hearingElapsedTime = value;
    }

    /**
     * ��ȡhearingSequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public HearingInternalNumberV10CT getHearingSequenceNumber() {
        return hearingSequenceNumber;
    }

    /**
     * ����hearingSequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public void setHearingSequenceNumber(HearingInternalNumberV10CT value) {
        this.hearingSequenceNumber = value;
    }

    /**
     * Gets the value of the orderByCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderByCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderByCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderByChargeV10CT }
     * 
     * 
     */
    public List<OrderByChargeV10CT> getOrderByCharge() {
        if (orderByCharge == null) {
            orderByCharge = new ArrayList<OrderByChargeV10CT>();
        }
        return this.orderByCharge;
    }

    /**
     * Gets the value of the orderByDefendant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderByDefendant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderByDefendant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderByDefendantV10CT }
     * 
     * 
     */
    public List<OrderByDefendantV10CT> getOrderByDefendant() {
        if (orderByDefendant == null) {
            orderByDefendant = new ArrayList<OrderByDefendantV10CT>();
        }
        return this.orderByDefendant;
    }

    /**
     * Gets the value of the bailRemand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bailRemand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBailRemand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BailRemandV10CT }
     * 
     * 
     */
    public List<BailRemandV10CT> getBailRemand() {
        if (bailRemand == null) {
            bailRemand = new ArrayList<BailRemandV10CT>();
        }
        return this.bailRemand;
    }

}
