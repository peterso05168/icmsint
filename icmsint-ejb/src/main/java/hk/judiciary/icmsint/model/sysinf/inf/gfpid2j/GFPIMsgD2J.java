//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

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
 *           &lt;element name="FixedPenaltyNoticeOfOrder" type="{}FixedPenaltyNoticeOfOrder.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltySummons" type="{}FixedPenaltySummons.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltyWitnessSummonsApplication" type="{}WitnessSummonsApplication.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="FixedPenaltyDistressWarrantApplication" type="{}FixedPenaltyDistressWarrantApplication.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="DefendantAddressApplication" type="{}DefendantAddressApplication.V2.0.CT" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="CaseDocument" type="{}CaseDocument.V1.0.CT" maxOccurs="unbounded" minOccurs="0"/>
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
    "fixedPenaltyNoticeOfOrder",
    "fixedPenaltySummons",
    "fixedPenaltyWitnessSummonsApplication",
    "fixedPenaltyDistressWarrantApplication",
    "defendantAddressApplication",
    "caseDocument"
})
@XmlRootElement(name = "GFPIMsgD2J")
public class GFPIMsgD2J {

    @XmlElement(name = "InterfaceFileHeader", required = true)
    protected InterfaceFileHeaderV13CT interfaceFileHeader;
    @XmlElement(name = "FixedPenaltyNoticeOfOrder")
    protected List<FixedPenaltyNoticeOfOrderV20CT> fixedPenaltyNoticeOfOrder;
    @XmlElement(name = "FixedPenaltySummons")
    protected List<FixedPenaltySummonsV20CT> fixedPenaltySummons;
    @XmlElement(name = "FixedPenaltyWitnessSummonsApplication")
    protected List<WitnessSummonsApplicationV20CT> fixedPenaltyWitnessSummonsApplication;
    @XmlElement(name = "FixedPenaltyDistressWarrantApplication")
    protected List<FixedPenaltyDistressWarrantApplicationV20CT> fixedPenaltyDistressWarrantApplication;
    @XmlElement(name = "DefendantAddressApplication")
    protected List<DefendantAddressApplicationV20CT> defendantAddressApplication;
    @XmlElement(name = "CaseDocument")
    protected List<CaseDocumentV10CT> caseDocument;

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
     * Gets the value of the fixedPenaltyNoticeOfOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyNoticeOfOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyNoticeOfOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltyNoticeOfOrderV20CT }
     * 
     * 
     */
    public List<FixedPenaltyNoticeOfOrderV20CT> getFixedPenaltyNoticeOfOrder() {
        if (fixedPenaltyNoticeOfOrder == null) {
            fixedPenaltyNoticeOfOrder = new ArrayList<FixedPenaltyNoticeOfOrderV20CT>();
        }
        return this.fixedPenaltyNoticeOfOrder;
    }

    /**
     * Gets the value of the fixedPenaltySummons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltySummons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltySummons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltySummonsV20CT }
     * 
     * 
     */
    public List<FixedPenaltySummonsV20CT> getFixedPenaltySummons() {
        if (fixedPenaltySummons == null) {
            fixedPenaltySummons = new ArrayList<FixedPenaltySummonsV20CT>();
        }
        return this.fixedPenaltySummons;
    }

    /**
     * Gets the value of the fixedPenaltyWitnessSummonsApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyWitnessSummonsApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyWitnessSummonsApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WitnessSummonsApplicationV20CT }
     * 
     * 
     */
    public List<WitnessSummonsApplicationV20CT> getFixedPenaltyWitnessSummonsApplication() {
        if (fixedPenaltyWitnessSummonsApplication == null) {
            fixedPenaltyWitnessSummonsApplication = new ArrayList<WitnessSummonsApplicationV20CT>();
        }
        return this.fixedPenaltyWitnessSummonsApplication;
    }

    /**
     * Gets the value of the fixedPenaltyDistressWarrantApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPenaltyDistressWarrantApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPenaltyDistressWarrantApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPenaltyDistressWarrantApplicationV20CT }
     * 
     * 
     */
    public List<FixedPenaltyDistressWarrantApplicationV20CT> getFixedPenaltyDistressWarrantApplication() {
        if (fixedPenaltyDistressWarrantApplication == null) {
            fixedPenaltyDistressWarrantApplication = new ArrayList<FixedPenaltyDistressWarrantApplicationV20CT>();
        }
        return this.fixedPenaltyDistressWarrantApplication;
    }

    /**
     * Gets the value of the defendantAddressApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defendantAddressApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefendantAddressApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefendantAddressApplicationV20CT }
     * 
     * 
     */
    public List<DefendantAddressApplicationV20CT> getDefendantAddressApplication() {
        if (defendantAddressApplication == null) {
            defendantAddressApplication = new ArrayList<DefendantAddressApplicationV20CT>();
        }
        return this.defendantAddressApplication;
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

}
