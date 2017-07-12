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
 * UID = COM000001, Dictionary Entry Name = HKID Number. Details,
 * 			A unique reference associated with the holder of a Hong Kong Identity Card issued by the Immigration Department of the HKSARG.
 * 
 * <p>HKIDNumberDetails.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HKIDNumberDetails.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{HKID}HKIDNumberIdentifier.V1.0.CT"/>
 *         &lt;element name="CheckDigit" type="{HKID}HKIDNumberCheckDigitText.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HKIDNumberDetails.V1.0.CT", namespace = "HKID", propOrder = {
    "identifier",
    "checkDigit"
})
public class HKIDNumberDetailsV10CT {

    @XmlElement(name = "Identifier", namespace = "HKID", required = true)
    protected HKIDNumberIdentifierV10CT identifier;
    @XmlElement(name = "CheckDigit", namespace = "HKID")
    protected HKIDNumberCheckDigitTextV10CT checkDigit;

    /**
     * ��ȡidentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HKIDNumberIdentifierV10CT }
     *     
     */
    public HKIDNumberIdentifierV10CT getIdentifier() {
        return identifier;
    }

    /**
     * ����identifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HKIDNumberIdentifierV10CT }
     *     
     */
    public void setIdentifier(HKIDNumberIdentifierV10CT value) {
        this.identifier = value;
    }

    /**
     * ��ȡcheckDigit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HKIDNumberCheckDigitTextV10CT }
     *     
     */
    public HKIDNumberCheckDigitTextV10CT getCheckDigit() {
        return checkDigit;
    }

    /**
     * ����checkDigit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HKIDNumberCheckDigitTextV10CT }
     *     
     */
    public void setCheckDigit(HKIDNumberCheckDigitTextV10CT value) {
        this.checkDigit = value;
    }

}
