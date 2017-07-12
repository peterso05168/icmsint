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
 * UID = COM000021, Dictionary Entry Name = Chinese Commercial Code. Extension Number. Text,
 * 			Optional 1-digit extension of the Chinese Commercial Code (CCC).  In some cases, a Chinese character may be written in multiple ways (i.e. represented by more than one glyphs), this extension code is used by the Immigration Department and some other government departments to indicate which glyph to use when displaying or printing that Chinese character.  There are also some rare cases where a CCC may be used to represent more than one Chinese characters, in these cases, this extension code will be used to indicate which character it is referring to.
 * 
 * <p>ChineseCommercialCodeExtensionNumberText.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ChineseCommercialCodeExtensionNumberText.V1.0.CT">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;CCT>Text.CT">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChineseCommercialCodeExtensionNumberText.V1.0.CT", namespace = "PCN")
public class ChineseCommercialCodeExtensionNumberTextV10CT
    extends TextCT
{


}
