//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:32:28 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdnid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for SODKey.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlSeeAlso({
    SODApplicationResultV10CT.class
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
     * Gets the value of the chapter property.
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
     * Sets the value of the chapter property.
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
     * Gets the value of the subLegislative property.
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
     * Sets the value of the subLegislative property.
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
     * Gets the value of the section property.
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
     * Sets the value of the section property.
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
     * Gets the value of the subSection property.
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
     * Sets the value of the subSection property.
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
     * Gets the value of the paragraph property.
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
     * Sets the value of the paragraph property.
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
     * Gets the value of the subParagraph property.
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
     * Sets the value of the subParagraph property.
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
     * Gets the value of the supplementCode property.
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
     * Sets the value of the supplementCode property.
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
     * Gets the value of the versionNumber property.
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
     * Sets the value of the versionNumber property.
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
