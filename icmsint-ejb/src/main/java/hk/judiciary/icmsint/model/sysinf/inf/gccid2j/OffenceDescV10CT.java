//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:51:00 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ofference Description
 * 	               a) PGBL Allow
 * 	               b) Law in English
 * 	               c) Law in Chinese
 * 	               d) Short Description in English
 * 	               e) Short Description in Chinse
 * 	               f) Long Description in English
 * 	               g) Long Description in Chinese
 * 			
 * 
 * <p>Java class for OffenceDesc.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceDesc.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PGBLAllow" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Law" type="{}Law.V1.0.CT"/&gt;
 *         &lt;element name="LawChinese" type="{}LawChinese.V1.1.CT"/&gt;
 *         &lt;element name="ShortDescription" type="{}ShortDescription.V1.0.CT"/&gt;
 *         &lt;element name="ShortDescriptionChinese" type="{}ShortDescriptionChinese.V1.1.CT"/&gt;
 *         &lt;element name="LongDescription" type="{}OffenceDescription.V1.0.CT"/&gt;
 *         &lt;element name="LongDescriptionChinese" type="{}OffenceDescriptionChinese.V1.1.CT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceDesc.V1.0.CT", propOrder = {
    "pgblAllow",
    "law",
    "lawChinese",
    "shortDescription",
    "shortDescriptionChinese",
    "longDescription",
    "longDescriptionChinese"
})
public class OffenceDescV10CT {

    @XmlElement(name = "PGBLAllow")
    protected FieldIndicatorV10CT pgblAllow;
    @XmlElement(name = "Law", required = true)
    protected LawV10CT law;
    @XmlElement(name = "LawChinese", required = true)
    protected LawChineseV11CT lawChinese;
    @XmlElement(name = "ShortDescription", required = true)
    protected ShortDescriptionV10CT shortDescription;
    @XmlElement(name = "ShortDescriptionChinese", required = true)
    protected ShortDescriptionChineseV11CT shortDescriptionChinese;
    @XmlElement(name = "LongDescription", required = true)
    protected OffenceDescriptionV10CT longDescription;
    @XmlElement(name = "LongDescriptionChinese", required = true)
    protected OffenceDescriptionChineseV11CT longDescriptionChinese;

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
     * Gets the value of the longDescription property.
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
     * Sets the value of the longDescription property.
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
     * Gets the value of the longDescriptionChinese property.
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
     * Sets the value of the longDescriptionChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescriptionChineseV11CT }
     *     
     */
    public void setLongDescriptionChinese(OffenceDescriptionChineseV11CT value) {
        this.longDescriptionChinese = value;
    }

}
