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
 * surety version 1.0 object derives from Party.V1.2.CT
 *                                object found in common_jud.xsd, additional
 *                                elements include : 
 *                                a) Address Object (v1.2)
 *                                b) Surety Sequence Number
 *             
 * 
 * <p>Surety.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Surety.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.2.CT">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{}Address.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="SuretySequenceNumber" type="{}SuretySequenceNumber.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Surety.V1.0.CT", propOrder = {
    "address",
    "suretySequenceNumber"
})
public class SuretyV10CT
    extends PartyV12CT
{

    @XmlElement(name = "Address")
    protected AddressV12CT address;
    @XmlElement(name = "SuretySequenceNumber", required = true)
    protected SuretySequenceNumberV10CT suretySequenceNumber;

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
     * 获取suretySequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuretySequenceNumberV10CT }
     *     
     */
    public SuretySequenceNumberV10CT getSuretySequenceNumber() {
        return suretySequenceNumber;
    }

    /**
     * 设置suretySequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuretySequenceNumberV10CT }
     *     
     */
    public void setSuretySequenceNumber(SuretySequenceNumberV10CT value) {
        this.suretySequenceNumber = value;
    }

}
