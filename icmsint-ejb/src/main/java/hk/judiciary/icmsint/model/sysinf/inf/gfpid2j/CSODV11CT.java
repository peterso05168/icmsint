//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
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
 * <p>CSOD.V1.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsodKey���Ե�ֵ��
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
     * ����sodKey���Ե�ֵ��
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
     * ��ȡprosecutionDepartmentCode���Ե�ֵ��
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
     * ����prosecutionDepartmentCode���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡeffectiveDate���Ե�ֵ��
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
     * ����effectiveDate���Ե�ֵ��
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
     * ��ȡshortDescription���Ե�ֵ��
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
     * ����shortDescription���Ե�ֵ��
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
     * ��ȡshortDescriptionChinese���Ե�ֵ��
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
     * ����shortDescriptionChinese���Ե�ֵ��
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
     * ��ȡlongDescription���Ե�ֵ��
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
     * ����longDescription���Ե�ֵ��
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
     * ��ȡlongDescriptionChinese���Ե�ֵ��
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
     * ����longDescriptionChinese���Ե�ֵ��
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
     * ��ȡlaw���Ե�ֵ��
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
     * ����law���Ե�ֵ��
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
     * ��ȡlawChinese���Ե�ֵ��
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
     * ����lawChinese���Ե�ֵ��
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
     * ��ȡattachmentIndicator���Ե�ֵ��
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
     * ����attachmentIndicator���Ե�ֵ��
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
     * ��ȡhearingWeight���Ե�ֵ��
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
     * ����hearingWeight���Ե�ֵ��
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
     * ��ȡpenaltyWeight���Ե�ֵ��
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
     * ����penaltyWeight���Ե�ֵ��
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
     * ��ȡfixedPenaltyFineCode���Ե�ֵ��
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
     * ����fixedPenaltyFineCode���Ե�ֵ��
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
     * ��ȡfixedPenaltyCostsCode���Ե�ֵ��
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
     * ����fixedPenaltyCostsCode���Ե�ֵ��
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
     * ��ȡtimeBarOffence���Ե�ֵ��
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
     * ����timeBarOffence���Ե�ֵ��
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
     * ��ȡtimeBarDiscover���Ե�ֵ��
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
     * ����timeBarDiscover���Ե�ֵ��
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
