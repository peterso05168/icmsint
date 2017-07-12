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
 * <p>WitnessSummonsApplication.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡapplyParty���Ե�ֵ��
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
     * ����applyParty���Ե�ֵ��
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
     * ��ȡwitnessDetails���Ե�ֵ��
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
     * ����witnessDetails���Ե�ֵ��
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
     * ��ȡbailiffDistrict���Ե�ֵ��
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
     * ����bailiffDistrict���Ե�ֵ��
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

}
