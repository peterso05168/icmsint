//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * UID = COM000016, Dictionary Entry Name = Person Chinese Name. Details,
 * 			The name of a person in Chinese, optionally with Chinese Commercial Code (CCC).
 * 
 * <p>PersonChineseNameDetails.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonChineseNameDetails.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{PCN}PersonChineseNameName.V1.0.CT"/>
 *         &lt;element name="ChineseCommercialCode" type="{PCN}ChineseCommercialCodeDetails.V1.0.CT" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonChineseNameDetails.V1.0.CT", namespace = "PCN", propOrder = {
    "name",
    "chineseCommercialCode"
})
public class PersonChineseNameDetailsV10CT {

    @XmlElement(name = "Name", namespace = "PCN", required = true)
    protected PersonChineseNameNameV10CT name;
    @XmlElement(name = "ChineseCommercialCode", namespace = "PCN")
    protected List<ChineseCommercialCodeDetailsV10CT> chineseCommercialCode;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonChineseNameNameV10CT }
     *     
     */
    public PersonChineseNameNameV10CT getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonChineseNameNameV10CT }
     *     
     */
    public void setName(PersonChineseNameNameV10CT value) {
        this.name = value;
    }

    /**
     * Gets the value of the chineseCommercialCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chineseCommercialCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChineseCommercialCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChineseCommercialCodeDetailsV10CT }
     * 
     * 
     */
    public List<ChineseCommercialCodeDetailsV10CT> getChineseCommercialCode() {
        if (chineseCommercialCode == null) {
            chineseCommercialCode = new ArrayList<ChineseCommercialCodeDetailsV10CT>();
        }
        return this.chineseCommercialCode;
    }

}
