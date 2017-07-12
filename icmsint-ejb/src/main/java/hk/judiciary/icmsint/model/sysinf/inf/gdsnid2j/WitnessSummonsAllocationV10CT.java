//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.03 at 10:31:06 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j;

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
 * <p>Java class for WitnessSummonsAllocation.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the recordPrefix property.
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
     * Sets the value of the recordPrefix property.
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
     * Gets the value of the interfaceID property.
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
     * Sets the value of the interfaceID property.
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
     * Gets the value of the witnessSummonsNumber property.
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
     * Sets the value of the witnessSummonsNumber property.
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
     * Gets the value of the witnessSummonsInternalNumber property.
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
     * Sets the value of the witnessSummonsInternalNumber property.
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
     * Gets the value of the witnessSummonsGenerationDate property.
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
     * Sets the value of the witnessSummonsGenerationDate property.
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
     * Gets the value of the witnessEnglishName property.
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
     * Sets the value of the witnessEnglishName property.
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
     * Gets the value of the witnessChineseName property.
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
     * Sets the value of the witnessChineseName property.
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
     * Gets the value of the witnessIdentificationType property.
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
     * Sets the value of the witnessIdentificationType property.
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
     * Gets the value of the witnessIdentificationNumber property.
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
     * Sets the value of the witnessIdentificationNumber property.
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
     * Gets the value of the hearingDate property.
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
     * Sets the value of the hearingDate property.
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
     * Gets the value of the hearingTime property.
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
     * Sets the value of the hearingTime property.
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
     * Gets the value of the applicationStatus property.
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
     * Sets the value of the applicationStatus property.
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
     * Gets the value of the witnessSummonsAllocationRemark property.
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
     * Sets the value of the witnessSummonsAllocationRemark property.
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
