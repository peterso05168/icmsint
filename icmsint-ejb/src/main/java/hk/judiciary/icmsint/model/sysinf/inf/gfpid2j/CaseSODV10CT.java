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
 * <p>CaseSOD.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     *     {@link ShortDescriptionChineseV10CT }
     *     
     */
    public ShortDescriptionChineseV10CT getShortDescriptionChinese() {
        return shortDescriptionChinese;
    }

    /**
     * 设置shortDescriptionChinese属性的值。
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
     * 获取offenceDescription属性的值。
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
     * 设置offenceDescription属性的值。
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
     * 获取offenceDescriptionChinese属性的值。
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
     * 设置offenceDescriptionChinese属性的值。
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
     *     {@link LawChineseV10CT }
     *     
     */
    public LawChineseV10CT getLawChinese() {
        return lawChinese;
    }

    /**
     * 设置lawChinese属性的值。
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
