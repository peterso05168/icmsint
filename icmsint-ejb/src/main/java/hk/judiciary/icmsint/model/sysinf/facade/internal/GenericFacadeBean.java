package hk.judiciary.icmsint.model.sysinf.facade.internal;


import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;
import javax.persistence.PersistenceContext;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.fmk.ejb.facade.DefaultFacadeInterceptor;
import hk.judiciary.icmsint.model.BaseFacade;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;
import hk.judiciary.icmsint.model.sysinf.facade.GenericFacade;

/**
 * 
 * @version $Revision: 14 $ $Date: 2015-02-25 09:31:08 +0800 (Wed, 25 Feb 2015)$
 * @author $Author: gordonhclam@judiciary.gov.hk $
 */

@Stateless(mappedName = "ejb/genericFacade")
@Interceptors(DefaultFacadeInterceptor.class)
@PersistenceContext(name = "icmsintPU", unitName = "icmsintPU")
public class GenericFacadeBean extends BaseFacade implements GenericFacade {

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public CommonWsDTO receiveDepartmentalSummonsApplication(JudiciaryUser user, String partyCd) throws Exception {
		return getCaseAppBO().receiveDepartmentalSummonsApplication(user,partyCd);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public CommonWsDTO receiveWitnessSummonsApplication(JudiciaryUser user, String partyCd) throws Exception {
		return getCaseAppBO().receiveWitnessSummonsApplication(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendSummonsAllocationResult(JudiciaryUser user, String partyCd) throws Exception {
		return getCaseAppBO().sendSummonsAllocationResult(user,partyCd);
	}

	public CommonWsDTO receiveDepartmentalNoticeApplication(JudiciaryUser user, String partyCd) throws Exception {
		return getCaseAppBO().receiveDepartmentalNoticeApplication(user,partyCd);
	}
	
	@Override
	public CommonWsDTO receiveFixedPenaltyNoticeOfOrderApplication(JudiciaryUser user, String partyCd) throws Exception {
		return getCaseAppBO().receiveFixedPenaltyNoticeOfOrderApplication(user,partyCd);
	}
	
	@Override
	public CommonWsDTO receiveFixedPenaltySummonsApplication(JudiciaryUser user, String partyCd) throws Exception {
		return getCaseAppBO().receiveFixedPenaltySummonsApplication(user,partyCd);
	}

	@Override
	public CommonWsDTO receiveFixedPenaltyDistressWarrantApplication(JudiciaryUser user, String partyCd) throws Exception {
		return getCaseAppBO().receiveFixedPenaltyDistressWarrantApplication(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public CommonWsDTO receiveChargeCaseApplication(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().receiveChargeCaseApplication(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public CommonWsDTO receiveDefendantAddressApplication(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().receiveDefendantAddressApplication(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public CommonWsDTO receiveSODApplication(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().receiveSODApplication(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public CommonWsDTO receiveCaseDocument(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().receiveCaseDocument(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public CommonWsDTO receiveFixedPenaltyWitnessSummonsApplication(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().receiveFixedPenaltyWitnessSummonsApplication(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendWarrantStatusUpdate(JudiciaryUser user,String partyCd) throws Exception {
		return getWarrantBO().GDSNIMsgJ2D_CM_GI05(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendWarrantStatusChange(JudiciaryUser user,String partyCd) throws Exception {
		return getWarrantBO().GDSNIMsgJ2D_CM_G05(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendAppealOrReviewGrantUpdate(JudiciaryUser user,String partyCd) throws Exception {
		return getAppealReviewBO().sendAppealOrReviewGrantUpdate(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendAppealReviewGrant(JudiciaryUser user,String partyCd) throws Exception {
		return getAppealReviewBO().sendAppealReviewGrant(user,partyCd);
	}
	
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendReserviceResult(JudiciaryUser user,String partyCd) throws Exception {
		return getReserviceBO().sendReserviceResult(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendDepartmentalNoticeAllocationResult(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendDepartmentalNoticeAllocationResult(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendFixedPenaltyNoticeSummonsAllocation(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendFixedPenaltyNoticeSummonsAllocation(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendFixedPenaltyDistressWarrantStatusChangeGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendFixedPenaltyDistressWarrantStatusChangeGenerator(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendFixedPenaltyNoticeofOrderCourtResultGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendFixedPenaltyNoticeofOrderCourtResultGenerator(user,partyCd);
	}
	
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendFixedPenaltyDistressWarrantAllocationGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendFixedPenaltyDistressWarrantAllocationGenerator(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendSummonsHearingResultGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendSummonsHearingResultGenerator(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendSODApplicationResultGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendSODApplicationResultGenerator(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendFutureHearingAllocationGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendFutureHearingAllocationGenerator(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendPaymentUpdateGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendPaymentUpdateGenerator(user,partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendWitnessSummonsAllocationResultGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getWitnessBO().sendWitnessSummonsAllocationResultGenerator(user, partyCd);
	}
	

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendCourtPaymentGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendCourtPaymentGenerator(user, partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendAcknowledgementofCaseDocumentGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendAcknowledgementofCaseDocumentGenerator(user, partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendCourtDocumentGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendCourtDocumentGenerator(user, partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendSODDetailsUpdateGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendSODDetailsUpdateGenerator(user, partyCd);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public GDSNIMsgDTO sendDepartmentalNoticeHearingResultGenerator(JudiciaryUser user,String partyCd) throws Exception {
		return getCaseAppBO().sendDepartmentalNoticeHearingResultGenerator(user, partyCd);
	}
	
	
	
}
