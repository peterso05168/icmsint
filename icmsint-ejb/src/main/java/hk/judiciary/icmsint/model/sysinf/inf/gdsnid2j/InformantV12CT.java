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
 * informant version 1.2 object derives from Party v1.2 object found in common_jud.xsd
 * 
 * <p>Java class for Informant.V1.2.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Informant.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.2.CT">
 *       &lt;sequence>
 *         &lt;element name="StaffNumber" type="{}StaffNumber.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Informant.V1.2.CT", propOrder = {
    "staffNumber"
})
public class InformantV12CT
    extends PartyV12CT
{

    @XmlElement(name = "StaffNumber")
    protected StaffNumberV10CT staffNumber;

    /**
     * Gets the value of the staffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link StaffNumberV10CT }
     *     
     */
    public StaffNumberV10CT getStaffNumber() {
        return staffNumber;
    }

    /**
     * Sets the value of the staffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffNumberV10CT }
     *     
     */
    public void setStaffNumber(StaffNumberV10CT value) {
        this.staffNumber = value;
    }

}
