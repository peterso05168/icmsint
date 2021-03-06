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
 * Receipt ID consists of
 *                                a) centre no.
 *                                b) workstation no.
 *                                c) shroff no.
 *                                d) receipt no.
 *             
 * 
 * <p>Java class for ReceiptID.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptID.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CentreNumber" type="{}CentreNumber.V1.0.CT"/&gt;
 *         &lt;element name="WorkstationNumber" type="{}WorkstationNumber.V1.0.CT"/&gt;
 *         &lt;element name="ShroffNumber" type="{}ShroffNumber.V1.0.CT"/&gt;
 *         &lt;element name="ReceiptNumber" type="{}ReceiptNumber.V1.1.CT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptID.V1.0.CT", propOrder = {
    "centreNumber",
    "workstationNumber",
    "shroffNumber",
    "receiptNumber"
})
public class ReceiptIDV10CT {

    @XmlElement(name = "CentreNumber", required = true)
    protected CentreNumberV10CT centreNumber;
    @XmlElement(name = "WorkstationNumber", required = true)
    protected WorkstationNumberV10CT workstationNumber;
    @XmlElement(name = "ShroffNumber", required = true)
    protected ShroffNumberV10CT shroffNumber;
    @XmlElement(name = "ReceiptNumber", required = true)
    protected ReceiptNumberV11CT receiptNumber;

    /**
     * Gets the value of the centreNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CentreNumberV10CT }
     *     
     */
    public CentreNumberV10CT getCentreNumber() {
        return centreNumber;
    }

    /**
     * Sets the value of the centreNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentreNumberV10CT }
     *     
     */
    public void setCentreNumber(CentreNumberV10CT value) {
        this.centreNumber = value;
    }

    /**
     * Gets the value of the workstationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link WorkstationNumberV10CT }
     *     
     */
    public WorkstationNumberV10CT getWorkstationNumber() {
        return workstationNumber;
    }

    /**
     * Sets the value of the workstationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkstationNumberV10CT }
     *     
     */
    public void setWorkstationNumber(WorkstationNumberV10CT value) {
        this.workstationNumber = value;
    }

    /**
     * Gets the value of the shroffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ShroffNumberV10CT }
     *     
     */
    public ShroffNumberV10CT getShroffNumber() {
        return shroffNumber;
    }

    /**
     * Sets the value of the shroffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShroffNumberV10CT }
     *     
     */
    public void setShroffNumber(ShroffNumberV10CT value) {
        this.shroffNumber = value;
    }

    /**
     * Gets the value of the receiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptNumberV11CT }
     *     
     */
    public ReceiptNumberV11CT getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Sets the value of the receiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptNumberV11CT }
     *     
     */
    public void setReceiptNumber(ReceiptNumberV11CT value) {
        this.receiptNumber = value;
    }

}
