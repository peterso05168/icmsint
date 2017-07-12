//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SOD variable consists of 
 *                                a) Variable Number
 *                                b) Variable Type
 *                                c) Variable Description in English
 *                                d) Variable Description in Chinese (V1.1)
 *             
 * 
 * <p>CSODVarDetail.V1.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CSODVarDetail.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariableNumber" type="{}VariableNumber.V1.0.CT"/>
 *         &lt;element name="VariableType" type="{}VariableType.V1.0.CT"/>
 *         &lt;element name="VariableDescription" type="{}VariableDescription.V1.0.CT"/>
 *         &lt;element name="VariableDescriptionChinese" type="{}VariableDescriptionChinese.V1.1.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSODVarDetail.V1.1.CT", propOrder = {
    "variableNumber",
    "variableType",
    "variableDescription",
    "variableDescriptionChinese"
})
public class CSODVarDetailV11CT {

    @XmlElement(name = "VariableNumber", required = true)
    protected VariableNumberV10CT variableNumber;
    @XmlElement(name = "VariableType", required = true)
    protected VariableTypeV10CT variableType;
    @XmlElement(name = "VariableDescription", required = true)
    protected VariableDescriptionV10CT variableDescription;
    @XmlElement(name = "VariableDescriptionChinese")
    protected VariableDescriptionChineseV11CT variableDescriptionChinese;

    /**
     * 获取variableNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public VariableNumberV10CT getVariableNumber() {
        return variableNumber;
    }

    /**
     * 设置variableNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public void setVariableNumber(VariableNumberV10CT value) {
        this.variableNumber = value;
    }

    /**
     * 获取variableType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableTypeV10CT }
     *     
     */
    public VariableTypeV10CT getVariableType() {
        return variableType;
    }

    /**
     * 设置variableType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableTypeV10CT }
     *     
     */
    public void setVariableType(VariableTypeV10CT value) {
        this.variableType = value;
    }

    /**
     * 获取variableDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public VariableDescriptionV10CT getVariableDescription() {
        return variableDescription;
    }

    /**
     * 设置variableDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public void setVariableDescription(VariableDescriptionV10CT value) {
        this.variableDescription = value;
    }

    /**
     * 获取variableDescriptionChinese属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableDescriptionChineseV11CT }
     *     
     */
    public VariableDescriptionChineseV11CT getVariableDescriptionChinese() {
        return variableDescriptionChinese;
    }

    /**
     * 设置variableDescriptionChinese属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDescriptionChineseV11CT }
     *     
     */
    public void setVariableDescriptionChinese(VariableDescriptionChineseV11CT value) {
        this.variableDescriptionChinese = value;
    }

}
