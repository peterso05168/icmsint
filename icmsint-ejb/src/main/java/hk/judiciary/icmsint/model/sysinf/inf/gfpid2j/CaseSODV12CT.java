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
 * <p>CaseSOD.V1.2.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CaseSOD.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SODKey" type="{}SODKey.V1.1.CT"/>
 *         &lt;element name="OffenceDescription" type="{}OffenceDescription.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescriptionChinese" type="{}OffenceDescriptionChinese.V1.3.CT" minOccurs="0"/>
 *         &lt;element name="ContraryToLaw" type="{}ContraryToLaw.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ContraryToLawChinese" type="{}ContraryToLawChinese.V1.0.CT" minOccurs="0"/>
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
     * 获取sodKey属性的值。
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
     * 设置sodKey属性的值。
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
     * 获取offenceDescription属性的值。
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
     * 设置offenceDescription属性的值。
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
     * 获取offenceDescriptionChinese属性的值。
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
     * 设置offenceDescriptionChinese属性的值。
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
     * 获取contraryToLaw属性的值。
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
     * 设置contraryToLaw属性的值。
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
     * 获取contraryToLawChinese属性的值。
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
     * 设置contraryToLawChinese属性的值。
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
     * 获取chargeParticular属性的值。
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
     * 设置chargeParticular属性的值。
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
     * 获取chargeParticularChinese属性的值。
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
     * 设置chargeParticularChinese属性的值。
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
