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
 * UID = COM000019, Dictionary Entry Name = Chinese Commercial Code. Details,
 * 			4-digit Chinese Commercial Code (CCC) printed on the HKID Card and optional 1-digit extension
 * 
 * <p>ChineseCommercialCodeDetails.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ChineseCommercialCodeDetails.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FourDigitCode" type="{PCN}ChineseCommercialCodeFourDigitCodeText.V1.0.CT"/>
 *         &lt;element name="ExtensionNumber" type="{PCN}ChineseCommercialCodeExtensionNumberText.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChineseCommercialCodeDetails.V1.0.CT", namespace = "PCN", propOrder = {
    "fourDigitCode",
    "extensionNumber"
})
public class ChineseCommercialCodeDetailsV10CT {

    @XmlElement(name = "FourDigitCode", namespace = "PCN", required = true)
    protected ChineseCommercialCodeFourDigitCodeTextV10CT fourDigitCode;
    @XmlElement(name = "ExtensionNumber", namespace = "PCN")
    protected ChineseCommercialCodeExtensionNumberTextV10CT extensionNumber;

    /**
     * 获取fourDigitCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChineseCommercialCodeFourDigitCodeTextV10CT }
     *     
     */
    public ChineseCommercialCodeFourDigitCodeTextV10CT getFourDigitCode() {
        return fourDigitCode;
    }

    /**
     * 设置fourDigitCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChineseCommercialCodeFourDigitCodeTextV10CT }
     *     
     */
    public void setFourDigitCode(ChineseCommercialCodeFourDigitCodeTextV10CT value) {
        this.fourDigitCode = value;
    }

    /**
     * 获取extensionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChineseCommercialCodeExtensionNumberTextV10CT }
     *     
     */
    public ChineseCommercialCodeExtensionNumberTextV10CT getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * 设置extensionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChineseCommercialCodeExtensionNumberTextV10CT }
     *     
     */
    public void setExtensionNumber(ChineseCommercialCodeExtensionNumberTextV10CT value) {
        this.extensionNumber = value;
    }

}
