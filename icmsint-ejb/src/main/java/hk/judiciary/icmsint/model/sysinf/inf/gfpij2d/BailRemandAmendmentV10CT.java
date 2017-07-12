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
 * Bail Remand amendment object
 * 							Derived from CommonAmendment.V1.0.CT
 * 							Extension consists of
 * 							a) Bail Remand Identifier
 * 			
 * 
 * <p>BailRemandAmendment.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BailRemandAmendment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}CommonAmendment.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="BailRemandIdentifier" type="{}BailRemandIdentifier.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BailRemandAmendment.V1.0.CT", propOrder = {
    "bailRemandIdentifier"
})
public class BailRemandAmendmentV10CT
    extends CommonAmendmentV10CT
{

    @XmlElement(name = "BailRemandIdentifier", required = true)
    protected BailRemandIdentifierV10CT bailRemandIdentifier;

    /**
     * ��ȡbailRemandIdentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BailRemandIdentifierV10CT }
     *     
     */
    public BailRemandIdentifierV10CT getBailRemandIdentifier() {
        return bailRemandIdentifier;
    }

    /**
     * ����bailRemandIdentifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BailRemandIdentifierV10CT }
     *     
     */
    public void setBailRemandIdentifier(BailRemandIdentifierV10CT value) {
        this.bailRemandIdentifier = value;
    }

}
