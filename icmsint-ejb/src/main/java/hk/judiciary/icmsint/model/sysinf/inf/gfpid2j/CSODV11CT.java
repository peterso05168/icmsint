//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SOD details version 1.1 consists of 
 *                                a) SOD Key Object
 *                                b) Prosecution Department Code (1.1)
 *                                c) Status
 *                                d) Effective Date
 *                                e) Short Description in English
 *                                f) Short Description in Chinese (V1.1)
 *                                g) Long Description in English
 *                                h) Long Description in Chinese (V1.1)
 *                                i) Law in English
 *                                j) Law in Chinese (V1.1)
 *                                k) Attachment Indicator
 *                                l) Hearing Weight
 *                                m) Penalty Weight
 *                                n) Fixed Penalty Fine Code
 *                                o) Fixed Penalty Costs Code
 *                                p) Time Bar Offence Period in Months
 *                                q) Time Bar Discover Period in Months                                   
 *             
 * 
 * <p>CSOD.V1.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CSOD.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SODKey" type="{}SODKey.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="Status" type="{}Status.V1.0.CT"/>
 *         &lt;element name="EffectiveDate" type="{CCT}Date.CT"/>
 *         &lt;element name="ShortDescription" type="{}ShortDescription.V1.0.CT"/>
 *         &lt;element name="ShortDescriptionChinese" type="{}ShortDescriptionChinese.V1.1.CT"/>
 *         &lt;element name="LongDescription" type="{}OffenceDescription.V1.0.CT"/>
 *         &lt;element name="LongDescriptionChinese" type="{}OffenceDescriptionChinese.V1.1.CT"/>
 *         &lt;element name="Law" type="{}Law.V1.0.CT"/>
 *         &lt;element name="LawChinese" type="{}LawChinese.V1.1.CT"/>
 *         &lt;element name="AttachmentIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="HearingWeight" type="{}HearingWeight.V1.0.CT"/>
 *         &lt;element name="PenaltyWeight" type="{}PenaltyWeight.V1.0.CT"/>
 *         &lt;element name="FixedPenaltyFineCode" type="{}FixedPenaltyFineCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="FixedPenaltyCostsCode" type="{}FixedPenaltyCostsCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="TimeBarOffence" type="{}TimeBarOffence.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="TimeBarDiscover" type="{}TimeBarDiscover.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSOD.V1.1.CT", propOrder = {
    "sodKey",
    "prosecutionDepartmentCode",
    "status",
    "effectiveDate",
    "shortDescription",
    "shortDescriptionChinese",
    "longDescription",
    "longDescriptionChinese",
    "law",
    "lawChinese",
    "attachmentIndicator",
    "hearingWeight",
    "penaltyWeight",
    "fixedPenaltyFineCode",
    "fixedPenaltyCostsCode",
    "timeBarOffence",
    "timeBarDiscover"
})
public class CSODV11CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV10CT sodKey;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "Status", required = true)
    protected StatusV10CT status;
    @XmlElement(name = "EffectiveDate", required = true)
    protected DateCT effectiveDate;
    @XmlElement(name = "ShortDescription", required = true)
    protected ShortDescriptionV10CT shortDescription;
    @XmlElement(name = "ShortDescriptionChinese", required = true)
    protected ShortDescriptionChineseV11CT shortDescriptionChinese;
    @XmlElement(name = "LongDescription", required = true)
    protected OffenceDescriptionV10CT longDescription;
    @XmlElement(name = "LongDescriptionChinese", required = true)
    protected OffenceDescriptionChineseV11CT longDescriptionChinese;
    @XmlElement(name = "Law", required = true)
    protected LawV10CT law;
    @XmlElement(name = "LawChinese", required = true)
    protected LawChineseV11CT lawChinese;
    @XmlElement(name = "AttachmentIndicator")
    protected FieldIndicatorV10CT attachmentIndicator;
    @XmlElement(name = "HearingWeight", required = true)
    protected HearingWeightV10CT hearingWeight;
    @XmlElement(name = "PenaltyWeight", required = true)
    protected PenaltyWeightV10CT penaltyWeight;
    @XmlElement(name = "FixedPenaltyFineCode")
    protected FixedPenaltyFineCodeV10CT fixedPenaltyFineCode;
    @XmlElement(name = "FixedPenaltyCostsCode")
    protected FixedPenaltyCostsCodeV10CT fixedPenaltyCostsCode;
    @XmlElement(name = "TimeBarOffence")
    protected TimeBarOffenceV10CT timeBarOffence;
    @XmlElement(name = "TimeBarDiscover")
    protected TimeBarDiscoverV10CT timeBarDiscover;

    /**
     * 获取sodKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SODKeyV10CT }
     *     
     */
    public SODKeyV10CT getSODKey() {
        return sodKey;
    }

    /**
     * 设置sodKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SODKeyV10CT }
     *     
     */
    public void setSODKey(SODKeyV10CT value) {
        this.sodKey = value;
    }

    /**
     * 获取prosecutionDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public ProsecutionDepartmentCodeV11CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * 设置prosecutionDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public void setProsecutionDepartmentCode(ProsecutionDepartmentCodeV11CT value) {
        this.prosecutionDepartmentCode = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatusV10CT }
     *     
     */
    public StatusV10CT getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusV10CT }
     *     
     */
    public void setStatus(StatusV10CT value) {
        this.status = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setEffectiveDate(DateCT value) {
        this.effectiveDate = value;
    }

    /**
     * 获取shortDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShortDescriptionV10CT }
     *     
     */
    public ShortDescriptionV10CT getShortDescription() {
        return shortDescription;
    }

    /**
     * 设置shortDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShortDescriptionV10CT }
     *     
     */
    public void setShortDescription(ShortDescriptionV10CT value) {
        this.shortDescription = value;
    }

    /**
     * 获取shortDescriptionChinese属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShortDescriptionChineseV11CT }
     *     
     */
    public ShortDescriptionChineseV11CT getShortDescriptionChinese() {
        return shortDescriptionChinese;
    }

    /**
     * 设置shortDescriptionChinese属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShortDescriptionChineseV11CT }
     *     
     */
    public void setShortDescriptionChinese(ShortDescriptionChineseV11CT value) {
        this.shortDescriptionChinese = value;
    }

    /**
     * 获取longDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionV10CT }
     *     
     */
    public OffenceDescriptionV10CT getLongDescription() {
        return longDescription;
    }

    /**
     * 设置longDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionV10CT }
     *     
     */
    public void setLongDescription(OffenceDescriptionV10CT value) {
        this.longDescription = value;
    }

    /**
     * 获取longDescriptionChinese属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionChineseV11CT }
     *     
     */
    public OffenceDescriptionChineseV11CT getLongDescriptionChinese() {
        return longDescriptionChinese;
    }

    /**
     * 设置longDescriptionChinese属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV11CT }
     *     
     */
    public void setLongDescriptionChinese(OffenceDescriptionChineseV11CT value) {
        this.longDescriptionChinese = value;
    }

    /**
     * 获取law属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LawV10CT }
     *     
     */
    public LawV10CT getLaw() {
        return law;
    }

    /**
     * 设置law属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LawV10CT }
     *     
     */
    public void setLaw(LawV10CT value) {
        this.law = value;
    }

    /**
     * 获取lawChinese属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LawChineseV11CT }
     *     
     */
    public LawChineseV11CT getLawChinese() {
        return lawChinese;
    }

    /**
     * 设置lawChinese属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LawChineseV11CT }
     *     
     */
    public void setLawChinese(LawChineseV11CT value) {
        this.lawChinese = value;
    }

    /**
     * 获取attachmentIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getAttachmentIndicator() {
        return attachmentIndicator;
    }

    /**
     * 设置attachmentIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setAttachmentIndicator(FieldIndicatorV10CT value) {
        this.attachmentIndicator = value;
    }

    /**
     * 获取hearingWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HearingWeightV10CT }
     *     
     */
    public HearingWeightV10CT getHearingWeight() {
        return hearingWeight;
    }

    /**
     * 设置hearingWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HearingWeightV10CT }
     *     
     */
    public void setHearingWeight(HearingWeightV10CT value) {
        this.hearingWeight = value;
    }

    /**
     * 获取penaltyWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PenaltyWeightV10CT }
     *     
     */
    public PenaltyWeightV10CT getPenaltyWeight() {
        return penaltyWeight;
    }

    /**
     * 设置penaltyWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyWeightV10CT }
     *     
     */
    public void setPenaltyWeight(PenaltyWeightV10CT value) {
        this.penaltyWeight = value;
    }

    /**
     * 获取fixedPenaltyFineCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltyFineCodeV10CT }
     *     
     */
    public FixedPenaltyFineCodeV10CT getFixedPenaltyFineCode() {
        return fixedPenaltyFineCode;
    }

    /**
     * 设置fixedPenaltyFineCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltyFineCodeV10CT }
     *     
     */
    public void setFixedPenaltyFineCode(FixedPenaltyFineCodeV10CT value) {
        this.fixedPenaltyFineCode = value;
    }

    /**
     * 获取fixedPenaltyCostsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltyCostsCodeV10CT }
     *     
     */
    public FixedPenaltyCostsCodeV10CT getFixedPenaltyCostsCode() {
        return fixedPenaltyCostsCode;
    }

    /**
     * 设置fixedPenaltyCostsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltyCostsCodeV10CT }
     *     
     */
    public void setFixedPenaltyCostsCode(FixedPenaltyCostsCodeV10CT value) {
        this.fixedPenaltyCostsCode = value;
    }

    /**
     * 获取timeBarOffence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeBarOffenceV10CT }
     *     
     */
    public TimeBarOffenceV10CT getTimeBarOffence() {
        return timeBarOffence;
    }

    /**
     * 设置timeBarOffence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBarOffenceV10CT }
     *     
     */
    public void setTimeBarOffence(TimeBarOffenceV10CT value) {
        this.timeBarOffence = value;
    }

    /**
     * 获取timeBarDiscover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeBarDiscoverV10CT }
     *     
     */
    public TimeBarDiscoverV10CT getTimeBarDiscover() {
        return timeBarDiscover;
    }

    /**
     * 设置timeBarDiscover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBarDiscoverV10CT }
     *     
     */
    public void setTimeBarDiscover(TimeBarDiscoverV10CT value) {
        this.timeBarDiscover = value;
    }

}
