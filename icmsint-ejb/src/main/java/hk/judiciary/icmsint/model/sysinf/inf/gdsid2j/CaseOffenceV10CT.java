//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:40:40 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsid2j;

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
 * <p>Java class for CaseOffence.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the offenceDate property.
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
     * Sets the value of the offenceDate property.
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
     * Gets the value of the offenceTime property.
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
     * Sets the value of the offenceTime property.
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

}
