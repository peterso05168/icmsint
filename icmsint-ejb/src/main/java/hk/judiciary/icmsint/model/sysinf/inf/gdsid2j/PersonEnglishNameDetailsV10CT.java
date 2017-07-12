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
 * UID = COM000022, Dictionary Entry Name = Person English Name. Details,
 * 			The name of a person in English, comprising some or all of the person's name prefix, family name, given name, and person's name suffix.
 * 
 * <p>Java class for PersonEnglishNameDetails.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonEnglishNameDetails.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnstructuredName" type="{PEN}PersonEnglishNameUnstructuredName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="StructuredName" type="{PEN}PersonEnglishStructuredNameDetails.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonEnglishNameDetails.V1.0.CT", namespace = "PEN", propOrder = {
    "unstructuredName",
    "structuredName"
})
public class PersonEnglishNameDetailsV10CT {

    @XmlElement(name = "UnstructuredName", namespace = "PEN")
    protected PersonEnglishNameUnstructuredNameV10CT unstructuredName;
    @XmlElement(name = "StructuredName", namespace = "PEN")
    protected PersonEnglishStructuredNameDetailsV10CT structuredName;

    /**
     * Gets the value of the unstructuredName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonEnglishNameUnstructuredNameV10CT }
     *     
     */
    public PersonEnglishNameUnstructuredNameV10CT getUnstructuredName() {
        return unstructuredName;
    }

    /**
     * Sets the value of the unstructuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEnglishNameUnstructuredNameV10CT }
     *     
     */
    public void setUnstructuredName(PersonEnglishNameUnstructuredNameV10CT value) {
        this.unstructuredName = value;
    }

    /**
     * Gets the value of the structuredName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonEnglishStructuredNameDetailsV10CT }
     *     
     */
    public PersonEnglishStructuredNameDetailsV10CT getStructuredName() {
        return structuredName;
    }

    /**
     * Sets the value of the structuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEnglishStructuredNameDetailsV10CT }
     *     
     */
    public void setStructuredName(PersonEnglishStructuredNameDetailsV10CT value) {
        this.structuredName = value;
    }

}