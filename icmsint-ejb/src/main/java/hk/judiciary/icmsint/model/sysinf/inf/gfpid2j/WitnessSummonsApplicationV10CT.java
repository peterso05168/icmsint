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
 * 	Witness Summons Application Message
 * 								Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Interface ID											
 * 				c) Hearing Date
 * 				d) Hearing Time
 * 				e) Apply Party								
 * 				f) Witness Object (v1.1)
 * 				g) Bailiff District
 * 				h) Informant Details Object (v1.1)				
 * 			
 * 
 * <p>WitnessSummonsApplication.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WitnessSummonsApplication.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="ApplyParty" type="{}ApplyParty.V1.0.CT"/>
 *         &lt;element name="WitnessDetails" type="{}Witness.V1.1.CT"/>
 *         &lt;element name="BailiffDistrict" type="{}BailiffDistrictCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WitnessSummonsApplication.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "hearingDate",
    "hearingTime",
    "applyParty",
    "witnessDetails",
    "bailiffDistrict",
    "informantDetails"
})
public class WitnessSummonsApplicationV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "ApplyParty", required = true)
    protected ApplyPartyV10CT applyParty;
    @XmlElement(name = "WitnessDetails", required = true)
    protected WitnessV11CT witnessDetails;
    @XmlElement(name = "BailiffDistrict")
    protected BailiffDistrictCodeV10CT bailiffDistrict;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV11CT informantDetails;

    /**
     * 获取recordPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixV10CT }
     *     
     */
    public PrefixV10CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * 设置recordPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV10CT }
     *     
     */
    public void setRecordPrefix(PrefixV10CT value) {
        this.recordPrefix = value;
    }

    /**
     * 获取interfaceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public InterfaceIDV10CT getInterfaceID() {
        return interfaceID;
    }

    /**
     * 设置interfaceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public void setInterfaceID(InterfaceIDV10CT value) {
        this.interfaceID = value;
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
     * 获取applyParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApplyPartyV10CT }
     *     
     */
    public ApplyPartyV10CT getApplyParty() {
        return applyParty;
    }

    /**
     * 设置applyParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApplyPartyV10CT }
     *     
     */
    public void setApplyParty(ApplyPartyV10CT value) {
        this.applyParty = value;
    }

    /**
     * 获取witnessDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WitnessV11CT }
     *     
     */
    public WitnessV11CT getWitnessDetails() {
        return witnessDetails;
    }

    /**
     * 设置witnessDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessV11CT }
     *     
     */
    public void setWitnessDetails(WitnessV11CT value) {
        this.witnessDetails = value;
    }

    /**
     * 获取bailiffDistrict属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BailiffDistrictCodeV10CT }
     *     
     */
    public BailiffDistrictCodeV10CT getBailiffDistrict() {
        return bailiffDistrict;
    }

    /**
     * 设置bailiffDistrict属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BailiffDistrictCodeV10CT }
     *     
     */
    public void setBailiffDistrict(BailiffDistrictCodeV10CT value) {
        this.bailiffDistrict = value;
    }

    /**
     * 获取informantDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InformantV11CT }
     *     
     */
    public InformantV11CT getInformantDetails() {
        return informantDetails;
    }

    /**
     * 设置informantDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InformantV11CT }
     *     
     */
    public void setInformantDetails(InformantV11CT value) {
        this.informantDetails = value;
    }

}
