//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.29 at 10:32:28 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdnid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * a file header indicate the details of the corresponding XML message body for easy processing
 *                                elements include :
 *                                a) Record Prefix
 *                                b) Serial Number
 *                                c) Interface Date
 *                                d) Record Count
 * 			
 * 
 * <p>Java class for InterfaceFileHeader.V1.2.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceFileHeader.V1.2.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prefix" type="{}Prefix.V1.2.CT"/>
 *         &lt;element name="BatchSerialNumber" type="{}BatchSerialNumber.V1.0.CT"/>
 *         &lt;element name="InterfaceDate" type="{CCT}Date.CT"/>
 *         &lt;element name="RecordCount" type="{}XMLRecordCount.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceFileHeader.V1.2.CT", propOrder = {
    "prefix",
    "batchSerialNumber",
    "interfaceDate",
    "recordCount"
})
public class InterfaceFileHeaderV12CT {

    @XmlElement(name = "Prefix", required = true)
    protected PrefixV12CT prefix;
    @XmlElement(name = "BatchSerialNumber", required = true)
    protected BatchSerialNumberV10CT batchSerialNumber;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "RecordCount", required = true)
    protected XMLRecordCountV10CT recordCount;

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixV12CT }
     *     
     */
    public PrefixV12CT getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV12CT }
     *     
     */
    public void setPrefix(PrefixV12CT value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the batchSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchSerialNumberV10CT }
     *     
     */
    public BatchSerialNumberV10CT getBatchSerialNumber() {
        return batchSerialNumber;
    }

    /**
     * Sets the value of the batchSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchSerialNumberV10CT }
     *     
     */
    public void setBatchSerialNumber(BatchSerialNumberV10CT value) {
        this.batchSerialNumber = value;
    }

    /**
     * Gets the value of the interfaceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCT }
     *     
     */
    public DateCT getInterfaceDate() {
        return interfaceDate;
    }

    /**
     * Sets the value of the interfaceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCT }
     *     
     */
    public void setInterfaceDate(DateCT value) {
        this.interfaceDate = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link XMLRecordCountV10CT }
     *     
     */
    public XMLRecordCountV10CT getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRecordCountV10CT }
     *     
     */
    public void setRecordCount(XMLRecordCountV10CT value) {
        this.recordCount = value;
    }

}
