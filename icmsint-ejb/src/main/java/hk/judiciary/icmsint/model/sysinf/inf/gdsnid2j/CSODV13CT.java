//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.03 at 10:31:06 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * SOD details version 1.3 consists of 
 *                                a) SOD Key Object (v1.1)
 *                                b) Prosecution Department Code (v1.1)
 *                                c) Status
 *                                d) Effective Date
 *                                e) Offence Description in English (v1.2)
 *                                f) Offence Description in Chinese (V1.3)
 *                                g) Charge Particulars in English
 *                                h) Charge Particulars in Chinese
 *                                i) Contrary to Law in English
 *                                j) Contrary to Law in Chinese
 *                                k) Attachment Indicator
 *                                l) Hearing Weight
 *                                m) Penalty Weight
 *                                n) Fixed Penalty Fine Code
 *                                o) Fixed Penalty Costs Code
 *                                p) Time Bar Offence Period in Months
 *                                q) Time Bar Discover Period in Months                                   
 *             
 * 
 * <p>Java class for CSOD.V1.3.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSOD.V1.3.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SODKey" type="{}SODKey.V1.1.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="Status" type="{}Status.V1.0.CT"/>
 *         &lt;element name="EffectiveDate" type="{CCT}Date.CT"/>
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.2.CT"/>
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.3.CT"/>
 *         &lt;element name="ChargeParticular" type="{}ChargeParticular.V1.0.CT"/>
 *         &lt;element name="ChargeParticularChinese" type="{}ChargeParticularChinese.V1.0.CT"/>
 *         &lt;element name="ContraryToLaw" type="{}ContraryToLaw.V1.0.CT"/>
 *         &lt;element name="ContraryToLawChinese" type="{}ContraryToLawChinese.V1.0.CT"/>
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
@XmlType(name = "CSOD.V1.3.CT", propOrder = {
    "sodKey",
    "prosecutionDepartmentCode",
    "status",
    "effectiveDate",
    "offenceDescription",
    "offenceDescriptionChinese",
    "chargeParticular",
    "chargeParticularChinese",
    "contraryToLaw",
    "contraryToLawChinese",
    "attachmentIndicator",
    "hearingWeight",
    "penaltyWeight",
    "fixedPenaltyFineCode",
    "fixedPenaltyCostsCode",
    "timeBarOffence",
    "timeBarDiscover"
})
@XmlSeeAlso({
    SODApplicationV20CT.class
})
public class CSODV13CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV11CT sodKey;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "Status", required = true)
    protected StatusV10CT status;
    @XmlElement(name = "EffectiveDate", required = true)
    protected DateCT effectiveDate;
    @XmlElement(name = "OffenceDescription", required = true)
    protected OffenceDescriptionV12CT offenceDescription;
    @XmlElement(name = "OffenceDescriptionChinese", required = true)
    protected OffenceDescriptionChineseV13CT offenceDescriptionChinese;
    @XmlElement(name = "ChargeParticular", required = true)
    protected ChargeParticularV10CT chargeParticular;
    @XmlElement(name = "ChargeParticularChinese", required = true)
    protected ChargeParticularChineseV10CT chargeParticularChinese;
    @XmlElement(name = "ContraryToLaw", required = true)
    protected ContraryToLawV10CT contraryToLaw;
    @XmlElement(name = "ContraryToLawChinese", required = true)
    protected ContraryToLawChineseV10CT contraryToLawChinese;
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
     * Gets the value of the sodKey property.
     * 
     * @return
     *     possible object is
     *     {@link SODKeyV11CT }
     *     
     */
    public SODKeyV11CT getSODKey() {
        return sodKey;
    }

    /**
     * Sets the value of the sodKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SODKeyV11CT }
     *     
     */
    public void setSODKey(SODKeyV11CT value) {
        this.sodKey = value;
    }

    /**
     * Gets the value of the prosecutionDepartmentCode property.
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
     * Sets the value of the prosecutionDepartmentCode property.
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
     * Gets the value of the status property.
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
     * Sets the value of the status property.
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
     * Gets the value of the effectiveDate property.
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
     * Sets the value of the effectiveDate property.
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
     * Gets the value of the offenceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionV12CT }
     *     
     */
    public OffenceDescriptionV12CT getOffenceDescription() {
        return offenceDescription;
    }

    /**
     * Sets the value of the offenceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionV12CT }
     *     
     */
    public void setOffenceDescription(OffenceDescriptionV12CT value) {
        this.offenceDescription = value;
    }

    /**
     * Gets the value of the offenceDescriptionChinese property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionChineseV13CT }
     *     
     */
    public OffenceDescriptionChineseV13CT getOffenceDescriptionChinese() {
        return offenceDescriptionChinese;
    }

    /**
     * Sets the value of the offenceDescriptionChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV13CT }
     *     
     */
    public void setOffenceDescriptionChinese(OffenceDescriptionChineseV13CT value) {
        this.offenceDescriptionChinese = value;
    }

    /**
     * Gets the value of the chargeParticular property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeParticularV10CT }
     *     
     */
    public ChargeParticularV10CT getChargeParticular() {
        return chargeParticular;
    }

    /**
     * Sets the value of the chargeParticular property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeParticularV10CT }
     *     
     */
    public void setChargeParticular(ChargeParticularV10CT value) {
        this.chargeParticular = value;
    }

    /**
     * Gets the value of the chargeParticularChinese property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeParticularChineseV10CT }
     *     
     */
    public ChargeParticularChineseV10CT getChargeParticularChinese() {
        return chargeParticularChinese;
    }

    /**
     * Sets the value of the chargeParticularChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeParticularChineseV10CT }
     *     
     */
    public void setChargeParticularChinese(ChargeParticularChineseV10CT value) {
        this.chargeParticularChinese = value;
    }

    /**
     * Gets the value of the contraryToLaw property.
     * 
     * @return
     *     possible object is
     *     {@link ContraryToLawV10CT }
     *     
     */
    public ContraryToLawV10CT getContraryToLaw() {
        return contraryToLaw;
    }

    /**
     * Sets the value of the contraryToLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraryToLawV10CT }
     *     
     */
    public void setContraryToLaw(ContraryToLawV10CT value) {
        this.contraryToLaw = value;
    }

    /**
     * Gets the value of the contraryToLawChinese property.
     * 
     * @return
     *     possible object is
     *     {@link ContraryToLawChineseV10CT }
     *     
     */
    public ContraryToLawChineseV10CT getContraryToLawChinese() {
        return contraryToLawChinese;
    }

    /**
     * Sets the value of the contraryToLawChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraryToLawChineseV10CT }
     *     
     */
    public void setContraryToLawChinese(ContraryToLawChineseV10CT value) {
        this.contraryToLawChinese = value;
    }

    /**
     * Gets the value of the attachmentIndicator property.
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
     * Sets the value of the attachmentIndicator property.
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
     * Gets the value of the hearingWeight property.
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
     * Sets the value of the hearingWeight property.
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
     * Gets the value of the penaltyWeight property.
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
     * Sets the value of the penaltyWeight property.
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
     * Gets the value of the fixedPenaltyFineCode property.
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
     * Sets the value of the fixedPenaltyFineCode property.
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
     * Gets the value of the fixedPenaltyCostsCode property.
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
     * Sets the value of the fixedPenaltyCostsCode property.
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
     * Gets the value of the timeBarOffence property.
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
     * Sets the value of the timeBarOffence property.
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
     * Gets the value of the timeBarDiscover property.
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
     * Sets the value of the timeBarDiscover property.
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