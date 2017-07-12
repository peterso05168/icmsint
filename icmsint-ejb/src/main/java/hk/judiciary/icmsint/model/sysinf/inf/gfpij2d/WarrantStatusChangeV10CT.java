//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
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
 * <p>WarrantStatusChange.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrecordPrefix���Ե�ֵ��
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
     * ����recordPrefix���Ե�ֵ��
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
     * ��ȡrecordSequenceNumber���Ե�ֵ��
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
     * ����recordSequenceNumber���Ե�ֵ��
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
     * ��ȡwarrantStatus���Ե�ֵ��
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
     * ����warrantStatus���Ե�ֵ��
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
     * ��ȡwarrantIssueDate���Ե�ֵ��
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
     * ����warrantIssueDate���Ե�ֵ��
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
     * ��ȡwarrantWritNumber���Ե�ֵ��
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
     * ����warrantWritNumber���Ե�ֵ��
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
     * ��ȡcommittalWritNumber���Ե�ֵ��
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
     * ����committalWritNumber���Ե�ֵ��
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
     * ��ȡrecordStatus���Ե�ֵ��
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
     * ����recordStatus���Ե�ֵ��
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
     * ��ȡrollbackFromState���Ե�ֵ��
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
     * ����rollbackFromState���Ե�ֵ��
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
     * ��ȡrollbackToState���Ե�ֵ��
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
     * ����rollbackToState���Ե�ֵ��
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
     * ��ȡinterfaceID���Ե�ֵ��
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
     * ����interfaceID���Ե�ֵ��
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
