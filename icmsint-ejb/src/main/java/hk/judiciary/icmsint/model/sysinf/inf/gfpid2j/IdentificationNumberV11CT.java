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
 * <p>IdentificationNumber.V1.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IdentificationNumber.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HKIDNumber" type="{HKID}HKIDNumberDetails.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OtherIDNumber" type="{}OtherIDNumber.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationNumber.V1.1.CT", propOrder = {
    "hkidNumber",
    "otherIDNumber"
})
public class IdentificationNumberV11CT {

    @XmlElement(name = "HKIDNumber")
    protected HKIDNumberDetailsV10CT hkidNumber;
    @XmlElement(name = "OtherIDNumber")
    protected OtherIDNumberV10CT otherIDNumber;

    /**
     * ��ȡhkidNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HKIDNumberDetailsV10CT }
     *     
     */
    public HKIDNumberDetailsV10CT getHKIDNumber() {
        return hkidNumber;
    }

    /**
     * ����hkidNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HKIDNumberDetailsV10CT }
     *     
     */
    public void setHKIDNumber(HKIDNumberDetailsV10CT value) {
        this.hkidNumber = value;
    }

    /**
     * ��ȡotherIDNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OtherIDNumberV10CT }
     *     
     */
    public OtherIDNumberV10CT getOtherIDNumber() {
        return otherIDNumber;
    }

    /**
     * ����otherIDNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIDNumberV10CT }
     *     
     */
    public void setOtherIDNumber(OtherIDNumberV10CT value) {
        this.otherIDNumber = value;
    }

}
