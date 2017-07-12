package hk.judiciary.icmsint.model.sysinf.biz.handler;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.BatchSerialNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.DateCT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.GFPIMsgD2J;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.InterfaceFileHeaderV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.XMLRecordCountV10CT;

public abstract class BaseGFPIMsgHandler extends AbstractGxxiMsgHandler<GFPIMsgD2J> {

	public BaseGFPIMsgHandler(JudiciaryUser judiciaryUser, String partyCd, 
			String sysInfMsgCd, String sysInfMsgTypeCd, String msgNat) {
		super(judiciaryUser, partyCd, sysInfMsgCd, sysInfMsgTypeCd, msgNat);
	}
	
	@Override
	public CommonWsDTO handle(GFPIMsgD2J msg) throws SysInfHandlerException {
		validateHeader(msg);
		CommonWsDTO returnVal = null;
        try {
        	insertSysInfBat(msg);
    		returnVal = handleMsg(msg);
    		if (returnVal.getReturnCode().compareTo("0000") == 0) {
    			updateSysInfBatStatus(SysInfStatus.SUCCESS.code());
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
	
	private void validateHeader(GFPIMsgD2J msg) throws SysInfHandlerException {
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
		} else if (!CommonUtil.isNullOrEmpty(msg.getDefendantAddressApplication())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getDefendantAddressApplication());
		} else if (!CommonUtil.isNullOrEmpty(msg.getFixedPenaltyDistressWarrantApplication())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getFixedPenaltyDistressWarrantApplication());
		} else if (!CommonUtil.isNullOrEmpty(msg.getFixedPenaltyWitnessSummonsApplication())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getFixedPenaltyWitnessSummonsApplication());
		} else if (!CommonUtil.isNullOrEmpty(msg.getFixedPenaltySummons())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getFixedPenaltySummons());
		} else if (!CommonUtil.isNullOrEmpty(msg.getFixedPenaltyNoticeOfOrder())) {
			validateRecordCount(recordCount.getValue().intValue(), msg.getFixedPenaltyNoticeOfOrder());
		}
	}
	
	private boolean insertSysInfBat(GFPIMsgD2J msg) throws DAOException {
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
