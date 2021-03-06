package hk.judiciary.icmsint.model.sysinf.biz.generator;

import java.util.List;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.fmk.ejb.webservice.WSClientHandler;
import hk.judiciary.icms.model.dao.entity.SysInfCtrl;
import hk.judiciary.icmsint.model.common.SysInfConstant;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.dao.PdDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlTypeDAO;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfCtrlStatus;
import hk.judiciary.icmsint.model.sysinf.inf.gfpij2d.AppealReviewGrantV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpij2d.GFPIMsgJ2D;
import hk.judiciary.icmsint.webservice.sysinf.ControlService;

public class GFPIAppealOrReviewGrantUpdateGenerator extends BaseGFPIMsgGenerator {
	
	public GFPIAppealOrReviewGrantUpdateGenerator(JudiciaryUser judiciaryUser, String partyCd, 
			SysInfCtrlDAO sysInfCtrlDao, SysInfCtrlTypeDAO sysInfCtrlTypeDao, PdDAO pdDao) {
		//TODO sysInfCtrlTypeCd
		super(judiciaryUser, partyCd, SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_APPEAL_REVIEW_GRANT, ControlService.SYSINF_CTRL_TYPE_CD_APPEAL_REVIEW_GRANT_UPDATE, sysInfCtrlDao, sysInfCtrlTypeDao, pdDao);
	}

	@Override
	public GFPIMsgJ2D generateGFPIMsg() throws SysInfGeneratorException, DAOException {
		List<SysInfCtrl> sysInfCtrlList = getSysInfCtrlList();
		
		GFPIMsgJ2D gdsni = new GFPIMsgJ2D();
		if (sysInfCtrlList.size() > 0) {
			List<AppealReviewGrantV20CT> appealReviewGrantList = gdsni.getAppealReviewGrant();
			for (SysInfCtrl sysInfCtrl : sysInfCtrlList) {
				//TODO
			}
		}
		return gdsni;
	}
}
