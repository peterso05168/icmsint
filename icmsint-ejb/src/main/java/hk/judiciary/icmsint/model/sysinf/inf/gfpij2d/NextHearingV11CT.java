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
 * 	Next Hearing Date
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Interface ID
 * 				c) Record Sequence Number
 * 				d) Hearing Internal Number
 * 				e) Record Status
 * 				f) Next Hearing Date
 * 				g) Next Hearing Time
 * 				h) Hearing Type
 * 				i) Hearing Court Sys
 * 				i) Court Number (v1.1)
 * 			
 * 
 * <p>NextHearing.V1.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="NextHearing.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="HearingInternalNumber" type="{}HearingInternalNumber.V1.0.CT"/>
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.0.CT"/>
 *         &lt;element name="NextHearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="NextHearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="HearingType" type="{}HearingType.V1.0.CT"/>
 *         &lt;element name="HearingCourtSys" type="{}CourtSys.V1.0.CT"/>
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextHearing.V1.1.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "recordSequenceNumber",
    "hearingInternalNumber",
    "recordStatus",
    "nextHearingDate",
    "nextHearingTime",
    "hearingType",
    "hearingCourtSys",
    "hearingCourtNumber"
})
public class NextHearingV11CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "HearingInternalNumber", required = true)
    protected HearingInternalNumberV10CT hearingInternalNumber;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV10CT recordStatus;
    @XmlElement(name = "NextHearingDate", required = true)
    protected DateCT nextHearingDate;
    @XmlElement(name = "NextHearingTime", required = true)
    protected TimeCT nextHearingTime;
    @XmlElement(name = "HearingType", required = true)
    protected HearingTypeV10CT hearingType;
    @XmlElement(name = "HearingCourtSys", required = true)
    protected CourtSysV10CT hearingCourtSys;
    @XmlElement(name = "HearingCourtNumber", required = true)
    protected HearingCourtNumberV11CT hearingCourtNumber;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PrefixV10CT }
     *     
     */
    public PrefixV10CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * ����recordPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV10CT }
     *     
     */
    public void setRecordPrefix(PrefixV10CT value) {
        this.recordPrefix = value;
    }

    /**
     * ��ȡinterfaceID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public InterfaceIDV10CT getInterfaceID() {
        return interfaceID;
    }

    /**
     * ����interfaceID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public void setInterfaceID(InterfaceIDV10CT value) {
        this.interfaceID = value;
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
     * ��ȡhearingInternalNumber���Ե�ֵ��
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
     * ����hearingInternalNumber���Ե�ֵ��
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
     * ��ȡrecordStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordStatusV10CT }
     *     
     */
    public RecordStatusV10CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * ����recordStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV10CT }
     *     
     */
    public void setRecordStatus(RecordStatusV10CT value) {
        this.recordStatus = value;
    }

    /**
     * ��ȡnextHearingDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getNextHearingDate() {
        return nextHearingDate;
    }

    /**
     * ����nextHearingDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setNextHearingDate(DateCT value) {
        this.nextHearingDate = value;
    }

    /**
     * ��ȡnextHearingTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getNextHearingTime() {
        return nextHearingTime;
    }

    /**
     * ����nextHearingTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setNextHearingTime(TimeCT value) {
        this.nextHearingTime = value;
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
     * ��ȡhearingCourtSys���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CourtSysV10CT }
     *     
     */
    public CourtSysV10CT getHearingCourtSys() {
        return hearingCourtSys;
    }

    /**
     * ����hearingCourtSys���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CourtSysV10CT }
     *     
     */
    public void setHearingCourtSys(CourtSysV10CT value) {
        this.hearingCourtSys = value;
    }

    /**
     * ��ȡhearingCourtNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public HearingCourtNumberV11CT getHearingCourtNumber() {
        return hearingCourtNumber;
    }

    /**
     * ����hearingCourtNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public void setHearingCourtNumber(HearingCourtNumberV11CT value) {
        this.hearingCourtNumber = value;
    }

}
