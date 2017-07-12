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
 * <p>CaseNumber.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取courtSys属性的值。
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
     * 设置courtSys属性的值。
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
     * 获取caseType属性的值。
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
     * 设置caseType属性的值。
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
     * 获取caseSerialNumber属性的值。
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
     * 设置caseSerialNumber属性的值。
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
     * 获取caseYear属性的值。
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
     * 设置caseYear属性的值。
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
