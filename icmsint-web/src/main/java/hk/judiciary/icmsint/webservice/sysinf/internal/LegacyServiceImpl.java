package hk.judiciary.icmsint.webservice.sysinf.internal;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import org.apache.cxf.interceptor.InInterceptors;
import hk.judiciary.icmsint.BaseController;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.ConversionResultDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.LegacyDataDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.RetrievalResultDTO;
import hk.judiciary.icmsint.webservice.sysinf.LegacyService;

@WebService(endpointInterface = "hk.judiciary.icmsint.webservice.sysinf.LegacyService")
@InInterceptors(interceptors = {"hk.judiciary.fmk.webservice.security.WSSecurityInterceptor"})
public class LegacyServiceImpl extends BaseController implements LegacyService {
 
	
//	private ProjectFacade getProjectFacade(){
//		return getFacade("projectFacade", ProjectFacade.class);
//	}
//
//	public List<ProjectSearchResultDTO> getProject(boolean active) //throws WebServiceException
//	{
//		validateGetProject(active);
//		return getProjectFacade().findProjectList(this.getUser(),active);	
//	}
//	
//	private void validateGetProject(boolean active) //throws WebServiceException
//	{
//		//Sample of input validation: active check  
//		if (!active) {
//			//throw new WebServiceException("You are not allowed to search inactive projects");
//		}
//	}

	@Override
	public String connectionTest(String testInput) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonWsDTO receiveDataFromParty(String partyCd, String filePath, Date uploadDate, List<LegacyDataDTO> dataList)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public RetrievalResultDTO retrieveDataToParty(String partyCd, String filePath) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
	public List<LegacyDataDTO> splitFICS(List<String> rolloutCourtCode, LegacyDataDTO content) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
	public LegacyDataDTO mergeFICS(List<LegacyDataDTO> content) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConversionResultDTO splitFlatFile(String fileType, List<String> rolloutCourtCode, LegacyDataDTO content)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConversionResultDTO mergeFlatFile(String fileType, List<LegacyDataDTO> content) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}



