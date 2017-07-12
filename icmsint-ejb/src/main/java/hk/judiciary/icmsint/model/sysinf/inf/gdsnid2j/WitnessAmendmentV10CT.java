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
 * Witness amendment object
 * 							Derived from CommonAmendment.V1.0.CT
 * 							Extension consists of
 * 							a) Witness Sequence Number
 * 			
 * 
 * <p>Java class for WitnessAmendment.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WitnessAmendment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}CommonAmendment.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="WitnessSequenceNumber" type="{}WitnessSequenceNumber.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WitnessAmendment.V1.0.CT", propOrder = {
    "witnessSequenceNumber"
})
public class WitnessAmendmentV10CT
    extends CommonAmendmentV10CT
{

    @XmlElement(name = "WitnessSequenceNumber", required = true)
    protected WitnessSequenceNumberV10CT witnessSequenceNumber;

    /**
     * Gets the value of the witnessSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link WitnessSequenceNumberV10CT }
     *     
     */
    public WitnessSequenceNumberV10CT getWitnessSequenceNumber() {
        return witnessSequenceNumber;
    }

    /**
     * Sets the value of the witnessSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessSequenceNumberV10CT }
     *     
     */
    public void setWitnessSequenceNumber(WitnessSequenceNumberV10CT value) {
        this.witnessSequenceNumber = value;
    }

}