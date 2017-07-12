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
 *  Case Document Submission Message                             
 * 								a) Record Prefix
 *                                                                 b) Prosecution Department Code
 *                                                                 c) Prosecution Reference Number
 *                                                                 d) Case Number
 * 								e) Document Reference Number
 * 								f) Document Title
 * 								g) Document Type (refer to code table)
 * 								h) Document Format
 * 								i) Document Language
 * 								j) Document Create Date/Time
 *                                 k) Urgency Indicator
 *                                 l) Submit Party
 *                                 m) Submitter Name
 *                                 n) Submitter Phone Number
 * 								o) Document Binary Content
 * 			
 * 
 * <p>CaseDocument.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CaseDocument.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DocumentReferenceNumber" type="{}DocumentReferenceNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DocumentTitle" type="{}DocumentTitle.V1.0.CT"/>
 *         &lt;element name="DocumentType" type="{}DocumentType.V1.0.CT"/>
 *         &lt;element name="DocumentFormat" type="{}DocumentFormat.V1.0.CT"/>
 *         &lt;element name="DocumentLanguage" type="{}Language.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="DocumentCreateDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DocumentCreateTime" type="{CCT}Time.CT"/>
 *         &lt;element name="UrgencyIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="SubmitParty" type="{}SubmitParty.V1.0.CT"/>
 *         &lt;element name="SubmitterName" type="{}SubmitterName.V1.0.CT"/>
 *         &lt;element name="SubmitterPhoneNumber" type="{}PhoneNumber.V1.0.CT"/>
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
@XmlType(name = "CaseDocument.V1.0.CT", propOrder = {
    "recordPrefix",
    "prosecutionDepartmentCode",
    "departmentReferenceNumber",
    "caseNumber",
    "documentReferenceNumber",
    "documentTitle",
    "documentType",
    "documentFormat",
    "documentLanguage",
    "documentCreateDate",
    "documentCreateTime",
    "urgencyIndicator",
    "submitParty",
    "submitterName",
    "submitterPhoneNumber",
    "documentBinaryContent"
})
public class CaseDocumentV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "DepartmentReferenceNumber", required = true)
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "CaseNumber")
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
    @XmlElement(name = "UrgencyIndicator")
    protected FieldIndicatorV10CT urgencyIndicator;
    @XmlElement(name = "SubmitParty", required = true)
    protected SubmitPartyV10CT submitParty;
    @XmlElement(name = "SubmitterName", required = true)
    protected SubmitterNameV10CT submitterName;
    @XmlElement(name = "SubmitterPhoneNumber", required = true)
    protected PhoneNumberV10CT submitterPhoneNumber;
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
     * ��ȡprosecutionDepartmentCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public ProsecutionDepartmentCodeV11CT getProsecutionDepartmentCode() {
        return prosecutionDepartmentCode;
    }

    /**
     * ����prosecutionDepartmentCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentCodeV11CT }
     *     
     */
    public void setProsecutionDepartmentCode(ProsecutionDepartmentCodeV11CT value) {
        this.prosecutionDepartmentCode = value;
    }

    /**
     * ��ȡdepartmentReferenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public DepartmentReferenceNumberV10CT getDepartmentReferenceNumber() {
        return departmentReferenceNumber;
    }

    /**
     * ����departmentReferenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public void setDepartmentReferenceNumber(DepartmentReferenceNumberV10CT value) {
        this.departmentReferenceNumber = value;
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
     * ��ȡurgencyIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getUrgencyIndicator() {
        return urgencyIndicator;
    }

    /**
     * ����urgencyIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setUrgencyIndicator(FieldIndicatorV10CT value) {
        this.urgencyIndicator = value;
    }

    /**
     * ��ȡsubmitParty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubmitPartyV10CT }
     *     
     */
    public SubmitPartyV10CT getSubmitParty() {
        return submitParty;
    }

    /**
     * ����submitParty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitPartyV10CT }
     *     
     */
    public void setSubmitParty(SubmitPartyV10CT value) {
        this.submitParty = value;
    }

    /**
     * ��ȡsubmitterName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubmitterNameV10CT }
     *     
     */
    public SubmitterNameV10CT getSubmitterName() {
        return submitterName;
    }

    /**
     * ����submitterName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitterNameV10CT }
     *     
     */
    public void setSubmitterName(SubmitterNameV10CT value) {
        this.submitterName = value;
    }

    /**
     * ��ȡsubmitterPhoneNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV10CT }
     *     
     */
    public PhoneNumberV10CT getSubmitterPhoneNumber() {
        return submitterPhoneNumber;
    }

    /**
     * ����submitterPhoneNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV10CT }
     *     
     */
    public void setSubmitterPhoneNumber(PhoneNumberV10CT value) {
        this.submitterPhoneNumber = value;
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
