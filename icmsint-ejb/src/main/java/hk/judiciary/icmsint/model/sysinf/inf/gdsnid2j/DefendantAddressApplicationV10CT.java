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
 * 	Defendant Address Update
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix				
 * 				b) Interface ID	
 * 				c) Address Update Date
 * 				d) Defendant Address
 * 			
 * 
 * <p>Java class for DefendantAddressApplication.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefendantAddressApplication.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="AddressUpdateDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DefendantAddress" type="{}Address.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefendantAddressApplication.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "addressUpdateDate",
    "defendantAddress"
})
public class DefendantAddressApplicationV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "AddressUpdateDate", required = true)
    protected DateCT addressUpdateDate;
    @XmlElement(name = "DefendantAddress", required = true)
    protected AddressV11CT defendantAddress;

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
     * Gets the value of the addressUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getAddressUpdateDate() {
        return addressUpdateDate;
    }

    /**
     * Sets the value of the addressUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setAddressUpdateDate(DateCT value) {
        this.addressUpdateDate = value;
    }

    /**
     * Gets the value of the defendantAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressV11CT }
     *     
     */
    public AddressV11CT getDefendantAddress() {
        return defendantAddress;
    }

    /**
     * Sets the value of the defendantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV11CT }
     *     
     */
    public void setDefendantAddress(AddressV11CT value) {
        this.defendantAddress = value;
    }

}
