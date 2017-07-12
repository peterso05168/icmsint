package hk.judiciary.icmsint.webservice.sysinf.internal;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;

import hk.judiciary.icmsint.BaseController;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.webservice.sysinf.ControlService;

@WebService(endpointInterface = "hk.judiciary.icmsint.webservice.sysinf.ControlService")
@InInterceptors(interceptors = {"hk.judiciary.fmk.webservice.security.WSSecurityInterceptor"})
public class ControlServiceImpl extends BaseController implements ControlService {

	@Override
	public String connectionTest(String testInput) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonWsDTO updateStatus(String partyCd, String caseTypeCd, String ctrlTypeCd, 
			Integer[] keys) throws Exception {
		return getControlFacade().updateStatus(getUser(), partyCd, caseTypeCd, ctrlTypeCd, keys);
	}

}
