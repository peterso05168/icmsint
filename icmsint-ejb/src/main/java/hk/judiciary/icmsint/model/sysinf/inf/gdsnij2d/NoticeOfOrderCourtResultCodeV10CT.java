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
 * court result code:
 *                 	' ' : for court result type = 'W' or 'I'
 *                 	'F' : Fixed Penalty for court result type 'N' or 'R' only
 *                 	'W' : Withdrawn for court result type 'N' or 'R' only
 *                 	'U' : Conviction upheld for court result type 'A' or 'R'
 *                 	'N' : No conviction or dismissed
 *                 	'RP': Rescinded - choose to pay for court result type 'A' or 'R'
 *                 	'RW': Rescinded - choose to withdraw for court result type 'A' or 'R'
 *                 	'RD': Rescinded - choose to dispute for court result type 'A' or 'R'
 *                 	'I' : Re-instatement for court result type 'R' only
 *                 	'WE': Warrant execution result for court result type 'R' only
 *             
 * 
 * <p>Java class for NoticeOfOrderCourtResultCode.V1.0.CT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeOfOrderCourtResultCode.V1.0.CT"&gt;
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
@XmlType(name = "NoticeOfOrderCourtResultCode.V1.0.CT")
public class NoticeOfOrderCourtResultCodeV10CT
    extends CodeCT
{


}
