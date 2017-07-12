//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:40:40 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Send SOD details to other PDs sharing the same SOD
 * 
 * <p>Java class for SODDetailsUpdate.V2.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SODDetailsUpdate.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}SODApplication.V2.0.CT">
 *       &lt;sequence>
 *         &lt;element name="OwnerProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SODDetailsUpdate.V2.0.CT", propOrder = {
    "ownerProsecutionDepartmentCode"
})
public class SODDetailsUpdateV20CT
    extends SODApplicationV20CT
{

    @XmlElement(name = "OwnerProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT ownerProsecutionDepartmentCode;

    /**
     * Gets the value of the ownerProsecutionDepartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public ProsecutionDepartmentCodeV11CT getOwnerProsecutionDepartmentCode() {
        return ownerProsecutionDepartmentCode;
    }

    /**
     * Sets the value of the ownerProsecutionDepartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public void setOwnerProsecutionDepartmentCode(ProsecutionDepartmentCodeV11CT value) {
        this.ownerProsecutionDepartmentCode = value;
    }

}