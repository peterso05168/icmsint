//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Court Document Message
 * 								a) Record Prefix
 *                                                                 b) Case Number
 * 								c) Document Reference Number
 * 								d) Document Title
 * 								e) Document Type
 * 								f) Document Format
 *                                                                 g) Document Language
 *                                                                 h) Document Create Date/Time
 *                                                                 i) Document Binary Content
 * 			
 * 
 * <p>CourtDocument.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CourtDocument.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="DocumentReferenceNumber" type="{}DocumentReferenceNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DocumentTitle" type="{}DocumentTitle.V1.0.CT"/>
 *         &lt;element name="DocumentType" type="{}DocumentType.V1.0.CT"/>
 *         &lt;element name="DocumentFormat" type="{}DocumentFormat.V1.0.CT"/>
 *         &lt;element name="DocumentLanguage" type="{}Language.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="DocumentCreateDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DocumentCreateTime" type="{CCT}Time.CT"/>
 *         &lt;element name="DocumentBinaryContent" type="{CCT}BinaryObject.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtDocument.V1.0.CT", propOrder = {
    "recordPrefix",
    "caseNumber",
    "documentReferenceNumber",
    "documentTitle",
    "documentType",
    "documentFormat",
    "documentLanguage",
    "documentCreateDate",
    "documentCreateTime",
    "documentBinaryContent"
})
public class CourtDocumentV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "DocumentReferenceNumber")
    protected DocumentReferenceNumberV10CT documentReferenceNumber;
    @XmlElement(name = "DocumentTitle", required = true)
    protected DocumentTitleV10CT documentTitle;
    @XmlElement(name = "DocumentType", required = true)
    protected DocumentTypeV10CT documentType;
    @XmlElement(name = "DocumentFormat", required = true)
    protected DocumentFormatV10CT documentFormat;
    @XmlElement(name = "DocumentLanguage")
    protected LanguageV11CT documentLanguage;
    @XmlElement(name = "DocumentCreateDate", required = true)
    protected DateCT documentCreateDate;
    @XmlElement(name = "DocumentCreateTime", required = true)
    protected TimeCT documentCreateTime;
    @XmlElement(name = "DocumentBinaryContent", required = true)
    protected BinaryObjectCT documentBinaryContent;

    /**
     * 获取recordPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixV13CT }
     *     
     */
    public PrefixV13CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * 设置recordPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV13CT }
     *     
     */
    public void setRecordPrefix(PrefixV13CT value) {
        this.recordPrefix = value;
    }

    /**
     * 获取caseNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getCaseNumber() {
        return caseNumber;
    }

    /**
     * 设置caseNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setCaseNumber(CaseNumberV10CT value) {
        this.caseNumber = value;
    }

    /**
     * 获取documentReferenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceNumberV10CT }
     *     
     */
    public DocumentReferenceNumberV10CT getDocumentReferenceNumber() {
        return documentReferenceNumber;
    }

    /**
     * 设置documentReferenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceNumberV10CT }
     *     
     */
    public void setDocumentReferenceNumber(DocumentReferenceNumberV10CT value) {
        this.documentReferenceNumber = value;
    }

    /**
     * 获取documentTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentTitleV10CT }
     *     
     */
    public DocumentTitleV10CT getDocumentTitle() {
        return documentTitle;
    }

    /**
     * 设置documentTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTitleV10CT }
     *     
     */
    public void setDocumentTitle(DocumentTitleV10CT value) {
        this.documentTitle = value;
    }

    /**
     * 获取documentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeV10CT }
     *     
     */
    public DocumentTypeV10CT getDocumentType() {
        return documentType;
    }

    /**
     * 设置documentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeV10CT }
     *     
     */
    public void setDocumentType(DocumentTypeV10CT value) {
        this.documentType = value;
    }

    /**
     * 获取documentFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormatV10CT }
     *     
     */
    public DocumentFormatV10CT getDocumentFormat() {
        return documentFormat;
    }

    /**
     * 设置documentFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormatV10CT }
     *     
     */
    public void setDocumentFormat(DocumentFormatV10CT value) {
        this.documentFormat = value;
    }

    /**
     * 获取documentLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LanguageV11CT }
     *     
     */
    public LanguageV11CT getDocumentLanguage() {
        return documentLanguage;
    }

    /**
     * 设置documentLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageV11CT }
     *     
     */
    public void setDocumentLanguage(LanguageV11CT value) {
        this.documentLanguage = value;
    }

    /**
     * 获取documentCreateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getDocumentCreateDate() {
        return documentCreateDate;
    }

    /**
     * 设置documentCreateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setDocumentCreateDate(DateCT value) {
        this.documentCreateDate = value;
    }

    /**
     * 获取documentCreateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getDocumentCreateTime() {
        return documentCreateTime;
    }

    /**
     * 设置documentCreateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setDocumentCreateTime(TimeCT value) {
        this.documentCreateTime = value;
    }

    /**
     * 获取documentBinaryContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectCT }
     *     
     */
    public BinaryObjectCT getDocumentBinaryContent() {
        return documentBinaryContent;
    }

    /**
     * 设置documentBinaryContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectCT }
     *     
     */
    public void setDocumentBinaryContent(BinaryObjectCT value) {
        this.documentBinaryContent = value;
    }

}
