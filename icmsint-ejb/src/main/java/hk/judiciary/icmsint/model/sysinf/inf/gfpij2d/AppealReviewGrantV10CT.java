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
 * 	Appeal/ Review granting Details
 * 								Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix				
 * 				b) Record Sequence Number in the given batch
 * 				c) Appeal Internal Number
 * 				d) Review Internal Number
 * 				c) Appeal/ Review Filing Date
 * 				d) Record Status
 * 				e) Interface ID
 * 			
 * 
 * <p>AppealReviewGrant.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AppealReviewGrant.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="AppealInternalNumber" type="{}AppealInternalNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReviewInternalNumber" type="{}ReviewInternalNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="AppealReviewFilingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppealReviewGrant.V1.0.CT", propOrder = {
    "recordPrefix",
    "recordSequenceNumber",
    "appealInternalNumber",
    "reviewInternalNumber",
    "appealReviewFilingDate",
    "recordStatus",
    "interfaceID"
})
public class AppealReviewGrantV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "AppealInternalNumber")
    protected AppealInternalNumberV10CT appealInternalNumber;
    @XmlElement(name = "ReviewInternalNumber")
    protected ReviewInternalNumberV10CT reviewInternalNumber;
    @XmlElement(name = "AppealReviewFilingDate", required = true)
    protected DateCT appealReviewFilingDate;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV10CT recordStatus;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PrefixV10CT }
     *     
     */
    public PrefixV10CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * ����recordPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV10CT }
     *     
     */
    public void setRecordPrefix(PrefixV10CT value) {
        this.recordPrefix = value;
    }

    /**
     * ��ȡrecordSequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public RecordSequenceNumberV10CT getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * ����recordSequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public void setRecordSequenceNumber(RecordSequenceNumberV10CT value) {
        this.recordSequenceNumber = value;
    }

    /**
     * ��ȡappealInternalNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AppealInternalNumberV10CT }
     *     
     */
    public AppealInternalNumberV10CT getAppealInternalNumber() {
        return appealInternalNumber;
    }

    /**
     * ����appealInternalNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AppealInternalNumberV10CT }
     *     
     */
    public void setAppealInternalNumber(AppealInternalNumberV10CT value) {
        this.appealInternalNumber = value;
    }

    /**
     * ��ȡreviewInternalNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReviewInternalNumberV10CT }
     *     
     */
    public ReviewInternalNumberV10CT getReviewInternalNumber() {
        return reviewInternalNumber;
    }

    /**
     * ����reviewInternalNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewInternalNumberV10CT }
     *     
     */
    public void setReviewInternalNumber(ReviewInternalNumberV10CT value) {
        this.reviewInternalNumber = value;
    }

    /**
     * ��ȡappealReviewFilingDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getAppealReviewFilingDate() {
        return appealReviewFilingDate;
    }

    /**
     * ����appealReviewFilingDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setAppealReviewFilingDate(DateCT value) {
        this.appealReviewFilingDate = value;
    }

    /**
     * ��ȡrecordStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordStatusV10CT }
     *     
     */
    public RecordStatusV10CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * ����recordStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV10CT }
     *     
     */
    public void setRecordStatus(RecordStatusV10CT value) {
        this.recordStatus = value;
    }

    /**
     * ��ȡinterfaceID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public InterfaceIDV10CT getInterfaceID() {
        return interfaceID;
    }

    /**
     * ����interfaceID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public void setInterfaceID(InterfaceIDV10CT value) {
        this.interfaceID = value;
    }

}
