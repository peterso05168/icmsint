//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

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
 * <p>FixedPenaltyWitnessSummonsAllocation.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyWitnessSummonsAllocation.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.1.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.0.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WritNumber" type="{}CaseNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WritInternalNumber" type="{}WritInternalNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WritGenerationDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="IdentificationType" type="{}IdentificationType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="IdentificationNumber" type="{}IdentificationNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessEnglishName" type="{}PartyEnglishName.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="WitnessChineseName" type="{}PartyChineseName.V1.0.CT" minOccurs="0"/>
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
@XmlType(name = "FixedPenaltyWitnessSummonsAllocation.V1.0.CT", propOrder = {
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
public class FixedPenaltyWitnessSummonsAllocationV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV11CT recordPrefix;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV10CT demandNoteNumber;
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
    protected IdentificationNumberV10CT identificationNumber;
    @XmlElement(name = "WitnessEnglishName")
    protected PartyEnglishNameV10CT witnessEnglishName;
    @XmlElement(name = "WitnessChineseName")
    protected PartyChineseNameV10CT witnessChineseName;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "ApplicationStatus", required = true)
    protected ApplicationStatusV10CT applicationStatus;
    @XmlElement(name = "RejectionDetails")
    protected List<ErrorDetailsV10CT> rejectionDetails;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PrefixV11CT }
     *     
     */
    public PrefixV11CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * ����recordPrefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV11CT }
     *     
     */
    public void setRecordPrefix(PrefixV11CT value) {
        this.recordPrefix = value;
    }

    /**
     * ��ȡinterfaceDate���Ե�ֵ��
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
     * ����interfaceDate���Ե�ֵ��
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
     * ��ȡdemandNoteNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DemandNoteNumberV10CT }
     *     
     */
    public DemandNoteNumberV10CT getDemandNoteNumber() {
        return demandNoteNumber;
    }

    /**
     * ����demandNoteNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DemandNoteNumberV10CT }
     *     
     */
    public void setDemandNoteNumber(DemandNoteNumberV10CT value) {
        this.demandNoteNumber = value;
    }

    /**
     * ��ȡcaseNumber���Ե�ֵ��
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
     * ����caseNumber���Ե�ֵ��
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
     * ��ȡwritNumber���Ե�ֵ��
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
     * ����writNumber���Ե�ֵ��
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
     * ��ȡwritInternalNumber���Ե�ֵ��
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
     * ����writInternalNumber���Ե�ֵ��
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
     * ��ȡwritGenerationDate���Ե�ֵ��
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
     * ����writGenerationDate���Ե�ֵ��
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
     * ��ȡidentificationType���Ե�ֵ��
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
     * ����identificationType���Ե�ֵ��
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
     * ��ȡidentificationNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumberV10CT }
     *     
     */
    public IdentificationNumberV10CT getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * ����identificationNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberV10CT }
     *     
     */
    public void setIdentificationNumber(IdentificationNumberV10CT value) {
        this.identificationNumber = value;
    }

    /**
     * ��ȡwitnessEnglishName���Ե�ֵ��
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
     * ����witnessEnglishName���Ե�ֵ��
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
     * ��ȡwitnessChineseName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PartyChineseNameV10CT }
     *     
     */
    public PartyChineseNameV10CT getWitnessChineseName() {
        return witnessChineseName;
    }

    /**
     * ����witnessChineseName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PartyChineseNameV10CT }
     *     
     */
    public void setWitnessChineseName(PartyChineseNameV10CT value) {
        this.witnessChineseName = value;
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
     * ��ȡapplicationStatus���Ե�ֵ��
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
     * ����applicationStatus���Ե�ֵ��
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
