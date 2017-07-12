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
 * hearing details consists of 
 *                                a) Hearing Internal Number
 *                                b) Hearing Date and Time
 *                                c) Hearing Type
 *                                d) Hearing Court Sys Code
 *                                e) Hearing Court Number
 *                                f) Hearing Magistrate Code
 *                                g) Interpret Language
 *             
 * 
 * <p>HearingDetail.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="HearingDetail.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HearingInternalNumber" type="{}HearingInternalNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="HearingType" type="{}HearingType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="HearingCourtSys" type="{}CourtSys.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="HearingMagistrateCode" type="{}HearingMagistrateCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="Language" type="{}Language.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HearingDetail.V1.0.CT", propOrder = {
    "hearingInternalNumber",
    "hearingDate",
    "hearingTime",
    "hearingType",
    "hearingCourtSys",
    "hearingCourtNumber",
    "hearingMagistrateCode",
    "language"
})
public class HearingDetailV10CT {

    @XmlElement(name = "HearingInternalNumber")
    protected HearingInternalNumberV10CT hearingInternalNumber;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "HearingType")
    protected HearingTypeV10CT hearingType;
    @XmlElement(name = "HearingCourtSys")
    protected CourtSysV10CT hearingCourtSys;
    @XmlElement(name = "HearingCourtNumber")
    protected HearingCourtNumberV10CT hearingCourtNumber;
    @XmlElement(name = "HearingMagistrateCode")
    protected HearingMagistrateCodeV10CT hearingMagistrateCode;
    @XmlElement(name = "Language")
    protected LanguageV10CT language;

    /**
     * ��ȡhearingInternalNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public HearingInternalNumberV10CT getHearingInternalNumber() {
        return hearingInternalNumber;
    }

    /**
     * ����hearingInternalNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingInternalNumberV10CT }
     *     
     */
    public void setHearingInternalNumber(HearingInternalNumberV10CT value) {
        this.hearingInternalNumber = value;
    }

    /**
     * ��ȡhearingDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getHearingDate() {
        return hearingDate;
    }

    /**
     * ����hearingDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setHearingDate(DateCT value) {
        this.hearingDate = value;
    }

    /**
     * ��ȡhearingTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getHearingTime() {
        return hearingTime;
    }

    /**
     * ����hearingTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setHearingTime(TimeCT value) {
        this.hearingTime = value;
    }

    /**
     * ��ȡhearingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingTypeV10CT }
     *     
     */
    public HearingTypeV10CT getHearingType() {
        return hearingType;
    }

    /**
     * ����hearingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingTypeV10CT }
     *     
     */
    public void setHearingType(HearingTypeV10CT value) {
        this.hearingType = value;
    }

    /**
     * ��ȡhearingCourtSys���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CourtSysV10CT }
     *     
     */
    public CourtSysV10CT getHearingCourtSys() {
        return hearingCourtSys;
    }

    /**
     * ����hearingCourtSys���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CourtSysV10CT }
     *     
     */
    public void setHearingCourtSys(CourtSysV10CT value) {
        this.hearingCourtSys = value;
    }

    /**
     * ��ȡhearingCourtNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV10CT }
     *     
     */
    public HearingCourtNumberV10CT getHearingCourtNumber() {
        return hearingCourtNumber;
    }

    /**
     * ����hearingCourtNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV10CT }
     *     
     */
    public void setHearingCourtNumber(HearingCourtNumberV10CT value) {
        this.hearingCourtNumber = value;
    }

    /**
     * ��ȡhearingMagistrateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingMagistrateCodeV10CT }
     *     
     */
    public HearingMagistrateCodeV10CT getHearingMagistrateCode() {
        return hearingMagistrateCode;
    }

    /**
     * ����hearingMagistrateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingMagistrateCodeV10CT }
     *     
     */
    public void setHearingMagistrateCode(HearingMagistrateCodeV10CT value) {
        this.hearingMagistrateCode = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LanguageV10CT }
     *     
     */
    public LanguageV10CT getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageV10CT }
     *     
     */
    public void setLanguage(LanguageV10CT value) {
        this.language = value;
    }

}
