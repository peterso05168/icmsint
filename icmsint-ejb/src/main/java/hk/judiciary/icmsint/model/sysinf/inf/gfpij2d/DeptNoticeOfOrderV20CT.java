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
 * Notice Of Order Application Message
 *                                                                 Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Defendant Details Object (v1.3)
 * 				c) Offence Date,Time
 *                                 d) Offence Description Format
 * 				e) Offence Location
 * 				f) SOD Details
 * 				g) Offence Description Object
 * 				h) Informant Details Object (v1.2)
 * 				i) Issue Date
 * 				j) Hearing Court Number
 *                                 k) First Hearing Date,Time
 *                         
 * 
 * <p>DeptNoticeOfOrder.V2.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DeptNoticeOfOrder.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.3.CT"/>
 *         &lt;element name="OffenceDateTime" type="{}OffenceDateTime.V1.0.CT"/>
 *         &lt;element name="OffenceDescFormat" type="{}OffenceDescFormat.V1.0.CT"/>
 *         &lt;element name="OffenceLocation" type="{}Address.V1.2.CT" minOccurs="0"/>
 *         &lt;element name="SODDetails" type="{}SODKey.V1.1.CT"/>
 *         &lt;element name="OffenceDesc" type="{}OffenceDesc.V1.2.CT"/>
 *         &lt;element name="InformantDetails" type="{}Informant.V1.2.CT"/>
 *         &lt;element name="IssueDate" type="{CCT}Date.CT"/>
 *         &lt;element name="HearingCourtNumber" type="{}HearingCourtNumber.V1.1.CT"/>
 *         &lt;element name="FirstHearingDate" type="{CCT}Date.CT"/>
 *         &lt;element name="FirstHearingTime" type="{CCT}Time.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeptNoticeOfOrder.V2.0.CT", propOrder = {
    "recordPrefix",
    "defendantDetails",
    "offenceDateTime",
    "offenceDescFormat",
    "offenceLocation",
    "sodDetails",
    "offenceDesc",
    "informantDetails",
    "issueDate",
    "hearingCourtNumber",
    "firstHearingDate",
    "firstHearingTime"
})
public class DeptNoticeOfOrderV20CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV13CT defendantDetails;
    @XmlElement(name = "OffenceDateTime", required = true)
    protected OffenceDateTimeV10CT offenceDateTime;
    @XmlElement(name = "OffenceDescFormat", required = true)
    protected OffenceDescFormatV10CT offenceDescFormat;
    @XmlElement(name = "OffenceLocation")
    protected AddressV12CT offenceLocation;
    @XmlElement(name = "SODDetails", required = true)
    protected SODKeyV11CT sodDetails;
    @XmlElement(name = "OffenceDesc", required = true)
    protected OffenceDescV12CT offenceDesc;
    @XmlElement(name = "InformantDetails", required = true)
    protected InformantV12CT informantDetails;
    @XmlElement(name = "IssueDate", required = true)
    protected DateCT issueDate;
    @XmlElement(name = "HearingCourtNumber", required = true)
    protected HearingCourtNumberV11CT hearingCourtNumber;
    @XmlElement(name = "FirstHearingDate", required = true)
    protected DateCT firstHearingDate;
    @XmlElement(name = "FirstHearingTime", required = true)
    protected TimeCT firstHearingTime;

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
     * ��ȡoffenceDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDateTimeV10CT }
     *     
     */
    public OffenceDateTimeV10CT getOffenceDateTime() {
        return offenceDateTime;
    }

    /**
     * ����offenceDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDateTimeV10CT }
     *     
     */
    public void setOffenceDateTime(OffenceDateTimeV10CT value) {
        this.offenceDateTime = value;
    }

    /**
     * ��ȡoffenceDescFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OffenceDescFormatV10CT }
     *     
     */
    public OffenceDescFormatV10CT getOffenceDescFormat() {
        return offenceDescFormat;
    }

    /**
     * ����offenceDescFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceDescFormatV10CT }
     *     
     */
    public void setOffenceDescFormat(OffenceDescFormatV10CT value) {
        this.offenceDescFormat = value;
    }

    /**
     * ��ȡoffenceLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AddressV12CT }
     *     
     */
    public AddressV12CT getOffenceLocation() {
        return offenceLocation;
    }

    /**
     * ����offenceLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV12CT }
     *     
     */
    public void setOffenceLocation(AddressV12CT value) {
        this.offenceLocation = value;
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
     * ��ȡissueDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getIssueDate() {
        return issueDate;
    }

    /**
     * ����issueDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setIssueDate(DateCT value) {
        this.issueDate = value;
    }

    /**
     * ��ȡhearingCourtNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public HearingCourtNumberV11CT getHearingCourtNumber() {
        return hearingCourtNumber;
    }

    /**
     * ����hearingCourtNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HearingCourtNumberV11CT }
     *     
     */
    public void setHearingCourtNumber(HearingCourtNumberV11CT value) {
        this.hearingCourtNumber = value;
    }

    /**
     * ��ȡfirstHearingDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFirstHearingDate() {
        return firstHearingDate;
    }

    /**
     * ����firstHearingDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFirstHearingDate(DateCT value) {
        this.firstHearingDate = value;
    }

    /**
     * ��ȡfirstHearingTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeCT }
     *     
     */
    public TimeCT getFirstHearingTime() {
        return firstHearingTime;
    }

    /**
     * ����firstHearingTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCT }
     *     
     */
    public void setFirstHearingTime(TimeCT value) {
        this.firstHearingTime = value;
    }

}
