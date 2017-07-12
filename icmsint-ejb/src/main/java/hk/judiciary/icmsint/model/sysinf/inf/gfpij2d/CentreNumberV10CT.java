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
 * Payment Centre Number
 *                                 1.ES - 35
 *                                 2.FL - 36
 *                                 3.KT - 37
 *                                 4.KC - 40
 *                                 5.ST - 41
 *                                 6.TM - 42
 *                                 7.TW - 43
 *                                 8.PP - 55 (Public Payment)
 *                                 9.RF - 90 (Refund)
 *                                10.IP - 91 (Imprisonment)
 *             
 * 
 * <p>CentreNumber.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CentreNumber.V1.0.CT">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;CCT>Numeric.CT">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentreNumber.V1.0.CT")
public class CentreNumberV10CT
    extends NumericCT
{


}
