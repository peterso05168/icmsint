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
 * 	Witness Summons Allocation 
 * 								Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix		
 * 				b) Interface ID
 * 				c) Witness Summons Number (Writ No.)
 * 				d) Witness Summons Internal Number
 * 				e) Witness Summons Generation Date
 * 				f) Witness English Name
 * 				g) Witness Chinese Name
 * 				h) Witness Identification Type
 * 				i) Witness Identification Number
 * 				j) Hearing Date
 * 				k) Hearing Time
 * 				l) Application Status
 * 				m) Witness Summons Allocation Remark			
 * 			
 * 
 * <p>WitnessSummonsAllocation.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WitnessSummonsAllocation.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="WitnessSummonsNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessSummonsInternalNumber" type="{}WitnessSummonsInternalNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessSummonsGenerationDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="WitnessEnglishName" type="{}PartyEnglishName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessChineseName" type="{}PartyChineseName.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="WitnessIdentificationType" type="{}IdentificationType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessIdentificationNumber" type="{}IdentificationNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/>
 *         &lt;element name="WitnessSummonsAllocationRemark" type="{}WitnessSummonsAllocationRemark.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WitnessSummonsAllocation.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "witnessSummonsNumber",
    "witnessSummonsInternalNumber",
    "witnessSummonsGenerationDate",
    "witnessEnglishName",
    "witnessChineseName",
    "witnessIdentificationType",
    "witnessIdentificationNumber",
    "hearingDate",
    "hearingTime",
    "applicationStatus",
    "witnessSummonsAllocationRemark"
})
public class WitnessSummonsAllocationV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "WitnessSummonsNumber")
    protected CaseNumberV10CT witnessSummonsNumber;
    @XmlElement(name = "WitnessSummonsInternalNumber")
    protected WitnessSummonsInternalNumberV10CT witnessSummonsInternalNumber;
    @XmlElement(name = "WitnessSummonsGenerationDate")
    protected DateCT witnessSummonsGenerationDate;
    @XmlElement(name = "WitnessEnglishName")
    protected PartyEnglishNameV10CT witnessEnglishName;
    @XmlElement(name = "WitnessChineseName")
    protected PartyChineseNameV11CT witnessChineseName;
    @XmlElement(name = "WitnessIdentificationType")
    protected IdentificationTypeV10CT witnessIdentificationType;
    @XmlElement(name = "WitnessIdentificationNumber")
    protected IdentificationNumberV11CT witnessIdentificationNumber;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "WitnessSummonsAllocationRemark")
    protected WitnessSummonsAllocationRemarkV10CT witnessSummonsAllocationRemark;

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
     * 获取witnessSummonsNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getWitnessSummonsNumber() {
        return witnessSummonsNumber;
    }

    /**
     * 设置witnessSummonsNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setWitnessSummonsNumber(CaseNumberV10CT value) {
        this.witnessSummonsNumber = value;
    }

    /**
     * 获取witnessSummonsInternalNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WitnessSummonsInternalNumberV10CT }
     *     
     */
    public WitnessSummonsInternalNumberV10CT getWitnessSummonsInternalNumber() {
        return witnessSummonsInternalNumber;
    }

    /**
     * 设置witnessSummonsInternalNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessSummonsInternalNumberV10CT }
     *     
     */
    public void setWitnessSummonsInternalNumber(WitnessSummonsInternalNumberV10CT value) {
        this.witnessSummonsInternalNumber = value;
    }

    /**
     * 获取witnessSummonsGenerationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getWitnessSummonsGenerationDate() {
        return witnessSummonsGenerationDate;
    }

    /**
     * 设置witnessSummonsGenerationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setWitnessSummonsGenerationDate(DateCT value) {
        this.witnessSummonsGenerationDate = value;
    }

    /**
     * 获取witnessEnglishName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyEnglishNameV10CT }
     *     
     */
    public PartyEnglishNameV10CT getWitnessEnglishName() {
        return witnessEnglishName;
    }

    /**
     * 设置witnessEnglishName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnglishNameV10CT }
     *     
     */
    public void setWitnessEnglishName(PartyEnglishNameV10CT value) {
        this.witnessEnglishName = value;
    }

    /**
     * 获取witnessChineseName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartyChineseNameV11CT }
     *     
     */
    public PartyChineseNameV11CT getWitnessChineseName() {
        return witnessChineseName;
    }

    /**
     * 设置witnessChineseName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartyChineseNameV11CT }
     *     
     */
    public void setWitnessChineseName(PartyChineseNameV11CT value) {
        this.witnessChineseName = value;
    }

    /**
     * 获取witnessIdentificationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentificationTypeV10CT }
     *     
     */
    public IdentificationTypeV10CT getWitnessIdentificationType() {
        return witnessIdentificationType;
    }

    /**
     * 设置witnessIdentificationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationTypeV10CT }
     *     
     */
    public void setWitnessIdentificationType(IdentificationTypeV10CT value) {
        this.witnessIdentificationType = value;
    }

    /**
     * 获取witnessIdentificationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumberV11CT }
     *     
     */
    public IdentificationNumberV11CT getWitnessIdentificationNumber() {
        return witnessIdentificationNumber;
    }

    /**
     * 设置witnessIdentificationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberV11CT }
     *     
     */
    public void setWitnessIdentificationNumber(IdentificationNumberV11CT value) {
        this.witnessIdentificationNumber = value;
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
     * 获取applicationStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApplicationStatusV10CT }
     *     
     */
    public ApplicationStatusV10CT getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * 设置applicationStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationStatusV10CT }
     *     
     */
    public void setApplicationStatus(ApplicationStatusV10CT value) {
        this.applicationStatus = value;
    }

    /**
     * 获取witnessSummonsAllocationRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WitnessSummonsAllocationRemarkV10CT }
     *     
     */
    public WitnessSummonsAllocationRemarkV10CT getWitnessSummonsAllocationRemark() {
        return witnessSummonsAllocationRemark;
    }

    /**
     * 设置witnessSummonsAllocationRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessSummonsAllocationRemarkV10CT }
     *     
     */
    public void setWitnessSummonsAllocationRemark(WitnessSummonsAllocationRemarkV10CT value) {
        this.witnessSummonsAllocationRemark = value;
    }

}
