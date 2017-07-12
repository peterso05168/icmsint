//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:40:40 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Case SOD details consists of 
 *                                a) SOD Key Object
 *                                b) Short Description in English
 *                                c) Short Description in Chinese
 *                                d) Offence Description in English
 *                                e) Offence Description in Chinese
 *                                f) Law in English
 *                                g) Law in Chinese
 *             
 * 
 * <p>Java class for CaseSOD.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseSOD.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SODKey" type="{}SODKey.V1.0.CT"/>
 *         &lt;element name="ShortDescription" type="{}ShortDescription.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ShortDescriptionChinese" type="{}ShortDescriptionChinese.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Law" type="{}Law.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="LawChinese" type="{}LawChinese.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSOD.V1.0.CT", propOrder = {
    "sodKey",
    "shortDescription",
    "shortDescriptionChinese",
    "offenceDescription",
    "offenceDescriptionChinese",
    "law",
    "lawChinese"
})
public class CaseSODV10CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV10CT sodKey;
    @XmlElement(name = "ShortDescription")
    protected ShortDescriptionV10CT shortDescription;
    @XmlElement(name = "ShortDescriptionChinese")
    protected ShortDescriptionChineseV10CT shortDescriptionChinese;
    @XmlElement(name = "OffenceDescription")
    protected OffenceDescriptionV10CT offenceDescription;
    @XmlElement(name = "OffenceDescriptionChinese")
    protected OffenceDescriptionChineseV10CT offenceDescriptionChinese;
    @XmlElement(name = "Law")
    protected LawV10CT law;
    @XmlElement(name = "LawChinese")
    protected LawChineseV10CT lawChinese;

    /**
     * Gets the value of the sodKey property.
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
     * Sets the value of the sodKey property.
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
     * Gets the value of the shortDescription property.
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
     * Sets the value of the shortDescription property.
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
     * Gets the value of the shortDescriptionChinese property.
     * 
     * @return
     *     possible object is
     *     {@link ShortDescriptionChineseV10CT }
     *     
     */
    public ShortDescriptionChineseV10CT getShortDescriptionChinese() {
        return shortDescriptionChinese;
    }

    /**
     * Sets the value of the shortDescriptionChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortDescriptionChineseV10CT }
     *     
     */
    public void setShortDescriptionChinese(ShortDescriptionChineseV10CT value) {
        this.shortDescriptionChinese = value;
    }

    /**
     * Gets the value of the offenceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionV10CT }
     *     
     */
    public OffenceDescriptionV10CT getOffenceDescription() {
        return offenceDescription;
    }

    /**
     * Sets the value of the offenceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionV10CT }
     *     
     */
    public void setOffenceDescription(OffenceDescriptionV10CT value) {
        this.offenceDescription = value;
    }

    /**
     * Gets the value of the offenceDescriptionChinese property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionChineseV10CT }
     *     
     */
    public OffenceDescriptionChineseV10CT getOffenceDescriptionChinese() {
        return offenceDescriptionChinese;
    }

    /**
     * Sets the value of the offenceDescriptionChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV10CT }
     *     
     */
    public void setOffenceDescriptionChinese(OffenceDescriptionChineseV10CT value) {
        this.offenceDescriptionChinese = value;
    }

    /**
     * Gets the value of the law property.
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
     * Sets the value of the law property.
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
     * Gets the value of the lawChinese property.
     * 
     * @return
     *     possible object is
     *     {@link LawChineseV10CT }
     *     
     */
    public LawChineseV10CT getLawChinese() {
        return lawChinese;
    }

    /**
     * Sets the value of the lawChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link LawChineseV10CT }
     *     
     */
    public void setLawChinese(LawChineseV10CT value) {
        this.lawChinese = value;
    }

}
