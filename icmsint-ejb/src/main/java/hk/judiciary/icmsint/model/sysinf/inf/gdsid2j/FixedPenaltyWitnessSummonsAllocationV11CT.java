//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:40:40 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsid2j;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Witness Summons allocation details for Fixed Penalty 
 *                                Notice/Summons sent from CASEMAN to TCO.  Message consists of
 *                                a) Record Prefix
 *                                b) Interface Date
 *                                c) Demand Note Number
 *                                d) Case Number Object
 *                                e) Witness Summons Number
 *                                f) Witness Summons Internal Number
 *                                g) Witness Summons Generation Date
 *                                h) ID Type
 *                                i) ID Number
 *                                j) Witness English Name
 *                                k) Witness Chinese Name
 *                                j) Hearing Date
 *                                k) Application Status
 *                                l) Rejection Details
 *            
 * 
 * <p>Java class for FixedPenaltyWitnessSummonsAllocation.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyWitnessSummonsAllocation.V1.1.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.1.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WritNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WritInternalNumber" type="{}WritInternalNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WritGenerationDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="IdentificationType" type="{}IdentificationType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="IdentificationNumber" type="{}IdentificationNumber.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="WitnessEnglishName" type="{}PartyEnglishName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessChineseName" type="{}PartyChineseName.V1.1.CT" minOccurs="0"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="ApplicationStatus" type="{}ApplicationStatus.V1.0.CT"/>
 *         &lt;element name="RejectionDetails" type="{}ErrorDetails.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyWitnessSummonsAllocation.V1.1.CT", propOrder = {
    "recordPrefix",
    "interfaceDate",
    "demandNoteNumber",
    "caseNumber",
    "writNumber",
    "writInternalNumber",
    "writGenerationDate",
    "identificationType",
    "identificationNumber",
    "witnessEnglishName",
    "witnessChineseName",
    "hearingDate",
    "hearingTime",
    "applicationStatus",
    "rejectionDetails"
})
public class FixedPenaltyWitnessSummonsAllocationV11CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV11CT demandNoteNumber;
    @XmlElement(name = "CaseNumber")
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "WritNumber")
    protected CaseNumberV10CT writNumber;
    @XmlElement(name = "WritInternalNumber")
    protected WritInternalNumberV10CT writInternalNumber;
    @XmlElement(name = "WritGenerationDate")
    protected DateCT writGenerationDate;
    @XmlElement(name = "IdentificationType")
    protected IdentificationTypeV10CT identificationType;
    @XmlElement(name = "IdentificationNumber")
    protected IdentificationNumberV11CT identificationNumber;
    @XmlElement(name = "WitnessEnglishName")
    protected PartyEnglishNameV10CT witnessEnglishName;
    @XmlElement(name = "WitnessChineseName")
    protected PartyChineseNameV11CT witnessChineseName;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "RejectionDetails")
    protected List<ErrorDetailsV10CT> rejectionDetails;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV12CT }
     *     
     */
    public PrefixV12CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV12CT }
     *     
     */
    public void setRecordPrefix(PrefixV12CT value) {
        this.recordPrefix = value;
    }

    /**
     * Gets the value of the interfaceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getInterfaceDate() {
        return interfaceDate;
    }

    /**
     * Sets the value of the interfaceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setInterfaceDate(DateCT value) {
        this.interfaceDate = value;
    }

    /**
     * Gets the value of the demandNoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DemandNoteNumberV11CT }
     *     
     */
    public DemandNoteNumberV11CT getDemandNoteNumber() {
        return demandNoteNumber;
    }

    /**
     * Sets the value of the demandNoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandNoteNumberV11CT }
     *     
     */
    public void setDemandNoteNumber(DemandNoteNumberV11CT value) {
        this.demandNoteNumber = value;
    }

    /**
     * Gets the value of the caseNumber property.
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
     * Sets the value of the caseNumber property.
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
     * Gets the value of the writNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getWritNumber() {
        return writNumber;
    }

    /**
     * Sets the value of the writNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setWritNumber(CaseNumberV10CT value) {
        this.writNumber = value;
    }

    /**
     * Gets the value of the writInternalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link WritInternalNumberV10CT }
     *     
     */
    public WritInternalNumberV10CT getWritInternalNumber() {
        return writInternalNumber;
    }

    /**
     * Sets the value of the writInternalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link WritInternalNumberV10CT }
     *     
     */
    public void setWritInternalNumber(WritInternalNumberV10CT value) {
        this.writInternalNumber = value;
    }

    /**
     * Gets the value of the writGenerationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getWritGenerationDate() {
        return writGenerationDate;
    }

    /**
     * Sets the value of the writGenerationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setWritGenerationDate(DateCT value) {
        this.writGenerationDate = value;
    }

    /**
     * Gets the value of the identificationType property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationTypeV10CT }
     *     
     */
    public IdentificationTypeV10CT getIdentificationType() {
        return identificationType;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationTypeV10CT }
     *     
     */
    public void setIdentificationType(IdentificationTypeV10CT value) {
        this.identificationType = value;
    }

    /**
     * Gets the value of the identificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumberV11CT }
     *     
     */
    public IdentificationNumberV11CT getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberV11CT }
     *     
     */
    public void setIdentificationNumber(IdentificationNumberV11CT value) {
        this.identificationNumber = value;
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
     * Gets the value of the rejectionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetailsV10CT }
     * 
     * 
     */
    public List<ErrorDetailsV10CT> getRejectionDetails() {
        if (rejectionDetails == null) {
            rejectionDetails = new ArrayList<ErrorDetailsV10CT>();
        }
        return this.rejectionDetails;
    }

}
