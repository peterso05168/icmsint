//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * defendant object derives from Party
 *                                object found in common_jud.xsd, additional
 *                                elements include :
 *                                a) Defendant Type 
 *                                b) Address Object
 *                                c) Interpret Language
 *                                d) Special Arrangement
 *             
 * 
 * <p>Defendant.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Defendant.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="DefendantType" type="{}DefendantType.V1.0.CT"/>
 *         &lt;element name="Address" type="{}Address.V1.0.CT"/>
 *         &lt;element name="InterpretLanguage" type="{}Language.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="SpecialArrangement" type="{}SpecialArrangement.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Defendant.V1.0.CT", propOrder = {
    "defendantType",
    "address",
    "interpretLanguage",
    "specialArrangement"
})
public class DefendantV10CT
    extends PartyV10CT
{

    @XmlElement(name = "DefendantType", required = true)
    protected DefendantTypeV10CT defendantType;
    @XmlElement(name = "Address", required = true)
    protected AddressV10CT address;
    @XmlElement(name = "InterpretLanguage")
    protected LanguageV10CT interpretLanguage;
    @XmlElement(name = "SpecialArrangement")
    protected SpecialArrangementV10CT specialArrangement;

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
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressV10CT }
     *     
     */
    public AddressV10CT getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV10CT }
     *     
     */
    public void setAddress(AddressV10CT value) {
        this.address = value;
    }

    /**
     * ��ȡinterpretLanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LanguageV10CT }
     *     
     */
    public LanguageV10CT getInterpretLanguage() {
        return interpretLanguage;
    }

    /**
     * ����interpretLanguage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageV10CT }
     *     
     */
    public void setInterpretLanguage(LanguageV10CT value) {
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

}