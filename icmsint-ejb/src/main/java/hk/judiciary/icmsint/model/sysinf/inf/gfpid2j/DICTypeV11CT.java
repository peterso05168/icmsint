//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * DIC Type
 * 		1 - DIC to be completed within 3 months
 *         	2 - DIC to be completed within last 3 months of the disqualification order
 *             	3 - DIC to be completed within the period specified by court
 * 		4 - DIC to be completed but without specified period
 * 		5 - DIC to be completed within 3 months after imprisonment/detention
 * 		6 - DIC to be completed with detention period not yet ascertainable
 *             
 * 
 * <p>DICType.V1.1.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DICType.V1.1.CT">
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
@XmlType(name = "DICType.V1.1.CT")
public class DICTypeV11CT
    extends CodeCT
{


}
