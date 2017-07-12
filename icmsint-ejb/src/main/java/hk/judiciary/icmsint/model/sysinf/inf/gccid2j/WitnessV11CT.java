//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:51:00 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * witness version 1.1 object derives from Party.V1.1.CT
 *                                object found in common_jud.xsd, additional
 *                                elements include : 
 *                                a) Address Object (v1.1)
 *                                b) Interpret Language (v1.1)
 *                                c) Special Arrangement
 *                                d) Item To Be Brought
 *             
 * 
 * <p>Java class for Witness.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Witness.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Party.V1.1.CT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{}Address.V1.1.CT"/&gt;
 *         &lt;element name="InterpretLanguage" type="{}Language.V1.1.CT" minOccurs="0"/&gt;
 *         &lt;element name="SpecialArrangement" type="{}SpecialArrangement.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ItemToBeBrought" type="{}ItemToBeBrought.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Witness.V1.1.CT", propOrder = {
    "address",
    "interpretLanguage",
    "specialArrangement",
    "itemToBeBrought"
})
public class WitnessV11CT
    extends PartyV11CT
{

    @XmlElement(name = "Address", required = true)
    protected AddressV11CT address;
    @XmlElement(name = "InterpretLanguage")
    protected LanguageV11CT interpretLanguage;
    @XmlElement(name = "SpecialArrangement")
    protected SpecialArrangementV10CT specialArrangement;
    @XmlElement(name = "ItemToBeBrought")
    protected ItemToBeBroughtV10CT itemToBeBrought;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressV11CT }
     *     
     */
    public AddressV11CT getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV11CT }
     *     
     */
    public void setAddress(AddressV11CT value) {
        this.address = value;
    }

    /**
     * Gets the value of the interpretLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageV11CT }
     *     
     */
    public LanguageV11CT getInterpretLanguage() {
        return interpretLanguage;
    }

    /**
     * Sets the value of the interpretLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageV11CT }
     *     
     */
    public void setInterpretLanguage(LanguageV11CT value) {
        this.interpretLanguage = value;
    }

    /**
     * Gets the value of the specialArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialArrangementV10CT }
     *     
     */
    public SpecialArrangementV10CT getSpecialArrangement() {
        return specialArrangement;
    }

    /**
     * Sets the value of the specialArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialArrangementV10CT }
     *     
     */
    public void setSpecialArrangement(SpecialArrangementV10CT value) {
        this.specialArrangement = value;
    }

    /**
     * Gets the value of the itemToBeBrought property.
     * 
     * @return
     *     possible object is
     *     {@link ItemToBeBroughtV10CT }
     *     
     */
    public ItemToBeBroughtV10CT getItemToBeBrought() {
        return itemToBeBrought;
    }

    /**
     * Sets the value of the itemToBeBrought property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemToBeBroughtV10CT }
     *     
     */
    public void setItemToBeBrought(ItemToBeBroughtV10CT value) {
        this.itemToBeBrought = value;
    }

}
