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
 * multiple remark line
 * 
 * <p>WitnessSummonsAllocationRemark.V1.0.CT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WitnessSummonsAllocationRemark.V1.0.CT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemarkLine" type="{}RemarkLine.V1.0.CT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WitnessSummonsAllocationRemark.V1.0.CT", propOrder = {
    "remarkLine"
})
public class WitnessSummonsAllocationRemarkV10CT {

    @XmlElement(name = "RemarkLine", required = true)
    protected List<RemarkLineV10CT> remarkLine;

    /**
     * Gets the value of the remarkLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarkLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarkLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkLineV10CT }
     * 
     * 
     */
    public List<RemarkLineV10CT> getRemarkLine() {
        if (remarkLine == null) {
            remarkLine = new ArrayList<RemarkLineV10CT>();
        }
        return this.remarkLine;
    }

}
