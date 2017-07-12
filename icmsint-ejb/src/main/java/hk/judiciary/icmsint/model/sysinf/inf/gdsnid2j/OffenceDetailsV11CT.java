//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.03 at 10:31:06 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j;

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
 * <p>Java class for OffenceDetails.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceDetails.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffenceDateFormat" type="{}OffenceDateFormat.V1.0.CT"/>
 *         &lt;element name="OffenceDateTime" type="{}OffenceDateTime.V1.0.CT" maxOccurs="2"/>
 *         &lt;element name="TimeBarMethod" type="{}TimeBarMethod.V1.0.CT"/>
 *         &lt;element name="DiscoverDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="InterfaceOffenceCode" type="{}InterfaceOffenceCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDescFormat" type="{}OffenceDescFormat.V1.0.CT"/>
 *         &lt;element name="OffenceLocation" type="{}Address.V1.2.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceDetails.V1.1.CT", propOrder = {
    "offenceDateFormat",
    "offenceDateTime",
    "timeBarMethod",
    "discoverDate",
    "interfaceOffenceCode",
    "offenceDescFormat",
    "offenceLocation"
})
public class OffenceDetailsV11CT {

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
    protected AddressV12CT offenceLocation;

    /**
     * Gets the value of the offenceDateFormat property.
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
     * Sets the value of the offenceDateFormat property.
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
     * Gets the value of the timeBarMethod property.
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
     * Sets the value of the timeBarMethod property.
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
     * Gets the value of the discoverDate property.
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
     * Sets the value of the discoverDate property.
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
     * Gets the value of the interfaceOffenceCode property.
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
     * Sets the value of the interfaceOffenceCode property.
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
     * Gets the value of the offenceDescFormat property.
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
     * Sets the value of the offenceDescFormat property.
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
     * Gets the value of the offenceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressV12CT }
     *     
     */
    public AddressV12CT getOffenceLocation() {
        return offenceLocation;
    }

    /**
     * Sets the value of the offenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV12CT }
     *     
     */
    public void setOffenceLocation(AddressV12CT value) {
        this.offenceLocation = value;
    }

}
