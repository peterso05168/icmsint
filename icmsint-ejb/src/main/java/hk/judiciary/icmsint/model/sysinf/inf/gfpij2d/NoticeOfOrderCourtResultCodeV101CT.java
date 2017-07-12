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
 * <p>NoticeOfOrderCourtResultCode.V1.0.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
