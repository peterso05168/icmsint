//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:51:00 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offence Date and Time
 * 
 * <p>Java class for OffenceDateTime.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceDateTime.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OffenceDate" type="{CCT}Date.CT"/&gt;
 *         &lt;element name="OffenceTime" type="{CCT}Time.CT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceDateTime.V1.0.CT", propOrder = {
    "offenceDate",
    "offenceTime"
})
public class OffenceDateTimeV10CT {

    @XmlElement(name = "OffenceDate", required = true)
    protected DateCT offenceDate;
    @XmlElement(name = "OffenceTime", required = true)
    protected TimeCT offenceTime;

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

}