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
 * variable detail
 * 
 * <p>Java class for VariableDetail.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableDetail.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CSODVarDetail" type="{}CSODVarDetail.V1.1.CT"/&gt;
 *         &lt;element name="SODVariableSelection" type="{}SODVariableSelection.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableDetail.V1.0.CT", propOrder = {
    "csodVarDetail",
    "sodVariableSelection"
})
public class VariableDetailV10CT {

    @XmlElement(name = "CSODVarDetail", required = true)
    protected CSODVarDetailV11CT csodVarDetail;
    @XmlElement(name = "SODVariableSelection")
    protected SODVariableSelectionV10CT sodVariableSelection;

    /**
     * Gets the value of the csodVarDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CSODVarDetailV11CT }
     *     
     */
    public CSODVarDetailV11CT getCSODVarDetail() {
        return csodVarDetail;
    }

    /**
     * Sets the value of the csodVarDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSODVarDetailV11CT }
     *     
     */
    public void setCSODVarDetail(CSODVarDetailV11CT value) {
        this.csodVarDetail = value;
    }

    /**
     * Gets the value of the sodVariableSelection property.
     * 
     * @return
     *     possible object is
     *     {@link SODVariableSelectionV10CT }
     *     
     */
    public SODVariableSelectionV10CT getSODVariableSelection() {
        return sodVariableSelection;
    }

    /**
     * Sets the value of the sodVariableSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SODVariableSelectionV10CT }
     *     
     */
    public void setSODVariableSelection(SODVariableSelectionV10CT value) {
        this.sodVariableSelection = value;
    }

}
