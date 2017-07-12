//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
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
 * <p>SODKey.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡchapter���Ե�ֵ��
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
     * ����chapter���Ե�ֵ��
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
     * ��ȡsubLegislative���Ե�ֵ��
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
     * ����subLegislative���Ե�ֵ��
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
     * ��ȡsection���Ե�ֵ��
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
     * ����section���Ե�ֵ��
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
     * ��ȡsubSection���Ե�ֵ��
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
     * ����subSection���Ե�ֵ��
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
     * ��ȡparagraph���Ե�ֵ��
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
     * ����paragraph���Ե�ֵ��
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
     * ��ȡsubParagraph���Ե�ֵ��
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
     * ����subParagraph���Ե�ֵ��
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
     * ��ȡsupplementCode���Ե�ֵ��
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
     * ����supplementCode���Ե�ֵ��
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
     * ��ȡversionNumber���Ե�ֵ��
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
     * ����versionNumber���Ե�ֵ��
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
