package hk.judiciary.icmsint.model.sysinf.biz.generator;

import java.util.List;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icms.model.dao.entity.SysInfCtrl;
import hk.judiciary.icmsint.model.common.SysInfConstant;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.dao.PdDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlTypeDAO;
import hk.judiciary.icmsint.model.sysinf.inf.gfpij2d.GFPIMsgJ2D;
import hk.judiciary.icmsint.webservice.sysinf.ControlService;

public class CourtPaymentGenerator extends BaseGFPIMsgGenerator {
	
	public CourtPaymentGenerator(JudiciaryUser judiciaryUser, String partyCd, 
			SysInfCtrlDAO sysInfCtrlDao, SysInfCtrlTypeDAO sysInfCtrlTypeDao, PdDAO pdDao) {
		super(judiciaryUser, partyCd, SysInfConstant.SYSINF_MSG_CD_GFPI_J2D_COURT_PAYMENT, ControlService.SYSINF_CTRL_TYPE_CD_COURT_PAYMENT, sysInfCtrlDao, sysInfCtrlTypeDao, pdDao);
	}

	@Override
	public GFPIMsgJ2D generateGFPIMsg() throws SysInfGeneratorException, DAOException {
		List<SysInfCtrl> sysInfCtrlList = getSysInfCtrlList();
		
		GFPIMsgJ2D gfpi = new GFPIMsgJ2D();
		//TODO
		return gfpi;
	}
}