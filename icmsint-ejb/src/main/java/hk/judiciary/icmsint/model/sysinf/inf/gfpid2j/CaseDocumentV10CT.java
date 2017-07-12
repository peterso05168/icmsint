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
 * <p>CaseDocument.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取prosecutionDepartmentCode属性的值。
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
     * 设置prosecutionDepartmentCode属性的值。
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
     * 获取departmentReferenceNumber属性的值。
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
     * 设置departmentReferenceNumber属性的值。
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
     * 获取urgencyIndicator属性的值。
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
     * 设置urgencyIndicator属性的值。
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
     * 获取submitParty属性的值。
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
     * 设置submitParty属性的值。
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
     * 获取submitterName属性的值。
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
     * 设置submitterName属性的值。
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
     * 获取submitterPhoneNumber属性的值。
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
     * 设置submitterPhoneNumber属性的值。
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
