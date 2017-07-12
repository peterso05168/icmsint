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
 * appeal details consists of 
 *                                a) Case Number Object
 *                                b) Appeal Internal Number
 *                                c) Appeal Register Serial Number
 *                                d) Filing Date
 *                                e) Applied Party 
 *             
 * 
 * <p>Appeal.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取caseNumber属性的值。
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
     * 设置caseNumber属性的值。
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
     * 获取appealInternalNumber属性的值。
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
     * 设置appealInternalNumber属性的值。
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
     * 获取appealRegisterNumber属性的值。
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
     * 设置appealRegisterNumber属性的值。
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
     * 获取filingDate属性的值。
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
     * 设置filingDate属性的值。
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
     * 获取appliedParty属性的值。
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
     * 设置appliedParty属性的值。
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
