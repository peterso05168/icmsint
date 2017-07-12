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
 * Document 
 * 				a) Prosecution department code
 * 				b) Departmental reference number (v1.1)
 * 				c) Link serial number (v1.1)
 * 				d) LEA Reference Number (Ticket number)
 * 				e) DOP offence code type
 * 				f) DOP offence code
 * 				g) Offence date
 * 				h) Conviction date
 * 				i) Document description (e.g. DOP points)
 * 			
 * 
 * <p>Document.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Document.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *         &lt;element name="LinkSerialNumber" type="{}LinkSerialNumber.V1.1.CT"/>
 *         &lt;element name="LEAReferenceNumber" type="{}LEAReferenceNumber.V1.0.CT"/>
 *         &lt;element name="OffenceCodeType" type="{}OffenceCodeType.V1.0.CT"/>
 *         &lt;element name="OffenceCode" type="{}OffenceCode.V1.0.CT"/>
 *         &lt;element name="OffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="ConvictionDate" type="{CCT}Date.CT"/>
 *         &lt;element name="OffencePoint" type="{}OffencePoint.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document.V1.0.CT", propOrder = {
    "prosecutionDepartmentCode",
    "departmentReferenceNumber",
    "linkSerialNumber",
    "leaReferenceNumber",
    "offenceCodeType",
    "offenceCode",
    "offenceDate",
    "convictionDate",
    "offencePoint"
})
public class DocumentV10CT {

    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "DepartmentReferenceNumber", required = true)
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "LinkSerialNumber", required = true)
    protected LinkSerialNumberV11CT linkSerialNumber;
    @XmlElement(name = "LEAReferenceNumber", required = true)
    protected LEAReferenceNumberV10CT leaReferenceNumber;
    @XmlElement(name = "OffenceCodeType", required = true)
    protected OffenceCodeTypeV10CT offenceCodeType;
    @XmlElement(name = "OffenceCode", required = true)
    protected OffenceCodeV10CT offenceCode;
    @XmlElement(name = "OffenceDate", required = true)
    protected DateCT offenceDate;
    @XmlElement(name = "ConvictionDate", required = true)
    protected DateCT convictionDate;
    @XmlElement(name = "OffencePoint", required = true)
    protected OffencePointV10CT offencePoint;

    /**
     * 获取prosecutionDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public ProsecutionDepartmentCodeV11CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * 设置prosecutionDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public void setProsecutionDepartmentCode(ProsecutionDepartmentCodeV11CT value) {
        this.prosecutionDepartmentCode = value;
    }

    /**
     * 获取departmentReferenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public DepartmentReferenceNumberV10CT getDepartmentReferenceNumber() {
        return departmentReferenceNumber;
    }

    /**
     * 设置departmentReferenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public void setDepartmentReferenceNumber(DepartmentReferenceNumberV10CT value) {
        this.departmentReferenceNumber = value;
    }

    /**
     * 获取linkSerialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LinkSerialNumberV11CT }
     *     
     */
    public LinkSerialNumberV11CT getLinkSerialNumber() {
        return linkSerialNumber;
    }

    /**
     * 设置linkSerialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LinkSerialNumberV11CT }
     *     
     */
    public void setLinkSerialNumber(LinkSerialNumberV11CT value) {
        this.linkSerialNumber = value;
    }

    /**
     * 获取leaReferenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LEAReferenceNumberV10CT }
     *     
     */
    public LEAReferenceNumberV10CT getLEAReferenceNumber() {
        return leaReferenceNumber;
    }

    /**
     * 设置leaReferenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LEAReferenceNumberV10CT }
     *     
     */
    public void setLEAReferenceNumber(LEAReferenceNumberV10CT value) {
        this.leaReferenceNumber = value;
    }

    /**
     * 获取offenceCodeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceCodeTypeV10CT }
     *     
     */
    public OffenceCodeTypeV10CT getOffenceCodeType() {
        return offenceCodeType;
    }

    /**
     * 设置offenceCodeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceCodeTypeV10CT }
     *     
     */
    public void setOffenceCodeType(OffenceCodeTypeV10CT value) {
        this.offenceCodeType = value;
    }

    /**
     * 获取offenceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceCodeV10CT }
     *     
     */
    public OffenceCodeV10CT getOffenceCode() {
        return offenceCode;
    }

    /**
     * 设置offenceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceCodeV10CT }
     *     
     */
    public void setOffenceCode(OffenceCodeV10CT value) {
        this.offenceCode = value;
    }

    /**
     * 获取offenceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getOffenceDate() {
        return offenceDate;
    }

    /**
     * 设置offenceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setOffenceDate(DateCT value) {
        this.offenceDate = value;
    }

    /**
     * 获取convictionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getConvictionDate() {
        return convictionDate;
    }

    /**
     * 设置convictionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setConvictionDate(DateCT value) {
        this.convictionDate = value;
    }

    /**
     * 获取offencePoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffencePointV10CT }
     *     
     */
    public OffencePointV10CT getOffencePoint() {
        return offencePoint;
    }

    /**
     * 设置offencePoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffencePointV10CT }
     *     
     */
    public void setOffencePoint(OffencePointV10CT value) {
        this.offencePoint = value;
    }

}
