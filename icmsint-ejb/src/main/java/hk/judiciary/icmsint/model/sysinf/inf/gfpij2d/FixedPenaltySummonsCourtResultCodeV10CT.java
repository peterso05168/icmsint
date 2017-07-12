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
 *                 	' ': for court result type = 'W'
 *                 	'C': Convicted, for court result type 'N' or 'R' only
 *                 	'A': Convicted and discharged (absolute), for court result type 'N' or 'R' only
 *                 	'D': Convicted and discharged (conditional), for court result type 'A' or 'R'
 *                 	'N': Not convicted, for court result type 'N', 'R' or 'A'
 *                 	'W': Withdrawn, for court result type 'N' or 'R'
 *                 	'U': Upheld, for court result type 'A' or 'R'
 * 					'WE': Warrant execution result for court result type 'R' only
 *             
 * 
 * <p>FixedPenaltySummonsCourtResultCode.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltySummonsCourtResultCode.V1.0.CT">
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
@XmlType(name = "FixedPenaltySummonsCourtResultCode.V1.0.CT")
public class FixedPenaltySummonsCourtResultCodeV10CT
    extends CodeCT
{


}
