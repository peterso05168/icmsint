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
 * court result code:
 *                 	' ' : for court result type = 'W' or 'I'
 *                 	'F' : Fixed Penalty for court result type 'N' or 'R' only
 *                 	'W' : Withdrawn for court result type 'N' or 'R' only
 *                 	'U' : Conviction upheld for court result type 'A' or 'R'
 *                 	'N' : No conviction or dismissed
 *                 	'RP': Rescinded - choose to pay for court result type 'A' or 'R'
 *                 	'RW': Rescinded - choose to withdraw for court result type 'A' or 'R'
 *                 	'RD': Rescinded - choose to dispute for court result type 'A' or 'R'
 *                 	'I' : Re-instatement for court result type 'R' only
 *                 	'WE': Warrant execution result for court result type 'R' only
 *                 	'O' : Miscellaneous result code, for all result type
 *             
 * 
 * <p>NoticeOfOrderCourtResultCode.V1.0.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="NoticeOfOrderCourtResultCode.V1.0.1.CT">
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
@XmlType(name = "NoticeOfOrderCourtResultCode.V1.0.1.CT")
public class NoticeOfOrderCourtResultCodeV101CT
    extends CodeCT
{


}
