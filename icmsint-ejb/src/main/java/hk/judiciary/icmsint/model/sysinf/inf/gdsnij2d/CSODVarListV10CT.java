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
 * SOD variable consists of 
 *                                a) SOD Key Object
 *                                b) SOD Variable Details Object
 *             
 * 
 * <p>Java class for CSODVarList.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSODVarList.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SODKey" type="{}SODKey.V1.0.CT"/&gt;
 *         &lt;element name="SODVarDetail" type="{}CSODVarDetail.V1.0.CT" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSODVarList.V1.0.CT", propOrder = {
    "sodKey",
    "sodVarDetail"
})
public class CSODVarListV10CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV10CT sodKey;
    @XmlElement(name = "SODVarDetail", required = true)
    protected List<CSODVarDetailV10CT> sodVarDetail;

    /**
     * Gets the value of the sodKey property.
     * 
     * @return
     *     possible object is
     *     {@link SODKeyV10CT }
     *     
     */
    public SODKeyV10CT getSODKey() {
        return sodKey;
    }

    /**
     * Sets the value of the sodKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SODKeyV10CT }
     *     
     */
    public void setSODKey(SODKeyV10CT value) {
        this.sodKey = value;
    }

    /**
     * Gets the value of the sodVarDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sodVarDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSODVarDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSODVarDetailV10CT }
     * 
     * 
     */
    public List<CSODVarDetailV10CT> getSODVarDetail() {
        if (sodVarDetail == null) {
            sodVarDetail = new ArrayList<CSODVarDetailV10CT>();
        }
        return this.sodVarDetail;
    }

}