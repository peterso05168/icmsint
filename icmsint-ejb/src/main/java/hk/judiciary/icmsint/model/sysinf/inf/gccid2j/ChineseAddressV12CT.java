//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:51:00 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Chinese address lines version 1.2
 * 
 * <p>Java class for ChineseAddress.V1.2.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChineseAddress.V1.2.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChineseAddressLine" type="{}ChineseAddressLine.V1.1.CT" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChineseAddress.V1.2.CT", propOrder = {
    "chineseAddressLine"
})
public class ChineseAddressV12CT {

    @XmlElement(name = "ChineseAddressLine", required = true)
    protected List<ChineseAddressLineV11CT> chineseAddressLine;

    /**
     * Gets the value of the chineseAddressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chineseAddressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChineseAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChineseAddressLineV11CT }
     * 
     * 
     */
    public List<ChineseAddressLineV11CT> getChineseAddressLine() {
        if (chineseAddressLine == null) {
            chineseAddressLine = new ArrayList<ChineseAddressLineV11CT>();
        }
        return this.chineseAddressLine;
    }

}
