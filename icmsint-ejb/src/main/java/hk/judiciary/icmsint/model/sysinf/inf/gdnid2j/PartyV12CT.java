//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:32:28 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdnid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * party version 1.2 details consists of 
 *                                a) Surname, Given name in English
 *                                b) Surname, Given name in Chinese
 *                                c) CCC Code
 *                                d) ID Type
 *                                e) ID Number
 *                                f) Gender
 *                                g) Date of Birth
 *                                h) Age (v1.1)
 *                                i) Phone number
 *                                j) Other Phone number
 *                                k) Fax number
 *                                l) Email
 *             
 * 
 * <p>Java class for Party.V1.2.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyEnglishSurname" type="{}PartyEnglishSurname.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PartyEnglishGivenName" type="{}PartyEnglishGivenName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PartyChineseSurname" type="{}PartyChineseSurname.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PartyChineseGivenName" type="{}PartyChineseGivenName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CCCCode" type="{PCN}ChineseCommercialCodeDetails.V1.0.CT" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="IdentificationType" type="{}IdentificationType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="IdentificationNumber" type="{}IdentificationNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="Gender" type="{PGC}PersonGenderCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="Age" type="{}Age.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{}PhoneNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="OtherPhoneNumber" type="{}PhoneNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{}PhoneNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="Email" type="{}Email.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party.V1.2.CT", propOrder = {
    "partyEnglishSurname",
    "partyEnglishGivenName",
    "partyChineseSurname",
    "partyChineseGivenName",
    "cccCode",
    "identificationType",
    "identificationNumber",
    "gender",
    "birthDate",
    "age",
    "phoneNumber",
    "otherPhoneNumber",
    "faxNumber",
    "email"
})
@XmlSeeAlso({
    SuretyV10CT.class,
    WitnessV12CT.class,
    InformantV12CT.class,
    DefendantV13CT.class
})
public class PartyV12CT {

    @XmlElement(name = "PartyEnglishSurname")
    protected PartyEnglishSurnameV10CT partyEnglishSurname;
    @XmlElement(name = "PartyEnglishGivenName")
    protected PartyEnglishGivenNameV10CT partyEnglishGivenName;
    @XmlElement(name = "PartyChineseSurname")
    protected PartyChineseSurnameV10CT partyChineseSurname;
    @XmlElement(name = "PartyChineseGivenName")
    protected PartyChineseGivenNameV10CT partyChineseGivenName;
    @XmlElement(name = "CCCCode")
    protected List<ChineseCommercialCodeDetailsV10CT> cccCode;
    @XmlElement(name = "IdentificationType")
    protected IdentificationTypeV10CT identificationType;
    @XmlElement(name = "IdentificationNumber")
    protected IdentificationNumberV11CT identificationNumber;
    @XmlElement(name = "Gender")
    protected PersonGenderCodeV10CT gender;
    @XmlElement(name = "BirthDate")
    protected DateCT birthDate;
    @XmlElement(name = "Age")
    protected AgeV11CT age;
    @XmlElement(name = "PhoneNumber")
    protected PhoneNumberV11CT phoneNumber;
    @XmlElement(name = "OtherPhoneNumber")
    protected PhoneNumberV11CT otherPhoneNumber;
    @XmlElement(name = "FaxNumber")
    protected PhoneNumberV11CT faxNumber;
    @XmlElement(name = "Email")
    protected EmailV10CT email;

    /**
     * Gets the value of the partyEnglishSurname property.
     * 
     * @return
     *     possible object is
     *     {@link PartyEnglishSurnameV10CT }
     *     
     */
    public PartyEnglishSurnameV10CT getPartyEnglishSurname() {
        return partyEnglishSurname;
    }

    /**
     * Sets the value of the partyEnglishSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnglishSurnameV10CT }
     *     
     */
    public void setPartyEnglishSurname(PartyEnglishSurnameV10CT value) {
        this.partyEnglishSurname = value;
    }

    /**
     * Gets the value of the partyEnglishGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link PartyEnglishGivenNameV10CT }
     *     
     */
    public PartyEnglishGivenNameV10CT getPartyEnglishGivenName() {
        return partyEnglishGivenName;
    }

    /**
     * Sets the value of the partyEnglishGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnglishGivenNameV10CT }
     *     
     */
    public void setPartyEnglishGivenName(PartyEnglishGivenNameV10CT value) {
        this.partyEnglishGivenName = value;
    }

    /**
     * Gets the value of the partyChineseSurname property.
     * 
     * @return
     *     possible object is
     *     {@link PartyChineseSurnameV10CT }
     *     
     */
    public PartyChineseSurnameV10CT getPartyChineseSurname() {
        return partyChineseSurname;
    }

    /**
     * Sets the value of the partyChineseSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyChineseSurnameV10CT }
     *     
     */
    public void setPartyChineseSurname(PartyChineseSurnameV10CT value) {
        this.partyChineseSurname = value;
    }

    /**
     * Gets the value of the partyChineseGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link PartyChineseGivenNameV10CT }
     *     
     */
    public PartyChineseGivenNameV10CT getPartyChineseGivenName() {
        return partyChineseGivenName;
    }

    /**
     * Sets the value of the partyChineseGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyChineseGivenNameV10CT }
     *     
     */
    public void setPartyChineseGivenName(PartyChineseGivenNameV10CT value) {
        this.partyChineseGivenName = value;
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
     *     {@link IdentificationNumberV11CT }
     *     
     */
    public IdentificationNumberV11CT getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberV11CT }
     *     
     */
    public void setIdentificationNumber(IdentificationNumberV11CT value) {
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
     *     {@link AgeV11CT }
     *     
     */
    public AgeV11CT getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeV11CT }
     *     
     */
    public void setAge(AgeV11CT value) {
        this.age = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV11CT }
     *     
     */
    public PhoneNumberV11CT getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV11CT }
     *     
     */
    public void setPhoneNumber(PhoneNumberV11CT value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the otherPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV11CT }
     *     
     */
    public PhoneNumberV11CT getOtherPhoneNumber() {
        return otherPhoneNumber;
    }

    /**
     * Sets the value of the otherPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV11CT }
     *     
     */
    public void setOtherPhoneNumber(PhoneNumberV11CT value) {
        this.otherPhoneNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV11CT }
     *     
     */
    public PhoneNumberV11CT getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV11CT }
     *     
     */
    public void setFaxNumber(PhoneNumberV11CT value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EmailV10CT }
     *     
     */
    public EmailV10CT getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailV10CT }
     *     
     */
    public void setEmail(EmailV10CT value) {
        this.email = value;
    }

}