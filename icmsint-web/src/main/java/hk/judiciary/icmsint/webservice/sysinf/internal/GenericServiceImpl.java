package hk.judiciary.icmsint.webservice.sysinf.internal;


import javax.jws.WebService;
import org.apache.cxf.interceptor.InInterceptors;

import hk.judiciary.icmsint.BaseController;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;
import hk.judiciary.icmsint.webservice.sysinf.GenericService;

@WebService(endpointInterface = "hk.judiciary.icmsint.webservice.sysinf.GenericService")
@InInterceptors(interceptors = {"hk.judiciary.fmk.webservice.security.WSSecurityInterceptor"})
public class GenericServiceImpl extends BaseController implements GenericService {


	@Override
	public String connectionTest(String testInput) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonWsDTO receiveDepartmentalSummonsApplication(String partyCd) throws Exception {
		return getGenericFacade().receiveDepartmentalSummonsApplication(this.getUser(),partyCd);
	}

	@Override
	public CommonWsDTO receiveWitnessSummonsApplication(String partyCd) throws Exception {
		return getGenericFacade().receiveWitnessSummonsApplication(this.getUser(),partyCd);
	}
	
	@Override
	public CommonWsDTO receiveDepartmentalNoticeApplication(String partyCd) throws Exception {
		return getGenericFacade().receiveDepartmentalNoticeApplication(this.getUser(),partyCd);
	}
	
	@Override
	public GDSNIMsgDTO sendSummonsAllocationResult(String partyCd) throws Exception {
		return getGenericFacade().sendSummonsAllocationResult(this.getUser(),partyCd );
	}
	public CommonWsDTO receiveFixedPenaltyNoticeOfOrderApplication(String partyCd) throws Exception {
		return getGenericFacade().receiveFixedPenaltyNoticeOfOrderApplication(this.getUser(),partyCd);
	}
	
	@Override
	public CommonWsDTO receiveFixedPenaltySummonsApplication(String partyCd) throws Exception {
		return getGenericFacade().receiveFixedPenaltySummonsApplication(this.getUser(),partyCd);
	}
	
	@Override
	public CommonWsDTO receiveFixedPenaltyDistressWarrantApplication(String partyCd) throws Exception {
		return getGenericFacade().receiveFixedPenaltyDistressWarrantApplication(this.getUser(),partyCd);
	}
	
	@Override
	public CommonWsDTO receiveChargeCaseApplication(String partyCd) throws Exception {
		return getGenericFacade().receiveChargeCaseApplication(this.getUser(),partyCd);
	}
	
	
	@Override
	public GDSNIMsgDTO sendWarrantStatusUpdate(String partyCd) throws Exception {
		return getGenericFacade().sendWarrantStatusUpdate(this.getUser(),partyCd );
	}
	
	@Override
	public GDSNIMsgDTO sendWarrantStatusChange(String partyCd) throws Exception {
		return getGenericFacade().sendWarrantStatusChange(this.getUser(),partyCd );
	}

	@Override
	public GDSNIMsgDTO sendAppealOrReviewGrantUpdate(String partyCd) throws Exception {
		return getGenericFacade().sendAppealOrReviewGrantUpdate(this.getUser(),partyCd );
	}
	
	@Override
	public GDSNIMsgDTO sendAppealReviewGrant(String partyCd) throws Exception {
		return getGenericFacade().sendAppealReviewGrant(this.getUser(),partyCd );
	}
	
	@Override
	public GDSNIMsgDTO sendReserviceResult(String partyCd) throws Exception {
		return getGenericFacade().sendReserviceResult(this.getUser(),partyCd );
	}
	
	@Override
	public GDSNIMsgDTO sendDepartmentalNoticeAllocationResult(String partyCd) throws Exception {
		return getGenericFacade().sendDepartmentalNoticeAllocationResult(this.getUser(),partyCd );
	}
	
	@Override
	public GDSNIMsgDTO sendFixedPenaltyNoticeSummonsAllocation(String partyCd) throws Exception {
		return getGenericFacade().sendFixedPenaltyNoticeSummonsAllocation(this.getUser(),partyCd );
	}
	
	@Override
	public GDSNIMsgDTO sendFixedPenaltyDistressWarrantAllocationGenerator(String partyCd) throws Exception {
		return getGenericFacade().sendFixedPenaltyDistressWarrantAllocationGenerator(this.getUser(),partyCd );
	}
	
	
}



