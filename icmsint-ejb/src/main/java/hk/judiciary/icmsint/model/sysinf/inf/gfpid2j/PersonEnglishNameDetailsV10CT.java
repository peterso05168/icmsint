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
 * UID = COM000022, Dictionary Entry Name = Person English Name. Details,
 * 			The name of a person in English, comprising some or all of the person's name prefix, family name, given name, and person's name suffix.
 * 
 * <p>PersonEnglishNameDetails.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonEnglishNameDetails.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnstructuredName" type="{PEN}PersonEnglishNameUnstructuredName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="StructuredName" type="{PEN}PersonEnglishStructuredNameDetails.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonEnglishNameDetails.V1.0.CT", namespace = "PEN", propOrder = {
    "unstructuredName",
    "structuredName"
})
public class PersonEnglishNameDetailsV10CT {

    @XmlElement(name = "UnstructuredName", namespace = "PEN")
    protected PersonEnglishNameUnstructuredNameV10CT unstructuredName;
    @XmlElement(name = "StructuredName", namespace = "PEN")
    protected PersonEnglishStructuredNameDetailsV10CT structuredName;

    /**
     * 获取unstructuredName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonEnglishNameUnstructuredNameV10CT }
     *     
     */
    public PersonEnglishNameUnstructuredNameV10CT getUnstructuredName() {
        return unstructuredName;
    }

    /**
     * 设置unstructuredName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEnglishNameUnstructuredNameV10CT }
     *     
     */
    public void setUnstructuredName(PersonEnglishNameUnstructuredNameV10CT value) {
        this.unstructuredName = value;
    }

    /**
     * 获取structuredName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonEnglishStructuredNameDetailsV10CT }
     *     
     */
    public PersonEnglishStructuredNameDetailsV10CT getStructuredName() {
        return structuredName;
    }

    /**
     * 设置structuredName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEnglishStructuredNameDetailsV10CT }
     *     
     */
    public void setStructuredName(PersonEnglishStructuredNameDetailsV10CT value) {
        this.structuredName = value;
    }

}
