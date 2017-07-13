package hk.judiciary.icmsint.model.sysinf.facade;


import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;

/**
 * 
 * @version $Revision: 14 $ $Date: 2015-02-25 09:31:08 +0800 (Wed, 25 Feb 2015)$
 * @author $Author: gordonhclam@judiciary.gov.hk $
 */
public interface GenericFacade {
	
	
	/**
	 * receive Departmental Summons (S) data from external party
	 * 
	 * @param user.
	 * @return status code, desc
	 */
	public CommonWsDTO receiveDepartmentalSummonsApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveWitnessSummonsApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveDepartmentalNoticeApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveFixedPenaltyNoticeOfOrderApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveFixedPenaltySummonsApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveFixedPenaltyDistressWarrantApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveChargeCaseApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveDefendantAddressApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveSODApplication(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveCaseDocument(JudiciaryUser user, String partyCd) throws Exception;
	
	public CommonWsDTO receiveFixedPenaltyWitnessSummonsApplication(JudiciaryUser user, String partyCd) throws Exception;
	/**
	 * send Departmental Summons (S) allocation data to external party
	 * 
	 * @param user.
	 * @return status code, desc
	 */
	public GDSNIMsgDTO sendSummonsAllocationResult(JudiciaryUser user, String partyCd) throws Exception;	
	
	public GDSNIMsgDTO sendWarrantStatusUpdate(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendWarrantStatusChange(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendAppealOrReviewGrantUpdate(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendAppealReviewGrant(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendReserviceResult(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendDepartmentalNoticeAllocationResult(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendFixedPenaltyNoticeSummonsAllocation(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendFixedPenaltyDistressWarrantAllocationGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendFixedPenaltyDistressWarrantStatusChangeGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendCourtPaymentGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendSummonsHearingResultGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendSODApplicationResultGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendWitnessSummonsAllocationResultGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendFutureHearingAllocationGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendPaymentUpdateGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendAcknowledgementofCaseDocumentGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendCourtDocumentGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendSODDetailsUpdateGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendDepartmentalNoticeHearingResultGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	public GDSNIMsgDTO sendFixedPenaltyNoticeofOrderCourtResultGenerator(JudiciaryUser user, String partyCd) throws Exception;
	
	
	
	
	
	
}
