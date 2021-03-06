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
 *  Charge Case Amendment Result Message
 *                               Derived from Case.V1.0.CT
 *                               Extension consists of
 * 								a) Record Prefix
 * 								b) Amendment Reference Number
 * 								c) Amendment Application Status
 * 								d) Amendment Application Remark
 * 			
 * 
 * <p>Java class for ChargeCaseAmendmentResult.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeCaseAmendmentResult.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Case.V1.0.CT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/&gt;
 *         &lt;element name="AmendmentReferenceNumber" type="{}AmendmentReferenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/&gt;
 *         &lt;element name="AmendmentApplicationRemark" type="{}AmendmentApplicationRemark.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCaseAmendmentResult.V1.0.CT", propOrder = {
    "recordPrefix",
    "amendmentReferenceNumber",
    "applicationStatus",
    "amendmentApplicationRemark"
})
public class ChargeCaseAmendmentResultV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "AmendmentReferenceNumber", required = true)
    protected AmendmentReferenceNumberV10CT amendmentReferenceNumber;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "AmendmentApplicationRemark")
    protected AmendmentApplicationRemarkV10CT amendmentApplicationRemark;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV13CT }
     *     
     */
    public PrefixV13CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV13CT }
     *     
     */
    public void setRecordPrefix(PrefixV13CT value) {
        this.recordPrefix = value;
    }

    /**
     * Gets the value of the amendmentReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentReferenceNumberV10CT }
     *     
     */
    public AmendmentReferenceNumberV10CT getAmendmentReferenceNumber() {
        return amendmentReferenceNumber;
    }

    /**
     * Sets the value of the amendmentReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentReferenceNumberV10CT }
     *     
     */
    public void setAmendmentReferenceNumber(AmendmentReferenceNumberV10CT value) {
        this.amendmentReferenceNumber = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationStatusV10CT }
     *     
     */
    public ApplicationStatusV10CT getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationStatusV10CT }
     *     
     */
    public void setApplicationStatus(ApplicationStatusV10CT value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the amendmentApplicationRemark property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentApplicationRemarkV10CT }
     *     
     */
    public AmendmentApplicationRemarkV10CT getAmendmentApplicationRemark() {
        return amendmentApplicationRemark;
    }

    /**
     * Sets the value of the amendmentApplicationRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentApplicationRemarkV10CT }
     *     
     */
    public void setAmendmentApplicationRemark(AmendmentApplicationRemarkV10CT value) {
        this.amendmentApplicationRemark = value;
    }

}
