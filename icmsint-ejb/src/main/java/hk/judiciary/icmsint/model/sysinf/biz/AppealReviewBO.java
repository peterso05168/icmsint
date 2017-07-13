package hk.judiciary.icmsint.model.sysinf.biz;


import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icmsint.model.BaseBO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;
import hk.judiciary.icmsint.model.sysinf.biz.generator.GDSNIAppealOrReviewGrantUpdateGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.AppealReviewGrantGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.GxxiMsgGenerator;


/**
 * 
 * @version $Revision: 14 $ $Date: 2017-05-24 17:33:30 +0800 (Wed, 24 May 2017) $
 * @author $Author: gordonhclam@judiciary.gov.hk $
 */
public class AppealReviewBO extends BaseBO {

	public static final String APPEAL_REVIEW_BO = "appealReviewBO";

	
	public GDSNIMsgDTO sendAppealOrReviewGrantUpdate(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new GDSNIAppealOrReviewGrantUpdateGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	public GDSNIMsgDTO sendAppealReviewGrant(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new AppealReviewGrantGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
}
