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
 * case offence details consists of 
 *                                a) Offence Date
 *                                b) Offence Time
 *                                c) Offence Location 
 *             
 * 
 * <p>CaseOffence.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CaseOffence.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="OffenceTime" type="{CCT}Time.CT"/>
 *         &lt;element name="OffenceLocation" type="{}Address.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseOffence.V1.0.CT", propOrder = {
    "offenceDate",
    "offenceTime",
    "offenceLocation"
})
public class CaseOffenceV10CT {

    @XmlElement(name = "OffenceDate", required = true)
    protected DateCT offenceDate;
    @XmlElement(name = "OffenceTime", required = true)
    protected TimeCT offenceTime;
    @XmlElement(name = "OffenceLocation", required = true)
    protected AddressV10CT offenceLocation;

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
     * 获取offenceTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getOffenceTime() {
        return offenceTime;
    }

    /**
     * 设置offenceTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setOffenceTime(TimeCT value) {
        this.offenceTime = value;
    }

    /**
     * 获取offenceLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressV10CT }
     *     
     */
    public AddressV10CT getOffenceLocation() {
        return offenceLocation;
    }

    /**
     * 设置offenceLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV10CT }
     *     
     */
    public void setOffenceLocation(AddressV10CT value) {
        this.offenceLocation = value;
    }

}
