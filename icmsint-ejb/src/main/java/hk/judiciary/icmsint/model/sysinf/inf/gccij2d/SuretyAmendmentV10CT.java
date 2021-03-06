//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:47:35 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Surety amendment object
 * 							Derived from CommonAmendment.V1.0.CT
 * 							Extension consists of
 * 							a) Surety Sequence Number
 * 			
 * 
 * <p>Java class for SuretyAmendment.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuretyAmendment.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CommonAmendment.V1.0.CT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuretySequenceNumber" type="{}SuretySequenceNumber.V1.0.CT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuretyAmendment.V1.0.CT", propOrder = {
    "suretySequenceNumber"
})
public class SuretyAmendmentV10CT
    extends CommonAmendmentV10CT
{

    @XmlElement(name = "SuretySequenceNumber", required = true)
    protected SuretySequenceNumberV10CT suretySequenceNumber;

    /**
     * Gets the value of the suretySequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SuretySequenceNumberV10CT }
     *     
     */
    public SuretySequenceNumberV10CT getSuretySequenceNumber() {
        return suretySequenceNumber;
    }

    /**
     * Sets the value of the suretySequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuretySequenceNumberV10CT }
     *     
     */
    public void setSuretySequenceNumber(SuretySequenceNumberV10CT value) {
        this.suretySequenceNumber = value;
    }

}
