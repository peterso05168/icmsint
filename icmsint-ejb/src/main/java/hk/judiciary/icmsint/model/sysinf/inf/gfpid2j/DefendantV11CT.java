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
 * defendant version 1.1 object derives from Party (V1.1)
 *                                object found in common_jud.xsd, additional
 *                                elements include :
 *                                a) Defendant Type
 *                                b) Address Object (V1.1)
 *                                c) Interpret Language (v1.1)
 *                                d) Defendant District Code
 *             
 * 
 * <p>Defendant.V1.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Defendant.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.1.CT">
 *       &lt;sequence>
 *         &lt;element name="DefendantType" type="{}DefendantType.V1.0.CT"/>
 *         &lt;element name="Address" type="{}Address.V1.1.CT"/>
 *         &lt;element name="InterpretLanguage" type="{}Language.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="DefendantDistrictCode" type="{}BailiffDistrictCode.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Defendant.V1.1.CT", propOrder = {
    "defendantType",
    "address",
    "interpretLanguage",
    "defendantDistrictCode"
})
public class DefendantV11CT
    extends PartyV11CT
{

    @XmlElement(name = "DefendantType", required = true)
    protected DefendantTypeV10CT defendantType;
    @XmlElement(name = "Address", required = true)
    protected AddressV11CT address;
    @XmlElement(name = "InterpretLanguage")
    protected LanguageV11CT interpretLanguage;
    @XmlElement(name = "DefendantDistrictCode")
    protected BailiffDistrictCodeV10CT defendantDistrictCode;

    /**
     * 获取defendantType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefendantTypeV10CT }
     *     
     */
    public DefendantTypeV10CT getDefendantType() {
        return defendantType;
    }

    /**
     * 设置defendantType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantTypeV10CT }
     *     
     */
    public void setDefendantType(DefendantTypeV10CT value) {
        this.defendantType = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressV11CT }
     *     
     */
    public AddressV11CT getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV11CT }
     *     
     */
    public void setAddress(AddressV11CT value) {
        this.address = value;
    }

    /**
     * 获取interpretLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LanguageV11CT }
     *     
     */
    public LanguageV11CT getInterpretLanguage() {
        return interpretLanguage;
    }

    /**
     * 设置interpretLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageV11CT }
     *     
     */
    public void setInterpretLanguage(LanguageV11CT value) {
        this.interpretLanguage = value;
    }

    /**
     * 获取defendantDistrictCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BailiffDistrictCodeV10CT }
     *     
     */
    public BailiffDistrictCodeV10CT getDefendantDistrictCode() {
        return defendantDistrictCode;
    }

    /**
     * 设置defendantDistrictCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BailiffDistrictCodeV10CT }
     *     
     */
    public void setDefendantDistrictCode(BailiffDistrictCodeV10CT value) {
        this.defendantDistrictCode = value;
    }

}
