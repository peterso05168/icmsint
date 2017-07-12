//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceFileHeader" type="{}InterfaceFileHeader.V1.3.CT"/>
 *         &lt;choice>
 *           &lt;element name="FixedPenaltyNoticeSummonsAllocation" type="{}FixedPenaltyNoticeSummonsAllocation.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltyNoticeOfOrderCourtResult" type="{}FixedPenaltyNoticeOfOrderCourtResult.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltySummonsCourtResult" type="{}FixedPenaltySummonsCourtResult.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltyWitnessSummonsAllocation" type="{}WitnessSummonsAllocation.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="AppealReviewGrant" type="{}AppealReviewGrant.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="WarrantStatusChange" type="{}WarrantStatusChange.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="CourtPayment" type="{}CourtPayment.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltyDistressWarrantAllocation" type="{}FixedPenaltyDistressWarrantAllocation.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltyDistressWarrantStatusChange" type="{}FixedPenaltyDistressWarrantStatusChange.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltyDistressWarrantCourtPayment" type="{}FixedPenaltyDistressWarrantCourtPayment.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="NextHearing" type="{}NextHearing.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="PublicPaymentTransactionNumber" type="{}PublicPaymentTransactionNumber.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="CaseDocumentAcknowledgement" type="{}CaseDocumentAcknowledgement.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="CourtDocument" type="{}CourtDocument.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "interfaceFileHeader",
    "fixedPenaltyNoticeSummonsAllocation",
    "fixedPenaltyNoticeOfOrderCourtResult",
    "fixedPenaltySummonsCourtResult",
    "fixedPenaltyWitnessSummonsAllocation",
    "appealReviewGrant",
    "warrantStatusChange",
    "courtPayment",
    "fixedPenaltyDistressWarrantAllocation",
    "fixedPenaltyDistressWarrantStatusChange",
    "fixedPenaltyDistressWarrantCourtPayment",
    "nextHearing",
    "publicPaymentTransactionNumber",
    "caseDocumentAcknowledgement",
    "courtDocument"
})
@XmlRootElement(name = "GFPIMsgJ2D")
public class GFPIMsgJ2D {

    @XmlElement(name = "InterfaceFileHeader", required = true)
    protected InterfaceFileHeaderV13CT interfaceFileHeader;
    @XmlElement(name = "FixedPenaltyNoticeSummonsAllocation")
    protected List<FixedPenaltyNoticeSummonsAllocationV20CT> fixedPenaltyNoticeSummonsAllocation;
    @XmlElement(name = "FixedPenaltyNoticeOfOrderCourtResult")
    protected List<FixedPenaltyNoticeOfOrderCourtResultV20CT> fixedPenaltyNoticeOfOrderCourtResult;
    @XmlElement(name = "FixedPenaltySummonsCourtResult")
    protected List<FixedPenaltySummonsCourtResultV20CT> fixedPenaltySummonsCourtResult;
    @XmlElement(name = "FixedPenaltyWitnessSummonsAllocation")
    protected List<WitnessSummonsAllocationV20CT> fixedPenaltyWitnessSummonsAllocation;
    @XmlElement(name = "AppealReviewGrant")
    protected List<AppealReviewGrantV20CT> appealReviewGrant;
    @XmlElement(name = "WarrantStatusChange")
    protected List<WarrantStatusChangeV20CT> warrantStatusChange;
    @XmlElement(name = "CourtPayment")
    protected List<CourtPaymentV20CT> courtPayment;
    @XmlElement(name = "FixedPenaltyDistressWarrantAllocation")
    protected List<FixedPenaltyDistressWarrantAllocationV20CT> fixedPenaltyDistressWarrantAllocation;
    @XmlElement(name = "FixedPenaltyDistressWarrantStatusChange")
    protected List<FixedPenaltyDistressWarrantStatusChangeV20CT> fixedPenaltyDistressWarrantStatusChange;
    @XmlElement(name = "FixedPenaltyDistressWarrantCourtPayment")
    protected List<FixedPenaltyDistressWarrantCourtPaymentV20CT> fixedPenaltyDistressWarrantCourtPayment;
    @XmlElement(name = "NextHearing")
    protected List<NextHearingV20CT> nextHearing;
    @XmlElement(name = "PublicPaymentTransactionNumber")
    protected List<PublicPaymentTransactionNumberV10CT> publicPaymentTransactionNumber;
    @XmlElement(name = "CaseDocumentAcknowledgement")
    protected List<CaseDocumentAcknowledgementV10CT> caseDocumentAcknowledgement;
    @XmlElement(name = "CourtDocument")
    protected List<CourtDocumentV10CT> courtDocument;

    /**
     * 获取interfaceFileHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InterfaceFileHeaderV13CT }
     *     
     */
    public InterfaceFileHeaderV13CT getInterfaceFileHeader() {
        return interfaceFileHeader;
    }

    /**
     * 设置interfaceFileHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceFileHeaderV13CT }
     *     
     */
    public void setInterfaceFileHeader(InterfaceFileHeaderV13CT value) {
        this.interfaceFileHeader = value;
    }

    /**
     * Gets the value of the fixedPenaltyNoticeSummonsAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyNoticeSummonsAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyNoticeSummonsAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltyNoticeSummonsAllocationV20CT }
     * 
     * 
     */
    public List<FixedPenaltyNoticeSummonsAllocationV20CT> getFixedPenaltyNoticeSummonsAllocation() {
        if (fixedPenaltyNoticeSummonsAllocation == null) {
            fixedPenaltyNoticeSummonsAllocation = new ArrayList<FixedPenaltyNoticeSummonsAllocationV20CT>();
        }
        return this.fixedPenaltyNoticeSummonsAllocation;
    }

    /**
     * Gets the value of the fixedPenaltyNoticeOfOrderCourtResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyNoticeOfOrderCourtResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyNoticeOfOrderCourtResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltyNoticeOfOrderCourtResultV20CT }
     * 
     * 
     */
    public List<FixedPenaltyNoticeOfOrderCourtResultV20CT> getFixedPenaltyNoticeOfOrderCourtResult() {
        if (fixedPenaltyNoticeOfOrderCourtResult == null) {
            fixedPenaltyNoticeOfOrderCourtResult = new ArrayList<FixedPenaltyNoticeOfOrderCourtResultV20CT>();
        }
        return this.fixedPenaltyNoticeOfOrderCourtResult;
    }

    /**
     * Gets the value of the fixedPenaltySummonsCourtResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltySummonsCourtResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltySummonsCourtResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltySummonsCourtResultV20CT }
     * 
     * 
     */
    public List<FixedPenaltySummonsCourtResultV20CT> getFixedPenaltySummonsCourtResult() {
        if (fixedPenaltySummonsCourtResult == null) {
            fixedPenaltySummonsCourtResult = new ArrayList<FixedPenaltySummonsCourtResultV20CT>();
        }
        return this.fixedPenaltySummonsCourtResult;
    }

    /**
     * Gets the value of the fixedPenaltyWitnessSummonsAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyWitnessSummonsAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyWitnessSummonsAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WitnessSummonsAllocationV20CT }
     * 
     * 
     */
    public List<WitnessSummonsAllocationV20CT> getFixedPenaltyWitnessSummonsAllocation() {
        if (fixedPenaltyWitnessSummonsAllocation == null) {
            fixedPenaltyWitnessSummonsAllocation = new ArrayList<WitnessSummonsAllocationV20CT>();
        }
        return this.fixedPenaltyWitnessSummonsAllocation;
    }

    /**
     * Gets the value of the appealReviewGrant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appealReviewGrant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppealReviewGrant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppealReviewGrantV20CT }
     * 
     * 
     */
    public List<AppealReviewGrantV20CT> getAppealReviewGrant() {
        if (appealReviewGrant == null) {
            appealReviewGrant = new ArrayList<AppealReviewGrantV20CT>();
        }
        return this.appealReviewGrant;
    }

    /**
     * Gets the value of the warrantStatusChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantStatusChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantStatusChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantStatusChangeV20CT }
     * 
     * 
     */
    public List<WarrantStatusChangeV20CT> getWarrantStatusChange() {
        if (warrantStatusChange == null) {
            warrantStatusChange = new ArrayList<WarrantStatusChangeV20CT>();
        }
        return this.warrantStatusChange;
    }

    /**
     * Gets the value of the courtPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courtPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourtPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourtPaymentV20CT }
     * 
     * 
     */
    public List<CourtPaymentV20CT> getCourtPayment() {
        if (courtPayment == null) {
            courtPayment = new ArrayList<CourtPaymentV20CT>();
        }
        return this.courtPayment;
    }

    /**
     * Gets the value of the fixedPenaltyDistressWarrantAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyDistressWarrantAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyDistressWarrantAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltyDistressWarrantAllocationV20CT }
     * 
     * 
     */
    public List<FixedPenaltyDistressWarrantAllocationV20CT> getFixedPenaltyDistressWarrantAllocation() {
        if (fixedPenaltyDistressWarrantAllocation == null) {
            fixedPenaltyDistressWarrantAllocation = new ArrayList<FixedPenaltyDistressWarrantAllocationV20CT>();
        }
        return this.fixedPenaltyDistressWarrantAllocation;
    }

    /**
     * Gets the value of the fixedPenaltyDistressWarrantStatusChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyDistressWarrantStatusChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyDistressWarrantStatusChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltyDistressWarrantStatusChangeV20CT }
     * 
     * 
     */
    public List<FixedPenaltyDistressWarrantStatusChangeV20CT> getFixedPenaltyDistressWarrantStatusChange() {
        if (fixedPenaltyDistressWarrantStatusChange == null) {
            fixedPenaltyDistressWarrantStatusChange = new ArrayList<FixedPenaltyDistressWarrantStatusChangeV20CT>();
        }
        return this.fixedPenaltyDistressWarrantStatusChange;
    }

    /**
     * Gets the value of the fixedPenaltyDistressWarrantCourtPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyDistressWarrantCourtPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyDistressWarrantCourtPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltyDistressWarrantCourtPaymentV20CT }
     * 
     * 
     */
    public List<FixedPenaltyDistressWarrantCourtPaymentV20CT> getFixedPenaltyDistressWarrantCourtPayment() {
        if (fixedPenaltyDistressWarrantCourtPayment == null) {
            fixedPenaltyDistressWarrantCourtPayment = new ArrayList<FixedPenaltyDistressWarrantCourtPaymentV20CT>();
        }
        return this.fixedPenaltyDistressWarrantCourtPayment;
    }

    /**
     * Gets the value of the nextHearing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextHearing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextHearing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextHearingV20CT }
     * 
     * 
     */
    public List<NextHearingV20CT> getNextHearing() {
        if (nextHearing == null) {
            nextHearing = new ArrayList<NextHearingV20CT>();
        }
        return this.nextHearing;
    }

    /**
     * Gets the value of the publicPaymentTransactionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicPaymentTransactionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicPaymentTransactionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicPaymentTransactionNumberV10CT }
     * 
     * 
     */
    public List<PublicPaymentTransactionNumberV10CT> getPublicPaymentTransactionNumber() {
        if (publicPaymentTransactionNumber == null) {
            publicPaymentTransactionNumber = new ArrayList<PublicPaymentTransactionNumberV10CT>();
        }
        return this.publicPaymentTransactionNumber;
    }

    /**
     * Gets the value of the caseDocumentAcknowledgement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseDocumentAcknowledgement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseDocumentAcknowledgement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseDocumentAcknowledgementV10CT }
     * 
     * 
     */
    public List<CaseDocumentAcknowledgementV10CT> getCaseDocumentAcknowledgement() {
        if (caseDocumentAcknowledgement == null) {
            caseDocumentAcknowledgement = new ArrayList<CaseDocumentAcknowledgementV10CT>();
        }
        return this.caseDocumentAcknowledgement;
    }

    /**
     * Gets the value of the courtDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courtDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourtDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourtDocumentV10CT }
     * 
     * 
     */
    public List<CourtDocumentV10CT> getCourtDocument() {
        if (courtDocument == null) {
            courtDocument = new ArrayList<CourtDocumentV10CT>();
        }
        return this.courtDocument;
    }

}
