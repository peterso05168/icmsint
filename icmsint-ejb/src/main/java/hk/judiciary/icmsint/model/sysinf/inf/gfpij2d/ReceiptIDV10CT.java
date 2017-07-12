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
 * Receipt ID consists of
 *                                a) centre no.
 *                                b) workstation no.
 *                                c) shroff no.
 *                                d) receipt no.
 *             
 * 
 * <p>ReceiptID.V1.0.CT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReceiptID.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CentreNumber" type="{}CentreNumber.V1.0.CT"/>
 *         &lt;element name="WorkstationNumber" type="{}WorkstationNumber.V1.0.CT"/>
 *         &lt;element name="ShroffNumber" type="{}ShroffNumber.V1.0.CT"/>
 *         &lt;element name="ReceiptNumber" type="{}ReceiptNumber.V1.1.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptID.V1.0.CT", propOrder = {
    "centreNumber",
    "workstationNumber",
    "shroffNumber",
    "receiptNumber"
})
public class ReceiptIDV10CT {

    @XmlElement(name = "CentreNumber", required = true)
    protected CentreNumberV10CT centreNumber;
    @XmlElement(name = "WorkstationNumber", required = true)
    protected WorkstationNumberV10CT workstationNumber;
    @XmlElement(name = "ShroffNumber", required = true)
    protected ShroffNumberV10CT shroffNumber;
    @XmlElement(name = "ReceiptNumber", required = true)
    protected ReceiptNumberV11CT receiptNumber;

    /**
     * 获取centreNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CentreNumberV10CT }
     *     
     */
    public CentreNumberV10CT getCentreNumber() {
        return centreNumber;
    }

    /**
     * 设置centreNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CentreNumberV10CT }
     *     
     */
    public void setCentreNumber(CentreNumberV10CT value) {
        this.centreNumber = value;
    }

    /**
     * 获取workstationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WorkstationNumberV10CT }
     *     
     */
    public WorkstationNumberV10CT getWorkstationNumber() {
        return workstationNumber;
    }

    /**
     * 设置workstationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WorkstationNumberV10CT }
     *     
     */
    public void setWorkstationNumber(WorkstationNumberV10CT value) {
        this.workstationNumber = value;
    }

    /**
     * 获取shroffNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShroffNumberV10CT }
     *     
     */
    public ShroffNumberV10CT getShroffNumber() {
        return shroffNumber;
    }

    /**
     * 设置shroffNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShroffNumberV10CT }
     *     
     */
    public void setShroffNumber(ShroffNumberV10CT value) {
        this.shroffNumber = value;
    }

    /**
     * 获取receiptNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReceiptNumberV11CT }
     *     
     */
    public ReceiptNumberV11CT getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * 设置receiptNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptNumberV11CT }
     *     
     */
    public void setReceiptNumber(ReceiptNumberV11CT value) {
        this.receiptNumber = value;
    }

}
