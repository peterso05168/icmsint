//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
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
 * <p>CourtDocument.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrecordPrefix���Ե�ֵ��
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
     * ����recordPrefix���Ե�ֵ��
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
     * ��ȡcaseNumber���Ե�ֵ��
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
     * ����caseNumber���Ե�ֵ��
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
     * ��ȡdocumentReferenceNumber���Ե�ֵ��
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
     * ����documentReferenceNumber���Ե�ֵ��
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
     * ��ȡdocumentTitle���Ե�ֵ��
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
     * ����documentTitle���Ե�ֵ��
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
     * ��ȡdocumentType���Ե�ֵ��
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
     * ����documentType���Ե�ֵ��
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
     * ��ȡdocumentFormat���Ե�ֵ��
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
     * ����documentFormat���Ե�ֵ��
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
     * ��ȡdocumentLanguage���Ե�ֵ��
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
     * ����documentLanguage���Ե�ֵ��
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
     * ��ȡdocumentCreateDate���Ե�ֵ��
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
     * ����documentCreateDate���Ե�ֵ��
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
     * ��ȡdocumentCreateTime���Ե�ֵ��
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
     * ����documentCreateTime���Ե�ֵ��
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
     * ��ȡdocumentBinaryContent���Ե�ֵ��
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
     * ����documentBinaryContent���Ե�ֵ��
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
