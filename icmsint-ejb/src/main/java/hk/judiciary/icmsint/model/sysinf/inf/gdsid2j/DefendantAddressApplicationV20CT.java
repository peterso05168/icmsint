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
 * 	Defendant Address Update
 * 	  							Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Address Update Date
 * 				c) Defendant Address
 * 			
 * 
 * <p>Java class for DefendantAddressApplication.V2.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefendantAddressApplication.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="AddressUpdateDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DefendantAddress" type="{}Address.V1.2.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefendantAddressApplication.V2.0.CT", propOrder = {
    "recordPrefix",
    "addressUpdateDate",
    "defendantAddress"
})
public class DefendantAddressApplicationV20CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "AddressUpdateDate", required = true)
    protected DateCT addressUpdateDate;
    @XmlElement(name = "DefendantAddress", required = true)
    protected AddressV12CT defendantAddress;

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
     *     {@link AddressV12CT }
     *     
     */
    public AddressV12CT getDefendantAddress() {
        return defendantAddress;
    }

    /**
     * Sets the value of the defendantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV12CT }
     *     
     */
    public void setDefendantAddress(AddressV12CT value) {
        this.defendantAddress = value;
    }

}
