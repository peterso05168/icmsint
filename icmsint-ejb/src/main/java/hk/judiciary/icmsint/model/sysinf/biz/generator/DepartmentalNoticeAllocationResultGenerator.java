package hk.judiciary.icmsint.model.sysinf.biz.generator;

import java.util.List;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icms.model.dao.entity.SysInfCtrl;
import hk.judiciary.icmsint.model.common.SysInfConstant;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.dao.PdDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlTypeDAO;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.DeptNoticeOfOrderV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.GDSNIMsgJ2D;
import hk.judiciary.icmsint.webservice.sysinf.ControlService;

public class DepartmentalNoticeAllocationResultGenerator extends BaseGDSNIMsgGenerator {
	
	public DepartmentalNoticeAllocationResultGenerator(JudiciaryUser judiciaryUser, String partyCd, 
			SysInfCtrlDAO sysInfCtrlDao, SysInfCtrlTypeDAO sysInfCtrlTypeDao, PdDAO pdDao) {
		super(judiciaryUser, partyCd, SysInfConstant.SYSINF_MSG_CD_GDNI_J2D_NOTICE_OF_ORDER_ALLOCATION, ControlService.SYSINF_CTRL_TYPE_CD_DEPARTMENTAL_NOTICE_ALLOCATION_RESULT, sysInfCtrlDao, sysInfCtrlTypeDao, pdDao);
	}

		@Override
		public GDSNIMsgJ2D generateGDSNIMsg() throws SysInfGeneratorException, DAOException {
			List<SysInfCtrl> sysInfCtrlList = getSysInfCtrlList();
			
			GDSNIMsgJ2D gdsni = new GDSNIMsgJ2D();
			if (sysInfCtrlList.size() > 0) {
//				List<DeptNoticeOfOrderV20CT> DeptNoticeOfOrderList = gdsni.get;
				for (SysInfCtrl sysInfCtrl : sysInfCtrlList) {
					//TODO
				}
		}
		return gdsni;
	}
}
