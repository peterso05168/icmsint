//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ofference Details
 * 	               a) Offence Date Format
 * 	               b) Offence Date
 * 	               c) Time Bar Method
 * 	               d) Discover Date
 * 	               e) Interface Offence Code
 * 	               f) Offence Description Format
 * 	               g) Offence Location
 * 			
 * 
 * <p>OffenceDetails.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OffenceDetails.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffenceDateFormat" type="{}OffenceDateFormat.V1.0.CT"/>
 *         &lt;element name="OffenceDateTime" type="{}OffenceDateTime.V1.0.CT" maxOccurs="2"/>
 *         &lt;element name="TimeBarMethod" type="{}TimeBarMethod.V1.0.CT"/>
 *         &lt;element name="DiscoverDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="InterfaceOffenceCode" type="{}InterfaceOffenceCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescFormat" type="{}OffenceDescFormat.V1.0.CT"/>
 *         &lt;element name="OffenceLocation" type="{}Address.V1.1.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceDetails.V1.0.CT", propOrder = {
    "offenceDateFormat",
    "offenceDateTime",
    "timeBarMethod",
    "discoverDate",
    "interfaceOffenceCode",
    "offenceDescFormat",
    "offenceLocation"
})
public class OffenceDetailsV10CT {

    @XmlElement(name = "OffenceDateFormat", required = true)
    protected OffenceDateFormatV10CT offenceDateFormat;
    @XmlElement(name = "OffenceDateTime", required = true)
    protected List<OffenceDateTimeV10CT> offenceDateTime;
    @XmlElement(name = "TimeBarMethod", required = true)
    protected TimeBarMethodV10CT timeBarMethod;
    @XmlElement(name = "DiscoverDate")
    protected DateCT discoverDate;
    @XmlElement(name = "InterfaceOffenceCode")
    protected InterfaceOffenceCodeV10CT interfaceOffenceCode;
    @XmlElement(name = "OffenceDescFormat", required = true)
    protected OffenceDescFormatV10CT offenceDescFormat;
    @XmlElement(name = "OffenceLocation")
    protected AddressV11CT offenceLocation;

    /**
     * 获取offenceDateFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceDateFormatV10CT }
     *     
     */
    public OffenceDateFormatV10CT getOffenceDateFormat() {
        return offenceDateFormat;
    }

    /**
     * 设置offenceDateFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDateFormatV10CT }
     *     
     */
    public void setOffenceDateFormat(OffenceDateFormatV10CT value) {
        this.offenceDateFormat = value;
    }

    /**
     * Gets the value of the offenceDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offenceDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffenceDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffenceDateTimeV10CT }
     * 
     * 
     */
    public List<OffenceDateTimeV10CT> getOffenceDateTime() {
        if (offenceDateTime == null) {
            offenceDateTime = new ArrayList<OffenceDateTimeV10CT>();
        }
        return this.offenceDateTime;
    }

    /**
     * 获取timeBarMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeBarMethodV10CT }
     *     
     */
    public TimeBarMethodV10CT getTimeBarMethod() {
        return timeBarMethod;
    }

    /**
     * 设置timeBarMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBarMethodV10CT }
     *     
     */
    public void setTimeBarMethod(TimeBarMethodV10CT value) {
        this.timeBarMethod = value;
    }

    /**
     * 获取discoverDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getDiscoverDate() {
        return discoverDate;
    }

    /**
     * 设置discoverDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setDiscoverDate(DateCT value) {
        this.discoverDate = value;
    }

    /**
     * 获取interfaceOffenceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InterfaceOffenceCodeV10CT }
     *     
     */
    public InterfaceOffenceCodeV10CT getInterfaceOffenceCode() {
        return interfaceOffenceCode;
    }

    /**
     * 设置interfaceOffenceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceOffenceCodeV10CT }
     *     
     */
    public void setInterfaceOffenceCode(InterfaceOffenceCodeV10CT value) {
        this.interfaceOffenceCode = value;
    }

    /**
     * 获取offenceDescFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescFormatV10CT }
     *     
     */
    public OffenceDescFormatV10CT getOffenceDescFormat() {
        return offenceDescFormat;
    }

    /**
     * 设置offenceDescFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescFormatV10CT }
     *     
     */
    public void setOffenceDescFormat(OffenceDescFormatV10CT value) {
        this.offenceDescFormat = value;
    }

    /**
     * 获取offenceLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressV11CT }
     *     
     */
    public AddressV11CT getOffenceLocation() {
        return offenceLocation;
    }

    /**
     * 设置offenceLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV11CT }
     *     
     */
    public void setOffenceLocation(AddressV11CT value) {
        this.offenceLocation = value;
    }

}
