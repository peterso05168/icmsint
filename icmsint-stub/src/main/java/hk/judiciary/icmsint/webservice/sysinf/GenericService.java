package hk.judiciary.icmsint.webservice.sysinf;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;


@WebService(targetNamespace = GenericService.NAMESPACE)
@SOAPBinding(style = Style.RPC)
public interface GenericService {

	public static final String WEBSERV_CD = "GenericSysInfWS";
	
	static final String NAMESPACE = "http://webservice.icmsint.judiciary.hk/";
	
	@WebResult(name = "connectionTest", targetNamespace = NAMESPACE)
	@WebMethod String connectionTest(
			@WebParam(name = "testInput") String testInput
			);
	
	@WebResult(name = "receiveDepartmentalSummonsApplication", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO receiveDepartmentalSummonsApplication(
//			@WebParam(name = "departmentalSummonsApplication") List<DepartmentalSummonsApplicationDTO> receiveDepartmentalSummonsApplication
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "receiveWitnessSummonsApplication", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO receiveWitnessSummonsApplication(
//			@WebParam(name = "witnessSummonsApplication") List<WitnessSummonsApplicationDTO> receiveWitnessSummonsApplication
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "receiveDepartmentalNoticeApplication", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO receiveDepartmentalNoticeApplication(
//			@WebParam(name = "departmentalNoticeApplication") List<DepartmentalNoticeApplicationDTO> receiveDepartmentalNoticeApplication
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "receiveFixedPenaltyNoticeOfOrderApplication", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO receiveFixedPenaltyNoticeOfOrderApplication(
//			@WebParam(name = "fixedPenaltyNoticeOfOrderApplication") List<FixedPenaltyNoticeOfOrderApplicationDTO> receiveFixedPenaltyNoticeOfOrderApplication
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "receiveFixedPenaltySummonsApplication", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO receiveFixedPenaltySummonsApplication(
//			@WebParam(name = "fixedPenaltySummonsApplication") List<FixedPenaltySummonsApplicationDTO> receiveFixedPenaltySummonsApplication
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	               
	@WebResult(name = "receiveFixedPenaltyDistressWarrantApplication", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO receiveFixedPenaltyDistressWarrantApplication(
//			@WebParam(name = "fixedPenaltyDistressWarrantApplication") List<FixedPenaltyDistressWarrantApplicationDTO> receiveFixedPenaltyDistressWarrantApplication
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	
	@WebResult(name = "sendSummonsAllocationResult", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendSummonsAllocationResult(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	
	@WebResult(name = "receiveChargeCaseApplication", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO receiveChargeCaseApplication(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	
	@WebResult(name = "sendWarrantStatusUpdate", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendWarrantStatusUpdate(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	
	@WebResult(name = "sendWarrantStatusChange", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendWarrantStatusChange(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "sendAppealOrReviewGrantUpdate", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendAppealOrReviewGrantUpdate(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "sendAppealReviewGrant", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendAppealReviewGrant(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "sendReserviceResult", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendReserviceResult(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "sendDepartmentalNoticeAllocationResult", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendDepartmentalNoticeAllocationResult(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "sendFixedPenaltyNoticeSummonsAllocation", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendFixedPenaltyNoticeSummonsAllocation(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
	@WebResult(name = "sendFixedPenaltyDistressWarrantAllocationGenerator", targetNamespace = NAMESPACE)
	@WebMethod GDSNIMsgDTO sendFixedPenaltyDistressWarrantAllocationGenerator(
			@WebParam(name = "partyCd") String partyCd
			) throws Exception;
	
}
