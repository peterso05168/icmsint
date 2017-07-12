//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import java.util.ArrayList;
import java.util.List;
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
 * 				e) Informant Details Object (v1.2)
 * 				f) SOD Details (v1.1)
 * 				g) Offence Details Object (v1.1)
 * 				h) Hearing Weight
 * 				i) Penalty Weight
 * 				j) Defendant Details Object (v1.3)				              
 * 				k) Motorcycle Indicator           
 * 				l) Vehicle Registration Mark      
 * 				m) Vehicle Registration Mark Digit
 * 				n) Offence Description Object		
 * 				o) DIC Completion Date
 * 				p) Supplement Document Object (DOP History)
 *                                 q) Offence Variable Object
 * 			
 * 
 * <p>DeptSummons.V2.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DeptSummons.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="AttachmentIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="HrngGroupID" type="{}HrngGroupID.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ManualScheduleIndicator" type="{}FieldIndicator.V1.0.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.2.CT"/>
 *         &lt;element name="SODDetails" type="{}SODKey.V1.1.CT"/>
 *         &lt;element name="OffenceDetails" type="{}OffenceDetails.V1.1.CT"/>
 *         &lt;element name="HearingWeight" type="{}HearingWeight.V1.0.CT"/>
 *         &lt;element name="PenaltyWeight" type="{}PenaltyWeight.V1.0.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.3.CT"/>
 *         &lt;element name="Motorcycle" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="VehicleRegistrationMark" type="{}VehicleRegistrationMark.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="VehicleRegistrationMarkDigit" type="{}VehicleRegistrationMarkDigit.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceDesc" type="{}OffenceDesc.V1.2.CT"/>
 *         &lt;element name="DICCompletionDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="SupplementDocument" type="{}SupplementDocument.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OffenceVariable" type="{}OffenceVariable.V1.0.CT" maxOccurs="52" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeptSummons.V2.0.CT", propOrder = {
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
    "dicCompletionDate",
    "supplementDocument",
    "offenceVariable"
})
public class DeptSummonsV20CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "AttachmentIndicator", required = true)
    protected FieldIndicatorV10CT attachmentIndicator;
    @XmlElement(name = "HrngGroupID")
    protected HrngGroupIDV10CT hrngGroupID;
    @XmlElement(name = "ManualScheduleIndicator", required = true)
    protected FieldIndicatorV10CT manualScheduleIndicator;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV12CT informantDetails;
    @XmlElement(name = "SODDetails", required = true)
    protected SODKeyV11CT sodDetails;
    @XmlElement(name = "OffenceDetails", required = true)
    protected OffenceDetailsV11CT offenceDetails;
    @XmlElement(name = "HearingWeight", required = true)
    protected HearingWeightV10CT hearingWeight;
    @XmlElement(name = "PenaltyWeight", required = true)
    protected PenaltyWeightV10CT penaltyWeight;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV13CT defendantDetails;
    @XmlElement(name = "Motorcycle")
    protected FieldIndicatorV10CT motorcycle;
    @XmlElement(name = "VehicleRegistrationMark")
    protected VehicleRegistrationMarkV10CT vehicleRegistrationMark;
    @XmlElement(name = "VehicleRegistrationMarkDigit")
    protected VehicleRegistrationMarkDigitV10CT vehicleRegistrationMarkDigit;
    @XmlElement(name = "OffenceDesc", required = true)
    protected OffenceDescV12CT offenceDesc;
    @XmlElement(name = "DICCompletionDate")
    protected DateCT dicCompletionDate;
    @XmlElement(name = "SupplementDocument")
    protected SupplementDocumentV10CT supplementDocument;
    @XmlElement(name = "OffenceVariable")
    protected List<OffenceVariableV10CT> offenceVariable;

    /**
     * ��ȡrecordPrefix���Ե�ֵ��
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
     * ����recordPrefix���Ե�ֵ��
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
     *     {@link InformantV12CT }
     *     
     */
    public InformantV12CT getInformantDetails() {
        return informantDetails;
    }

    /**
     * ����informantDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InformantV12CT }
     *     
     */
    public void setInformantDetails(InformantV12CT value) {
        this.informantDetails = value;
    }

    /**
     * ��ȡsodDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SODKeyV11CT }
     *     
     */
    public SODKeyV11CT getSODDetails() {
        return sodDetails;
    }

    /**
     * ����sodDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SODKeyV11CT }
     *     
     */
    public void setSODDetails(SODKeyV11CT value) {
        this.sodDetails = value;
    }

    /**
     * ��ȡoffenceDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDetailsV11CT }
     *     
     */
    public OffenceDetailsV11CT getOffenceDetails() {
        return offenceDetails;
    }

    /**
     * ����offenceDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDetailsV11CT }
     *     
     */
    public void setOffenceDetails(OffenceDetailsV11CT value) {
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
     *     {@link DefendantV13CT }
     *     
     */
    public DefendantV13CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * ����defendantDetails���Ե�ֵ��
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
     *     {@link OffenceDescV12CT }
     *     
     */
    public OffenceDescV12CT getOffenceDesc() {
        return offenceDesc;
    }

    /**
     * ����offenceDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescV12CT }
     *     
     */
    public void setOffenceDesc(OffenceDescV12CT value) {
        this.offenceDesc = value;
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

    /**
     * Gets the value of the offenceVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offenceVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffenceVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffenceVariableV10CT }
     * 
     * 
     */
    public List<OffenceVariableV10CT> getOffenceVariable() {
        if (offenceVariable == null) {
            offenceVariable = new ArrayList<OffenceVariableV10CT>();
        }
        return this.offenceVariable;
    }

}
