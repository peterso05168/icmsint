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
 * 	Departmental Summons Application Message
 * 								Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Attachment Indicator
 * 				c) Hearing Group ID
 * 				d) Manual Schedule Indicator
 * 				e) Informant Details Object (v1.1)
 * 				f) SOD Details
 * 				g) Offence Details Object
 * 				i) Application Source ID
 * 				j) Hearing Weight
 * 				k) Penalty Weight
 * 				l) Defendant Details Object (v1.1)				              
 * 				m) Motorcycle Indicator           
 * 				n) Vehicle Registration Mark      
 * 				o) Vehicle Registration Mark Digit
 * 				p) Offence Description Object
 * 				q) Interface ID			
 * 				r) DIC Completion Date
 * 				s) Supplement Document Object (DOP History)
 * 			
 * 
 * <p>DeptSummons.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DeptSummons.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="AttachmentIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="HrngGroupID" type="{}HrngGroupID.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ManualScheduleIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.1.CT"/>
 *         &lt;element name="SODDetails" type="{}SODKey.V1.0.CT"/>
 *         &lt;element name="OffenceDetails" type="{}OffenceDetails.V1.0.CT"/>
 *         &lt;element name="HearingWeight" type="{}HearingWeight.V1.0.CT"/>
 *         &lt;element name="PenaltyWeight" type="{}PenaltyWeight.V1.0.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.1.CT"/>
 *         &lt;element name="Motorcycle" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="VehicleRegistrationMark" type="{}VehicleRegistrationMark.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="VehicleRegistrationMarkDigit" type="{}VehicleRegistrationMarkDigit.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDesc" type="{}OffenceDesc.V1.0.CT"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *         &lt;element name="DICCompletionDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="SupplementDocument" type="{}SupplementDocument.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeptSummons.V1.0.CT", propOrder = {
    "recordPrefix",
    "attachmentIndicator",
    "hrngGroupID",
    "manualScheduleIndicator",
    "informantDetails",
    "sodDetails",
    "offenceDetails",
    "hearingWeight",
    "penaltyWeight",
    "defendantDetails",
    "motorcycle",
    "vehicleRegistrationMark",
    "vehicleRegistrationMarkDigit",
    "offenceDesc",
    "interfaceID",
    "dicCompletionDate",
    "supplementDocument"
})
public class DeptSummonsV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "AttachmentIndicator", required = true)
    protected FieldIndicatorV10CT attachmentIndicator;
    @XmlElement(name = "HrngGroupID")
    protected HrngGroupIDV10CT hrngGroupID;
    @XmlElement(name = "ManualScheduleIndicator", required = true)
    protected FieldIndicatorV10CT manualScheduleIndicator;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV11CT informantDetails;
    @XmlElement(name = "SODDetails", required = true)
    protected SODKeyV10CT sodDetails;
    @XmlElement(name = "OffenceDetails", required = true)
    protected OffenceDetailsV10CT offenceDetails;
    @XmlElement(name = "HearingWeight", required = true)
    protected HearingWeightV10CT hearingWeight;
    @XmlElement(name = "PenaltyWeight", required = true)
    protected PenaltyWeightV10CT penaltyWeight;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV11CT defendantDetails;
    @XmlElement(name = "Motorcycle")
    protected FieldIndicatorV10CT motorcycle;
    @XmlElement(name = "VehicleRegistrationMark")
    protected VehicleRegistrationMarkV10CT vehicleRegistrationMark;
    @XmlElement(name = "VehicleRegistrationMarkDigit")
    protected VehicleRegistrationMarkDigitV10CT vehicleRegistrationMarkDigit;
    @XmlElement(name = "OffenceDesc", required = true)
    protected OffenceDescV10CT offenceDesc;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "DICCompletionDate")
    protected DateCT dicCompletionDate;
    @XmlElement(name = "SupplementDocument")
    protected SupplementDocumentV10CT supplementDocument;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
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
     * ����recordPrefix���Ե�ֵ��
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
     * ��ȡattachmentIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getAttachmentIndicator() {
        return attachmentIndicator;
    }

    /**
     * ����attachmentIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setAttachmentIndicator(FieldIndicatorV10CT value) {
        this.attachmentIndicator = value;
    }

    /**
     * ��ȡhrngGroupID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HrngGroupIDV10CT }
     *     
     */
    public HrngGroupIDV10CT getHrngGroupID() {
        return hrngGroupID;
    }

    /**
     * ����hrngGroupID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HrngGroupIDV10CT }
     *     
     */
    public void setHrngGroupID(HrngGroupIDV10CT value) {
        this.hrngGroupID = value;
    }

    /**
     * ��ȡmanualScheduleIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getManualScheduleIndicator() {
        return manualScheduleIndicator;
    }

    /**
     * ����manualScheduleIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setManualScheduleIndicator(FieldIndicatorV10CT value) {
        this.manualScheduleIndicator = value;
    }

    /**
     * ��ȡinformantDetails���Ե�ֵ��
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
     * ����informantDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InformantV11CT }
     *     
     */
    public void setInformantDetails(InformantV11CT value) {
        this.informantDetails = value;
    }

    /**
     * ��ȡsodDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SODKeyV10CT }
     *     
     */
    public SODKeyV10CT getSODDetails() {
        return sodDetails;
    }

    /**
     * ����sodDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SODKeyV10CT }
     *     
     */
    public void setSODDetails(SODKeyV10CT value) {
        this.sodDetails = value;
    }

    /**
     * ��ȡoffenceDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDetailsV10CT }
     *     
     */
    public OffenceDetailsV10CT getOffenceDetails() {
        return offenceDetails;
    }

    /**
     * ����offenceDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDetailsV10CT }
     *     
     */
    public void setOffenceDetails(OffenceDetailsV10CT value) {
        this.offenceDetails = value;
    }

    /**
     * ��ȡhearingWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingWeightV10CT }
     *     
     */
    public HearingWeightV10CT getHearingWeight() {
        return hearingWeight;
    }

    /**
     * ����hearingWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingWeightV10CT }
     *     
     */
    public void setHearingWeight(HearingWeightV10CT value) {
        this.hearingWeight = value;
    }

    /**
     * ��ȡpenaltyWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PenaltyWeightV10CT }
     *     
     */
    public PenaltyWeightV10CT getPenaltyWeight() {
        return penaltyWeight;
    }

    /**
     * ����penaltyWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyWeightV10CT }
     *     
     */
    public void setPenaltyWeight(PenaltyWeightV10CT value) {
        this.penaltyWeight = value;
    }

    /**
     * ��ȡdefendantDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DefendantV11CT }
     *     
     */
    public DefendantV11CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * ����defendantDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantV11CT }
     *     
     */
    public void setDefendantDetails(DefendantV11CT value) {
        this.defendantDetails = value;
    }

    /**
     * ��ȡmotorcycle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getMotorcycle() {
        return motorcycle;
    }

    /**
     * ����motorcycle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setMotorcycle(FieldIndicatorV10CT value) {
        this.motorcycle = value;
    }

    /**
     * ��ȡvehicleRegistrationMark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VehicleRegistrationMarkV10CT }
     *     
     */
    public VehicleRegistrationMarkV10CT getVehicleRegistrationMark() {
        return vehicleRegistrationMark;
    }

    /**
     * ����vehicleRegistrationMark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRegistrationMarkV10CT }
     *     
     */
    public void setVehicleRegistrationMark(VehicleRegistrationMarkV10CT value) {
        this.vehicleRegistrationMark = value;
    }

    /**
     * ��ȡvehicleRegistrationMarkDigit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VehicleRegistrationMarkDigitV10CT }
     *     
     */
    public VehicleRegistrationMarkDigitV10CT getVehicleRegistrationMarkDigit() {
        return vehicleRegistrationMarkDigit;
    }

    /**
     * ����vehicleRegistrationMarkDigit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRegistrationMarkDigitV10CT }
     *     
     */
    public void setVehicleRegistrationMarkDigit(VehicleRegistrationMarkDigitV10CT value) {
        this.vehicleRegistrationMarkDigit = value;
    }

    /**
     * ��ȡoffenceDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescV10CT }
     *     
     */
    public OffenceDescV10CT getOffenceDesc() {
        return offenceDesc;
    }

    /**
     * ����offenceDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescV10CT }
     *     
     */
    public void setOffenceDesc(OffenceDescV10CT value) {
        this.offenceDesc = value;
    }

    /**
     * ��ȡinterfaceID���Ե�ֵ��
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
     * ����interfaceID���Ե�ֵ��
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
     * ��ȡdicCompletionDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getDICCompletionDate() {
        return dicCompletionDate;
    }

    /**
     * ����dicCompletionDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setDICCompletionDate(DateCT value) {
        this.dicCompletionDate = value;
    }

    /**
     * ��ȡsupplementDocument���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SupplementDocumentV10CT }
     *     
     */
    public SupplementDocumentV10CT getSupplementDocument() {
        return supplementDocument;
    }

    /**
     * ����supplementDocument���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementDocumentV10CT }
     *     
     */
    public void setSupplementDocument(SupplementDocumentV10CT value) {
        this.supplementDocument = value;
    }

}
