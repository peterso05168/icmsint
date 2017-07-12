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
 * bail/remand details object for charge case 
 *                                consists of
 *                                a) Defendant Sequence Number
 *                                b) Period Type
 *                                c) Bail Form Reference Number (Pol.40 no.)
 *                                d) Surety Sequency Number
 *                                e) Relationship code/free text between defendant and surety
 *                                f) From Date
 *                                g) To Date
 *                                h) Bail Type
 *                                i) Cash Amount
 *                                j) Own/Undertaking Amount
 *                                k) Bail Condition
 *                                l) Report/Remand Location
 *                                m) Report Frequency
 *                                n) Report on Monday Indicator
 *                                o) Report on Tuesday Indicator
 *                                p) Report on Wednesday Indicator
 *                                q) Report on Thursday Indicator
 *                                r) Report on Friday Indicator
 *                                s) Report on Saturday Indicator
 *                                t) Report on Sunday Indicator
 * 			
 * 
 * <p>BailRemand.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BailRemand.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefendantSequenceNumber" type="{}DefendantSequenceNumber.V1.0.CT"/>
 *         &lt;element name="PeriodType" type="{}PeriodType.V1.0.CT"/>
 *         &lt;element name="BailFormReferenceNumber" type="{}BailBookSerialNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="SuretySequenceNumber" type="{}SuretySequenceNumber.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="RelationshipCode" type="{}RelationshipCode.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="RelationshipText" type="{}RelationshipText.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="FromDate" type="{CCT}Date.CT"/>
 *         &lt;element name="ToDate" type="{CCT}Date.CT" minOccurs="0"/>
 *         &lt;element name="BailType" type="{}BailType.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="CashAmount" type="{}Amount.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="OwnUndertakingAmount" type="{}Amount.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="BailCondition" type="{}BailCondition.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportRemandLocation" type="{}ProsecutionDepartmentStation.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportFrequency" type="{}ReportFrequency.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportMondayIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportTuesdayIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportWednesdayIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportThursdayIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportFridayIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportSaturdayIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *         &lt;element name="ReportSundayIndicator" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BailRemand.V1.0.CT", propOrder = {
    "defendantSequenceNumber",
    "periodType",
    "bailFormReferenceNumber",
    "suretySequenceNumber",
    "relationshipCode",
    "relationshipText",
    "fromDate",
    "toDate",
    "bailType",
    "cashAmount",
    "ownUndertakingAmount",
    "bailCondition",
    "reportRemandLocation",
    "reportFrequency",
    "reportMondayIndicator",
    "reportTuesdayIndicator",
    "reportWednesdayIndicator",
    "reportThursdayIndicator",
    "reportFridayIndicator",
    "reportSaturdayIndicator",
    "reportSundayIndicator"
})
public class BailRemandV10CT {

    @XmlElement(name = "DefendantSequenceNumber", required = true)
    protected DefendantSequenceNumberV10CT defendantSequenceNumber;
    @XmlElement(name = "PeriodType", required = true)
    protected PeriodTypeV10CT periodType;
    @XmlElement(name = "BailFormReferenceNumber")
    protected BailBookSerialNumberV10CT bailFormReferenceNumber;
    @XmlElement(name = "SuretySequenceNumber")
    protected SuretySequenceNumberV10CT suretySequenceNumber;
    @XmlElement(name = "RelationshipCode")
    protected RelationshipCodeV10CT relationshipCode;
    @XmlElement(name = "RelationshipText")
    protected RelationshipTextV10CT relationshipText;
    @XmlElement(name = "FromDate", required = true)
    protected DateCT fromDate;
    @XmlElement(name = "ToDate")
    protected DateCT toDate;
    @XmlElement(name = "BailType")
    protected BailTypeV10CT bailType;
    @XmlElement(name = "CashAmount")
    protected AmountV10CT cashAmount;
    @XmlElement(name = "OwnUndertakingAmount")
    protected AmountV10CT ownUndertakingAmount;
    @XmlElement(name = "BailCondition")
    protected BailConditionV10CT bailCondition;
    @XmlElement(name = "ReportRemandLocation")
    protected ProsecutionDepartmentStationV10CT reportRemandLocation;
    @XmlElement(name = "ReportFrequency")
    protected ReportFrequencyV10CT reportFrequency;
    @XmlElement(name = "ReportMondayIndicator")
    protected FieldIndicatorV10CT reportMondayIndicator;
    @XmlElement(name = "ReportTuesdayIndicator")
    protected FieldIndicatorV10CT reportTuesdayIndicator;
    @XmlElement(name = "ReportWednesdayIndicator")
    protected FieldIndicatorV10CT reportWednesdayIndicator;
    @XmlElement(name = "ReportThursdayIndicator")
    protected FieldIndicatorV10CT reportThursdayIndicator;
    @XmlElement(name = "ReportFridayIndicator")
    protected FieldIndicatorV10CT reportFridayIndicator;
    @XmlElement(name = "ReportSaturdayIndicator")
    protected FieldIndicatorV10CT reportSaturdayIndicator;
    @XmlElement(name = "ReportSundayIndicator")
    protected FieldIndicatorV10CT reportSundayIndicator;

    /**
     * 获取defendantSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefendantSequenceNumberV10CT }
     *     
     */
    public DefendantSequenceNumberV10CT getDefendantSequenceNumber() {
        return defendantSequenceNumber;
    }

    /**
     * 设置defendantSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefendantSequenceNumberV10CT }
     *     
     */
    public void setDefendantSequenceNumber(DefendantSequenceNumberV10CT value) {
        this.defendantSequenceNumber = value;
    }

    /**
     * 获取periodType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PeriodTypeV10CT }
     *     
     */
    public PeriodTypeV10CT getPeriodType() {
        return periodType;
    }

    /**
     * 设置periodType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodTypeV10CT }
     *     
     */
    public void setPeriodType(PeriodTypeV10CT value) {
        this.periodType = value;
    }

    /**
     * 获取bailFormReferenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BailBookSerialNumberV10CT }
     *     
     */
    public BailBookSerialNumberV10CT getBailFormReferenceNumber() {
        return bailFormReferenceNumber;
    }

    /**
     * 设置bailFormReferenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BailBookSerialNumberV10CT }
     *     
     */
    public void setBailFormReferenceNumber(BailBookSerialNumberV10CT value) {
        this.bailFormReferenceNumber = value;
    }

    /**
     * 获取suretySequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SuretySequenceNumberV10CT }
     *     
     */
    public SuretySequenceNumberV10CT getSuretySequenceNumber() {
        return suretySequenceNumber;
    }

    /**
     * 设置suretySequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SuretySequenceNumberV10CT }
     *     
     */
    public void setSuretySequenceNumber(SuretySequenceNumberV10CT value) {
        this.suretySequenceNumber = value;
    }

    /**
     * 获取relationshipCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelationshipCodeV10CT }
     *     
     */
    public RelationshipCodeV10CT getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * 设置relationshipCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipCodeV10CT }
     *     
     */
    public void setRelationshipCode(RelationshipCodeV10CT value) {
        this.relationshipCode = value;
    }

    /**
     * 获取relationshipText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelationshipTextV10CT }
     *     
     */
    public RelationshipTextV10CT getRelationshipText() {
        return relationshipText;
    }

    /**
     * 设置relationshipText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipTextV10CT }
     *     
     */
    public void setRelationshipText(RelationshipTextV10CT value) {
        this.relationshipText = value;
    }

    /**
     * 获取fromDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getFromDate() {
        return fromDate;
    }

    /**
     * 设置fromDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setFromDate(DateCT value) {
        this.fromDate = value;
    }

    /**
     * 获取toDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getToDate() {
        return toDate;
    }

    /**
     * 设置toDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setToDate(DateCT value) {
        this.toDate = value;
    }

    /**
     * 获取bailType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BailTypeV10CT }
     *     
     */
    public BailTypeV10CT getBailType() {
        return bailType;
    }

    /**
     * 设置bailType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BailTypeV10CT }
     *     
     */
    public void setBailType(BailTypeV10CT value) {
        this.bailType = value;
    }

    /**
     * 获取cashAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getCashAmount() {
        return cashAmount;
    }

    /**
     * 设置cashAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setCashAmount(AmountV10CT value) {
        this.cashAmount = value;
    }

    /**
     * 获取ownUndertakingAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmountV10CT }
     *     
     */
    public AmountV10CT getOwnUndertakingAmount() {
        return ownUndertakingAmount;
    }

    /**
     * 设置ownUndertakingAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountV10CT }
     *     
     */
    public void setOwnUndertakingAmount(AmountV10CT value) {
        this.ownUndertakingAmount = value;
    }

    /**
     * 获取bailCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BailConditionV10CT }
     *     
     */
    public BailConditionV10CT getBailCondition() {
        return bailCondition;
    }

    /**
     * 设置bailCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BailConditionV10CT }
     *     
     */
    public void setBailCondition(BailConditionV10CT value) {
        this.bailCondition = value;
    }

    /**
     * 获取reportRemandLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProsecutionDepartmentStationV10CT }
     *     
     */
    public ProsecutionDepartmentStationV10CT getReportRemandLocation() {
        return reportRemandLocation;
    }

    /**
     * 设置reportRemandLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProsecutionDepartmentStationV10CT }
     *     
     */
    public void setReportRemandLocation(ProsecutionDepartmentStationV10CT value) {
        this.reportRemandLocation = value;
    }

    /**
     * 获取reportFrequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReportFrequencyV10CT }
     *     
     */
    public ReportFrequencyV10CT getReportFrequency() {
        return reportFrequency;
    }

    /**
     * 设置reportFrequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReportFrequencyV10CT }
     *     
     */
    public void setReportFrequency(ReportFrequencyV10CT value) {
        this.reportFrequency = value;
    }

    /**
     * 获取reportMondayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getReportMondayIndicator() {
        return reportMondayIndicator;
    }

    /**
     * 设置reportMondayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setReportMondayIndicator(FieldIndicatorV10CT value) {
        this.reportMondayIndicator = value;
    }

    /**
     * 获取reportTuesdayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getReportTuesdayIndicator() {
        return reportTuesdayIndicator;
    }

    /**
     * 设置reportTuesdayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setReportTuesdayIndicator(FieldIndicatorV10CT value) {
        this.reportTuesdayIndicator = value;
    }

    /**
     * 获取reportWednesdayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getReportWednesdayIndicator() {
        return reportWednesdayIndicator;
    }

    /**
     * 设置reportWednesdayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setReportWednesdayIndicator(FieldIndicatorV10CT value) {
        this.reportWednesdayIndicator = value;
    }

    /**
     * 获取reportThursdayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getReportThursdayIndicator() {
        return reportThursdayIndicator;
    }

    /**
     * 设置reportThursdayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setReportThursdayIndicator(FieldIndicatorV10CT value) {
        this.reportThursdayIndicator = value;
    }

    /**
     * 获取reportFridayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getReportFridayIndicator() {
        return reportFridayIndicator;
    }

    /**
     * 设置reportFridayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setReportFridayIndicator(FieldIndicatorV10CT value) {
        this.reportFridayIndicator = value;
    }

    /**
     * 获取reportSaturdayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getReportSaturdayIndicator() {
        return reportSaturdayIndicator;
    }

    /**
     * 设置reportSaturdayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setReportSaturdayIndicator(FieldIndicatorV10CT value) {
        this.reportSaturdayIndicator = value;
    }

    /**
     * 获取reportSundayIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getReportSundayIndicator() {
        return reportSundayIndicator;
    }

    /**
     * 设置reportSundayIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setReportSundayIndicator(FieldIndicatorV10CT value) {
        this.reportSundayIndicator = value;
    }

}
