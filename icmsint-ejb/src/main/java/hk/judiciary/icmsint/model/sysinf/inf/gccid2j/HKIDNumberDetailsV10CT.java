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
 * UID = COM000001, Dictionary Entry Name = HKID Number. Details,
 * 			A unique reference associated with the holder of a Hong Kong Identity Card issued by the Immigration Department of the HKSARG.
 * 
 * <p>Java class for HKIDNumberDetails.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HKIDNumberDetails.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{HKID}HKIDNumberIdentifier.V1.0.CT"/&gt;
 *         &lt;element name="CheckDigit" type="{HKID}HKIDNumberCheckDigitText.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HKIDNumberDetails.V1.0.CT", namespace = "HKID", propOrder = {
    "identifier",
    "checkDigit"
})
public class HKIDNumberDetailsV10CT {

    @XmlElement(name = "Identifier", namespace = "HKID", required = true)
    protected HKIDNumberIdentifierV10CT identifier;
    @XmlElement(name = "CheckDigit", namespace = "HKID")
    protected HKIDNumberCheckDigitTextV10CT checkDigit;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link HKIDNumberIdentifierV10CT }
     *     
     */
    public HKIDNumberIdentifierV10CT getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HKIDNumberIdentifierV10CT }
     *     
     */
    public void setIdentifier(HKIDNumberIdentifierV10CT value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the checkDigit property.
     * 
     * @return
     *     possible object is
     *     {@link HKIDNumberCheckDigitTextV10CT }
     *     
     */
    public HKIDNumberCheckDigitTextV10CT getCheckDigit() {
        return checkDigit;
    }

    /**
     * Sets the value of the checkDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link HKIDNumberCheckDigitTextV10CT }
     *     
     */
    public void setCheckDigit(HKIDNumberCheckDigitTextV10CT value) {
        this.checkDigit = value;
    }

}
