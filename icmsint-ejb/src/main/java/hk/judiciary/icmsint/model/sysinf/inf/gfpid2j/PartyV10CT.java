//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
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
 * <p>Party.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpartyEnglishName���Ե�ֵ��
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
     * ����partyEnglishName���Ե�ֵ��
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
     * ��ȡpartyChineseName���Ե�ֵ��
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
     * ����partyChineseName���Ե�ֵ��
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
     * ��ȡidentificationType���Ե�ֵ��
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
     * ����identificationType���Ե�ֵ��
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
     * ��ȡidentificationNumber���Ե�ֵ��
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
     * ����identificationNumber���Ե�ֵ��
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
     * ��ȡgender���Ե�ֵ��
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
     * ����gender���Ե�ֵ��
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
     * ��ȡbirthDate���Ե�ֵ��
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
     * ����birthDate���Ե�ֵ��
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
     * ��ȡage���Ե�ֵ��
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
     * ����age���Ե�ֵ��
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
     * ��ȡphoneNumber���Ե�ֵ��
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
     * ����phoneNumber���Ե�ֵ��
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
