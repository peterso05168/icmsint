//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 05:38:22 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterfaceFileHeader" type="{}InterfaceFileHeader.V1.3.CT"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="NoticeOfOrderAllocation" type="{}NoticeOfOrderAllocation.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="NoticeOfOrderHearingResult" type="{}HearingResult.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="SummonsAllocation" type="{}SummonsAllocation.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="SummonsHearingResult" type="{}HearingResult.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="AppealReviewGrant" type="{}AppealReviewGrant.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="WarrantStatusChange" type="{}WarrantStatusChange.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="WitnessSummonsAllocation" type="{}WitnessSummonsAllocation.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="NextHearing" type="{}NextHearing.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="ReServiceResult" type="{}ReServiceResult.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="CourtPayment" type="{}CourtPayment.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="SODApplicationResult" type="{}SODApplicationResult.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="CaseDocumentAcknowledgement" type="{}CaseDocumentAcknowledgement.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="CourtDocument" type="{}CourtDocument.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="SODDetailsUpdate" type="{}SODDetailsUpdate.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "interfaceFileHeader",
    "noticeOfOrderAllocation",
    "noticeOfOrderHearingResult",
    "summonsAllocation",
    "summonsHearingResult",
    "appealReviewGrant",
    "warrantStatusChange",
    "witnessSummonsAllocation",
    "nextHearing",
    "reServiceResult",
    "courtPayment",
    "sodApplicationResult",
    "caseDocumentAcknowledgement",
    "courtDocument",
    "sodDetailsUpdate"
})
@XmlRootElement(name = "GDSNIMsgJ2D")
public class GDSNIMsgJ2D {

    @XmlElement(name = "InterfaceFileHeader", required = true)
    protected InterfaceFileHeaderV13CT interfaceFileHeader;
    @XmlElement(name = "NoticeOfOrderAllocation")
    protected List<NoticeOfOrderAllocationV20CT> noticeOfOrderAllocation;
    @XmlElement(name = "NoticeOfOrderHearingResult")
    protected List<HearingResultV20CT> noticeOfOrderHearingResult;
    @XmlElement(name = "SummonsAllocation")
    protected List<SummonsAllocationV20CT> summonsAllocation;
    @XmlElement(name = "SummonsHearingResult")
    protected List<HearingResultV20CT> summonsHearingResult;
    @XmlElement(name = "AppealReviewGrant")
    protected List<AppealReviewGrantV20CT> appealReviewGrant;
    @XmlElement(name = "WarrantStatusChange")
    protected List<WarrantStatusChangeV20CT> warrantStatusChange;
    @XmlElement(name = "WitnessSummonsAllocation")
    protected List<WitnessSummonsAllocationV20CT> witnessSummonsAllocation;
    @XmlElement(name = "NextHearing")
    protected List<NextHearingV20CT> nextHearing;
    @XmlElement(name = "ReServiceResult")
    protected List<ReServiceResultV20CT> reServiceResult;
    @XmlElement(name = "CourtPayment")
    protected List<CourtPaymentV20CT> courtPayment;
    @XmlElement(name = "SODApplicationResult")
    protected List<SODApplicationResultV20CT> sodApplicationResult;
    @XmlElement(name = "CaseDocumentAcknowledgement")
    protected List<CaseDocumentAcknowledgementV10CT> caseDocumentAcknowledgement;
    @XmlElement(name = "CourtDocument")
    protected List<CourtDocumentV10CT> courtDocument;
    @XmlElement(name = "SODDetailsUpdate")
    protected List<SODDetailsUpdateV20CT> sodDetailsUpdate;

    /**
     * Gets the value of the interfaceFileHeader property.
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
     * Sets the value of the interfaceFileHeader property.
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
     * Gets the value of the noticeOfOrderAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeOfOrderAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeOfOrderAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoticeOfOrderAllocationV20CT }
     * 
     * 
     */
    public List<NoticeOfOrderAllocationV20CT> getNoticeOfOrderAllocation() {
        if (noticeOfOrderAllocation == null) {
            noticeOfOrderAllocation = new ArrayList<NoticeOfOrderAllocationV20CT>();
        }
        return this.noticeOfOrderAllocation;
    }

    /**
     * Gets the value of the noticeOfOrderHearingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeOfOrderHearingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeOfOrderHearingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HearingResultV20CT }
     * 
     * 
     */
    public List<HearingResultV20CT> getNoticeOfOrderHearingResult() {
        if (noticeOfOrderHearingResult == null) {
            noticeOfOrderHearingResult = new ArrayList<HearingResultV20CT>();
        }
        return this.noticeOfOrderHearingResult;
    }

    /**
     * Gets the value of the summonsAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summonsAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummonsAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummonsAllocationV20CT }
     * 
     * 
     */
    public List<SummonsAllocationV20CT> getSummonsAllocation() {
        if (summonsAllocation == null) {
            summonsAllocation = new ArrayList<SummonsAllocationV20CT>();
        }
        return this.summonsAllocation;
    }

    /**
     * Gets the value of the summonsHearingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summonsHearingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummonsHearingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HearingResultV20CT }
     * 
     * 
     */
    public List<HearingResultV20CT> getSummonsHearingResult() {
        if (summonsHearingResult == null) {
            summonsHearingResult = new ArrayList<HearingResultV20CT>();
        }
        return this.summonsHearingResult;
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
     * Gets the value of the witnessSummonsAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the witnessSummonsAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWitnessSummonsAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WitnessSummonsAllocationV20CT }
     * 
     * 
     */
    public List<WitnessSummonsAllocationV20CT> getWitnessSummonsAllocation() {
        if (witnessSummonsAllocation == null) {
            witnessSummonsAllocation = new ArrayList<WitnessSummonsAllocationV20CT>();
        }
        return this.witnessSummonsAllocation;
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
     * Gets the value of the reServiceResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reServiceResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReServiceResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReServiceResultV20CT }
     * 
     * 
     */
    public List<ReServiceResultV20CT> getReServiceResult() {
        if (reServiceResult == null) {
            reServiceResult = new ArrayList<ReServiceResultV20CT>();
        }
        return this.reServiceResult;
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
     * Gets the value of the sodApplicationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sodApplicationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSODApplicationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SODApplicationResultV20CT }
     * 
     * 
     */
    public List<SODApplicationResultV20CT> getSODApplicationResult() {
        if (sodApplicationResult == null) {
            sodApplicationResult = new ArrayList<SODApplicationResultV20CT>();
        }
        return this.sodApplicationResult;
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

    /**
     * Gets the value of the sodDetailsUpdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sodDetailsUpdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSODDetailsUpdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SODDetailsUpdateV20CT }
     * 
     * 
     */
    public List<SODDetailsUpdateV20CT> getSODDetailsUpdate() {
        if (sodDetailsUpdate == null) {
            sodDetailsUpdate = new ArrayList<SODDetailsUpdateV20CT>();
        }
        return this.sodDetailsUpdate;
    }

}
