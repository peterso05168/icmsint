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
 * informant version 1.2 object derives from Party v1.2 object found in common_jud.xsd
 * 
 * <p>Informant.V1.2.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Informant.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Party.V1.2.CT">
 *       &lt;sequence>
 *         &lt;element name="StaffNumber" type="{}StaffNumber.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Informant.V1.2.CT", propOrder = {
    "staffNumber"
})
public class InformantV12CT
    extends PartyV12CT
{

    @XmlElement(name = "StaffNumber")
    protected StaffNumberV10CT staffNumber;

    /**
     * ��ȡstaffNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StaffNumberV10CT }
     *     
     */
    public StaffNumberV10CT getStaffNumber() {
        return staffNumber;
    }

    /**
     * ����staffNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StaffNumberV10CT }
     *     
     */
    public void setStaffNumber(StaffNumberV10CT value) {
        this.staffNumber = value;
    }

}
