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
 * <p>Java class for CaseSOD.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseSOD.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SODKey" type="{}SODKey.V1.0.CT"/&gt;
 *         &lt;element name="ShortDescription" type="{}ShortDescription.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ShortDescriptionChinese" type="{}ShortDescriptionChinese.V1.1.CT" minOccurs="0"/&gt;
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.1.CT" minOccurs="0"/&gt;
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.2.CT" minOccurs="0"/&gt;
 *         &lt;element name="Law" type="{}Law.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="LawChinese" type="{}LawChinese.V1.1.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseSOD.V1.1.CT", propOrder = {
    "sodKey",
    "shortDescription",
    "shortDescriptionChinese",
    "offenceDescription",
    "offenceDescriptionChinese",
    "law",
    "lawChinese"
})
public class CaseSODV11CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV10CT sodKey;
    @XmlElement(name = "ShortDescription")
    protected ShortDescriptionV10CT shortDescription;
    @XmlElement(name = "ShortDescriptionChinese")
    protected ShortDescriptionChineseV11CT shortDescriptionChinese;
    @XmlElement(name = "OffenceDescription")
    protected OffenceDescriptionV11CT offenceDescription;
    @XmlElement(name = "OffenceDescriptionChinese")
    protected OffenceDescriptionChineseV12CT offenceDescriptionChinese;
    @XmlElement(name = "Law")
    protected LawV10CT law;
    @XmlElement(name = "LawChinese")
    protected LawChineseV11CT lawChinese;

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
     *     {@link ShortDescriptionChineseV11CT }
     *     
     */
    public ShortDescriptionChineseV11CT getShortDescriptionChinese() {
        return shortDescriptionChinese;
    }

    /**
     * Sets the value of the shortDescriptionChinese property.
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
     * Gets the value of the offenceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionV11CT }
     *     
     */
    public OffenceDescriptionV11CT getOffenceDescription() {
        return offenceDescription;
    }

    /**
     * Sets the value of the offenceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionV11CT }
     *     
     */
    public void setOffenceDescription(OffenceDescriptionV11CT value) {
        this.offenceDescription = value;
    }

    /**
     * Gets the value of the offenceDescriptionChinese property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescriptionChineseV12CT }
     *     
     */
    public OffenceDescriptionChineseV12CT getOffenceDescriptionChinese() {
        return offenceDescriptionChinese;
    }

    /**
     * Sets the value of the offenceDescriptionChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV12CT }
     *     
     */
    public void setOffenceDescriptionChinese(OffenceDescriptionChineseV12CT value) {
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
     *     {@link LawChineseV11CT }
     *     
     */
    public LawChineseV11CT getLawChinese() {
        return lawChinese;
    }

    /**
     * Sets the value of the lawChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link LawChineseV11CT }
     *     
     */
    public void setLawChinese(LawChineseV11CT value) {
        this.lawChinese = value;
    }

}
