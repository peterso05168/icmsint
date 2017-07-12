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
 * 	Court Hearing Result
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Interface ID
 * 				c) Record Sequence Number of the given batch
 * 				d) Party Type
 * 				e) Party No
 * 				d) Hearing Internal Number
 * 				e) Hearing Date
 * 				f) Hearing Time
 * 				g) Court Number (v1.1)
 * 				i) Record Type (Normal, Rollback, Chang of Order Detail)
 * 				j) Hearing Type
 * 				k) Hearing Outcome
 * 				l) Master/Judge  (v1.1)
 * 				m) Plea Indicator
 * 				n) Interface Offence Code
 * 				o) Interface Type
 * 				p) Offence Change Indicator
 * 				q) Hearing Order Object
 * 			
 * 
 * <p>HearingResult.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HearingResult.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
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
 *         &lt;element name="HearingOrder" type="{}HearingOrder.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HearingResult.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
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
public class HearingResultV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
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
    protected HearingOrderV10CT hearingOrder;

    /**
     * 获取recordPrefix属性的值。
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
     * 设置recordPrefix属性的值。
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
     * 获取interfaceID属性的值。
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
     * 设置interfaceID属性的值。
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
     * 获取recordSequenceNumber属性的值。
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
     * 设置recordSequenceNumber属性的值。
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
     * 获取partyNo属性的值。
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
     * 设置partyNo属性的值。
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
     * 获取hearingDate属性的值。
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
     * 设置hearingDate属性的值。
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
     * 获取hearingTime属性的值。
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
     * 设置hearingTime属性的值。
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
     * 获取hearingCourtNumber属性的值。
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
     * 设置hearingCourtNumber属性的值。
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
     * 获取recordType属性的值。
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
     * 设置recordType属性的值。
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
     * 获取hearingType属性的值。
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
     * 设置hearingType属性的值。
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
     * 获取hearingOutcome属性的值。
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
     * 设置hearingOutcome属性的值。
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
     * 获取masterJudgeCode属性的值。
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
     * 设置masterJudgeCode属性的值。
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
     * 获取interfaceOffenceCode属性的值。
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
     * 设置interfaceOffenceCode属性的值。
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
     * 获取offenceChangeIndicator属性的值。
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
     * 设置offenceChangeIndicator属性的值。
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
     * 获取hearingOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HearingOrderV10CT }
     *     
     */
    public HearingOrderV10CT getHearingOrder() {
        return hearingOrder;
    }

    /**
     * 设置hearingOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HearingOrderV10CT }
     *     
     */
    public void setHearingOrder(HearingOrderV10CT value) {
        this.hearingOrder = value;
    }

}
