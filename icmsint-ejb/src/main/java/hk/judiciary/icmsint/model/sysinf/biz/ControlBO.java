package hk.judiciary.icmsint.model.sysinf.biz;

import hk.judiciary.icms.model.dao.entity.SysInfCtrlType;
import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icms.model.dao.entity.CaseType;
import hk.judiciary.icms.model.dao.entity.Pd;
import hk.judiciary.icms.model.dao.entity.SysInfCtrl;
import hk.judiciary.icmsint.model.BaseBO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfCtrlStatus;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;

public class ControlBO extends BaseBO {
	
	public static final String CONTROL_BO = "controlBO";
	
	public CommonWsDTO updateStatus(JudiciaryUser user, String partyCd, String caseTypeCd, 
			String ctrlTypeCd, Integer[] keys) throws Exception {
		
		CommonWsDTO retVal= new CommonWsDTO();
		boolean isError=false;
		SysInfCtrl sysInfCtrl = null;
		
		try {
			Pd pd=getPdDAO().findPd(partyCd);
			CaseType caseType=getCaseTypeDAO().findCaseType(caseTypeCd);
			SysInfCtrlType sysInfCtrlType = getSysInfCtrlTypeDAO().findSysInfCtrlType(ctrlTypeCd);
 
			sysInfCtrl=getSysInfCtrlDAO().findSysInfCtrl(pd, caseType, sysInfCtrlType, SysInfCtrlStatus.NEW, SysInfStatus.CHANGE, keys);
	
			if (sysInfCtrl==null){
				sysInfCtrl=new SysInfCtrl();
				sysInfCtrl.setPd(pd);
				sysInfCtrl.setCaseType(caseType);
				sysInfCtrl.setSysInfCtrlType(sysInfCtrlType);
				sysInfCtrl.setSysInfCtrlStatus(SysInfCtrlStatus.NEW.code());
				sysInfCtrl.setSysInfStatus(SysInfStatus.CHANGE.code());
				
				int noOfKeys=keys.length;
				switch (noOfKeys) {				
					case 3:
						sysInfCtrl.setKey3(keys[2]);
						
					case 2:
						sysInfCtrl.setKey2(keys[1]);
						
					case 1:
						sysInfCtrl.setKey1(keys[0]);
						break;
						
					default:
						isError=true;
						retVal.setReturnCode(ReturnStatus.SEARCH_KEY_NOT_DEFINED.code());
						retVal.setReturnDesc(ReturnStatus.SEARCH_KEY_NOT_DEFINED.desc());
						break;			
				}

			}
			else { // if found do nothing
//				sysInfCtrl.setPreviousVersion(sysInfCtrl.getVersion());
			}
		}
		catch (DAOException de) {
			isError=true;
			retVal.setReturnCode(de.getStatus().code());
			retVal.setReturnDesc(de.getEntityName()+" "+de.getStatus().desc());
		}
		
		if (!isError) {
			getSysInfCtrlDAO().persist(sysInfCtrl);
			retVal.setReturnCode(ReturnStatus.SUCCESS.code());
			retVal.setReturnDesc(ReturnStatus.SUCCESS.desc());
		}
		return retVal;
	}

}
