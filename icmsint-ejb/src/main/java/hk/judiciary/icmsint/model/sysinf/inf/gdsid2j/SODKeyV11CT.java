//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:40:40 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for SODKey.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlSeeAlso({
    SODApplicationResultV20CT.class
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
     * Gets the value of the chapter property.
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
     * Sets the value of the chapter property.
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
     * Gets the value of the subLegislative property.
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
     * Sets the value of the subLegislative property.
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
     * Gets the value of the section property.
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
     * Sets the value of the section property.
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
     * Gets the value of the subSection property.
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
     * Sets the value of the subSection property.
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
     * Gets the value of the paragraph property.
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
     * Sets the value of the paragraph property.
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
     * Gets the value of the subParagraph property.
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
     * Sets the value of the subParagraph property.
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
     * Gets the value of the supplementCode property.
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
     * Sets the value of the supplementCode property.
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
     * Gets the value of the versionNumber property.
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
     * Sets the value of the versionNumber property.
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
