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
import javax.xml.bind.annotation.XmlType;


/**
 * bail (Pol.458) details consists of 
 *                                a) PD Station
 *                                b) Bail Register Number (Pol.458 no.)
 *                                c) PD Station Sub-total
 *                                d) Consolidated Report Sub-total
 *                                e) Bail (Pol.40) Data Object
 * 			
 * 
 * <p>Java class for BailPol458.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BailPol458.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PDStation" type="{}ProsecutionDepartmentStation.V1.0.CT"/&gt;
 *         &lt;element name="BailRegisterNumber" type="{}BailRegisterNumber.V1.0.CT"/&gt;
 *         &lt;element name="PDStationSubTotal" type="{}Amount.V1.0.CT"/&gt;
 *         &lt;element name="ConsolidatedReportSubTotal" type="{}Amount.V1.0.CT"/&gt;
 *         &lt;element name="BailPol40" type="{}BailPol40.V1.0.CT" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BailPol458.V1.0.CT", propOrder = {
    "pdStation",
    "bailRegisterNumber",
    "pdStationSubTotal",
    "consolidatedReportSubTotal",
    "bailPol40"
})
public class BailPol458V10CT {

    @XmlElement(name = "PDStation", required = true)
    protected ProsecutionDepartmentStationV10CT pdStation;
    @XmlElement(name = "BailRegisterNumber", required = true)
    protected BailRegisterNumberV10CT bailRegisterNumber;
    @XmlElement(name = "PDStationSubTotal", required = true)
    protected AmountV10CT pdStationSubTotal;
    @XmlElement(name = "ConsolidatedReportSubTotal", required = true)
    protected AmountV10CT consolidatedReportSubTotal;
    @XmlElement(name = "BailPol40", required = true)
    protected List<BailPol40V10CT> bailPol40;

    /**
     * Gets the value of the pdStation property.
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentStationV10CT }
     *     
     */
    public ProsecutionDepartmentStationV10CT getPDStation() {
        return pdStation;
    }

    /**
     * Sets the value of the pdStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentStationV10CT }
     *     
     */
    public void setPDStation(ProsecutionDepartmentStationV10CT value) {
        this.pdStation = value;
    }

    /**
     * Gets the value of the bailRegisterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BailRegisterNumberV10CT }
     *     
     */
    public BailRegisterNumberV10CT getBailRegisterNumber() {
        return bailRegisterNumber;
    }

    /**
     * Sets the value of the bailRegisterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BailRegisterNumberV10CT }
     *     
     */
    public void setBailRegisterNumber(BailRegisterNumberV10CT value) {
        this.bailRegisterNumber = value;
    }

    /**
     * Gets the value of the pdStationSubTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getPDStationSubTotal() {
        return pdStationSubTotal;
    }

    /**
     * Sets the value of the pdStationSubTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setPDStationSubTotal(AmountV10CT value) {
        this.pdStationSubTotal = value;
    }

    /**
     * Gets the value of the consolidatedReportSubTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getConsolidatedReportSubTotal() {
        return consolidatedReportSubTotal;
    }

    /**
     * Sets the value of the consolidatedReportSubTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setConsolidatedReportSubTotal(AmountV10CT value) {
        this.consolidatedReportSubTotal = value;
    }

    /**
     * Gets the value of the bailPol40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bailPol40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBailPol40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BailPol40V10CT }
     * 
     * 
     */
    public List<BailPol40V10CT> getBailPol40() {
        if (bailPol40 == null) {
            bailPol40 = new ArrayList<BailPol40V10CT>();
        }
        return this.bailPol40;
    }

}
