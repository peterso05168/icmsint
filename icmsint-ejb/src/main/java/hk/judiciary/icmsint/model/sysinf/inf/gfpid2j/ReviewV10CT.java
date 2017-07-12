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
 * review details consists of 
 *                                a) Case Number Object
 *                                b) Review Internal Number
 *                                c) Filing Date
 *                                d) Applied Party
 *             
 * 
 * <p>Review.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Review.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="ReviewwInternalNumber" type="{}ReviewInternalNumber.V1.0.CT"/>
 *         &lt;element name="FilingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="AppliedParty" type="{}ReviewAppliedParty.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Review.V1.0.CT", propOrder = {
    "caseNumber",
    "reviewwInternalNumber",
    "filingDate",
    "appliedParty"
})
public class ReviewV10CT {

    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "ReviewwInternalNumber", required = true)
    protected ReviewInternalNumberV10CT reviewwInternalNumber;
    @XmlElement(name = "FilingDate", required = true)
    protected DateCT filingDate;
    @XmlElement(name = "AppliedParty", required = true)
    protected ReviewAppliedPartyV10CT appliedParty;

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
     * ��ȡreviewwInternalNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReviewInternalNumberV10CT }
     *     
     */
    public ReviewInternalNumberV10CT getReviewwInternalNumber() {
        return reviewwInternalNumber;
    }

    /**
     * ����reviewwInternalNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewInternalNumberV10CT }
     *     
     */
    public void setReviewwInternalNumber(ReviewInternalNumberV10CT value) {
        this.reviewwInternalNumber = value;
    }

    /**
     * ��ȡfilingDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFilingDate() {
        return filingDate;
    }

    /**
     * ����filingDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFilingDate(DateCT value) {
        this.filingDate = value;
    }

    /**
     * ��ȡappliedParty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReviewAppliedPartyV10CT }
     *     
     */
    public ReviewAppliedPartyV10CT getAppliedParty() {
        return appliedParty;
    }

    /**
     * ����appliedParty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewAppliedPartyV10CT }
     *     
     */
    public void setAppliedParty(ReviewAppliedPartyV10CT value) {
        this.appliedParty = value;
    }

}
