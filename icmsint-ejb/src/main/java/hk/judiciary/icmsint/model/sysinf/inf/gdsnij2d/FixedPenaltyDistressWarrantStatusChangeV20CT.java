//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 05:38:22 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Distress warrant status change details consists of
 * 				a) Record Prefix
 * 				b) Department Reference Number
 * 				c) Distress Warrant Case Number Object
 * 				d) Case Sequence Number in a batch
 * 				e) Distress Warrant Status
 * 				f) Distress Warrant Issue Date
 * 				g) Record Status
 * 				h) Distress Warrant Costs
 * 				i) Rollback from state
 * 				j) Rollack to state 
 *             
 * 
 * <p>Java class for FixedPenaltyDistressWarrantStatusChange.V2.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPenaltyDistressWarrantStatusChange.V2.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.3.CT"/&gt;
 *         &lt;element name="DepartmentReferenceNumber" type="{}DepartmentReferenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="DistressWarrantNumber" type="{}CaseNumber.V1.0.CT"/&gt;
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="DistressWarrantStatus" type="{}WarrantStatus.V1.1.CT"/&gt;
 *         &lt;element name="DistressWarrantIssueDate" type="{CCT}Date.CT" minOccurs="0"/&gt;
 *         &lt;element name="DistressWarrantCosts" type="{}Amount.V1.1.CT" minOccurs="0"/&gt;
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.2.CT"/&gt;
 *         &lt;element name="RollbackFromState" type="{}WarrantStatus.V1.1.CT" minOccurs="0"/&gt;
 *         &lt;element name="RollbackToState" type="{}WarrantStatus.V1.1.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPenaltyDistressWarrantStatusChange.V2.0.CT", propOrder = {
    "recordPrefix",
    "departmentReferenceNumber",
    "distressWarrantNumber",
    "recordSequenceNumber",
    "distressWarrantStatus",
    "distressWarrantIssueDate",
    "distressWarrantCosts",
    "recordStatus",
    "rollbackFromState",
    "rollbackToState"
})
public class FixedPenaltyDistressWarrantStatusChangeV20CT {

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV13CT recordPrefix;
    @XmlElement(name = "DepartmentReferenceNumber", required = true)
    protected DepartmentReferenceNumberV10CT departmentReferenceNumber;
    @XmlElement(name = "DistressWarrantNumber", required = true)
    protected CaseNumberV10CT distressWarrantNumber;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "DistressWarrantStatus", required = true)
    protected WarrantStatusV11CT distressWarrantStatus;
    @XmlElement(name = "DistressWarrantIssueDate")
    protected DateCT distressWarrantIssueDate;
    @XmlElement(name = "DistressWarrantCosts")
    protected AmountV11CT distressWarrantCosts;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV12CT recordStatus;
    @XmlElement(name = "RollbackFromState")
    protected WarrantStatusV11CT rollbackFromState;
    @XmlElement(name = "RollbackToState")
    protected WarrantStatusV11CT rollbackToState;

    /**
     * Gets the value of the recordPrefix property.
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
     * Sets the value of the recordPrefix property.
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
     * Gets the value of the departmentReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public DepartmentReferenceNumberV10CT getDepartmentReferenceNumber() {
        return departmentReferenceNumber;
    }

    /**
     * Sets the value of the departmentReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentReferenceNumberV10CT }
     *     
     */
    public void setDepartmentReferenceNumber(DepartmentReferenceNumberV10CT value) {
        this.departmentReferenceNumber = value;
    }

    /**
     * Gets the value of the distressWarrantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public CaseNumberV10CT getDistressWarrantNumber() {
        return distressWarrantNumber;
    }

    /**
     * Sets the value of the distressWarrantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseNumberV10CT }
     *     
     */
    public void setDistressWarrantNumber(CaseNumberV10CT value) {
        this.distressWarrantNumber = value;
    }

    /**
     * Gets the value of the recordSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public RecordSequenceNumberV10CT getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * Sets the value of the recordSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordSequenceNumberV10CT }
     *     
     */
    public void setRecordSequenceNumber(RecordSequenceNumberV10CT value) {
        this.recordSequenceNumber = value;
    }

    /**
     * Gets the value of the distressWarrantStatus property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public WarrantStatusV11CT getDistressWarrantStatus() {
        return distressWarrantStatus;
    }

    /**
     * Sets the value of the distressWarrantStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public void setDistressWarrantStatus(WarrantStatusV11CT value) {
        this.distressWarrantStatus = value;
    }

    /**
     * Gets the value of the distressWarrantIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getDistressWarrantIssueDate() {
        return distressWarrantIssueDate;
    }

    /**
     * Sets the value of the distressWarrantIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setDistressWarrantIssueDate(DateCT value) {
        this.distressWarrantIssueDate = value;
    }

    /**
     * Gets the value of the distressWarrantCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountV11CT }
     *     
     */
    public AmountV11CT getDistressWarrantCosts() {
        return distressWarrantCosts;
    }

    /**
     * Sets the value of the distressWarrantCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV11CT }
     *     
     */
    public void setDistressWarrantCosts(AmountV11CT value) {
        this.distressWarrantCosts = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordStatusV12CT }
     *     
     */
    public RecordStatusV12CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV12CT }
     *     
     */
    public void setRecordStatus(RecordStatusV12CT value) {
        this.recordStatus = value;
    }

    /**
     * Gets the value of the rollbackFromState property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public WarrantStatusV11CT getRollbackFromState() {
        return rollbackFromState;
    }

    /**
     * Sets the value of the rollbackFromState property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public void setRollbackFromState(WarrantStatusV11CT value) {
        this.rollbackFromState = value;
    }

    /**
     * Gets the value of the rollbackToState property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public WarrantStatusV11CT getRollbackToState() {
        return rollbackToState;
    }

    /**
     * Sets the value of the rollbackToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusV11CT }
     *     
     */
    public void setRollbackToState(WarrantStatusV11CT value) {
        this.rollbackToState = value;
    }

}
