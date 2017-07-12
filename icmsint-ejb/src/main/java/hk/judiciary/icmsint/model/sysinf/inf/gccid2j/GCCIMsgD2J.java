//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 04:51:00 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gccid2j;

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
 *           &lt;element name="ChargeCase" type="{}ChargeCase.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="CaseDocument" type="{}CaseDocument.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="ChargeCaseAmendment" type="{}ChargeCaseAmendment.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="WitnessSummonsApplication" type="{}WitnessSummonsApplication.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="BailRegister" type="{}BailRegister.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "chargeCase",
    "caseDocument",
    "chargeCaseAmendment",
    "witnessSummonsApplication",
    "bailRegister"
})
@XmlRootElement(name = "GCCIMsgD2J")
public class GCCIMsgD2J {

    @XmlElement(name = "InterfaceFileHeader", required = true)
    protected InterfaceFileHeaderV13CT interfaceFileHeader;
    @XmlElement(name = "ChargeCase")
    protected List<ChargeCaseV10CT> chargeCase;
    @XmlElement(name = "CaseDocument")
    protected List<CaseDocumentV10CT> caseDocument;
    @XmlElement(name = "ChargeCaseAmendment")
    protected List<ChargeCaseAmendmentV10CT> chargeCaseAmendment;
    @XmlElement(name = "WitnessSummonsApplication")
    protected List<WitnessSummonsApplicationV20CT> witnessSummonsApplication;
    @XmlElement(name = "BailRegister")
    protected List<BailRegisterV10CT> bailRegister;

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
     * Gets the value of the chargeCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeCaseV10CT }
     * 
     * 
     */
    public List<ChargeCaseV10CT> getChargeCase() {
        if (chargeCase == null) {
            chargeCase = new ArrayList<ChargeCaseV10CT>();
        }
        return this.chargeCase;
    }

    /**
     * Gets the value of the caseDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseDocumentV10CT }
     * 
     * 
     */
    public List<CaseDocumentV10CT> getCaseDocument() {
        if (caseDocument == null) {
            caseDocument = new ArrayList<CaseDocumentV10CT>();
        }
        return this.caseDocument;
    }

    /**
     * Gets the value of the chargeCaseAmendment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeCaseAmendment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeCaseAmendment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeCaseAmendmentV10CT }
     * 
     * 
     */
    public List<ChargeCaseAmendmentV10CT> getChargeCaseAmendment() {
        if (chargeCaseAmendment == null) {
            chargeCaseAmendment = new ArrayList<ChargeCaseAmendmentV10CT>();
        }
        return this.chargeCaseAmendment;
    }

    /**
     * Gets the value of the witnessSummonsApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the witnessSummonsApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWitnessSummonsApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WitnessSummonsApplicationV20CT }
     * 
     * 
     */
    public List<WitnessSummonsApplicationV20CT> getWitnessSummonsApplication() {
        if (witnessSummonsApplication == null) {
            witnessSummonsApplication = new ArrayList<WitnessSummonsApplicationV20CT>();
        }
        return this.witnessSummonsApplication;
    }

    /**
     * Gets the value of the bailRegister property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bailRegister property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBailRegister().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BailRegisterV10CT }
     * 
     * 
     */
    public List<BailRegisterV10CT> getBailRegister() {
        if (bailRegister == null) {
            bailRegister = new ArrayList<BailRegisterV10CT>();
        }
        return this.bailRegister;
    }

}