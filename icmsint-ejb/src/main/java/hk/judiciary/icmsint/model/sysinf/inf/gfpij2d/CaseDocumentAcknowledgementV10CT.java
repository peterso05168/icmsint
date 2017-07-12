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
 *  Case Document Acknowledgement Message
 *                               Derived from Case.V1.0.CT
 *                               Extension consists of
 * 								a) Record Prefix
 * 								b) Document Reference Number
 * 								c) Document Status
 * 								d) Document Filed Date
 * 								e) Document Filed Time
 * 			
 * 
 * <p>CaseDocumentAcknowledgement.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CaseDocumentAcknowledgement.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="DocumentReferenceNumber" type="{}DocumentReferenceNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="DocumentStatus" type="{}DocumentStatus.V1.0.CT"/>
 *         &lt;element name="DocumentFiledDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="DocumentFiledTime" type="{CCT}Time.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseDocumentAcknowledgement.V1.0.CT", propOrder = {
    "recordPrefix",
    "documentReferenceNumber",
    "documentStatus",
    "documentFiledDate",
    "documentFiledTime"
})
public class CaseDocumentAcknowledgementV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "DocumentReferenceNumber")
    protected DocumentReferenceNumberV10CT documentReferenceNumber;
    @XmlElement(name = "DocumentStatus", required = true)
    protected DocumentStatusV10CT documentStatus;
    @XmlElement(name = "DocumentFiledDate")
    protected DateCT documentFiledDate;
    @XmlElement(name = "DocumentFiledTime")
    protected TimeCT documentFiledTime;

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
     * ��ȡdocumentStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusV10CT }
     *     
     */
    public DocumentStatusV10CT getDocumentStatus() {
        return documentStatus;
    }

    /**
     * ����documentStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusV10CT }
     *     
     */
    public void setDocumentStatus(DocumentStatusV10CT value) {
        this.documentStatus = value;
    }

    /**
     * ��ȡdocumentFiledDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getDocumentFiledDate() {
        return documentFiledDate;
    }

    /**
     * ����documentFiledDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setDocumentFiledDate(DateCT value) {
        this.documentFiledDate = value;
    }

    /**
     * ��ȡdocumentFiledTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getDocumentFiledTime() {
        return documentFiledTime;
    }

    /**
     * ����documentFiledTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setDocumentFiledTime(TimeCT value) {
        this.documentFiledTime = value;
    }

}
