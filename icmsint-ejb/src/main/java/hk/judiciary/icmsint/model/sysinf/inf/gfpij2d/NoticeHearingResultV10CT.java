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
 * 	Departmental Notices Court Hearing Result
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Interface ID
 * 				c) Record Sequence Number of the given batch
 * 				d) Hearing Date
 * 				e) Hearing Time
 * 				f) Hearing Court Numner
 * 				g) Record Type
 * 				h) Hearing Outcome
 * 				i) Master Judge Code
 * 				j) PleaType
 * 				k) Hearing Order
 * 			
 * 
 * <p>NoticeHearingResult.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NoticeHearingResult.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="HearingInternalNumber" type="{}HearingInternalNumber.V1.0.CT"/>
 *         &lt;element name="AdjudicationDate" type="{CCT}Date.CT"/>
 *         &lt;element name="AdjudicationTime" type="{CCT}Time.CT"/>
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT"/>
 *         &lt;element name="RecordType" type="{}RecordType.V1.0.CT"/>
 *         &lt;element name="HearingOutcome" type="{}HearingOutcome.V1.0.CT"/>
 *         &lt;element name="MasterJudgeCode" type="{}HearingMagistrateCode.V1.1.CT"/>
 *         &lt;element name="PleaType" type="{}PleaType.V1.0.CT" minOccurs="0"/>
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
@XmlType(name = "NoticeHearingResult.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "recordSequenceNumber",
    "hearingInternalNumber",
    "adjudicationDate",
    "adjudicationTime",
    "hearingCourtNumber",
    "recordType",
    "hearingOutcome",
    "masterJudgeCode",
    "pleaType",
    "hearingOrder"
})
public class NoticeHearingResultV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "HearingInternalNumber", required = true)
    protected HearingInternalNumberV10CT hearingInternalNumber;
    @XmlElement(name = "AdjudicationDate", required = true)
    protected DateCT adjudicationDate;
    @XmlElement(name = "AdjudicationTime", required = true)
    protected TimeCT adjudicationTime;
    @XmlElement(name = "HearingCourtNumber", required = true)
    protected HearingCourtNumberV11CT hearingCourtNumber;
    @XmlElement(name = "RecordType", required = true)
    protected RecordTypeV10CT recordType;
    @XmlElement(name = "HearingOutcome", required = true)
    protected HearingOutcomeV10CT hearingOutcome;
    @XmlElement(name = "MasterJudgeCode", required = true)
    protected HearingMagistrateCodeV11CT masterJudgeCode;
    @XmlElement(name = "PleaType")
    protected PleaTypeV10CT pleaType;
    @XmlElement(name = "HearingOrder")
    protected HearingOrderV10CT hearingOrder;

    /**
     * 获取recordPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixV12CT }
     *     
     */
    public PrefixV12CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * 设置recordPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV12CT }
     *     
     */
    public void setRecordPrefix(PrefixV12CT value) {
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
     * 获取adjudicationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getAdjudicationDate() {
        return adjudicationDate;
    }

    /**
     * 设置adjudicationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setAdjudicationDate(DateCT value) {
        this.adjudicationDate = value;
    }

    /**
     * 获取adjudicationTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getAdjudicationTime() {
        return adjudicationTime;
    }

    /**
     * 设置adjudicationTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setAdjudicationTime(TimeCT value) {
        this.adjudicationTime = value;
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
