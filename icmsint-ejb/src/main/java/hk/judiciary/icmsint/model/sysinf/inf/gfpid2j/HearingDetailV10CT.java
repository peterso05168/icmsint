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
 * <p>HearingDetail.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取hearingInternalNumber属性的值。
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
     * 设置hearingInternalNumber属性的值。
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
     * 获取hearingDate属性的值。
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
     * 设置hearingDate属性的值。
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
     * 获取hearingTime属性的值。
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
     * 设置hearingTime属性的值。
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
     * 获取hearingType属性的值。
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
     * 设置hearingType属性的值。
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
     * 获取hearingCourtSys属性的值。
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
     * 设置hearingCourtSys属性的值。
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
     * 获取hearingCourtNumber属性的值。
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
     * 设置hearingCourtNumber属性的值。
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
     * 获取hearingMagistrateCode属性的值。
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
     * 设置hearingMagistrateCode属性的值。
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
     * 获取language属性的值。
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
     * 设置language属性的值。
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
