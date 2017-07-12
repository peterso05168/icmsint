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
 * offence details object for charge case 
 *                                consists of
 *                                a) Offence Sequence Number
 *                                b) Charge Type
 *                                c) Charge Case Offence Date Object
 *                                d) CaseSOD (v1.2)
 *                                e) Related Offence Sequence Number
 * 			
 * 
 * <p>Java class for ChargeCaseOffence.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeCaseOffence.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OffenceSequenceNumber" type="{}OffenceSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="ChargeType" type="{}ChargeType.V1.0.CT"/&gt;
 *         &lt;element name="OffenceDate" type="{}ChargeCaseOffenceDate.V1.0.CT"/&gt;
 *         &lt;element name="CaseSODDetails" type="{}CaseSOD.V1.2.CT"/&gt;
 *         &lt;element name="RelatedOffenceSequenceNumber" type="{}OffenceSequenceNumber.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCaseOffence.V1.0.CT", propOrder = {
    "offenceSequenceNumber",
    "chargeType",
    "offenceDate",
    "caseSODDetails",
    "relatedOffenceSequenceNumber"
})
public class ChargeCaseOffenceV10CT {

    @XmlElement(name = "OffenceSequenceNumber", required = true)
    protected OffenceSequenceNumberV10CT offenceSequenceNumber;
    @XmlElement(name = "ChargeType", required = true)
    protected ChargeTypeV10CT chargeType;
    @XmlElement(name = "OffenceDate", required = true)
    protected ChargeCaseOffenceDateV10CT offenceDate;
    @XmlElement(name = "CaseSODDetails", required = true)
    protected CaseSODV12CT caseSODDetails;
    @XmlElement(name = "RelatedOffenceSequenceNumber")
    protected OffenceSequenceNumberV10CT relatedOffenceSequenceNumber;

    /**
     * Gets the value of the offenceSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceSequenceNumberV10CT }
     *     
     */
    public OffenceSequenceNumberV10CT getOffenceSequenceNumber() {
        return offenceSequenceNumber;
    }

    /**
     * Sets the value of the offenceSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceSequenceNumberV10CT }
     *     
     */
    public void setOffenceSequenceNumber(OffenceSequenceNumberV10CT value) {
        this.offenceSequenceNumber = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTypeV10CT }
     *     
     */
    public ChargeTypeV10CT getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTypeV10CT }
     *     
     */
    public void setChargeType(ChargeTypeV10CT value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the offenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeCaseOffenceDateV10CT }
     *     
     */
    public ChargeCaseOffenceDateV10CT getOffenceDate() {
        return offenceDate;
    }

    /**
     * Sets the value of the offenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeCaseOffenceDateV10CT }
     *     
     */
    public void setOffenceDate(ChargeCaseOffenceDateV10CT value) {
        this.offenceDate = value;
    }

    /**
     * Gets the value of the caseSODDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CaseSODV12CT }
     *     
     */
    public CaseSODV12CT getCaseSODDetails() {
        return caseSODDetails;
    }

    /**
     * Sets the value of the caseSODDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseSODV12CT }
     *     
     */
    public void setCaseSODDetails(CaseSODV12CT value) {
        this.caseSODDetails = value;
    }

    /**
     * Gets the value of the relatedOffenceSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceSequenceNumberV10CT }
     *     
     */
    public OffenceSequenceNumberV10CT getRelatedOffenceSequenceNumber() {
        return relatedOffenceSequenceNumber;
    }

    /**
     * Sets the value of the relatedOffenceSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceSequenceNumberV10CT }
     *     
     */
    public void setRelatedOffenceSequenceNumber(OffenceSequenceNumberV10CT value) {
        this.relatedOffenceSequenceNumber = value;
    }

}
