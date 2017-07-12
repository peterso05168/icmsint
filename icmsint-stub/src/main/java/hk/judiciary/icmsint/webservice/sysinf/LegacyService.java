package hk.judiciary.icmsint.webservice.sysinf;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.ConversionResultDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.LegacyDataDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.RetrievalResultDTO;

@WebService(targetNamespace = LegacyService.NAMESPACE)
@SOAPBinding(style = Style.RPC)
public interface LegacyService {

	public static final String WEBSERV_CD = "LegacySysInfWS";
	
	static final String NAMESPACE = "http://webservice.icmsint.judiciary.hk/";
	
	@WebResult(name = "connectionTest", targetNamespace = NAMESPACE)
	@WebMethod String connectionTest(
			@WebParam(name = "testInput") String testInput
			);
	
	@WebResult(name = "receiveDataFromParty", targetNamespace = NAMESPACE)
	@WebMethod CommonWsDTO receiveDataFromParty(
			@WebParam(name = "partyCd") String partyCd,
			@WebParam(name = "filePath") String filePath,
			@WebParam(name = "uploadDate") Date uploadDate,
			@WebParam(name = "dataList") List<LegacyDataDTO> dataList
			) throws Exception;
	
	@WebResult(name = "retrieveDataToParty", targetNamespace = NAMESPACE)
	@WebMethod RetrievalResultDTO retrieveDataToParty(
			@WebParam(name = "partyCd") String partyCd,
			@WebParam(name = "filePath") String filePath
			) throws Exception;
	
	@WebResult(name = "splitFlatFile", targetNamespace = NAMESPACE)
	@WebMethod ConversionResultDTO splitFlatFile(
			@WebParam(name = "fileType") String fileType,
			@WebParam(name = "rolloutCourtCode") List<String> rolloutCourtCode,
			@WebParam(name = "content") LegacyDataDTO content
			) throws Exception;
	
	@WebResult(name = "mergeFlatFile", targetNamespace = NAMESPACE)
	@WebMethod ConversionResultDTO mergeFlatFile(
			@WebParam(name = "fileType") String fileType,
			@WebParam(name = "content") List<LegacyDataDTO> content
			) throws Exception;
	
}
