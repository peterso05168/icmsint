package hk.judiciary.icmsint.model.sysinf.facade.internal;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.PersistenceContext;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.fmk.ejb.facade.DefaultFacadeInterceptor;
import hk.judiciary.icmsint.model.BaseFacade;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.facade.ControlFacade;

@Stateless(mappedName = "ejb/controlFacade")
@Interceptors(DefaultFacadeInterceptor.class)
@PersistenceContext(name = "icmsintPU", unitName = "icmsintPU")
public class ControlFacadeBean extends BaseFacade implements ControlFacade {

	@Override
	public CommonWsDTO updateStatus(JudiciaryUser user, String partyCd, String caseTypeCd,
			String ctrlTypeCd, Integer[] keys) throws Exception {
		return getControlBO().updateStatus(user, partyCd, caseTypeCd, ctrlTypeCd, keys);
	}



}
