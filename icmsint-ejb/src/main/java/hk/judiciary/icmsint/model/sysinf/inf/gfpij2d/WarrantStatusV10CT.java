//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * warrant status code for non-payment warrant:
 *                 	'0': Pending Magistrate's Order
 *                 	'1': Warrant Issued -Pending Execution
 *                 	'2': Warrant Executed
 *                 	'3': Warrant Withdrawn
 *                 	'4': Warrant Application Withdrawn
 *                 	'5': Warrant Returned - Wrong Address
 *                 	'6': Warrant Returned - Isuff Goods
 *                 	'7': Warrant Returned - Misc. Reasons
 *                 	'X': Warrant Cancel Before Issue
 *                 	'Y': Warrant Cancel After Issue
 * 					'Z':
 *             
 * 
 * <p>WarrantStatus.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WarrantStatus.V1.0.CT">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;CCT>Code.CT">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarrantStatus.V1.0.CT")
public class WarrantStatusV10CT
    extends CodeCT
{


}
