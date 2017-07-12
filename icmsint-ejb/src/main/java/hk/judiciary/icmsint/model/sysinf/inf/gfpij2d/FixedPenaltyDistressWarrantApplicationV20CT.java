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
 * Generic Fixed Penalty Distress Warrant Application message consists of
 * 				a) Record Prefix
 * 				b) Case Object
 * 				c) Defendant Details
 * 				d) Hearing Date for Start Case
 * 				e) Hearing Date for End Case
 * 				f) Filter
 * 				g) Warrant Details Object
 *             
 * 
 * <p>FixedPenaltyDistressWarrantApplication.V2.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyDistressWarrantApplication.V2.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/>
 *         &lt;element name="Case" type="{}Case.V1.0.CT"/>
 *         &lt;element name="DefendantDetails" type="{}Defendant.V1.3.CT"/>
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
@XmlType(name = "FixedPenaltyDistressWarrantApplication.V2.0.CT", propOrder = {
    "recordPrefix",
    "_case",
    "defendantDetails",
    "firstConvictionDate",
    "lastConvictionDate",
    "fpDistressWarrantDetails"
})
public class FixedPenaltyDistressWarrantApplicationV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "Case", required = true)
    protected CaseV10CT _case;
    @XmlElement(name = "DefendantDetails", required = true)
    protected DefendantV13CT defendantDetails;
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
