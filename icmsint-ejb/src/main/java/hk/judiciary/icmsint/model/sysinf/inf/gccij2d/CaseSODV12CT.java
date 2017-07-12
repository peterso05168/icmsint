//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:47:35 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Case SOD details v1.2 (the fields are renamed)
 *                               consists of 
 *                                a) SOD Key Object (v1.1)
 *                                b) Offence Description in English (v1.2)
 *                                c) Offence Description in Chinese (v1.3)
 *                                d) Contrary to Law in English
 *                                e) Contrary to Law in Chinese
 *                                f) Charge Particular in English
 *                                g) Charge Particular in Chinese
 *             
 * 
 * <p>Java class for CaseSOD.V1.2.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseSOD.V1.2.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SODKey" type="{}SODKey.V1.1.CT"/&gt;
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.2.CT" minOccurs="0"/&gt;
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.3.CT" minOccurs="0"/&gt;
 *         &lt;element name="ContraryToLaw" type="{}ContraryToLaw.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ContraryToLawChinese" type="{}ContraryToLawChinese.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ChargeParticular" type="{}ChargeParticular.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ChargeParticularChinese" type="{}ChargeParticularChinese.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSOD.V1.2.CT", propOrder = {
    "sodKey",
    "offenceDescription",
    "offenceDescriptionChinese",
    "contraryToLaw",
    "contraryToLawChinese",
    "chargeParticular",
    "chargeParticularChinese"
})
public class CaseSODV12CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV11CT sodKey;
    @XmlElement(name = "OffenceDescription")
    protected OffenceDescriptionV12CT offenceDescription;
    @XmlElement(name = "OffenceDescriptionChinese")
    protected OffenceDescriptionChineseV13CT offenceDescriptionChinese;
    @XmlElement(name = "ContraryToLaw")
    protected ContraryToLawV10CT contraryToLaw;
    @XmlElement(name = "ContraryToLawChinese")
    protected ContraryToLawChineseV10CT contraryToLawChinese;
    @XmlElement(name = "ChargeParticular")
    protected ChargeParticularV10CT chargeParticular;
    @XmlElement(name = "ChargeParticularChinese")
    protected ChargeParticularChineseV10CT chargeParticularChinese;

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

}
