package hk.judiciary.icmsint.model.sysinf.biz.generator;

import java.util.List;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.fmk.ejb.webservice.WSClientHandler;
import hk.judiciary.icms.model.dao.entity.SysInfCtrl;
import hk.judiciary.icmsint.model.common.SysInfConstant;
import hk.judiciary.icmsint.model.sysinf.converter.gdsnij2d.WarrantWsDTOConvert;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.dao.PdDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlTypeDAO;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfCtrlStatus;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.GDSNIMsgJ2D;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.WarrantStatusChangeV20CT;
import hk.judiciary.icmsint.webservice.sysinf.ControlService;
import hk.judiciary.icmswar.model.warrant.biz.dto.ws.WarrantWsDTO;
import hk.judiciary.icmswar.webservice.warrant.WarrantService;

public class WitnessSummonsAllocationResultGenerator extends BaseGDSNIMsgGenerator {
	
	public WitnessSummonsAllocationResultGenerator(JudiciaryUser judiciaryUser, String partyCd, 
			SysInfCtrlDAO sysInfCtrlDao, SysInfCtrlTypeDAO sysInfCtrlTypeDao, PdDAO pdDao) {
		super(judiciaryUser, partyCd, SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_WITNESS_SUMMONS_ALLOCATION, ControlService.SYSINF_CTRL_TYPE_CD_WITNESS_SUMMONS_ALLOCATION, sysInfCtrlDao, sysInfCtrlTypeDao, pdDao);
	}

	@Override
	public GDSNIMsgJ2D generateGDSNIMsg() throws SysInfGeneratorException, DAOException {
		String endpoint = WSClientHandler.getEndpointByWSConfigCode(WarrantService.WEBSERV_CD);
		WarrantService warrantService = (WarrantService) WSClientHandler.handleMessage(getJudiciaryUser(), WarrantService.class, endpoint);

		List<SysInfCtrl> sysInfCtrlList = getSysInfCtrlList();
		
		GDSNIMsgJ2D gdsni = new GDSNIMsgJ2D();
		return gdsni;
	}
}
