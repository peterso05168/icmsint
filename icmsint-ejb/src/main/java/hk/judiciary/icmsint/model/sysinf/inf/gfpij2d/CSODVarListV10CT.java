//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.07.11 ʱ�� 05:59:54 PM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gfpij2d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SOD variable consists of 
 *                                a) SOD Key Object
 *                                b) SOD Variable Details Object
 *             
 * 
 * <p>CSODVarList.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CSODVarList.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SODKey" type="{}SODKey.V1.0.CT"/>
 *         &lt;element name="SODVarDetail" type="{}CSODVarDetail.V1.0.CT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSODVarList.V1.0.CT", propOrder = {
    "sodKey",
    "sodVarDetail"
})
public class CSODVarListV10CT {

    @XmlElement(name = "SODKey", required = true)
    protected SODKeyV10CT sodKey;
    @XmlElement(name = "SODVarDetail", required = true)
    protected List<CSODVarDetailV10CT> sodVarDetail;

    /**
     * ��ȡsodKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SODKeyV10CT }
     *     
     */
    public SODKeyV10CT getSODKey() {
        return sodKey;
    }

    /**
     * ����sodKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SODKeyV10CT }
     *     
     */
    public void setSODKey(SODKeyV10CT value) {
        this.sodKey = value;
    }

    /**
     * Gets the value of the sodVarDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sodVarDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSODVarDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSODVarDetailV10CT }
     * 
     * 
     */
    public List<CSODVarDetailV10CT> getSODVarDetail() {
        if (sodVarDetail == null) {
            sodVarDetail = new ArrayList<CSODVarDetailV10CT>();
        }
        return this.sodVarDetail;
    }

}
