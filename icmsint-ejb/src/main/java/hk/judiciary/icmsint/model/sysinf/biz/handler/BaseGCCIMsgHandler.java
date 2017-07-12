package hk.judiciary.icmsint.model.sysinf.biz.handler;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.InterfaceFileHeaderV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.XMLRecordCountV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.BatchSerialNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.DateCT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.GCCIMsgD2J;

public abstract class BaseGCCIMsgHandler extends AbstractGxxiMsgHandler<GCCIMsgD2J> {

	public BaseGCCIMsgHandler(JudiciaryUser judiciaryUser, String partyCd, 
			String sysInfMsgCd, String sysInfMsgTypeCd, String msgNat) {
		super(judiciaryUser, partyCd, sysInfMsgCd, sysInfMsgTypeCd, msgNat);
	}
	
	@Override
	public CommonWsDTO handle(GCCIMsgD2J msg) throws SysInfHandlerException {
		validateHeader(msg);
		CommonWsDTO returnVal = null;
        try {
        	if (insertSysInfBat(msg)) {
        		returnVal = handleMsg(msg);
        		if (returnVal.getReturnCode().compareTo("0000") == 0) {
        			updateSysInfBatStatus(SysInfStatus.SUCCESS.code());
        		} else {
        			//TODO handle other return code
        		}
        	} else {
        		throw new SysInfHandlerException("insert sys_inf_bat failure");
        	}
		} catch (DAOException e) {
			returnVal = new CommonWsDTO();
        	returnVal.setReturnCode(e.getStatus().code());
        	returnVal.setReturnDesc(e.getStatus().desc());
		} catch (SysInfHandlerException | NullPointerException e) {
			returnVal = new CommonWsDTO();
        	returnVal.setReturnCode("9999"); //TODO TBC
        	returnVal.setReturnDesc(e.getMessage() != null ? e.getMessage() : e.getClass().getSimpleName());
		}
		return returnVal;
	}
	
	private void validateHeader(GCCIMsgD2J msg) throws SysInfHandlerException {
		if (CommonUtil.isNullOrEmpty(msg)) {
			throw new SysInfHandlerException("interface file is null");
		}
		InterfaceFileHeaderV13CT header = msg.getInterfaceFileHeader();
		if (CommonUtil.isNullOrEmpty(header)) {
			throw new SysInfHandlerException("interface file header is null");
		}
		XMLRecordCountV10CT recordCount = header.getRecordCount();
		if (CommonUtil.isNullOrEmpty(recordCount)) {
			throw new SysInfHandlerException("interface file header record count is null");
		}
		
		if (!CommonUtil.isNullOrEmpty(msg.getCaseDocument())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getCaseDocument());
		} else if (!CommonUtil.isNullOrEmpty(msg.getBailRegister())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getBailRegister());
		} else if (!CommonUtil.isNullOrEmpty(msg.getCaseDocument())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getCaseDocument());
		} else if (!CommonUtil.isNullOrEmpty(msg.getChargeCase())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getChargeCase());
		} else if (!CommonUtil.isNullOrEmpty(msg.getWitnessSummonsApplication())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getWitnessSummonsApplication());
		}
	}
	
	private boolean insertSysInfBat(GCCIMsgD2J msg) throws DAOException {
		InterfaceFileHeaderV13CT header = msg.getInterfaceFileHeader();
		BatchSerialNumberV10CT batchSerialNumber = header.getBatchSerialNumber();
		//if (CommonUtil.isNullOrEmpty(batchSerialNumber)) {
		//	return false;
		//}
		DateCT interfaceDate = header.getInterfaceDate();
		//if (CommonUtil.isNullOrEmpty(interfaceDate)) {
		//	return false;
		//}
		XMLRecordCountV10CT recordCount = header.getRecordCount();
		//if (CommonUtil.isNullOrEmpty(recordCount)) {
		//	return false;
		//}
		return insertSysInfBat(batchSerialNumber.getValue().intValue(), interfaceDate.getValue().toGregorianCalendar().getTime(), recordCount.getValue().intValue());
	}
}
