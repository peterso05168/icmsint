//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:32:28 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdnid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ofference Description
 * 	               a) PGBL Allow
 * 	               b) Contrary to Law in English
 * 	               c) Contrary to Law in Chinese
 * 	               d) Offence Description in English
 * 	               e) Offence Description in Chinse
 * 	               f) Charge Particulars in English
 * 	               g) Charge Particulars in Chinese
 * 			
 * 
 * <p>Java class for OffenceDesc.V1.2.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceDesc.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PGBLAllow" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ContraryToLaw" type="{}ContraryToLaw.V1.0.CT"/>
 *         &lt;element name="ContraryToLawChinese" type="{}ContraryToLawChinese.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.2.CT"/>
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.3.CT" minOccurs="0"/>
 *         &lt;element name="ChargeParticular" type="{}ChargeParticular.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ChargeParticularChinese" type="{}ChargeParticularChinese.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceDesc.V1.2.CT", propOrder = {
    "pgblAllow",
    "contraryToLaw",
    "contraryToLawChinese",
    "offenceDescription",
    "offenceDescriptionChinese",
    "chargeParticular",
    "chargeParticularChinese"
})
public class OffenceDescV12CT {

    @XmlElement(name = "PGBLAllow")
    protected FieldIndicatorV10CT pgblAllow;
    @XmlElement(name = "ContraryToLaw", required = true)
    protected ContraryToLawV10CT contraryToLaw;
    @XmlElement(name = "ContraryToLawChinese")
    protected ContraryToLawChineseV10CT contraryToLawChinese;
    @XmlElement(name = "OffenceDescription", required = true)
    protected OffenceDescriptionV12CT offenceDescription;
    @XmlElement(name = "OffenceDescriptionChinese")
    protected OffenceDescriptionChineseV13CT offenceDescriptionChinese;
    @XmlElement(name = "ChargeParticular")
    protected ChargeParticularV10CT chargeParticular;
    @XmlElement(name = "ChargeParticularChinese")
    protected ChargeParticularChineseV10CT chargeParticularChinese;

    /**
     * Gets the value of the pgblAllow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getPGBLAllow() {
        return pgblAllow;
    }

    /**
     * Sets the value of the pgblAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setPGBLAllow(FieldIndicatorV10CT value) {
        this.pgblAllow = value;
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

}
