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
 * 	SOD Application Result
 * 	  							Derived from SODKey.V1.0.CT
 * 								Extension consists of				 
 * 				a) Record Prefix
 * 				b) Interface ID
 * 				c) Prosecution Department Code (v1.1)
 * 				d) ApplicationAction (Add, Update)				
 * 				e) Application Result Code
 * 				f) Rejection Detail Object
 * 				
 * 			
 * 
 * <p>Java class for SODApplicationResult.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SODApplicationResult.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}SODKey.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="ApplicationAction" type="{}ApplicationAction.V1.0.CT"/>
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/>
 *         &lt;element name="SODApplicationRemark" type="{}SODApplicationRemark.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SODApplicationResult.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "prosecutionDepartmentCode",
    "applicationAction",
    "applicationStatus",
    "sodApplicationRemark"
})
public class SODApplicationResultV10CT
    extends SODKeyV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "ApplicationAction", required = true)
    protected ApplicationActionV10CT applicationAction;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "SODApplicationRemark")
    protected SODApplicationRemarkV10CT sodApplicationRemark;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV10CT }
     *     
     */
    public PrefixV10CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV10CT }
     *     
     */
    public void setRecordPrefix(PrefixV10CT value) {
        this.recordPrefix = value;
    }

    /**
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public InterfaceIDV10CT getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public void setInterfaceID(InterfaceIDV10CT value) {
        this.interfaceID = value;
    }

    /**
     * Gets the value of the prosecutionDepartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public ProsecutionDepartmentCodeV11CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * Sets the value of the prosecutionDepartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public void setProsecutionDepartmentCode(ProsecutionDepartmentCodeV11CT value) {
        this.prosecutionDepartmentCode = value;
    }

    /**
     * Gets the value of the applicationAction property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationActionV10CT }
     *     
     */
    public ApplicationActionV10CT getApplicationAction() {
        return applicationAction;
    }

    /**
     * Sets the value of the applicationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationActionV10CT }
     *     
     */
    public void setApplicationAction(ApplicationActionV10CT value) {
        this.applicationAction = value;
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
     * Gets the value of the sodApplicationRemark property.
     * 
     * @return
     *     possible object is
     *     {@link SODApplicationRemarkV10CT }
     *     
     */
    public SODApplicationRemarkV10CT getSODApplicationRemark() {
        return sodApplicationRemark;
    }

    /**
     * Sets the value of the sodApplicationRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link SODApplicationRemarkV10CT }
     *     
     */
    public void setSODApplicationRemark(SODApplicationRemarkV10CT value) {
        this.sodApplicationRemark = value;
    }

}
