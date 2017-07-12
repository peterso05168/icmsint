//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * defendant version 1.3 object derives from Party (V1.2)
 *                                object found in common_jud.xsd, additional
 *                                elements include :
 *                                a) Defendant Type
 *                                b) Defendant Alias Name in English
 *                                c) Defendant Alias Name in Chinese
 *                                d) Address Object (V1.2)
 *                                e) Interpret Language (v1.1)
 *                                f) Special Arrangement
 *                                g) Defendant District Code
 *             
 * 
 * <p>Defendant.V1.3.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Defendant.V1.3.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.2.CT">
 *       &lt;sequence>
 *         &lt;element name="DefendantType" type="{}DefendantType.V1.0.CT"/>
 *         &lt;element name="PartyEnglishAliasName" type="{}PartyEnglishAliasName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="PartyChineseAliasName" type="{}PartyChineseAliasName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Address" type="{}Address.V1.2.CT"/>
 *         &lt;element name="InterpretLanguage" type="{}Language.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="SpecialArrangement" type="{}SpecialArrangement.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DefendantDistrictCode" type="{}BailiffDistrictCode.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Defendant.V1.3.CT", propOrder = {
    "defendantType",
    "partyEnglishAliasName",
    "partyChineseAliasName",
    "address",
    "interpretLanguage",
    "specialArrangement",
    "defendantDistrictCode"
})
public class DefendantV13CT
    extends PartyV12CT
{

    @XmlElement(name = "DefendantType", required = true)
    protected DefendantTypeV10CT defendantType;
    @XmlElement(name = "PartyEnglishAliasName")
    protected PartyEnglishAliasNameV10CT partyEnglishAliasName;
    @XmlElement(name = "PartyChineseAliasName")
    protected PartyChineseAliasNameV10CT partyChineseAliasName;
    @XmlElement(name = "Address", required = true)
    protected AddressV12CT address;
    @XmlElement(name = "InterpretLanguage")
    protected LanguageV11CT interpretLanguage;
    @XmlElement(name = "SpecialArrangement")
    protected SpecialArrangementV10CT specialArrangement;
    @XmlElement(name = "DefendantDistrictCode")
    protected BailiffDistrictCodeV10CT defendantDistrictCode;

    /**
     * ��ȡdefendantType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DefendantTypeV10CT }
     *     
     */
    public DefendantTypeV10CT getDefendantType() {
        return defendantType;
    }

    /**
     * ����defendantType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantTypeV10CT }
     *     
     */
    public void setDefendantType(DefendantTypeV10CT value) {
        this.defendantType = value;
    }

    /**
     * ��ȡpartyEnglishAliasName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PartyEnglishAliasNameV10CT }
     *     
     */
    public PartyEnglishAliasNameV10CT getPartyEnglishAliasName() {
        return partyEnglishAliasName;
    }

    /**
     * ����partyEnglishAliasName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnglishAliasNameV10CT }
     *     
     */
    public void setPartyEnglishAliasName(PartyEnglishAliasNameV10CT value) {
        this.partyEnglishAliasName = value;
    }

    /**
     * ��ȡpartyChineseAliasName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PartyChineseAliasNameV10CT }
     *     
     */
    public PartyChineseAliasNameV10CT getPartyChineseAliasName() {
        return partyChineseAliasName;
    }

    /**
     * ����partyChineseAliasName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PartyChineseAliasNameV10CT }
     *     
     */
    public void setPartyChineseAliasName(PartyChineseAliasNameV10CT value) {
        this.partyChineseAliasName = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressV12CT }
     *     
     */
    public AddressV12CT getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV12CT }
     *     
     */
    public void setAddress(AddressV12CT value) {
        this.address = value;
    }

    /**
     * ��ȡinterpretLanguage���Ե�ֵ��
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
     * ����interpretLanguage���Ե�ֵ��
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
     * ��ȡspecialArrangement���Ե�ֵ��
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
     * ����specialArrangement���Ե�ֵ��
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
     * ��ȡdefendantDistrictCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BailiffDistrictCodeV10CT }
     *     
     */
    public BailiffDistrictCodeV10CT getDefendantDistrictCode() {
        return defendantDistrictCode;
    }

    /**
     * ����defendantDistrictCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BailiffDistrictCodeV10CT }
     *     
     */
    public void setDefendantDistrictCode(BailiffDistrictCodeV10CT value) {
        this.defendantDistrictCode = value;
    }

}
