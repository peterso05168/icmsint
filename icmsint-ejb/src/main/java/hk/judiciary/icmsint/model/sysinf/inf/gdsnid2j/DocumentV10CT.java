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
 * Document 
 * 				a) Prosecution department code
 * 				b) Departmental reference number (v1.1)
 * 				c) Link serial number (v1.1)
 * 				d) LEA Reference Number (Ticket number)
 * 				e) DOP offence code type
 * 				f) DOP offence code
 * 				g) Offence date
 * 				h) Conviction date
 * 				i) Document description (e.g. DOP points)
 * 			
 * 
 * <p>Java class for Document.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *         &lt;element name="LinkSerialNumber" type="{}LinkSerialNumber.V1.1.CT"/>
 *         &lt;element name="LEAReferenceNumber" type="{}LEAReferenceNumber.V1.0.CT"/>
 *         &lt;element name="OffenceCodeType" type="{}OffenceCodeType.V1.0.CT"/>
 *         &lt;element name="OffenceCode" type="{}OffenceCode.V1.0.CT"/>
 *         &lt;element name="OffenceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="ConvictionDate" type="{CCT}Date.CT"/>
 *         &lt;element name="OffencePoint" type="{}OffencePoint.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document.V1.0.CT", propOrder = {
    "prosecutionDepartmentCode",
    "departmentReferenceNumber",
    "linkSerialNumber",
    "leaReferenceNumber",
    "offenceCodeType",
    "offenceCode",
    "offenceDate",
    "convictionDate",
    "offencePoint"
})
public class DocumentV10CT {

    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "DepartmentReferenceNumber", required = true)
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "LinkSerialNumber", required = true)
    protected LinkSerialNumberV11CT linkSerialNumber;
    @XmlElement(name = "LEAReferenceNumber", required = true)
    protected LEAReferenceNumberV10CT leaReferenceNumber;
    @XmlElement(name = "OffenceCodeType", required = true)
    protected OffenceCodeTypeV10CT offenceCodeType;
    @XmlElement(name = "OffenceCode", required = true)
    protected OffenceCodeV10CT offenceCode;
    @XmlElement(name = "OffenceDate", required = true)
    protected DateCT offenceDate;
    @XmlElement(name = "ConvictionDate", required = true)
    protected DateCT convictionDate;
    @XmlElement(name = "OffencePoint", required = true)
    protected OffencePointV10CT offencePoint;

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
     * Gets the value of the departmentReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public DepartmentReferenceNumberV10CT getDepartmentReferenceNumber() {
        return departmentReferenceNumber;
    }

    /**
     * Sets the value of the departmentReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public void setDepartmentReferenceNumber(DepartmentReferenceNumberV10CT value) {
        this.departmentReferenceNumber = value;
    }

    /**
     * Gets the value of the linkSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link LinkSerialNumberV11CT }
     *     
     */
    public LinkSerialNumberV11CT getLinkSerialNumber() {
        return linkSerialNumber;
    }

    /**
     * Sets the value of the linkSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkSerialNumberV11CT }
     *     
     */
    public void setLinkSerialNumber(LinkSerialNumberV11CT value) {
        this.linkSerialNumber = value;
    }

    /**
     * Gets the value of the leaReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link LEAReferenceNumberV10CT }
     *     
     */
    public LEAReferenceNumberV10CT getLEAReferenceNumber() {
        return leaReferenceNumber;
    }

    /**
     * Sets the value of the leaReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEAReferenceNumberV10CT }
     *     
     */
    public void setLEAReferenceNumber(LEAReferenceNumberV10CT value) {
        this.leaReferenceNumber = value;
    }

    /**
     * Gets the value of the offenceCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceCodeTypeV10CT }
     *     
     */
    public OffenceCodeTypeV10CT getOffenceCodeType() {
        return offenceCodeType;
    }

    /**
     * Sets the value of the offenceCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceCodeTypeV10CT }
     *     
     */
    public void setOffenceCodeType(OffenceCodeTypeV10CT value) {
        this.offenceCodeType = value;
    }

    /**
     * Gets the value of the offenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffenceCodeV10CT }
     *     
     */
    public OffenceCodeV10CT getOffenceCode() {
        return offenceCode;
    }

    /**
     * Sets the value of the offenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceCodeV10CT }
     *     
     */
    public void setOffenceCode(OffenceCodeV10CT value) {
        this.offenceCode = value;
    }

    /**
     * Gets the value of the offenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getOffenceDate() {
        return offenceDate;
    }

    /**
     * Sets the value of the offenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setOffenceDate(DateCT value) {
        this.offenceDate = value;
    }

    /**
     * Gets the value of the convictionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getConvictionDate() {
        return convictionDate;
    }

    /**
     * Sets the value of the convictionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setConvictionDate(DateCT value) {
        this.convictionDate = value;
    }

    /**
     * Gets the value of the offencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link OffencePointV10CT }
     *     
     */
    public OffencePointV10CT getOffencePoint() {
        return offencePoint;
    }

    /**
     * Sets the value of the offencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffencePointV10CT }
     *     
     */
    public void setOffencePoint(OffencePointV10CT value) {
        this.offencePoint = value;
    }

}
