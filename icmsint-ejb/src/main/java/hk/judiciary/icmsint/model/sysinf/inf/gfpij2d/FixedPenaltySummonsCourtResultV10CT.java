//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * court order result details for Fixed Penalty Summons sent from 
 *                                CASEMAN to TCO.  Message consists of
 * 								a) Record Prefix
 * 								b) Interface Date
 * 								c) Demand Note Number
 * 								d) Case Number Object
 * 								e) Case Sequence Number in a Batch
 * 								f) Court Result Type
 * 								g) Court Result Code
 * 								h) Hearing Date
 * 								i) Hearing Time
 * 								j) Hearing Court Number
 * 								k) Court Fine Amount
 * 								l) Additional Penalty Amount
 * 								m) Court Costs Amount
 *             
 * 
 * <p>FixedPenaltySummonsCourtResult.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltySummonsCourtResult.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.1.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DemandNoteNumber" type="{}DemandNoteNumber.V1.0.CT"/>
 *         &lt;element name="CaseNumber" type="{}CaseNumber.V1.0.CT"/>
 *         &lt;element name="CaseRowSequenceNumber" type="{}CaseRowSequenceNumber.V1.0.CT"/>
 *         &lt;element name="FixedPenaltySummonsCourtResultType" type="{}FixedPenaltySummonsCourtResultType.V1.0.CT"/>
 *         &lt;element name="FixedPenaltySummonsCourtResultCode" type="{}FixedPenaltySummonsCourtResultCode.V1.0.CT"/>
 *         &lt;element name="HearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingTime" type="{CCT}Time.CT"/>
 *         &lt;element name="CourtNumber" type="{}HearingCourtNumber.V1.0.CT"/>
 *         &lt;element name="Penalty" type="{}Amount.V1.0.CT"/>
 *         &lt;element name="AdditionalPenalty" type="{}Amount.V1.0.CT"/>
 *         &lt;element name="CourtCosts" type="{}Amount.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltySummonsCourtResult.V1.0.CT", propOrder = {
    "recordPrefix",
    "interfaceDate",
    "demandNoteNumber",
    "caseNumber",
    "caseRowSequenceNumber",
    "fixedPenaltySummonsCourtResultType",
    "fixedPenaltySummonsCourtResultCode",
    "hearingDate",
    "hearingTime",
    "courtNumber",
    "penalty",
    "additionalPenalty",
    "courtCosts"
})
public class FixedPenaltySummonsCourtResultV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV11CT recordPrefix;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "DemandNoteNumber", required = true)
    protected DemandNoteNumberV10CT demandNoteNumber;
    @XmlElement(name = "CaseNumber", required = true)
    protected CaseNumberV10CT caseNumber;
    @XmlElement(name = "CaseRowSequenceNumber", required = true)
    protected CaseRowSequenceNumberV10CT caseRowSequenceNumber;
    @XmlElement(name = "FixedPenaltySummonsCourtResultType", required = true)
    protected FixedPenaltySummonsCourtResultTypeV10CT fixedPenaltySummonsCourtResultType;
    @XmlElement(name = "FixedPenaltySummonsCourtResultCode", required = true)
    protected FixedPenaltySummonsCourtResultCodeV10CT fixedPenaltySummonsCourtResultCode;
    @XmlElement(name = "HearingDate", required = true)
    protected DateCT hearingDate;
    @XmlElement(name = "HearingTime", required = true)
    protected TimeCT hearingTime;
    @XmlElement(name = "CourtNumber", required = true)
    protected HearingCourtNumberV10CT courtNumber;
    @XmlElement(name = "Penalty", required = true)
    protected AmountV10CT penalty;
    @XmlElement(name = "AdditionalPenalty", required = true)
    protected AmountV10CT additionalPenalty;
    @XmlElement(name = "CourtCosts", required = true)
    protected AmountV10CT courtCosts;

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
     * ��ȡcaseRowSequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CaseRowSequenceNumberV10CT }
     *     
     */
    public CaseRowSequenceNumberV10CT getCaseRowSequenceNumber() {
        return caseRowSequenceNumber;
    }

    /**
     * ����caseRowSequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CaseRowSequenceNumberV10CT }
     *     
     */
    public void setCaseRowSequenceNumber(CaseRowSequenceNumberV10CT value) {
        this.caseRowSequenceNumber = value;
    }

    /**
     * ��ȡfixedPenaltySummonsCourtResultType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltySummonsCourtResultTypeV10CT }
     *     
     */
    public FixedPenaltySummonsCourtResultTypeV10CT getFixedPenaltySummonsCourtResultType() {
        return fixedPenaltySummonsCourtResultType;
    }

    /**
     * ����fixedPenaltySummonsCourtResultType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltySummonsCourtResultTypeV10CT }
     *     
     */
    public void setFixedPenaltySummonsCourtResultType(FixedPenaltySummonsCourtResultTypeV10CT value) {
        this.fixedPenaltySummonsCourtResultType = value;
    }

    /**
     * ��ȡfixedPenaltySummonsCourtResultCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FixedPenaltySummonsCourtResultCodeV10CT }
     *     
     */
    public FixedPenaltySummonsCourtResultCodeV10CT getFixedPenaltySummonsCourtResultCode() {
        return fixedPenaltySummonsCourtResultCode;
    }

    /**
     * ����fixedPenaltySummonsCourtResultCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPenaltySummonsCourtResultCodeV10CT }
     *     
     */
    public void setFixedPenaltySummonsCourtResultCode(FixedPenaltySummonsCourtResultCodeV10CT value) {
        this.fixedPenaltySummonsCourtResultCode = value;
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
     * ��ȡcourtNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV10CT }
     *     
     */
    public HearingCourtNumberV10CT getCourtNumber() {
        return courtNumber;
    }

    /**
     * ����courtNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV10CT }
     *     
     */
    public void setCourtNumber(HearingCourtNumberV10CT value) {
        this.courtNumber = value;
    }

    /**
     * ��ȡpenalty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getPenalty() {
        return penalty;
    }

    /**
     * ����penalty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setPenalty(AmountV10CT value) {
        this.penalty = value;
    }

    /**
     * ��ȡadditionalPenalty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getAdditionalPenalty() {
        return additionalPenalty;
    }

    /**
     * ����additionalPenalty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setAdditionalPenalty(AmountV10CT value) {
        this.additionalPenalty = value;
    }

    /**
     * ��ȡcourtCosts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getCourtCosts() {
        return courtCosts;
    }

    /**
     * ����courtCosts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setCourtCosts(AmountV10CT value) {
        this.courtCosts = value;
    }

}