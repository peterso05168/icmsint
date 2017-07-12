//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.06 ʱ�� 02:29:53 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpid2j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic amendment object consists of
 * 						a) Action
 * 						b) Data Name
 * 						c) Data Value
 * 			
 * 
 * <p>CommonAmendment.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CommonAmendment.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{}AmendmentAction.V1.0.CT"/>
 *         &lt;element name="DataName" type="{}AmendmentDataName.V1.0.CT"/>
 *         &lt;element name="DataValue" type="{}AmendmentDataValue.V1.0.CT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonAmendment.V1.0.CT", propOrder = {
    "action",
    "dataName",
    "dataValue"
})
@XmlSeeAlso({
    BailRemandAmendmentV10CT.class,
    SuretyAmendmentV10CT.class,
    OffenceAmendmentV10CT.class,
    DefendantAmendmentV10CT.class,
    WitnessAmendmentV10CT.class
})
public class CommonAmendmentV10CT {

    @XmlElement(name = "Action", required = true)
    protected AmendmentActionV10CT action;
    @XmlElement(name = "DataName", required = true)
    protected AmendmentDataNameV10CT dataName;
    @XmlElement(name = "DataValue", required = true)
    protected AmendmentDataValueV10CT dataValue;

    /**
     * ��ȡaction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmendmentActionV10CT }
     *     
     */
    public AmendmentActionV10CT getAction() {
        return action;
    }

    /**
     * ����action���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentActionV10CT }
     *     
     */
    public void setAction(AmendmentActionV10CT value) {
        this.action = value;
    }

    /**
     * ��ȡdataName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmendmentDataNameV10CT }
     *     
     */
    public AmendmentDataNameV10CT getDataName() {
        return dataName;
    }

    /**
     * ����dataName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentDataNameV10CT }
     *     
     */
    public void setDataName(AmendmentDataNameV10CT value) {
        this.dataName = value;
    }

    /**
     * ��ȡdataValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AmendmentDataValueV10CT }
     *     
     */
    public AmendmentDataValueV10CT getDataValue() {
        return dataValue;
    }

    /**
     * ����dataValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentDataValueV10CT }
     *     
     */
    public void setDataValue(AmendmentDataValueV10CT value) {
        this.dataValue = value;
    }

}
