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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * case details derived from CaseNumber object
 *                                found in common_jud.xsd, additional fields consist of 
 *                                a) Prosecution Department Code (v1.1)
 *                                b) Department Reference Number
 *             
 * 
 * <p>Case.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Case.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}CaseNumber.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="ProsecutionDepartmentCode" type="{}ProsecutionDepartmentCode.V1.1.CT"/>
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Case.V1.0.CT", propOrder = {
    "prosecutionDepartmentCode",
    "departmentReferenceNumber"
})
@XmlSeeAlso({
    CaseDocumentAcknowledgementV10CT.class,
    ChargeCaseHearingResultV10CT.class,
    WarrantStatusChangeV10CT.class,
    CourtPaymentV10CT.class,
    NoticeOfOrderAllocationV20CT.class,
    NoticeHearingResultV20CT.class,
    WitnessSummonsAllocationV10CT.class,
    NextHearingV10CT.class,
    NoticeHearingResultV10CT.class,
    NoticeOfOrderAllocationV10CT.class,
    NextHearingV11CT.class,
    DeptNoticeOfOrderV20CT.class,
    AppealReviewGrantV10CT.class,
    HearingResultV20CT.class,
    HearingResultV10CT.class,
    WitnessSummonsApplicationV10CT.class,
    DeptNoticeOfOrderV10CT.class
})
public class CaseV10CT
    extends CaseNumberV10CT
{

    @XmlElement(name = "ProsecutionDepartmentCode", required = true)
    protected ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode;
    @XmlElement(name = "DepartmentReferenceNumber", required = true)
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;

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

}
