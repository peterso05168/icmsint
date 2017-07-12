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
 *                                a) From Offence Date
 *                                b) From Offence Time
 *                                c) To Offence Date
 *                                d) To Offence Time
 * 							   e) Offence Location
 * 							   f) Multiple Offence Location Indicator
 * 							   g) Duration: Minute, Second
 * 							   h) Vehicle Registration Mark
 * 			
 * 
 * <p>CaseOffence.V1.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CaseOffence.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromOffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="FromOffenceTime" type="{CCT}Time.CT"/>
 *         &lt;element name="ToOffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="ToOffenceTime" type="{CCT}Time.CT"/>
 *         &lt;element name="OffenceLocation" type="{}Address.V1.0.CT"/>
 *         &lt;element name="MultiLocationIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Duration" type="{}Duration.V1.0.CT"/>
 *         &lt;element name="VehicleRegistrationMark" type="{}VehicleRegistrationMark.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseOffence.V1.1.CT", propOrder = {
    "fromOffenceDate",
    "fromOffenceTime",
    "toOffenceDate",
    "toOffenceTime",
    "offenceLocation",
    "multiLocationIndicator",
    "duration",
    "vehicleRegistrationMark"
})
public class CaseOffenceV11CT {

    @XmlElement(name = "FromOffenceDate", required = true)
    protected DateCT fromOffenceDate;
    @XmlElement(name = "FromOffenceTime", required = true)
    protected TimeCT fromOffenceTime;
    @XmlElement(name = "ToOffenceDate", required = true)
    protected DateCT toOffenceDate;
    @XmlElement(name = "ToOffenceTime", required = true)
    protected TimeCT toOffenceTime;
    @XmlElement(name = "OffenceLocation", required = true)
    protected AddressV10CT offenceLocation;
    @XmlElement(name = "MultiLocationIndicator")
    protected FieldIndicatorV10CT multiLocationIndicator;
    @XmlElement(name = "Duration", required = true)
    protected DurationV10CT duration;
    @XmlElement(name = "VehicleRegistrationMark")
    protected VehicleRegistrationMarkV10CT vehicleRegistrationMark;

    /**
     * 获取fromOffenceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFromOffenceDate() {
        return fromOffenceDate;
    }

    /**
     * 设置fromOffenceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFromOffenceDate(DateCT value) {
        this.fromOffenceDate = value;
    }

    /**
     * 获取fromOffenceTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getFromOffenceTime() {
        return fromOffenceTime;
    }

    /**
     * 设置fromOffenceTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setFromOffenceTime(TimeCT value) {
        this.fromOffenceTime = value;
    }

    /**
     * 获取toOffenceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getToOffenceDate() {
        return toOffenceDate;
    }

    /**
     * 设置toOffenceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setToOffenceDate(DateCT value) {
        this.toOffenceDate = value;
    }

    /**
     * 获取toOffenceTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getToOffenceTime() {
        return toOffenceTime;
    }

    /**
     * 设置toOffenceTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setToOffenceTime(TimeCT value) {
        this.toOffenceTime = value;
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

    /**
     * 获取multiLocationIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getMultiLocationIndicator() {
        return multiLocationIndicator;
    }

    /**
     * 设置multiLocationIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setMultiLocationIndicator(FieldIndicatorV10CT value) {
        this.multiLocationIndicator = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DurationV10CT }
     *     
     */
    public DurationV10CT getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DurationV10CT }
     *     
     */
    public void setDuration(DurationV10CT value) {
        this.duration = value;
    }

    /**
     * 获取vehicleRegistrationMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleRegistrationMarkV10CT }
     *     
     */
    public VehicleRegistrationMarkV10CT getVehicleRegistrationMark() {
        return vehicleRegistrationMark;
    }

    /**
     * 设置vehicleRegistrationMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRegistrationMarkV10CT }
     *     
     */
    public void setVehicleRegistrationMark(VehicleRegistrationMarkV10CT value) {
        this.vehicleRegistrationMark = value;
    }

}
