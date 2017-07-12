//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:47:35 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccij2d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * UID = COM000016, Dictionary Entry Name = Person Chinese Name. Details,
 * 			The name of a person in Chinese, optionally with Chinese Commercial Code (CCC).
 * 
 * <p>Java class for PersonChineseNameDetails.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonChineseNameDetails.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{PCN}PersonChineseNameName.V1.0.CT"/&gt;
 *         &lt;element name="ChineseCommercialCode" type="{PCN}ChineseCommercialCodeDetails.V1.0.CT" maxOccurs="6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonChineseNameDetails.V1.0.CT", namespace = "PCN", propOrder = {
    "name",
    "chineseCommercialCode"
})
public class PersonChineseNameDetailsV10CT {

    @XmlElement(name = "Name", namespace = "PCN", required = true)
    protected PersonChineseNameNameV10CT name;
    @XmlElement(name = "ChineseCommercialCode", namespace = "PCN")
    protected List<ChineseCommercialCodeDetailsV10CT> chineseCommercialCode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonChineseNameNameV10CT }
     *     
     */
    public PersonChineseNameNameV10CT getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonChineseNameNameV10CT }
     *     
     */
    public void setName(PersonChineseNameNameV10CT value) {
        this.name = value;
    }

    /**
     * Gets the value of the chineseCommercialCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chineseCommercialCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChineseCommercialCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChineseCommercialCodeDetailsV10CT }
     * 
     * 
     */
    public List<ChineseCommercialCodeDetailsV10CT> getChineseCommercialCode() {
        if (chineseCommercialCode == null) {
            chineseCommercialCode = new ArrayList<ChineseCommercialCodeDetailsV10CT>();
        }
        return this.chineseCommercialCode;
    }

}
