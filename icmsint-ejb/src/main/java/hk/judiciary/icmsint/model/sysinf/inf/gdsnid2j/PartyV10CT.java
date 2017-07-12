//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.03 at 10:31:06 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * party details consists of 
 *                                a) Name in English
 *                                b) Name in Chinese
 *                                c) CCC Code
 *                                d) ID Type
 *                                e) ID Number
 *                                f) Gender
 *                                g) Date of Birth
 *                                h) Age
 *                                i) Phone number
 *             
 * 
 * <p>Java class for Party.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyEnglishName" type="{}PartyEnglishName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PartyChineseName" type="{}PartyChineseName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CCCCode" type="{PCN}ChineseCommercialCodeDetails.V1.0.CT" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="IdentificationType" type="{}IdentificationType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="IdentificationNumber" type="{}IdentificationNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Gender" type="{PGC}PersonGenderCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="Age" type="{}Age.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{}PhoneNumber.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party.V1.0.CT", propOrder = {
    "partyEnglishName",
    "partyChineseName",
    "cccCode",
    "identificationType",
    "identificationNumber",
    "gender",
    "birthDate",
    "age",
    "phoneNumber"
})
@XmlSeeAlso({
    DefendantV10CT.class,
    WitnessV10CT.class,
    InformantV10CT.class
})
public class PartyV10CT {

    @XmlElement(name = "PartyEnglishName")
    protected PartyEnglishNameV10CT partyEnglishName;
    @XmlElement(name = "PartyChineseName")
    protected PartyChineseNameV10CT partyChineseName;
    @XmlElement(name = "CCCCode")
    protected List<ChineseCommercialCodeDetailsV10CT> cccCode;
    @XmlElement(name = "IdentificationType")
    protected IdentificationTypeV10CT identificationType;
    @XmlElement(name = "IdentificationNumber")
    protected IdentificationNumberV10CT identificationNumber;
    @XmlElement(name = "Gender")
    protected PersonGenderCodeV10CT gender;
    @XmlElement(name = "BirthDate")
    protected DateCT birthDate;
    @XmlElement(name = "Age")
    protected AgeV10CT age;
    @XmlElement(name = "PhoneNumber")
    protected PhoneNumberV10CT phoneNumber;

    /**
     * Gets the value of the partyEnglishName property.
     * 
     * @return
     *     possible object is
     *     {@link PartyEnglishNameV10CT }
     *     
     */
    public PartyEnglishNameV10CT getPartyEnglishName() {
        return partyEnglishName;
    }

    /**
     * Sets the value of the partyEnglishName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnglishNameV10CT }
     *     
     */
    public void setPartyEnglishName(PartyEnglishNameV10CT value) {
        this.partyEnglishName = value;
    }

    /**
     * Gets the value of the partyChineseName property.
     * 
     * @return
     *     possible object is
     *     {@link PartyChineseNameV10CT }
     *     
     */
    public PartyChineseNameV10CT getPartyChineseName() {
        return partyChineseName;
    }

    /**
     * Sets the value of the partyChineseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyChineseNameV10CT }
     *     
     */
    public void setPartyChineseName(PartyChineseNameV10CT value) {
        this.partyChineseName = value;
    }

    /**
     * Gets the value of the cccCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cccCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCCCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChineseCommercialCodeDetailsV10CT }
     * 
     * 
     */
    public List<ChineseCommercialCodeDetailsV10CT> getCCCCode() {
        if (cccCode == null) {
            cccCode = new ArrayList<ChineseCommercialCodeDetailsV10CT>();
        }
        return this.cccCode;
    }

    /**
     * Gets the value of the identificationType property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationTypeV10CT }
     *     
     */
    public IdentificationTypeV10CT getIdentificationType() {
        return identificationType;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationTypeV10CT }
     *     
     */
    public void setIdentificationType(IdentificationTypeV10CT value) {
        this.identificationType = value;
    }

    /**
     * Gets the value of the identificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumberV10CT }
     *     
     */
    public IdentificationNumberV10CT getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberV10CT }
     *     
     */
    public void setIdentificationNumber(IdentificationNumberV10CT value) {
        this.identificationNumber = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link PersonGenderCodeV10CT }
     *     
     */
    public PersonGenderCodeV10CT getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonGenderCodeV10CT }
     *     
     */
    public void setGender(PersonGenderCodeV10CT value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setBirthDate(DateCT value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link AgeV10CT }
     *     
     */
    public AgeV10CT getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeV10CT }
     *     
     */
    public void setAge(AgeV10CT value) {
        this.age = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV10CT }
     *     
     */
    public PhoneNumberV10CT getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV10CT }
     *     
     */
    public void setPhoneNumber(PhoneNumberV10CT value) {
        this.phoneNumber = value;
    }

}
