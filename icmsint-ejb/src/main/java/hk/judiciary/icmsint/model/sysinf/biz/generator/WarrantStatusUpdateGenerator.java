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

public class WarrantStatusUpdateGenerator extends BaseGDSNIMsgGenerator {
	
	public WarrantStatusUpdateGenerator(JudiciaryUser judiciaryUser, String partyCd, 
			SysInfCtrlDAO sysInfCtrlDao, SysInfCtrlTypeDAO sysInfCtrlTypeDao, PdDAO pdDao) {
		super(judiciaryUser, partyCd, SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_WARRANT_STATUS_UPDATE, ControlService.SYSINF_CTRL_TYPE_CD_WARRANT_STATUS_UPDATE, sysInfCtrlDao, sysInfCtrlTypeDao, pdDao);
	}

	@Override
	public GDSNIMsgJ2D generateGDSNIMsg() throws SysInfGeneratorException, DAOException {
		String endpoint = WSClientHandler.getEndpointByWSConfigCode(WarrantService.WEBSERV_CD);
		WarrantService warrantService = (WarrantService) WSClientHandler.handleMessage(getJudiciaryUser(), WarrantService.class, endpoint);

		List<SysInfCtrl> sysInfCtrlList = getSysInfCtrlList();
		
		GDSNIMsgJ2D gdsni = new GDSNIMsgJ2D();
		if (sysInfCtrlList.size() > 0) {
			List<WarrantStatusChangeV20CT> lstWarrant = gdsni.getWarrantStatusChange();
			WarrantWsDTOConvert wcConv=new WarrantWsDTOConvert();
			for (SysInfCtrl sysInfCtrl : sysInfCtrlList) { //foreach WarrantChange in Ctrl Table
				Integer caseId = sysInfCtrl.getKey1();
				//  call Warrant ws to get corresponding Warrant status.
				//	convert the response to WarrantStatusChange
				//	Add to GDSNIMsgJ2D

				WarrantWsDTO warrant;
				try {
					warrant = warrantService.getWarrant(caseId);
				} catch (Exception e) {
					//TODO process fail record
					throw new SysInfGeneratorException("", e);
				}
				
				WarrantStatusChangeV20CT wsc=wcConv.convert(warrant);

				lstWarrant.add(wsc);
		
				//  update Ctrl Table Status
				sysInfCtrl.setSysInfCtrlStatus(SysInfCtrlStatus.DONE.code());
				sysInfCtrl.setPreviousVersion(sysInfCtrl.getVersion());
				getSysInfCtrlDAO().persist(sysInfCtrl);
			}
		}
		return gdsni;
	}
}
