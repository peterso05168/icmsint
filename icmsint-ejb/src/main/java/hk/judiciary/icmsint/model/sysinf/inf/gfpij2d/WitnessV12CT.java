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
 * witness version 1.2 object derives from Party.V1.2.CT
 *                                object found in common_jud.xsd, additional
 *                                elements include : 
 *                                a) Address Object (v1.2)
 *                                b) Interpret Language (v1.1)
 *                                c) Special Arrangement
 *                                d) Item To Be Brought
 *                                e) Witness Sequence Number
 *             
 * 
 * <p>Witness.V1.2.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Witness.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.2.CT">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{}Address.V1.2.CT"/>
 *         &lt;element name="InterpretLanguage" type="{}Language.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="SpecialArrangement" type="{}SpecialArrangement.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ItemToBeBrought" type="{}ItemToBeBrought.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessSequenceNumber" type="{}WitnessSequenceNumber.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Witness.V1.2.CT", propOrder = {
    "address",
    "interpretLanguage",
    "specialArrangement",
    "itemToBeBrought",
    "witnessSequenceNumber"
})
public class WitnessV12CT
    extends PartyV12CT
{

    @XmlElement(name = "Address", required = true)
    protected AddressV12CT address;
    @XmlElement(name = "InterpretLanguage")
    protected LanguageV11CT interpretLanguage;
    @XmlElement(name = "SpecialArrangement")
    protected SpecialArrangementV10CT specialArrangement;
    @XmlElement(name = "ItemToBeBrought")
    protected ItemToBeBroughtV10CT itemToBeBrought;
    @XmlElement(name = "WitnessSequenceNumber", required = true)
    protected WitnessSequenceNumberV10CT witnessSequenceNumber;

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
     * ��ȡitemToBeBrought���Ե�ֵ��
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
     * ����itemToBeBrought���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemToBeBroughtV10CT }
     *     
     */
    public void setItemToBeBrought(ItemToBeBroughtV10CT value) {
        this.itemToBeBrought = value;
    }

    /**
     * ��ȡwitnessSequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WitnessSequenceNumberV10CT }
     *     
     */
    public WitnessSequenceNumberV10CT getWitnessSequenceNumber() {
        return witnessSequenceNumber;
    }

    /**
     * ����witnessSequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessSequenceNumberV10CT }
     *     
     */
    public void setWitnessSequenceNumber(WitnessSequenceNumberV10CT value) {
        this.witnessSequenceNumber = value;
    }

}
