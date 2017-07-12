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
 * Witness amendment object
 * 							Derived from CommonAmendment.V1.0.CT
 * 							Extension consists of
 * 							a) Witness Sequence Number
 * 			
 * 
 * <p>WitnessAmendment.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WitnessAmendment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}CommonAmendment.V1.0.CT">
 *       &lt;sequence>
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
@XmlType(name = "WitnessAmendment.V1.0.CT", propOrder = {
    "witnessSequenceNumber"
})
public class WitnessAmendmentV10CT
    extends CommonAmendmentV10CT
{

    @XmlElement(name = "WitnessSequenceNumber", required = true)
    protected WitnessSequenceNumberV10CT witnessSequenceNumber;

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
