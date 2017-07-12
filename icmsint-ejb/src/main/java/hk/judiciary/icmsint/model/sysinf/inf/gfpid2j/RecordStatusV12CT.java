//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Appeal/ Review record status
 *                                a) blank - Normal entry
 *                                a) 'N'   - Normal entry
 *                                b) 'C'   - Indicates that this same entry had been sent in previous batch
 *                                				and it has now been cancelled due to mis-entry. If a correct 
 *                                				entry is re-entered by the Magistrates' Courts user, then a 
 *                                				new entry is to be followed.
 *                                c) 'R'	 - Rollback
 * 			
 * 
 * <p>RecordStatus.V1.2.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RecordStatus.V1.2.CT">
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
@XmlType(name = "RecordStatus.V1.2.CT")
public class RecordStatusV12CT
    extends CodeCT
{


}
