//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:32:28 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdnid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * UID = COM000019, Dictionary Entry Name = Chinese Commercial Code. Details,
 * 			4-digit Chinese Commercial Code (CCC) printed on the HKID Card and optional 1-digit extension
 * 
 * <p>Java class for ChineseCommercialCodeDetails.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChineseCommercialCodeDetails.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FourDigitCode" type="{PCN}ChineseCommercialCodeFourDigitCodeText.V1.0.CT"/>
 *         &lt;element name="ExtensionNumber" type="{PCN}ChineseCommercialCodeExtensionNumberText.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChineseCommercialCodeDetails.V1.0.CT", namespace = "PCN", propOrder = {
    "fourDigitCode",
    "extensionNumber"
})
public class ChineseCommercialCodeDetailsV10CT {

    @XmlElement(name = "FourDigitCode", namespace = "PCN", required = true)
    protected ChineseCommercialCodeFourDigitCodeTextV10CT fourDigitCode;
    @XmlElement(name = "ExtensionNumber", namespace = "PCN")
    protected ChineseCommercialCodeExtensionNumberTextV10CT extensionNumber;

    /**
     * Gets the value of the fourDigitCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChineseCommercialCodeFourDigitCodeTextV10CT }
     *     
     */
    public ChineseCommercialCodeFourDigitCodeTextV10CT getFourDigitCode() {
        return fourDigitCode;
    }

    /**
     * Sets the value of the fourDigitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChineseCommercialCodeFourDigitCodeTextV10CT }
     *     
     */
    public void setFourDigitCode(ChineseCommercialCodeFourDigitCodeTextV10CT value) {
        this.fourDigitCode = value;
    }

    /**
     * Gets the value of the extensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ChineseCommercialCodeExtensionNumberTextV10CT }
     *     
     */
    public ChineseCommercialCodeExtensionNumberTextV10CT getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * Sets the value of the extensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChineseCommercialCodeExtensionNumberTextV10CT }
     *     
     */
    public void setExtensionNumber(ChineseCommercialCodeExtensionNumberTextV10CT value) {
        this.extensionNumber = value;
    }

}
