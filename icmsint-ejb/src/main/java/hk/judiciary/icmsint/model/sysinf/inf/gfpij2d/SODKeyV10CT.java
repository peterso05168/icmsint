//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SOD key consists of 
 *                                a) Chapter 
 *                                b) Sub Legislative
 *                                c) Section
 *                                d) Sub Section
 *                                e) Paragraph
 *                                f) Sub Paragraph
 *                                g) Supplement Code
 *                                h) Version Number
 *             
 * 
 * <p>SODKey.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SODKey.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Chapter" type="{}Chapter.V1.0.CT"/>
 *         &lt;element name="SubLegislative" type="{}SubLegislative.V1.0.CT"/>
 *         &lt;element name="Section" type="{}Section.V1.0.CT"/>
 *         &lt;element name="SubSection" type="{}SubSection.V1.0.CT"/>
 *         &lt;element name="Paragraph" type="{}Paragraph.V1.0.CT"/>
 *         &lt;element name="SubParagraph" type="{}SubParagraph.V1.0.CT"/>
 *         &lt;element name="SupplementCode" type="{}SupplementCode.V1.0.CT"/>
 *         &lt;element name="VersionNumber" type="{}VersionNumber.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SODKey.V1.0.CT", propOrder = {
    "chapter",
    "subLegislative",
    "section",
    "subSection",
    "paragraph",
    "subParagraph",
    "supplementCode",
    "versionNumber"
})
public class SODKeyV10CT {

    @XmlElement(name = "Chapter", required = true)
    protected ChapterV10CT chapter;
    @XmlElement(name = "SubLegislative", required = true)
    protected SubLegislativeV10CT subLegislative;
    @XmlElement(name = "Section", required = true)
    protected SectionV10CT section;
    @XmlElement(name = "SubSection", required = true)
    protected SubSectionV10CT subSection;
    @XmlElement(name = "Paragraph", required = true)
    protected ParagraphV10CT paragraph;
    @XmlElement(name = "SubParagraph", required = true)
    protected SubParagraphV10CT subParagraph;
    @XmlElement(name = "SupplementCode", required = true)
    protected SupplementCodeV10CT supplementCode;
    @XmlElement(name = "VersionNumber", required = true)
    protected VersionNumberV10CT versionNumber;

    /**
     * 获取chapter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChapterV10CT }
     *     
     */
    public ChapterV10CT getChapter() {
        return chapter;
    }

    /**
     * 设置chapter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterV10CT }
     *     
     */
    public void setChapter(ChapterV10CT value) {
        this.chapter = value;
    }

    /**
     * 获取subLegislative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubLegislativeV10CT }
     *     
     */
    public SubLegislativeV10CT getSubLegislative() {
        return subLegislative;
    }

    /**
     * 设置subLegislative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubLegislativeV10CT }
     *     
     */
    public void setSubLegislative(SubLegislativeV10CT value) {
        this.subLegislative = value;
    }

    /**
     * 获取section属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SectionV10CT }
     *     
     */
    public SectionV10CT getSection() {
        return section;
    }

    /**
     * 设置section属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SectionV10CT }
     *     
     */
    public void setSection(SectionV10CT value) {
        this.section = value;
    }

    /**
     * 获取subSection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubSectionV10CT }
     *     
     */
    public SubSectionV10CT getSubSection() {
        return subSection;
    }

    /**
     * 设置subSection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubSectionV10CT }
     *     
     */
    public void setSubSection(SubSectionV10CT value) {
        this.subSection = value;
    }

    /**
     * 获取paragraph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphV10CT }
     *     
     */
    public ParagraphV10CT getParagraph() {
        return paragraph;
    }

    /**
     * 设置paragraph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphV10CT }
     *     
     */
    public void setParagraph(ParagraphV10CT value) {
        this.paragraph = value;
    }

    /**
     * 获取subParagraph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubParagraphV10CT }
     *     
     */
    public SubParagraphV10CT getSubParagraph() {
        return subParagraph;
    }

    /**
     * 设置subParagraph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubParagraphV10CT }
     *     
     */
    public void setSubParagraph(SubParagraphV10CT value) {
        this.subParagraph = value;
    }

    /**
     * 获取supplementCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplementCodeV10CT }
     *     
     */
    public SupplementCodeV10CT getSupplementCode() {
        return supplementCode;
    }

    /**
     * 设置supplementCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementCodeV10CT }
     *     
     */
    public void setSupplementCode(SupplementCodeV10CT value) {
        this.supplementCode = value;
    }

    /**
     * 获取versionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VersionNumberV10CT }
     *     
     */
    public VersionNumberV10CT getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置versionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VersionNumberV10CT }
     *     
     */
    public void setVersionNumber(VersionNumberV10CT value) {
        this.versionNumber = value;
    }

}
