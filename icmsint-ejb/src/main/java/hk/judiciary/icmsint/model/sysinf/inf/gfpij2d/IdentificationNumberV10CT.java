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
 * <p>IdentificationNumber.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IdentificationNumber.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDNumberType" type="{}IDNumberType.V1.0.CT"/>
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
@XmlType(name = "IdentificationNumber.V1.0.CT", propOrder = {
    "idNumberType",
    "hkidNumber",
    "otherIDNumber"
})
public class IdentificationNumberV10CT {

    @XmlElement(name = "IDNumberType", required = true)
    protected IDNumberTypeV10CT idNumberType;
    @XmlElement(name = "HKIDNumber")
    protected HKIDNumberDetailsV10CT hkidNumber;
    @XmlElement(name = "OtherIDNumber")
    protected OtherIDNumberV10CT otherIDNumber;

    /**
     * ��ȡidNumberType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IDNumberTypeV10CT }
     *     
     */
    public IDNumberTypeV10CT getIDNumberType() {
        return idNumberType;
    }

    /**
     * ����idNumberType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IDNumberTypeV10CT }
     *     
     */
    public void setIDNumberType(IDNumberTypeV10CT value) {
        this.idNumberType = value;
    }

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