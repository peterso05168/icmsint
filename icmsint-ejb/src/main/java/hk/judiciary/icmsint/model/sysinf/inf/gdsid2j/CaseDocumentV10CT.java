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
 * <p>Java class for CaseDocument.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the recordPrefix property.
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
     * Sets the value of the recordPrefix property.
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
     * Gets the value of the prosecutionDepartmentCode property.
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
     * Sets the value of the prosecutionDepartmentCode property.
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
     * Gets the value of the departmentReferenceNumber property.
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
     * Sets the value of the departmentReferenceNumber property.
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
     * Gets the value of the caseNumber property.
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
     * Sets the value of the caseNumber property.
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
     * Gets the value of the documentReferenceNumber property.
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
     * Sets the value of the documentReferenceNumber property.
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
     * Gets the value of the documentTitle property.
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
     * Sets the value of the documentTitle property.
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
     * Gets the value of the documentType property.
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
     * Sets the value of the documentType property.
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
     * Gets the value of the documentFormat property.
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
     * Sets the value of the documentFormat property.
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
     * Gets the value of the documentLanguage property.
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
     * Sets the value of the documentLanguage property.
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
     * Gets the value of the documentCreateDate property.
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
     * Sets the value of the documentCreateDate property.
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
     * Gets the value of the documentCreateTime property.
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
     * Sets the value of the documentCreateTime property.
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
     * Gets the value of the urgencyIndicator property.
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
     * Sets the value of the urgencyIndicator property.
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
     * Gets the value of the submitParty property.
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
     * Sets the value of the submitParty property.
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
     * Gets the value of the submitterName property.
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
     * Sets the value of the submitterName property.
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
     * Gets the value of the submitterPhoneNumber property.
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
     * Sets the value of the submitterPhoneNumber property.
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
     * Gets the value of the documentBinaryContent property.
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
     * Sets the value of the documentBinaryContent property.
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