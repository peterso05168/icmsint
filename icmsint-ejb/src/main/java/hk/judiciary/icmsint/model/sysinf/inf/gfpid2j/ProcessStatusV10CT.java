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
 * Process Status
 *             					"1" New or Modify
 *             					"2" Authorize
 *             					"3" First upload
 *             					"4" Download case with case no
 *             					"5" Down case with return code
 *             					"6" Reauthorize
 *             					"7" Reupload
 *             					"9" Assign case no or reject summon
 * 			
 * 
 * <p>ProcessStatus.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ProcessStatus.V1.0.CT">
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
@XmlType(name = "ProcessStatus.V1.0.CT")
public class ProcessStatusV10CT
    extends CodeCT
{


}
