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
 * Ofference Variable		   
 *                            a) Offence Variable Code
 *                            b) Offence Variable Name/Description
 *                            c) Offence Variable Value
 *                            d) Offence Variable Value Chinese
 * 			
 * 
 * <p>OffenceVariable.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OffenceVariable.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffenceVarCode" type="{}VariableNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceVarDesc" type="{}VariableDescription.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceVarValue" type="{}OffenceVarValue.V1.0.CT"/>
 *         &lt;element name="OffenceVarValueChinese" type="{}OffenceVarValueChinese.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceVariable.V1.0.CT", propOrder = {
    "offenceVarCode",
    "offenceVarDesc",
    "offenceVarValue",
    "offenceVarValueChinese"
})
public class OffenceVariableV10CT {

    @XmlElement(name = "OffenceVarCode")
    protected VariableNumberV10CT offenceVarCode;
    @XmlElement(name = "OffenceVarDesc")
    protected VariableDescriptionV10CT offenceVarDesc;
    @XmlElement(name = "OffenceVarValue", required = true)
    protected OffenceVarValueV10CT offenceVarValue;
    @XmlElement(name = "OffenceVarValueChinese")
    protected OffenceVarValueChineseV10CT offenceVarValueChinese;

    /**
     * 获取offenceVarCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public VariableNumberV10CT getOffenceVarCode() {
        return offenceVarCode;
    }

    /**
     * 设置offenceVarCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public void setOffenceVarCode(VariableNumberV10CT value) {
        this.offenceVarCode = value;
    }

    /**
     * 获取offenceVarDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public VariableDescriptionV10CT getOffenceVarDesc() {
        return offenceVarDesc;
    }

    /**
     * 设置offenceVarDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public void setOffenceVarDesc(VariableDescriptionV10CT value) {
        this.offenceVarDesc = value;
    }

    /**
     * 获取offenceVarValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceVarValueV10CT }
     *     
     */
    public OffenceVarValueV10CT getOffenceVarValue() {
        return offenceVarValue;
    }

    /**
     * 设置offenceVarValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceVarValueV10CT }
     *     
     */
    public void setOffenceVarValue(OffenceVarValueV10CT value) {
        this.offenceVarValue = value;
    }

    /**
     * 获取offenceVarValueChinese属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceVarValueChineseV10CT }
     *     
     */
    public OffenceVarValueChineseV10CT getOffenceVarValueChinese() {
        return offenceVarValueChinese;
    }

    /**
     * 设置offenceVarValueChinese属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceVarValueChineseV10CT }
     *     
     */
    public void setOffenceVarValueChinese(OffenceVarValueChineseV10CT value) {
        this.offenceVarValueChinese = value;
    }

}
