//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 05:38:22 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * English address lines version 1.1
 * 
 * <p>Java class for EnglishAddress.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnglishAddress.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnglishAddressLine" type="{}EnglishAddressLine.V1.1.CT" maxOccurs="5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnglishAddress.V1.1.CT", propOrder = {
    "englishAddressLine"
})
public class EnglishAddressV11CT {

    @XmlElement(name = "EnglishAddressLine", required = true)
    protected List<EnglishAddressLineV11CT> englishAddressLine;

    /**
     * Gets the value of the englishAddressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the englishAddressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnglishAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnglishAddressLineV11CT }
     * 
     * 
     */
    public List<EnglishAddressLineV11CT> getEnglishAddressLine() {
        if (englishAddressLine == null) {
            englishAddressLine = new ArrayList<EnglishAddressLineV11CT>();
        }
        return this.englishAddressLine;
    }

}
