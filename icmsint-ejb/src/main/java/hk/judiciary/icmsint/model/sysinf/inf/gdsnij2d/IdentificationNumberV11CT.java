//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 05:38:22 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationNumber.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationNumber.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HKIDNumber" type="{HKID}HKIDNumberDetails.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="OtherIDNumber" type="{}OtherIDNumber.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationNumber.V1.1.CT", propOrder = {
    "hkidNumber",
    "otherIDNumber"
})
public class IdentificationNumberV11CT {

    @XmlElement(name = "HKIDNumber")
    protected HKIDNumberDetailsV10CT hkidNumber;
    @XmlElement(name = "OtherIDNumber")
    protected OtherIDNumberV10CT otherIDNumber;

    /**
     * Gets the value of the hkidNumber property.
     * 
     * @return
     *     possible object is
     *     {@link HKIDNumberDetailsV10CT }
     *     
     */
    public HKIDNumberDetailsV10CT getHKIDNumber() {
        return hkidNumber;
    }

    /**
     * Sets the value of the hkidNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HKIDNumberDetailsV10CT }
     *     
     */
    public void setHKIDNumber(HKIDNumberDetailsV10CT value) {
        this.hkidNumber = value;
    }

    /**
     * Gets the value of the otherIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIDNumberV10CT }
     *     
     */
    public OtherIDNumberV10CT getOtherIDNumber() {
        return otherIDNumber;
    }

    /**
     * Sets the value of the otherIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIDNumberV10CT }
     *     
     */
    public void setOtherIDNumber(OtherIDNumberV10CT value) {
        this.otherIDNumber = value;
    }

}