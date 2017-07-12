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
 * a specific character string used to identify a type of XML message - Message ID
 * 	    	      1) CM-FP01 : Fixed Penalty Notice of Order Application
 * 	              2) CM-FP02 : Fixed Penalty Summons Application
 * 	              3) CM-G03  : Witness Summons Application
 * 	              4) CM-FP04 : Notice of Order/ Summons Hearing Allocation Result
 * 	              5) CM-FP05 : Fixed Penalty Notice of Order Hearing Result
 * 	              6) CM-FP06 : Fixed Penalty Summons Hearing Result
 * 	              7) CM-G04  : Witness Summons Allocation Result
 * 	              8) CM-FP08 : Appeal/ Review Filing Interface
 * 	              9) CM-G05  : Warrant Status Change Notification
 * 				 10) CM-G06  : Court Payment Interface
 * 				 11) CM-FP10 : Fixed Penalty Distress Warrant Application
 * 				 12) CM-FP11 : Distress Warrant Application Result
 * 				 13) CM-FP12 : Distress Warrant Status Change
 * 				 14) CM-FP13 : Court Payment for Distress Warrant Costs
 * 			
 * 
 * <p>Prefix.V1.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Prefix.V1.1.CT">
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
@XmlType(name = "Prefix.V1.1.CT")
public class PrefixV11CT
    extends CodeCT
{


}
