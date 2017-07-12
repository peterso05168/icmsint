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
 * 	Court Hearing Result
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Record Sequence Number of the given batch
 * 				c) Party Type
 * 				d) Party No
 * 				e) Hearing Internal Number
 * 				f) Hearing Date
 * 				g) Hearing Time
 * 				h) Court Number (v1.1)
 * 				i) Record Type (Normal, Rollback, Chang of Order Detail)
 * 				j) Hearing Type
 * 				k) Hearing Outcome
 * 				l) Master/Judge  (v1.1)
 * 				m) Plea Indicator
 * 				n) Interface Offence Code
 * 				o) Offence Change Indicator
 * 				p) Hearing Order Object
 * 			
 * 
 * <p>HearingResult.V2.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HearingResult.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="PartyType" type="{}PartyType.V1.0.CT"/>
 *         &lt;element name="PartyNo" type="{}PartyNo.V1.0.CT"/>
 *         &lt;element name="HearingInternalNumber" type="{}HearingInternalNumber.V1.0.CT"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT"/>
 *         &lt;element name="RecordType" type="{}RecordType.V1.0.CT"/>
 *         &lt;element name="HearingType" type="{}HearingType.V1.0.CT"/>
 *         &lt;element name="HearingOutcome" type="{}HearingOutcome.V1.0.CT"/>
 *         &lt;element name="MasterJudgeCode" type="{}HearingMagistrateCode.V1.1.CT"/>
 *         &lt;element name="PleaType" type="{}PleaType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="InterfaceOffenceCode" type="{}InterfaceOffenceCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceChangeIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="HearingOrder" type="{}HearingOrder.V1.1.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HearingResult.V2.0.CT", propOrder = {
    "recordPrefix",
    "recordSequenceNumber",
    "partyType",
    "partyNo",
    "hearingInternalNumber",
    "hearingDate",
    "hearingTime",
    "hearingCourtNumber",
    "recordType",
    "hearingType",
    "hearingOutcome",
    "masterJudgeCode",
    "pleaType",
    "interfaceOffenceCode",
    "offenceChangeIndicator",
    "hearingOrder"
})
public class HearingResultV20CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "PartyType", required = true)
    protected PartyTypeV10CT partyType;
    @XmlElement(name = "PartyNo", required = true)
    protected PartyNoV10CT partyNo;
    @XmlElement(name = "HearingInternalNumber", required = true)
    protected HearingInternalNumberV10CT hearingInternalNumber;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "HearingCourtNumber", required = true)
    protected HearingCourtNumberV11CT hearingCourtNumber;
    @XmlElement(name = "RecordType", required = true)
    protected RecordTypeV10CT recordType;
    @XmlElement(name = "HearingType", required = true)
    protected HearingTypeV10CT hearingType;
    @XmlElement(name = "HearingOutcome", required = true)
    protected HearingOutcomeV10CT hearingOutcome;
    @XmlElement(name = "MasterJudgeCode", required = true)
    protected HearingMagistrateCodeV11CT masterJudgeCode;
    @XmlElement(name = "PleaType")
    protected PleaTypeV10CT pleaType;
    @XmlElement(name = "InterfaceOffenceCode")
    protected InterfaceOffenceCodeV10CT interfaceOffenceCode;
    @XmlElement(name = "OffenceChangeIndicator", required = true)
    protected FieldIndicatorV10CT offenceChangeIndicator;
    @XmlElement(name = "HearingOrder")
    protected HearingOrderV11CT hearingOrder;

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
     * ��ȡpartyNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PartyNoV10CT }
     *     
     */
    public PartyNoV10CT getPartyNo() {
        return partyNo;
    }

    /**
     * ����partyNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PartyNoV10CT }
     *     
     */
    public void setPartyNo(PartyNoV10CT value) {
        this.partyNo = value;
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

    /**
     * ��ȡrecordType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordTypeV10CT }
     *     
     */
    public RecordTypeV10CT getRecordType() {
        return recordType;
    }

    /**
     * ����recordType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypeV10CT }
     *     
     */
    public void setRecordType(RecordTypeV10CT value) {
        this.recordType = value;
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
     * ��ȡhearingOutcome���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingOutcomeV10CT }
     *     
     */
    public HearingOutcomeV10CT getHearingOutcome() {
        return hearingOutcome;
    }

    /**
     * ����hearingOutcome���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingOutcomeV10CT }
     *     
     */
    public void setHearingOutcome(HearingOutcomeV10CT value) {
        this.hearingOutcome = value;
    }

    /**
     * ��ȡmasterJudgeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingMagistrateCodeV11CT }
     *     
     */
    public HearingMagistrateCodeV11CT getMasterJudgeCode() {
        return masterJudgeCode;
    }

    /**
     * ����masterJudgeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingMagistrateCodeV11CT }
     *     
     */
    public void setMasterJudgeCode(HearingMagistrateCodeV11CT value) {
        this.masterJudgeCode = value;
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
     * ��ȡinterfaceOffenceCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InterfaceOffenceCodeV10CT }
     *     
     */
    public InterfaceOffenceCodeV10CT getInterfaceOffenceCode() {
        return interfaceOffenceCode;
    }

    /**
     * ����interfaceOffenceCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceOffenceCodeV10CT }
     *     
     */
    public void setInterfaceOffenceCode(InterfaceOffenceCodeV10CT value) {
        this.interfaceOffenceCode = value;
    }

    /**
     * ��ȡoffenceChangeIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getOffenceChangeIndicator() {
        return offenceChangeIndicator;
    }

    /**
     * ����offenceChangeIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setOffenceChangeIndicator(FieldIndicatorV10CT value) {
        this.offenceChangeIndicator = value;
    }

    /**
     * ��ȡhearingOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingOrderV11CT }
     *     
     */
    public HearingOrderV11CT getHearingOrder() {
        return hearingOrder;
    }

    /**
     * ����hearingOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingOrderV11CT }
     *     
     */
    public void setHearingOrder(HearingOrderV11CT value) {
        this.hearingOrder = value;
    }

}
