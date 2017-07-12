//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.06 时间 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

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
 * <p>InterfaceFileHeader.V1.3.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InterfaceFileHeader.V1.3.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prefix" type="{}Prefix.V1.3.CT"/>
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
@XmlType(name = "InterfaceFileHeader.V1.3.CT", propOrder = {
    "prefix",
    "batchSerialNumber",
    "interfaceDate",
    "recordCount"
})
public class InterfaceFileHeaderV13CT {

    @XmlElement(name = "Prefix", required = true)
    protected PrefixV13CT prefix;
    @XmlElement(name = "BatchSerialNumber", required = true)
    protected BatchSerialNumberV10CT batchSerialNumber;
    @XmlElement(name = "InterfaceDate", required = true)
    protected DateCT interfaceDate;
    @XmlElement(name = "RecordCount", required = true)
    protected XMLRecordCountV10CT recordCount;

    /**
     * 获取prefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrefixV13CT }
     *     
     */
    public PrefixV13CT getPrefix() {
        return prefix;
    }

    /**
     * 设置prefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixV13CT }
     *     
     */
    public void setPrefix(PrefixV13CT value) {
        this.prefix = value;
    }

    /**
     * 获取batchSerialNumber属性的值。
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
     * 设置batchSerialNumber属性的值。
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
     * 获取interfaceDate属性的值。
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
     * 设置interfaceDate属性的值。
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
     * 获取recordCount属性的值。
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
     * 设置recordCount属性的值。
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
