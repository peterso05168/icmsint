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
 * Offence amendment object
 * 						Derived from CommonAmendment.V1.0.CT
 * 						Extension consists of
 * 						a) Offence Sequence Number
 * 			
 * 
 * <p>OffenceAmendment.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OffenceAmendment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}CommonAmendment.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="OffenceSequenceNumber" type="{}OffenceSequenceNumber.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceAmendment.V1.0.CT", propOrder = {
    "offenceSequenceNumber"
})
public class OffenceAmendmentV10CT
    extends CommonAmendmentV10CT
{

    @XmlElement(name = "OffenceSequenceNumber", required = true)
    protected OffenceSequenceNumberV10CT offenceSequenceNumber;

    /**
     * ��ȡoffenceSequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceSequenceNumberV10CT }
     *     
     */
    public OffenceSequenceNumberV10CT getOffenceSequenceNumber() {
        return offenceSequenceNumber;
    }

    /**
     * ����offenceSequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceSequenceNumberV10CT }
     *     
     */
    public void setOffenceSequenceNumber(OffenceSequenceNumberV10CT value) {
        this.offenceSequenceNumber = value;
    }

}
