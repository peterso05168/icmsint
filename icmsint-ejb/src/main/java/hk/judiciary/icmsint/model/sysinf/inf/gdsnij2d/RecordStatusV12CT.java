//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.31 at 05:38:22 AM CST 
//


package hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Appeal/ Review record status
 *                                a) blank - Normal entry
 *                                a) 'N'   - Normal entry
 *                                b) 'C'   - Indicates that this same entry had been sent in previous batch
 *                                				and it has now been cancelled due to mis-entry. If a correct 
 *                                				entry is re-entered by the Magistrates' Courts user, then a 
 *                                				new entry is to be followed.
 *                                c) 'R'	 - Rollback
 * 			
 * 
 * <p>Java class for RecordStatus.V1.2.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordStatus.V1.2.CT"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;CCT&gt;Code.CT"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordStatus.V1.2.CT")
public class RecordStatusV12CT
    extends CodeCT
{


}
