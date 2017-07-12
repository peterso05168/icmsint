//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * UID = COM000035, Dictionary Entry Name = HKSARG Department. Code,
 * 			A code representing a government bureau or department or a government related organization, with code values assigned in accordance with the standardized list of government department codes.
 * 
 * <p>HKSARGDepartmentCode.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HKSARGDepartmentCode.V1.0.CT">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;CCT>Code.CT">
 *       &lt;attribute name="agencyId" default="http://www.xml.gov.hk">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *             &lt;enumeration value="http://www.xml.gov.hk"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="agencyName" default="www.xml.gov.hk">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *             &lt;enumeration value="www.xml.gov.hk"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="codeListName" default="HKSARG Department Code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *             &lt;enumeration value="HKSARG Department Code"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HKSARGDepartmentCode.V1.0.CT", namespace = "HDC")
@XmlSeeAlso({
    ProsecutionDepartmentCodeV11CT.class,
    ProsecutionDepartmentCodeV10CT.class
})
public class HKSARGDepartmentCodeV10CT
    extends CodeCT
{


}
