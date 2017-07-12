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
 * Ofference Variable		   
 *                            a) Offence Variable Code
 *                            b) Offence Variable Name/Description
 *                            c) Offence Variable Value
 *                            d) Offence Variable Value Chinese
 * 			
 * 
 * <p>Java class for OffenceVariable.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceVariable.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffenceVarCode" type="{}VariableNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceVarDesc" type="{}VariableDescription.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceVarValue" type="{}OffenceVarValue.V1.0.CT"/>
 *         &lt;element name="OffenceVarValueChinese" type="{}OffenceVarValueChinese.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceVariable.V1.0.CT", propOrder = {
    "offenceVarCode",
    "offenceVarDesc",
    "offenceVarValue",
    "offenceVarValueChinese"
})
public class OffenceVariableV10CT {

    @XmlElement(name = "OffenceVarCode")
    protected VariableNumberV10CT offenceVarCode;
    @XmlElement(name = "OffenceVarDesc")
    protected VariableDescriptionV10CT offenceVarDesc;
    @XmlElement(name = "OffenceVarValue", required = true)
    protected OffenceVarValueV10CT offenceVarValue;
    @XmlElement(name = "OffenceVarValueChinese")
    protected OffenceVarValueChineseV10CT offenceVarValueChinese;

    /**
     * Gets the value of the offenceVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public VariableNumberV10CT getOffenceVarCode() {
        return offenceVarCode;
    }

    /**
     * Sets the value of the offenceVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public void setOffenceVarCode(VariableNumberV10CT value) {
        this.offenceVarCode = value;
    }

    /**
     * Gets the value of the offenceVarDesc property.
     * 
     * @return
     *     possible object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public VariableDescriptionV10CT getOffenceVarDesc() {
        return offenceVarDesc;
    }

    /**
     * Sets the value of the offenceVarDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public void setOffenceVarDesc(VariableDescriptionV10CT value) {
        this.offenceVarDesc = value;
    }

    /**
     * Gets the value of the offenceVarValue property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceVarValueV10CT }
     *     
     */
    public OffenceVarValueV10CT getOffenceVarValue() {
        return offenceVarValue;
    }

    /**
     * Sets the value of the offenceVarValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceVarValueV10CT }
     *     
     */
    public void setOffenceVarValue(OffenceVarValueV10CT value) {
        this.offenceVarValue = value;
    }

    /**
     * Gets the value of the offenceVarValueChinese property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceVarValueChineseV10CT }
     *     
     */
    public OffenceVarValueChineseV10CT getOffenceVarValueChinese() {
        return offenceVarValueChinese;
    }

    /**
     * Sets the value of the offenceVarValueChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceVarValueChineseV10CT }
     *     
     */
    public void setOffenceVarValueChinese(OffenceVarValueChineseV10CT value) {
        this.offenceVarValueChinese = value;
    }

}