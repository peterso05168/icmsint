package hk.judiciary.icmsint;

import hk.judiciary.fmk.webservice.AbstractController;
import hk.judiciary.icmsint.model.sysinf.facade.GenericFacade;
import hk.judiciary.icmsint.model.sysinf.facade.LegacyFacade;
import hk.judiciary.icmsint.model.sysinf.facade.ControlFacade;

public class BaseController extends AbstractController {
	
	protected GenericFacade getGenericFacade(){
        return getFacade("genericFacade",GenericFacade.class);
	}
	
	protected LegacyFacade getLegacyFacade(){
        return getFacade("legacyFacade",LegacyFacade.class);
	}

	protected ControlFacade getControlFacade(){
        return getFacade("controlFacade",ControlFacade.class);
	}
}
