//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.11 时间 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

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
 * <p>WarrantStatusChange.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WarrantStatusChange.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;extension base="{}Case.V1.0.CT">
 *       &lt;sequence>
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.0.CT"/>
 *         &lt;element name="RecordSequenceNumber" type="{}RecordSequenceNumber.V1.0.CT"/>
 *         &lt;element name="WarrantStatus" type="{}WarrantStatus.V1.0.CT"/>
 *         &lt;element name="WarrantIssueDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="WarrantWritNumber" type="{}WarrantWritNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CommittalWritNumber" type="{}CommittalWritNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="RecordStatus" type="{}RecordStatus.V1.0.CT"/>
 *         &lt;element name="RollbackFromState" type="{}RollbackFromState.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="RollbackToState" type="{}RollbackToState.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * 获取recordPrefix属性的值。
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
     * 设置recordPrefix属性的值。
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
     * 获取recordSequenceNumber属性的值。
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
     * 设置recordSequenceNumber属性的值。
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
     * 获取warrantStatus属性的值。
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
     * 设置warrantStatus属性的值。
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
     * 获取warrantIssueDate属性的值。
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
     * 设置warrantIssueDate属性的值。
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
     * 获取warrantWritNumber属性的值。
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
     * 设置warrantWritNumber属性的值。
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
     * 获取committalWritNumber属性的值。
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
     * 设置committalWritNumber属性的值。
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
     * 获取recordStatus属性的值。
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
     * 设置recordStatus属性的值。
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
     * 获取rollbackFromState属性的值。
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
     * 设置rollbackFromState属性的值。
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
     * 获取rollbackToState属性的值。
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
     * 设置rollbackToState属性的值。
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
     * 获取interfaceID属性的值。
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
     * 设置interfaceID属性的值。
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
