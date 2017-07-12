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
 * informant version 1.2 object derives from Party v1.2 object found in common_jud.xsd
 * 
 * <p>Informant.V1.2.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Informant.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.2.CT">
 *       &lt;sequence>
 *         &lt;element name="StaffNumber" type="{}StaffNumber.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Informant.V1.2.CT", propOrder = {
    "staffNumber"
})
public class InformantV12CT
    extends PartyV12CT
{

    @XmlElement(name = "StaffNumber")
    protected StaffNumberV10CT staffNumber;

    /**
     * 获取staffNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StaffNumberV10CT }
     *     
     */
    public StaffNumberV10CT getStaffNumber() {
        return staffNumber;
    }

    /**
     * 设置staffNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StaffNumberV10CT }
     *     
     */
    public void setStaffNumber(StaffNumberV10CT value) {
        this.staffNumber = value;
    }

}
