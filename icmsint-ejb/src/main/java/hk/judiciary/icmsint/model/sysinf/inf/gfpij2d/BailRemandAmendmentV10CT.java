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
 * Bail Remand amendment object
 * 							Derived from CommonAmendment.V1.0.CT
 * 							Extension consists of
 * 							a) Bail Remand Identifier
 * 			
 * 
 * <p>BailRemandAmendment.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BailRemandAmendment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}CommonAmendment.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="BailRemandIdentifier" type="{}BailRemandIdentifier.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BailRemandAmendment.V1.0.CT", propOrder = {
    "bailRemandIdentifier"
})
public class BailRemandAmendmentV10CT
    extends CommonAmendmentV10CT
{

    @XmlElement(name = "BailRemandIdentifier", required = true)
    protected BailRemandIdentifierV10CT bailRemandIdentifier;

    /**
     * 获取bailRemandIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BailRemandIdentifierV10CT }
     *     
     */
    public BailRemandIdentifierV10CT getBailRemandIdentifier() {
        return bailRemandIdentifier;
    }

    /**
     * 设置bailRemandIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BailRemandIdentifierV10CT }
     *     
     */
    public void setBailRemandIdentifier(BailRemandIdentifierV10CT value) {
        this.bailRemandIdentifier = value;
    }

}
