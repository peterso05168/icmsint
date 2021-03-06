//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:47:35 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccij2d;

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
 *           &lt;element name="ChargeCaseAllocation" type="{}ChargeCaseAllocation.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="CaseDocumentAcknowledgement" type="{}CaseDocumentAcknowledgement.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="ChargeCaseAmendmentResult" type="{}ChargeCaseAmendmentResult.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="ChargeCaseCourtResult" type="{}ChargeCaseHearingResult.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="NextHearing" type="{}NextHearing.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="WitnessSummonsAllocation" type="{}WitnessSummonsAllocation.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="CourtDocument" type="{}CourtDocument.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "chargeCaseAllocation",
    "caseDocumentAcknowledgement",
    "chargeCaseAmendmentResult",
    "chargeCaseCourtResult",
    "nextHearing",
    "witnessSummonsAllocation",
    "courtDocument"
})
@XmlRootElement(name = "GCCIMsgJ2D")
public class GCCIMsgJ2D {

    @XmlElement(name = "InterfaceFileHeader", required = true)
    protected InterfaceFileHeaderV13CT interfaceFileHeader;
    @XmlElement(name = "ChargeCaseAllocation")
    protected List<ChargeCaseAllocationV10CT> chargeCaseAllocation;
    @XmlElement(name = "CaseDocumentAcknowledgement")
    protected List<CaseDocumentAcknowledgementV10CT> caseDocumentAcknowledgement;
    @XmlElement(name = "ChargeCaseAmendmentResult")
    protected List<ChargeCaseAmendmentResultV10CT> chargeCaseAmendmentResult;
    @XmlElement(name = "ChargeCaseCourtResult")
    protected List<ChargeCaseHearingResultV10CT> chargeCaseCourtResult;
    @XmlElement(name = "NextHearing")
    protected List<NextHearingV20CT> nextHearing;
    @XmlElement(name = "WitnessSummonsAllocation")
    protected List<WitnessSummonsAllocationV20CT> witnessSummonsAllocation;
    @XmlElement(name = "CourtDocument")
    protected List<CourtDocumentV10CT> courtDocument;

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
     * Gets the value of the chargeCaseAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeCaseAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeCaseAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeCaseAllocationV10CT }
     * 
     * 
     */
    public List<ChargeCaseAllocationV10CT> getChargeCaseAllocation() {
        if (chargeCaseAllocation == null) {
            chargeCaseAllocation = new ArrayList<ChargeCaseAllocationV10CT>();
        }
        return this.chargeCaseAllocation;
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
     * Gets the value of the chargeCaseAmendmentResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeCaseAmendmentResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeCaseAmendmentResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeCaseAmendmentResultV10CT }
     * 
     * 
     */
    public List<ChargeCaseAmendmentResultV10CT> getChargeCaseAmendmentResult() {
        if (chargeCaseAmendmentResult == null) {
            chargeCaseAmendmentResult = new ArrayList<ChargeCaseAmendmentResultV10CT>();
        }
        return this.chargeCaseAmendmentResult;
    }

    /**
     * Gets the value of the chargeCaseCourtResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeCaseCourtResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeCaseCourtResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeCaseHearingResultV10CT }
     * 
     * 
     */
    public List<ChargeCaseHearingResultV10CT> getChargeCaseCourtResult() {
        if (chargeCaseCourtResult == null) {
            chargeCaseCourtResult = new ArrayList<ChargeCaseHearingResultV10CT>();
        }
        return this.chargeCaseCourtResult;
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
