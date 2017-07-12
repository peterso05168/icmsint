package hk.judiciary.icmsint.model.sysinf.facade;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;

public interface ControlFacade {
	
	
	public CommonWsDTO updateStatus(JudiciaryUser user, String partyCd, String caseTypeCd, 
			String ctrlTypeCd, Integer[] keys) throws Exception;
		

}
