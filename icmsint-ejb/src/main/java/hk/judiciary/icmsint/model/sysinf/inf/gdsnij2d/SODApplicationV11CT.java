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
 * 	SOD Application
 * 	  							Derived from CSOD.V1.2.CT
 * 								Extension consists of				 
 * 				a) Record Prefix
 * 				b) Interface ID	
 * 				c) ApplicationAction (Add, Update, Inactive)
 * 				d) Driving Offence Point (DOP)
 * 				e) PGBL Allow
 * 				f) Apply to Summons Indicator
 * 				g) Apply to Notice of Order Indicator
 * 				h) Apply to DOP Indicator
 * 				i) Apply to CC Indicator
 * 				j) Apply to Fixed Penalty				
 * 				k) Total number of variables
 * 				l) SOD Variable Detail Object							
 * 			
 * 
 * <p>Java class for SODApplication.V1.1.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SODApplication.V1.1.CT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CSOD.V1.2.CT"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordPrefix" type="{}Prefix.V1.2.CT"/&gt;
 *         &lt;element name="InterfaceID" type="{}InterfaceID.V1.0.CT"/&gt;
 *         &lt;element name="ApplicationAction" type="{}ApplicationAction.V1.0.CT"/&gt;
 *         &lt;element name="DrivingOffencePoint" type="{}DrivingOffencePoint.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="PGBLAllow" type="{}FieldIndicator.V1.0.CT"/&gt;
 *         &lt;element name="ApplyToSummons" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ApplyToNotice" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ApplyToDOP" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ApplyToCC" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="ApplyToFP" type="{}FieldIndicator.V1.0.CT" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberOfVariable" type="{}TotalNumberOfVariable.V1.0.CT"/&gt;
 *         &lt;element name="SODVariable" type="{}SODVariable.V1.0.CT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SODApplication.V1.1.CT", propOrder = {
    "recordPrefix",
    "interfaceID",
    "applicationAction",
    "drivingOffencePoint",
    "pgblAllow",
    "applyToSummons",
    "applyToNotice",
    "applyToDOP",
    "applyToCC",
    "applyToFP",
    "totalNumberOfVariable",
    "sodVariable"
})
public class SODApplicationV11CT
    extends CSODV12CT
{

    @XmlElement(name = "RecordPrefix", required = true)
    protected PrefixV12CT recordPrefix;
    @XmlElement(name = "InterfaceID", required = true)
    protected InterfaceIDV10CT interfaceID;
    @XmlElement(name = "ApplicationAction", required = true)
    protected ApplicationActionV10CT applicationAction;
    @XmlElement(name = "DrivingOffencePoint")
    protected DrivingOffencePointV10CT drivingOffencePoint;
    @XmlElement(name = "PGBLAllow", required = true)
    protected FieldIndicatorV10CT pgblAllow;
    @XmlElement(name = "ApplyToSummons")
    protected FieldIndicatorV10CT applyToSummons;
    @XmlElement(name = "ApplyToNotice")
    protected FieldIndicatorV10CT applyToNotice;
    @XmlElement(name = "ApplyToDOP")
    protected FieldIndicatorV10CT applyToDOP;
    @XmlElement(name = "ApplyToCC")
    protected FieldIndicatorV10CT applyToCC;
    @XmlElement(name = "ApplyToFP")
    protected FieldIndicatorV10CT applyToFP;
    @XmlElement(name = "TotalNumberOfVariable", required = true)
    protected TotalNumberOfVariableV10CT totalNumberOfVariable;
    @XmlElement(name = "SODVariable")
    protected SODVariableV10CT sodVariable;

    /**
     * Gets the value of the recordPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV12CT }
     *     
     */
    public PrefixV12CT getRecordPrefix() {
        return recordPrefix;
    }

    /**
     * Sets the value of the recordPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV12CT }
     *     
     */
    public void setRecordPrefix(PrefixV12CT value) {
        this.recordPrefix = value;
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

    /**
     * Gets the value of the applicationAction property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationActionV10CT }
     *     
     */
    public ApplicationActionV10CT getApplicationAction() {
        return applicationAction;
    }

    /**
     * Sets the value of the applicationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationActionV10CT }
     *     
     */
    public void setApplicationAction(ApplicationActionV10CT value) {
        this.applicationAction = value;
    }

    /**
     * Gets the value of the drivingOffencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingOffencePointV10CT }
     *     
     */
    public DrivingOffencePointV10CT getDrivingOffencePoint() {
        return drivingOffencePoint;
    }

    /**
     * Sets the value of the drivingOffencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingOffencePointV10CT }
     *     
     */
    public void setDrivingOffencePoint(DrivingOffencePointV10CT value) {
        this.drivingOffencePoint = value;
    }

    /**
     * Gets the value of the pgblAllow property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getPGBLAllow() {
        return pgblAllow;
    }

    /**
     * Sets the value of the pgblAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setPGBLAllow(FieldIndicatorV10CT value) {
        this.pgblAllow = value;
    }

    /**
     * Gets the value of the applyToSummons property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getApplyToSummons() {
        return applyToSummons;
    }

    /**
     * Sets the value of the applyToSummons property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setApplyToSummons(FieldIndicatorV10CT value) {
        this.applyToSummons = value;
    }

    /**
     * Gets the value of the applyToNotice property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getApplyToNotice() {
        return applyToNotice;
    }

    /**
     * Sets the value of the applyToNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setApplyToNotice(FieldIndicatorV10CT value) {
        this.applyToNotice = value;
    }

    /**
     * Gets the value of the applyToDOP property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getApplyToDOP() {
        return applyToDOP;
    }

    /**
     * Sets the value of the applyToDOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setApplyToDOP(FieldIndicatorV10CT value) {
        this.applyToDOP = value;
    }

    /**
     * Gets the value of the applyToCC property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getApplyToCC() {
        return applyToCC;
    }

    /**
     * Sets the value of the applyToCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setApplyToCC(FieldIndicatorV10CT value) {
        this.applyToCC = value;
    }

    /**
     * Gets the value of the applyToFP property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public FieldIndicatorV10CT getApplyToFP() {
        return applyToFP;
    }

    /**
     * Sets the value of the applyToFP property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIndicatorV10CT }
     *     
     */
    public void setApplyToFP(FieldIndicatorV10CT value) {
        this.applyToFP = value;
    }

    /**
     * Gets the value of the totalNumberOfVariable property.
     * 
     * @return
     *     possible object is
     *     {@link TotalNumberOfVariableV10CT }
     *     
     */
    public TotalNumberOfVariableV10CT getTotalNumberOfVariable() {
        return totalNumberOfVariable;
    }

    /**
     * Sets the value of the totalNumberOfVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalNumberOfVariableV10CT }
     *     
     */
    public void setTotalNumberOfVariable(TotalNumberOfVariableV10CT value) {
        this.totalNumberOfVariable = value;
    }

    /**
     * Gets the value of the sodVariable property.
     * 
     * @return
     *     possible object is
     *     {@link SODVariableV10CT }
     *     
     */
    public SODVariableV10CT getSODVariable() {
        return sodVariable;
    }

    /**
     * Sets the value of the sodVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SODVariableV10CT }
     *     
     */
    public void setSODVariable(SODVariableV10CT value) {
        this.sodVariable = value;
    }

}
