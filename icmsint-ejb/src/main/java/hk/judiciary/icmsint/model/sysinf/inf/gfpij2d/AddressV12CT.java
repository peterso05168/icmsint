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
 * address details consists of 
 *                                a) Address territory
 *                                   1 - HK
 *                                   2 - KLN
 *                                   3 - NT
 *                                   4 - Outlying Islands
 *                                   5 - Others
 *                                b) Address in English (v1.2)
 *                                c) Address in Chinese (v1.2)
 *                                d) District code
 *                                e) Overseas Indicator
 *             
 * 
 * <p>Address.V1.2.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Address.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressTerritory" type="{}AddressTerritory.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="EnglishAddress" type="{}EnglishAddress.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="ChineseAddress" type="{}ChineseAddress.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="DistrictCode" type="{}DistrictCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OverseasIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address.V1.2.CT", propOrder = {
    "addressTerritory",
    "englishAddress",
    "chineseAddress",
    "districtCode",
    "overseasIndicator"
})
public class AddressV12CT {

    @XmlElement(name = "AddressTerritory")
    protected AddressTerritoryV10CT addressTerritory;
    @XmlElement(name = "EnglishAddress")
    protected EnglishAddressV12CT englishAddress;
    @XmlElement(name = "ChineseAddress")
    protected ChineseAddressV12CT chineseAddress;
    @XmlElement(name = "DistrictCode")
    protected DistrictCodeV10CT districtCode;
    @XmlElement(name = "OverseasIndicator")
    protected FieldIndicatorV10CT overseasIndicator;

    /**
     * 获取addressTerritory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressTerritoryV10CT }
     *     
     */
    public AddressTerritoryV10CT getAddressTerritory() {
        return addressTerritory;
    }

    /**
     * 设置addressTerritory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTerritoryV10CT }
     *     
     */
    public void setAddressTerritory(AddressTerritoryV10CT value) {
        this.addressTerritory = value;
    }

    /**
     * 获取englishAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnglishAddressV12CT }
     *     
     */
    public EnglishAddressV12CT getEnglishAddress() {
        return englishAddress;
    }

    /**
     * 设置englishAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnglishAddressV12CT }
     *     
     */
    public void setEnglishAddress(EnglishAddressV12CT value) {
        this.englishAddress = value;
    }

    /**
     * 获取chineseAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChineseAddressV12CT }
     *     
     */
    public ChineseAddressV12CT getChineseAddress() {
        return chineseAddress;
    }

    /**
     * 设置chineseAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChineseAddressV12CT }
     *     
     */
    public void setChineseAddress(ChineseAddressV12CT value) {
        this.chineseAddress = value;
    }

    /**
     * 获取districtCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DistrictCodeV10CT }
     *     
     */
    public DistrictCodeV10CT getDistrictCode() {
        return districtCode;
    }

    /**
     * 设置districtCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictCodeV10CT }
     *     
     */
    public void setDistrictCode(DistrictCodeV10CT value) {
        this.districtCode = value;
    }

    /**
     * 获取overseasIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getOverseasIndicator() {
        return overseasIndicator;
    }

    /**
     * 设置overseasIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setOverseasIndicator(FieldIndicatorV10CT value) {
        this.overseasIndicator = value;
    }

}
