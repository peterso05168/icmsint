//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic Fixed Penalty Distress Warrant Application message consists of
 * 				a) Record Prefix
 * 				b) Case Object
 * 				c) Defendant Details
 * 				d) Hearing Date for Start Case
 * 				e) Hearing Date for End Case
 * 				f) Filter
 * 				g) Warrant Details Object
 *             
 * 
 * <p>FixedPenaltyDistressWarrantApplication.V2.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyDistressWarrantApplication.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="Case" type="{}Case.V1.0.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.3.CT"/>
 *         &lt;element name="FirstConvictionDate" type="{CCT}Date.CT"/>
 *         &lt;element name="LastConvictionDate" type="{CCT}Date.CT"/>
 *         &lt;element name="FPDistressWarrantDetails" type="{}FPDistressWarrantDetails.V1.0.CT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyDistressWarrantApplication.V2.0.CT", propOrder = {
    "recordPrefix",
    "_case",
    "defendantDetails",
    "firstConvictionDate",
    "lastConvictionDate",
    "fpDistressWarrantDetails"
})
public class FixedPenaltyDistressWarrantApplicationV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "Case", required = true)
    protected CaseV10CT _case;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV13CT defendantDetails;
    @XmlElement(name = "FirstConvictionDate", required = true)
    protected DateCT firstConvictionDate;
    @XmlElement(name = "LastConvictionDate", required = true)
    protected DateCT lastConvictionDate;
    @XmlElement(name = "FPDistressWarrantDetails", required = true)
    protected List<FPDistressWarrantDetailsV10CT> fpDistressWarrantDetails;

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
     * 获取case属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseV10CT }
     *     
     */
    public CaseV10CT getCase() {
        return _case;
    }

    /**
     * 设置case属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseV10CT }
     *     
     */
    public void setCase(CaseV10CT value) {
        this._case = value;
    }

    /**
     * 获取defendantDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefendantV13CT }
     *     
     */
    public DefendantV13CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * 设置defendantDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantV13CT }
     *     
     */
    public void setDefendantDetails(DefendantV13CT value) {
        this.defendantDetails = value;
    }

    /**
     * 获取firstConvictionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFirstConvictionDate() {
        return firstConvictionDate;
    }

    /**
     * 设置firstConvictionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFirstConvictionDate(DateCT value) {
        this.firstConvictionDate = value;
    }

    /**
     * 获取lastConvictionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getLastConvictionDate() {
        return lastConvictionDate;
    }

    /**
     * 设置lastConvictionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setLastConvictionDate(DateCT value) {
        this.lastConvictionDate = value;
    }

    /**
     * Gets the value of the fpDistressWarrantDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fpDistressWarrantDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFPDistressWarrantDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FPDistressWarrantDetailsV10CT }
     * 
     * 
     */
    public List<FPDistressWarrantDetailsV10CT> getFPDistressWarrantDetails() {
        if (fpDistressWarrantDetails == null) {
            fpDistressWarrantDetails = new ArrayList<FPDistressWarrantDetailsV10CT>();
        }
        return this.fpDistressWarrantDetails;
    }

}
