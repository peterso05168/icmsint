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
 * Generic Fixed Penalty Distress Warrant Application message consists of
 * 				a) Record Prefix
 * 				b) Case Object
 * 				c) Application Source ID
 * 				d) Interface Date
 * 				e) Defendant Details
 * 				f) Hearing Date for Start Case
 * 				g) Hearing Date for End Case
 * 				h) Filter
 * 				i) Warrant Details Object
 *             
 * 
 * <p>FixedPenaltyDistressWarrantApplication.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyDistressWarrantApplication.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.1.CT"/>
 *         &lt;element name="Case" type="{}Case.V1.0.CT"/>
 *         &lt;element name="ApplicationSourceID" type="{}ApplicationSourceID.V1.0.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.0.CT"/>
 *         &lt;element name="FirstConvictionDate" type="{CCT}Date.CT"/>
 *         &lt;element name="LastConvictionDate" type="{CCT}Date.CT"/>
 *         &lt;element name="FPDistressWarrantDetails" type="{}FPDistressWarrantDetails.V1.0.CT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyDistressWarrantApplication.V1.0.CT", propOrder = {
    "recordPrefix",
    "_case",
    "applicationSourceID",
    "interfaceDate",
    "defendantDetails",
    "firstConvictionDate",
    "lastConvictionDate",
    "fpDistressWarrantDetails"
})
public class FixedPenaltyDistressWarrantApplicationV10CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV11CT recordPrefix;
    @XmlElement(name = "Case", required = true)
    protected CaseV10CT _case;
    @XmlElement(name = "ApplicationSourceID", required = true)
    protected ApplicationSourceIDV10CT applicationSourceID;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV10CT defendantDetails;
    @XmlElement(name = "FirstConvictionDate", required = true)
    protected DateCT firstConvictionDate;
    @XmlElement(name = "LastConvictionDate", required = true)
    protected DateCT lastConvictionDate;
    @XmlElement(name = "FPDistressWarrantDetails", required = true)
    protected List<FPDistressWarrantDetailsV10CT> fpDistressWarrantDetails;

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
     * ��ȡcase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CaseV10CT }
     *     
     */
    public CaseV10CT getCase() {
        return _case;
    }

    /**
     * ����case���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CaseV10CT }
     *     
     */
    public void setCase(CaseV10CT value) {
        this._case = value;
    }

    /**
     * ��ȡapplicationSourceID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSourceIDV10CT }
     *     
     */
    public ApplicationSourceIDV10CT getApplicationSourceID() {
        return applicationSourceID;
    }

    /**
     * ����applicationSourceID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSourceIDV10CT }
     *     
     */
    public void setApplicationSourceID(ApplicationSourceIDV10CT value) {
        this.applicationSourceID = value;
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
     * ��ȡdefendantDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DefendantV10CT }
     *     
     */
    public DefendantV10CT getDefendantDetails() {
        return defendantDetails;
    }

    /**
     * ����defendantDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantV10CT }
     *     
     */
    public void setDefendantDetails(DefendantV10CT value) {
        this.defendantDetails = value;
    }

    /**
     * ��ȡfirstConvictionDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFirstConvictionDate() {
        return firstConvictionDate;
    }

    /**
     * ����firstConvictionDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFirstConvictionDate(DateCT value) {
        this.firstConvictionDate = value;
    }

    /**
     * ��ȡlastConvictionDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getLastConvictionDate() {
        return lastConvictionDate;
    }

    /**
     * ����lastConvictionDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setLastConvictionDate(DateCT value) {
        this.lastConvictionDate = value;
    }

    /**
     * Gets the value of the fpDistressWarrantDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fpDistressWarrantDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFPDistressWarrantDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FPDistressWarrantDetailsV10CT }
     * 
     * 
     */
    public List<FPDistressWarrantDetailsV10CT> getFPDistressWarrantDetails() {
        if (fpDistressWarrantDetails == null) {
            fpDistressWarrantDetails = new ArrayList<FPDistressWarrantDetailsV10CT>();
        }
        return this.fpDistressWarrantDetails;
    }

}
