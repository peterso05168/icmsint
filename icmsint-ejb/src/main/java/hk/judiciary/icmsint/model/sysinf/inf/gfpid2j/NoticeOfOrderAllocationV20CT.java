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
 * Notice of Order Allocation
 *                                                     Derived from Case.V1.0.CT
 *                                                     Extension consists of
 * 				a) Record Prefix
 * 				b) Application Status (A-Accept, J-Reject)
 * 				c) Notice of Order Allocation Remark
 *             
 * 
 * <p>NoticeOfOrderAllocation.V2.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="NoticeOfOrderAllocation.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/>
 *         &lt;element name="NoticeOfOrderAllocationRemark" type="{}NoticeOfOrderAllocationRemark.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeOfOrderAllocation.V2.0.CT", propOrder = {
    "recordPrefix",
    "applicationStatus",
    "noticeOfOrderAllocationRemark"
})
public class NoticeOfOrderAllocationV20CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "NoticeOfOrderAllocationRemark")
    protected NoticeOfOrderAllocationRemarkV10CT noticeOfOrderAllocationRemark;

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
     * ��ȡapplicationStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ApplicationStatusV10CT }
     *     
     */
    public ApplicationStatusV10CT getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * ����applicationStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationStatusV10CT }
     *     
     */
    public void setApplicationStatus(ApplicationStatusV10CT value) {
        this.applicationStatus = value;
    }

    /**
     * ��ȡnoticeOfOrderAllocationRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NoticeOfOrderAllocationRemarkV10CT }
     *     
     */
    public NoticeOfOrderAllocationRemarkV10CT getNoticeOfOrderAllocationRemark() {
        return noticeOfOrderAllocationRemark;
    }

    /**
     * ����noticeOfOrderAllocationRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeOfOrderAllocationRemarkV10CT }
     *     
     */
    public void setNoticeOfOrderAllocationRemark(NoticeOfOrderAllocationRemarkV10CT value) {
        this.noticeOfOrderAllocationRemark = value;
    }

}
