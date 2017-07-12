//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * payment centre that the payment made
 *                 	'35' - ES - Eastern Magistrates' Courts
 *                 	'36' - FL - Fanling Magistrates' Courts
 *                 	'37' - KT - Kwun Tong Magistrates' Courts
 *                 	'40' - KC - Kowloon City Magistrates' Courts
 *                 	'41' - ST - Shatin Magistrates' Courts
 *                 	'42' - TM - Tuen Mun Magistrates' Courts
 *                 	'43' - TW - Tsuen Wan Magistrates' Courts
 *                 	'55' - PP - Public Payment (Electronic Payment)
 *                 	'90' - RF - Refund
 *                 	'91' - IP - Imprisonment
 *             
 * 
 * <p>PaymentCentre.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentCentre.V1.0.CT">
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
@XmlType(name = "PaymentCentre.V1.0.CT")
public class PaymentCentreV10CT
    extends CodeCT
{


}
