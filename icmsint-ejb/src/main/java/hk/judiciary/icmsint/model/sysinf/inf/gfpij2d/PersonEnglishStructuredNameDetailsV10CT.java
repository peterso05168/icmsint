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
 * UID = COM000025, Dictionary Entry Name = Person English Structured Name. Details,
 * 			Name of the person in English storing in structured components.
 * 
 * <p>PersonEnglishStructuredNameDetails.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonEnglishStructuredNameDetails.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Surname" type="{PEN}PersonEnglishStructuredNameSurnameName.V1.0.CT"/>
 *         &lt;element name="GivenName" type="{PEN}PersonEnglishStructuredNameGivenName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PersonNamePrefix" type="{PEN}PersonEnglishStructuredNamePersonNamePrefixText.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PersonNameSuffix" type="{PEN}PersonEnglishStructuredNamePersonNameSuffixText.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonEnglishStructuredNameDetails.V1.0.CT", namespace = "PEN", propOrder = {
    "surname",
    "givenName",
    "personNamePrefix",
    "personNameSuffix"
})
public class PersonEnglishStructuredNameDetailsV10CT {

    @XmlElement(name = "Surname", namespace = "PEN", required = true)
    protected PersonEnglishStructuredNameSurnameNameV10CT surname;
    @XmlElement(name = "GivenName", namespace = "PEN")
    protected PersonEnglishStructuredNameGivenNameV10CT givenName;
    @XmlElement(name = "PersonNamePrefix", namespace = "PEN")
    protected PersonEnglishStructuredNamePersonNamePrefixTextV10CT personNamePrefix;
    @XmlElement(name = "PersonNameSuffix", namespace = "PEN")
    protected PersonEnglishStructuredNamePersonNameSuffixTextV10CT personNameSuffix;

    /**
     * 获取surname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonEnglishStructuredNameSurnameNameV10CT }
     *     
     */
    public PersonEnglishStructuredNameSurnameNameV10CT getSurname() {
        return surname;
    }

    /**
     * 设置surname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEnglishStructuredNameSurnameNameV10CT }
     *     
     */
    public void setSurname(PersonEnglishStructuredNameSurnameNameV10CT value) {
        this.surname = value;
    }

    /**
     * 获取givenName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonEnglishStructuredNameGivenNameV10CT }
     *     
     */
    public PersonEnglishStructuredNameGivenNameV10CT getGivenName() {
        return givenName;
    }

    /**
     * 设置givenName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEnglishStructuredNameGivenNameV10CT }
     *     
     */
    public void setGivenName(PersonEnglishStructuredNameGivenNameV10CT value) {
        this.givenName = value;
    }

    /**
     * 获取personNamePrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonEnglishStructuredNamePersonNamePrefixTextV10CT }
     *     
     */
    public PersonEnglishStructuredNamePersonNamePrefixTextV10CT getPersonNamePrefix() {
        return personNamePrefix;
    }

    /**
     * 设置personNamePrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEnglishStructuredNamePersonNamePrefixTextV10CT }
     *     
     */
    public void setPersonNamePrefix(PersonEnglishStructuredNamePersonNamePrefixTextV10CT value) {
        this.personNamePrefix = value;
    }

    /**
     * 获取personNameSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonEnglishStructuredNamePersonNameSuffixTextV10CT }
     *     
     */
    public PersonEnglishStructuredNamePersonNameSuffixTextV10CT getPersonNameSuffix() {
        return personNameSuffix;
    }

    /**
     * 设置personNameSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEnglishStructuredNamePersonNameSuffixTextV10CT }
     *     
     */
    public void setPersonNameSuffix(PersonEnglishStructuredNamePersonNameSuffixTextV10CT value) {
        this.personNameSuffix = value;
    }

}
