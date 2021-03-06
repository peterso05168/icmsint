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
 * witness version 1.2 object derives from Party.V1.2.CT
 *                                object found in common_jud.xsd, additional
 *                                elements include : 
 *                                a) Address Object (v1.2)
 *                                b) Interpret Language (v1.1)
 *                                c) Special Arrangement
 *                                d) Item To Be Brought
 *                                e) Witness Sequence Number
 *             
 * 
 * <p>Witness.V1.2.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Witness.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.2.CT">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{}Address.V1.2.CT"/>
 *         &lt;element name="InterpretLanguage" type="{}Language.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="SpecialArrangement" type="{}SpecialArrangement.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ItemToBeBrought" type="{}ItemToBeBrought.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessSequenceNumber" type="{}WitnessSequenceNumber.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Witness.V1.2.CT", propOrder = {
    "address",
    "interpretLanguage",
    "specialArrangement",
    "itemToBeBrought",
    "witnessSequenceNumber"
})
public class WitnessV12CT
    extends PartyV12CT
{

    @XmlElement(name = "Address", required = true)
    protected AddressV12CT address;
    @XmlElement(name = "InterpretLanguage")
    protected LanguageV11CT interpretLanguage;
    @XmlElement(name = "SpecialArrangement")
    protected SpecialArrangementV10CT specialArrangement;
    @XmlElement(name = "ItemToBeBrought")
    protected ItemToBeBroughtV10CT itemToBeBrought;
    @XmlElement(name = "WitnessSequenceNumber", required = true)
    protected WitnessSequenceNumberV10CT witnessSequenceNumber;

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressV12CT }
     *     
     */
    public AddressV12CT getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV12CT }
     *     
     */
    public void setAddress(AddressV12CT value) {
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
     * 获取specialArrangement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialArrangementV10CT }
     *     
     */
    public SpecialArrangementV10CT getSpecialArrangement() {
        return specialArrangement;
    }

    /**
     * 设置specialArrangement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialArrangementV10CT }
     *     
     */
    public void setSpecialArrangement(SpecialArrangementV10CT value) {
        this.specialArrangement = value;
    }

    /**
     * 获取itemToBeBrought属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemToBeBroughtV10CT }
     *     
     */
    public ItemToBeBroughtV10CT getItemToBeBrought() {
        return itemToBeBrought;
    }

    /**
     * 设置itemToBeBrought属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemToBeBroughtV10CT }
     *     
     */
    public void setItemToBeBrought(ItemToBeBroughtV10CT value) {
        this.itemToBeBrought = value;
    }

    /**
     * 获取witnessSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WitnessSequenceNumberV10CT }
     *     
     */
    public WitnessSequenceNumberV10CT getWitnessSequenceNumber() {
        return witnessSequenceNumber;
    }

    /**
     * 设置witnessSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessSequenceNumberV10CT }
     *     
     */
    public void setWitnessSequenceNumber(WitnessSequenceNumberV10CT value) {
        this.witnessSequenceNumber = value;
    }

}
