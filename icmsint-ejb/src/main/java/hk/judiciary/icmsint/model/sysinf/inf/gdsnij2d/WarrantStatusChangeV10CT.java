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
 * 	Non-Payment/Non-Appearance/Committal warrant status change details 
 *             					Derived from Case.V1.0.CT
 * 								Extension consists of
 * 				a) Record Prefix
 * 				b) Record Sequence Number in the given batch                          
 * 				c) Warrant Status                                                   
 * 				d) Warrant Issue Date                                               
 * 				e) Warrant Writ Number (Non-Payment/Non-Appearance warrant only)    
 * 				f) Committal Writ Number (Committal warrant only)                   				                                  
 * 				g) Record Status                                                    
 * 				h) Rollback from state                                              
 * 				i) Rollack to state                                             	
 * 				j) Interface ID				
 *             
 * 
 * <p>Java class for WarrantStatusChange.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantStatusChange.V1.0.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Case.V1.0.CT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/&gt;
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/&gt;
 *         &lt;element name="WarrantStatus" type="{}WarrantStatus.V1.0.CT"/&gt;
 *         &lt;element name="WarrantIssueDate" type="{CCT}Date.CT" minOccurs="0"/&gt;
 *         &lt;element name="WarrantWritNumber" type="{}WarrantWritNumber.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="CommittalWritNumber" type="{}CommittalWritNumber.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.0.CT"/&gt;
 *         &lt;element name="RollbackFromState" type="{}RollbackFromState.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="RollbackToState" type="{}RollbackToState.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarrantStatusChange.V1.0.CT", propOrder = {
    "recordPrefix",
    "recordSequenceNumber",
    "warrantStatus",
    "warrantIssueDate",
    "warrantWritNumber",
    "committalWritNumber",
    "recordStatus",
    "rollbackFromState",
    "rollbackToState",
    "interfaceID"
})
public class WarrantStatusChangeV10CT
    extends CaseV10CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV10CT recordPrefix;
    @XmlElement(name = "RecordSequenceNumber", required = true)
    protected RecordSequenceNumberV10CT recordSequenceNumber;
    @XmlElement(name = "WarrantStatus", required = true)
    protected WarrantStatusV10CT warrantStatus;
    @XmlElement(name = "WarrantIssueDate")
    protected DateCT warrantIssueDate;
    @XmlElement(name = "WarrantWritNumber")
    protected WarrantWritNumberV10CT warrantWritNumber;
    @XmlElement(name = "CommittalWritNumber")
    protected CommittalWritNumberV10CT committalWritNumber;
    @XmlElement(name = "RecordStatus", required = true)
    protected RecordStatusV10CT recordStatus;
    @XmlElement(name = "RollbackFromState")
    protected RollbackFromStateV10CT rollbackFromState;
    @XmlElement(name = "RollbackToState")
    protected RollbackToStateV10CT rollbackToState;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV10CT }
     *     
     */
    public PrefixV10CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV10CT }
     *     
     */
    public void setRecordPrefix(PrefixV10CT value) {
        this.recordPrefix = value;
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
     * Gets the value of the warrantStatus property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantStatusV10CT }
     *     
     */
    public WarrantStatusV10CT getWarrantStatus() {
        return warrantStatus;
    }

    /**
     * Sets the value of the warrantStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStatusV10CT }
     *     
     */
    public void setWarrantStatus(WarrantStatusV10CT value) {
        this.warrantStatus = value;
    }

    /**
     * Gets the value of the warrantIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getWarrantIssueDate() {
        return warrantIssueDate;
    }

    /**
     * Sets the value of the warrantIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setWarrantIssueDate(DateCT value) {
        this.warrantIssueDate = value;
    }

    /**
     * Gets the value of the warrantWritNumber property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantWritNumberV10CT }
     *     
     */
    public WarrantWritNumberV10CT getWarrantWritNumber() {
        return warrantWritNumber;
    }

    /**
     * Sets the value of the warrantWritNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantWritNumberV10CT }
     *     
     */
    public void setWarrantWritNumber(WarrantWritNumberV10CT value) {
        this.warrantWritNumber = value;
    }

    /**
     * Gets the value of the committalWritNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CommittalWritNumberV10CT }
     *     
     */
    public CommittalWritNumberV10CT getCommittalWritNumber() {
        return committalWritNumber;
    }

    /**
     * Sets the value of the committalWritNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommittalWritNumberV10CT }
     *     
     */
    public void setCommittalWritNumber(CommittalWritNumberV10CT value) {
        this.committalWritNumber = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordStatusV10CT }
     *     
     */
    public RecordStatusV10CT getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatusV10CT }
     *     
     */
    public void setRecordStatus(RecordStatusV10CT value) {
        this.recordStatus = value;
    }

    /**
     * Gets the value of the rollbackFromState property.
     * 
     * @return
     *     possible object is
     *     {@link RollbackFromStateV10CT }
     *     
     */
    public RollbackFromStateV10CT getRollbackFromState() {
        return rollbackFromState;
    }

    /**
     * Sets the value of the rollbackFromState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RollbackFromStateV10CT }
     *     
     */
    public void setRollbackFromState(RollbackFromStateV10CT value) {
        this.rollbackFromState = value;
    }

    /**
     * Gets the value of the rollbackToState property.
     * 
     * @return
     *     possible object is
     *     {@link RollbackToStateV10CT }
     *     
     */
    public RollbackToStateV10CT getRollbackToState() {
        return rollbackToState;
    }

    /**
     * Sets the value of the rollbackToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RollbackToStateV10CT }
     *     
     */
    public void setRollbackToState(RollbackToStateV10CT value) {
        this.rollbackToState = value;
    }

    /**
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public InterfaceIDV10CT getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceIDV10CT }
     *     
     */
    public void setInterfaceID(InterfaceIDV10CT value) {
        this.interfaceID = value;
    }

}
