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
 * appeal details consists of 
 *                                a) Case Number Object
 *                                b) Appeal Internal Number
 *                                c) Appeal Register Serial Number
 *                                d) Filing Date
 *                                e) Applied Party 
 *             
 * 
 * <p>Appeal.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Appeal.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="AppealInternalNumber" type="{}AppealInternalNumber.V1.0.CT"/>
 *         &lt;element name="AppealRegisterNumber" type="{}AppealRegisterNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="AppliedParty" type="{}AppealAppliedParty.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appeal.V1.0.CT", propOrder = {
    "caseNumber",
    "appealInternalNumber",
    "appealRegisterNumber",
    "filingDate",
    "appliedParty"
})
public class AppealV10CT {

    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "AppealInternalNumber", required = true)
    protected AppealInternalNumberV10CT appealInternalNumber;
    @XmlElement(name = "AppealRegisterNumber")
    protected AppealRegisterNumberV10CT appealRegisterNumber;
    @XmlElement(name = "FilingDate", required = true)
    protected DateCT filingDate;
    @XmlElement(name = "AppliedParty", required = true)
    protected AppealAppliedPartyV10CT appliedParty;

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
     * ��ȡappealRegisterNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AppealRegisterNumberV10CT }
     *     
     */
    public AppealRegisterNumberV10CT getAppealRegisterNumber() {
        return appealRegisterNumber;
    }

    /**
     * ����appealRegisterNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AppealRegisterNumberV10CT }
     *     
     */
    public void setAppealRegisterNumber(AppealRegisterNumberV10CT value) {
        this.appealRegisterNumber = value;
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
     *     {@link AppealAppliedPartyV10CT }
     *     
     */
    public AppealAppliedPartyV10CT getAppliedParty() {
        return appliedParty;
    }

    /**
     * ����appliedParty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AppealAppliedPartyV10CT }
     *     
     */
    public void setAppliedParty(AppealAppliedPartyV10CT value) {
        this.appliedParty = value;
    }

}
