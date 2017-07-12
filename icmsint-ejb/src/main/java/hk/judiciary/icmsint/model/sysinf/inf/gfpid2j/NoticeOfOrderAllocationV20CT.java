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
 * Notice of Order Allocation
 *                                                     Derived from Case.V1.0.CT
 *                                                     Extension consists of
 * 				a) Record Prefix
 * 				b) Application Status (A-Accept, J-Reject)
 * 				c) Notice of Order Allocation Remark
 *             
 * 
 * <p>NoticeOfOrderAllocation.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取applicationStatus属性的值。
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
     * 设置applicationStatus属性的值。
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
     * 获取noticeOfOrderAllocationRemark属性的值。
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
     * 设置noticeOfOrderAllocationRemark属性的值。
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
