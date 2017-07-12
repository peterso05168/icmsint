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
 *                                a) Chapter (v1.1)
 *                                b) Sub Legislative (v1.1)
 *                                c) Section (v1.1)
 *                                d) Sub Section (v1.1)
 *                                e) Paragraph (v1.1)
 *                                f) Sub Paragraph (v1.1)
 *                                g) Supplement Code (v1.1)
 *                                h) Version Number (v1.1)
 *             
 * 
 * <p>SODKey.V1.1.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SODKey.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Chapter" type="{}Chapter.V1.1.CT"/>
 *         &lt;element name="SubLegislative" type="{}SubLegislative.V1.1.CT"/>
 *         &lt;element name="Section" type="{}Section.V1.1.CT"/>
 *         &lt;element name="SubSection" type="{}SubSection.V1.1.CT"/>
 *         &lt;element name="Paragraph" type="{}Paragraph.V1.1.CT"/>
 *         &lt;element name="SubParagraph" type="{}SubParagraph.V1.1.CT"/>
 *         &lt;element name="SupplementCode" type="{}SupplementCode.V1.1.CT"/>
 *         &lt;element name="VersionNumber" type="{}VersionNumber.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SODKey.V1.1.CT", propOrder = {
    "chapter",
    "subLegislative",
    "section",
    "subSection",
    "paragraph",
    "subParagraph",
    "supplementCode",
    "versionNumber"
})
public class SODKeyV11CT {

    @XmlElement(name = "Chapter", required = true)
    protected ChapterV11CT chapter;
    @XmlElement(name = "SubLegislative", required = true)
    protected SubLegislativeV11CT subLegislative;
    @XmlElement(name = "Section", required = true)
    protected SectionV11CT section;
    @XmlElement(name = "SubSection", required = true)
    protected SubSectionV11CT subSection;
    @XmlElement(name = "Paragraph", required = true)
    protected ParagraphV11CT paragraph;
    @XmlElement(name = "SubParagraph", required = true)
    protected SubParagraphV11CT subParagraph;
    @XmlElement(name = "SupplementCode", required = true)
    protected SupplementCodeV11CT supplementCode;
    @XmlElement(name = "VersionNumber", required = true)
    protected VersionNumberV11CT versionNumber;

    /**
     * 获取chapter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChapterV11CT }
     *     
     */
    public ChapterV11CT getChapter() {
        return chapter;
    }

    /**
     * 设置chapter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterV11CT }
     *     
     */
    public void setChapter(ChapterV11CT value) {
        this.chapter = value;
    }

    /**
     * 获取subLegislative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubLegislativeV11CT }
     *     
     */
    public SubLegislativeV11CT getSubLegislative() {
        return subLegislative;
    }

    /**
     * 设置subLegislative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubLegislativeV11CT }
     *     
     */
    public void setSubLegislative(SubLegislativeV11CT value) {
        this.subLegislative = value;
    }

    /**
     * 获取section属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SectionV11CT }
     *     
     */
    public SectionV11CT getSection() {
        return section;
    }

    /**
     * 设置section属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SectionV11CT }
     *     
     */
    public void setSection(SectionV11CT value) {
        this.section = value;
    }

    /**
     * 获取subSection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubSectionV11CT }
     *     
     */
    public SubSectionV11CT getSubSection() {
        return subSection;
    }

    /**
     * 设置subSection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubSectionV11CT }
     *     
     */
    public void setSubSection(SubSectionV11CT value) {
        this.subSection = value;
    }

    /**
     * 获取paragraph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParagraphV11CT }
     *     
     */
    public ParagraphV11CT getParagraph() {
        return paragraph;
    }

    /**
     * 设置paragraph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphV11CT }
     *     
     */
    public void setParagraph(ParagraphV11CT value) {
        this.paragraph = value;
    }

    /**
     * 获取subParagraph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubParagraphV11CT }
     *     
     */
    public SubParagraphV11CT getSubParagraph() {
        return subParagraph;
    }

    /**
     * 设置subParagraph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubParagraphV11CT }
     *     
     */
    public void setSubParagraph(SubParagraphV11CT value) {
        this.subParagraph = value;
    }

    /**
     * 获取supplementCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplementCodeV11CT }
     *     
     */
    public SupplementCodeV11CT getSupplementCode() {
        return supplementCode;
    }

    /**
     * 设置supplementCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementCodeV11CT }
     *     
     */
    public void setSupplementCode(SupplementCodeV11CT value) {
        this.supplementCode = value;
    }

    /**
     * 获取versionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VersionNumberV11CT }
     *     
     */
    public VersionNumberV11CT getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置versionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VersionNumberV11CT }
     *     
     */
    public void setVersionNumber(VersionNumberV11CT value) {
        this.versionNumber = value;
    }

}
