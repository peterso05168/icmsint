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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * case no consists of 
 *                                a) Magistrates' Courts Code
 *                                b) Case Type
 *                                c) Case Serial No
 *                                d) Case Year
 *             
 * 
 * <p>CaseNumber.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CaseNumber.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourtSys" type="{}CourtSys.V1.0.CT"/>
 *         &lt;element name="CaseType" type="{}CaseType.V1.0.CT"/>
 *         &lt;element name="CaseSerialNumber" type="{}CaseSerialNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CaseYear" type="{}CaseYear.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseNumber.V1.0.CT", propOrder = {
    "courtSys",
    "caseType",
    "caseSerialNumber",
    "caseYear"
})
@XmlSeeAlso({
    CaseV10CT.class
})
public class CaseNumberV10CT {

    @XmlElement(name = "CourtSys", required = true)
    protected CourtSysV10CT courtSys;
    @XmlElement(name = "CaseType", required = true)
    protected CaseTypeV10CT caseType;
    @XmlElement(name = "CaseSerialNumber")
    protected CaseSerialNumberV10CT caseSerialNumber;
    @XmlElement(name = "CaseYear")
    protected CaseYearV10CT caseYear;

    /**
     * ��ȡcourtSys���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CourtSysV10CT }
     *     
     */
    public CourtSysV10CT getCourtSys() {
        return courtSys;
    }

    /**
     * ����courtSys���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CourtSysV10CT }
     *     
     */
    public void setCourtSys(CourtSysV10CT value) {
        this.courtSys = value;
    }

    /**
     * ��ȡcaseType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CaseTypeV10CT }
     *     
     */
    public CaseTypeV10CT getCaseType() {
        return caseType;
    }

    /**
     * ����caseType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CaseTypeV10CT }
     *     
     */
    public void setCaseType(CaseTypeV10CT value) {
        this.caseType = value;
    }

    /**
     * ��ȡcaseSerialNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CaseSerialNumberV10CT }
     *     
     */
    public CaseSerialNumberV10CT getCaseSerialNumber() {
        return caseSerialNumber;
    }

    /**
     * ����caseSerialNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CaseSerialNumberV10CT }
     *     
     */
    public void setCaseSerialNumber(CaseSerialNumberV10CT value) {
        this.caseSerialNumber = value;
    }

    /**
     * ��ȡcaseYear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CaseYearV10CT }
     *     
     */
    public CaseYearV10CT getCaseYear() {
        return caseYear;
    }

    /**
     * ����caseYear���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CaseYearV10CT }
     *     
     */
    public void setCaseYear(CaseYearV10CT value) {
        this.caseYear = value;
    }

}
