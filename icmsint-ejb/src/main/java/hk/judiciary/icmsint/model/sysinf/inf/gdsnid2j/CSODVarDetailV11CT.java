//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.03 at 10:31:06 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SOD variable consists of 
 *                                a) Variable Number
 *                                b) Variable Type
 *                                c) Variable Description in English
 *                                d) Variable Description in Chinese (V1.1)
 *             
 * 
 * <p>Java class for CSODVarDetail.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSODVarDetail.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariableNumber" type="{}VariableNumber.V1.0.CT"/>
 *         &lt;element name="VariableType" type="{}VariableType.V1.0.CT"/>
 *         &lt;element name="VariableDescription" type="{}VariableDescription.V1.0.CT"/>
 *         &lt;element name="VariableDescriptionChinese" type="{}VariableDescriptionChinese.V1.1.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSODVarDetail.V1.1.CT", propOrder = {
    "variableNumber",
    "variableType",
    "variableDescription",
    "variableDescriptionChinese"
})
public class CSODVarDetailV11CT {

    @XmlElement(name = "VariableNumber", required = true)
    protected VariableNumberV10CT variableNumber;
    @XmlElement(name = "VariableType", required = true)
    protected VariableTypeV10CT variableType;
    @XmlElement(name = "VariableDescription", required = true)
    protected VariableDescriptionV10CT variableDescription;
    @XmlElement(name = "VariableDescriptionChinese")
    protected VariableDescriptionChineseV11CT variableDescriptionChinese;

    /**
     * Gets the value of the variableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public VariableNumberV10CT getVariableNumber() {
        return variableNumber;
    }

    /**
     * Sets the value of the variableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableNumberV10CT }
     *     
     */
    public void setVariableNumber(VariableNumberV10CT value) {
        this.variableNumber = value;
    }

    /**
     * Gets the value of the variableType property.
     * 
     * @return
     *     possible object is
     *     {@link VariableTypeV10CT }
     *     
     */
    public VariableTypeV10CT getVariableType() {
        return variableType;
    }

    /**
     * Sets the value of the variableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableTypeV10CT }
     *     
     */
    public void setVariableType(VariableTypeV10CT value) {
        this.variableType = value;
    }

    /**
     * Gets the value of the variableDescription property.
     * 
     * @return
     *     possible object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public VariableDescriptionV10CT getVariableDescription() {
        return variableDescription;
    }

    /**
     * Sets the value of the variableDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDescriptionV10CT }
     *     
     */
    public void setVariableDescription(VariableDescriptionV10CT value) {
        this.variableDescription = value;
    }

    /**
     * Gets the value of the variableDescriptionChinese property.
     * 
     * @return
     *     possible object is
     *     {@link VariableDescriptionChineseV11CT }
     *     
     */
    public VariableDescriptionChineseV11CT getVariableDescriptionChinese() {
        return variableDescriptionChinese;
    }

    /**
     * Sets the value of the variableDescriptionChinese property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDescriptionChineseV11CT }
     *     
     */
    public void setVariableDescriptionChinese(VariableDescriptionChineseV11CT value) {
        this.variableDescriptionChinese = value;
    }

}
