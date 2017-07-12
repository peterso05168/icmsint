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
 * <p>CaseDocumentAcknowledgement.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取documentStatus属性的值。
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
     * 设置documentStatus属性的值。
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
     * 获取documentFiledDate属性的值。
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
     * 设置documentFiledDate属性的值。
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
     * 获取documentFiledTime属性的值。
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
     * 设置documentFiledTime属性的值。
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
