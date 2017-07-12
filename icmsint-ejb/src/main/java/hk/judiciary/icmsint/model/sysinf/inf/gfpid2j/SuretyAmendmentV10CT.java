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
 * Surety amendment object
 * 							Derived from CommonAmendment.V1.0.CT
 * 							Extension consists of
 * 							a) Surety Sequence Number
 * 			
 * 
 * <p>SuretyAmendment.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SuretyAmendment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}CommonAmendment.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="SuretySequenceNumber" type="{}SuretySequenceNumber.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuretyAmendment.V1.0.CT", propOrder = {
    "suretySequenceNumber"
})
public class SuretyAmendmentV10CT
    extends CommonAmendmentV10CT
{

    @XmlElement(name = "SuretySequenceNumber", required = true)
    protected SuretySequenceNumberV10CT suretySequenceNumber;

    /**
     * ��ȡsuretySequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SuretySequenceNumberV10CT }
     *     
     */
    public SuretySequenceNumberV10CT getSuretySequenceNumber() {
        return suretySequenceNumber;
    }

    /**
     * ����suretySequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SuretySequenceNumberV10CT }
     *     
     */
    public void setSuretySequenceNumber(SuretySequenceNumberV10CT value) {
        this.suretySequenceNumber = value;
    }

}
