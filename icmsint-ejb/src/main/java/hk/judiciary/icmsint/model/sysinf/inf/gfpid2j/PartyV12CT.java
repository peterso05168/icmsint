//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

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
 * <p>Party.V1.2.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取partyEnglishSurname属性的值。
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
     * 设置partyEnglishSurname属性的值。
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
     * 获取partyEnglishGivenName属性的值。
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
     * 设置partyEnglishGivenName属性的值。
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
     * 获取partyChineseSurname属性的值。
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
     * 设置partyChineseSurname属性的值。
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
     * 获取partyChineseGivenName属性的值。
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
     * 设置partyChineseGivenName属性的值。
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
     * 获取identificationType属性的值。
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
     * 设置identificationType属性的值。
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
     * 获取identificationNumber属性的值。
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
     * 设置identificationNumber属性的值。
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
     * 获取gender属性的值。
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
     * 设置gender属性的值。
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
     * 获取birthDate属性的值。
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
     * 设置birthDate属性的值。
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
     * 获取age属性的值。
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
     * 设置age属性的值。
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
     * 获取phoneNumber属性的值。
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
     * 设置phoneNumber属性的值。
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
     * 获取otherPhoneNumber属性的值。
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
     * 设置otherPhoneNumber属性的值。
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
     * 获取faxNumber属性的值。
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
     * 设置faxNumber属性的值。
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
     * 获取email属性的值。
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
     * 设置email属性的值。
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
