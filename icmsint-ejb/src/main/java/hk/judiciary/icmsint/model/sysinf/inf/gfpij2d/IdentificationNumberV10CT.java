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
 * <p>IdentificationNumber.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IdentificationNumber.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDNumberType" type="{}IDNumberType.V1.0.CT"/>
 *         &lt;element name="HKIDNumber" type="{HKID}HKIDNumberDetails.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OtherIDNumber" type="{}OtherIDNumber.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationNumber.V1.0.CT", propOrder = {
    "idNumberType",
    "hkidNumber",
    "otherIDNumber"
})
public class IdentificationNumberV10CT {

    @XmlElement(name = "IDNumberType", required = true)
    protected IDNumberTypeV10CT idNumberType;
    @XmlElement(name = "HKIDNumber")
    protected HKIDNumberDetailsV10CT hkidNumber;
    @XmlElement(name = "OtherIDNumber")
    protected OtherIDNumberV10CT otherIDNumber;

    /**
     * 获取idNumberType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IDNumberTypeV10CT }
     *     
     */
    public IDNumberTypeV10CT getIDNumberType() {
        return idNumberType;
    }

    /**
     * 设置idNumberType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IDNumberTypeV10CT }
     *     
     */
    public void setIDNumberType(IDNumberTypeV10CT value) {
        this.idNumberType = value;
    }

    /**
     * 获取hkidNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HKIDNumberDetailsV10CT }
     *     
     */
    public HKIDNumberDetailsV10CT getHKIDNumber() {
        return hkidNumber;
    }

    /**
     * 设置hkidNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HKIDNumberDetailsV10CT }
     *     
     */
    public void setHKIDNumber(HKIDNumberDetailsV10CT value) {
        this.hkidNumber = value;
    }

    /**
     * 获取otherIDNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OtherIDNumberV10CT }
     *     
     */
    public OtherIDNumberV10CT getOtherIDNumber() {
        return otherIDNumber;
    }

    /**
     * 设置otherIDNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIDNumberV10CT }
     *     
     */
    public void setOtherIDNumber(OtherIDNumberV10CT value) {
        this.otherIDNumber = value;
    }

}
