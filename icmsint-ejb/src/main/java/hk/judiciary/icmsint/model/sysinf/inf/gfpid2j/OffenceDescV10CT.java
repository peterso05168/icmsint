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
 * <p>OffenceDesc.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OffenceDesc.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PGBLAllow" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Law" type="{}Law.V1.0.CT"/>
 *         &lt;element name="LawChinese" type="{}LawChinese.V1.1.CT"/>
 *         &lt;element name="ShortDescription" type="{}ShortDescription.V1.0.CT"/>
 *         &lt;element name="ShortDescriptionChinese" type="{}ShortDescriptionChinese.V1.1.CT"/>
 *         &lt;element name="LongDescription" type="{}OffenceDescription.V1.0.CT"/>
 *         &lt;element name="LongDescriptionChinese" type="{}OffenceDescriptionChinese.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * 获取pgblAllow属性的值。
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
     * 设置pgblAllow属性的值。
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

}
