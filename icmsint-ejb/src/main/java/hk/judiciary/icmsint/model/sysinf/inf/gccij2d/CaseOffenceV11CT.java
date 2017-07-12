//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:47:35 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccij2d;

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
 * <p>Java class for CaseOffence.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseOffence.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromOffenceDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="FromOffenceTime" type="{CCT}Time.CT"/&gt;
 *         &lt;element name="ToOffenceDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="ToOffenceTime" type="{CCT}Time.CT"/&gt;
 *         &lt;element name="OffenceLocation" type="{}Address.V1.0.CT"/&gt;
 *         &lt;element name="MultiLocationIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{}Duration.V1.0.CT"/&gt;
 *         &lt;element name="VehicleRegistrationMark" type="{}VehicleRegistrationMark.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Gets the value of the fromOffenceDate property.
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
     * Sets the value of the fromOffenceDate property.
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
     * Gets the value of the fromOffenceTime property.
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
     * Sets the value of the fromOffenceTime property.
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
     * Gets the value of the toOffenceDate property.
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
     * Sets the value of the toOffenceDate property.
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
     * Gets the value of the toOffenceTime property.
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
     * Sets the value of the toOffenceTime property.
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
     * Gets the value of the offenceLocation property.
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
     * Sets the value of the offenceLocation property.
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
     * Gets the value of the multiLocationIndicator property.
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
     * Sets the value of the multiLocationIndicator property.
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
     * Gets the value of the duration property.
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
     * Sets the value of the duration property.
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
     * Gets the value of the vehicleRegistrationMark property.
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
     * Sets the value of the vehicleRegistrationMark property.
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
