package hk.judiciary.icmsint.webservice.sysinf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;



@WebService(targetNamespace = ControlService.NAMESPACE)
@SOAPBinding(style = Style.RPC)
public interface ControlService {
	
	public static final String WEBSERV_CD = "ControlSysInfWS";
	
	static final String NAMESPACE = "http://webservice.icmsint.judiciary.hk/";
	public static final String SYSINF_CTRL_TYPE_CD_CASE_ALLOCATION="CA";
	public static final String SYSINF_CTRL_TYPE_CD_FIXED_PENALTY_NOTICE_SUMMONS_ALLOCATION="FPNSA";
	public static final String SYSINF_CTRL_TYPE_CD_COURT_RESULT_UPDATE="CRU";
	public static final String SYSINF_CTRL_TYPE_CD_CASE_DOCUMENT_ACK="CDA";
	
	public static final String SYSINF_CTRL_TYPE_CD_PAYMENT_UPDATE="PU";
	public static final String SYSINF_CTRL_TYPE_CD_APPEAL_REVIEW_GRANT="ARG";
	public static final String SYSINF_CTRL_TYPE_CD_APPEAL_REVIEW_GRANT_UPDATE="ARGU";
	public static final String SYSINF_CTRL_TYPE_CD_SUMMON_HEARING_RESULT="SHR";
	public static final String SYSINF_CTRL_TYPE_CD_WITNESS_SUMMONS_ALLOCATION="WSA";
	public static final String SYSINF_CTRL_TYPE_CD_WARRANT_STATUS_UPDATE="WSU";
	public static final String SYSINF_CTRL_TYPE_CD_WARRANT_STATUS_CHANGE="WSC";
	public static final String SYSINF_CTRL_TYPE_CD_WITNESS_SUMMONS_APPLICATION_RESULT="WSAR";
	public static final String SYSINF_CTRL_TYPE_CD_FIXED_PENALTY_DISTRESS_WARRANT_ALLOCATION="FPDWA";
	public static final String SYSINF_CTRL_TYPE_CD_FIXED_PENALTY_DISTRESS_WARRANT_STATUS_CHANGE="FPDWSC";
	
	public static final String SYSINF_CTRL_TYPE_CD_FUTURE_HEARING_ALLOCATION="FHA";
	public static final String SYSINF_CTRL_TYPE_CD_RESERVICE_RESULT="RSR";
	public static final String SYSINF_CTRL_TYPE_CD_DEPARTMENTAL_NOTICE_ALLOCATION_RESULT="DNAR";
	public static final String SYSINF_CTRL_TYPE_CD_SOD_APPLICATION_RESULT="SODAR";
	public static final String SYSINF_CTRL_TYPE_CD_PUBLIC_PAYMENT_TX_NUM="PPTN";
	public static final String SYSINF_CTRL_TYPE_CD_ACK_OF_CASE_DOC="ACD";
	public static final String SYSINF_CTRL_TYPE_CD_COURT_DOC="CD";
	public static final String SYSINF_CTRL_TYPE_CD_COURT_PAYMENT="CP";
	public static final String SYSINF_CTRL_TYPE_CD_SOD_DETAILS_UPDATE="SODU";
	
	@WebResult(name = "connectionTest", targetNamespace = NAMESPACE)
	@WebMethod String connectionTest(
			@WebParam(name = "testInput") String testInput
			);
	
	@WebResult(name = "changeControlSatatus", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO updateStatus(
			@WebParam(name = "partyCd") String partyCd,
			@WebParam(name = "caseTypeCd") String caseTypeCd,
			@WebParam(name = "ctrlTypeCd") String ctrlTypeCd,
			@WebParam(name = "keys") Integer[] keys
			)  throws Exception;

}
