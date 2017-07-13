package hk.judiciary.icmsint.model.sysinf.biz.handler;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseXMLWriter;
import hk.judiciary.icmsint.model.common.SysInfConstant;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.converter.gfpid2j.FixedPenaltyDistressWarrantApplicationV20CT_SysInfCaseDTO_Converter;
import hk.judiciary.icmsint.model.sysinf.converter.gfpid2j.WitnessSummonsApplicationV20CT_SysInfCaseDTO_Converter;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.FixedPenaltyDistressWarrantApplicationV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.FixedPenaltyWitnessSummonsAllocationV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.GFPIMsgD2J;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.WitnessSummonsApplicationV20CT;

public class FixedPenaltyWitnessSummonsApplicationHandler extends BaseGFPIMsgHandler {
	
	public FixedPenaltyWitnessSummonsApplicationHandler(JudiciaryUser judiciaryUser, String partyCd) {
		super(judiciaryUser, partyCd, SysInfConstant.SYSINF_MSG_CD_GFPI_D2J_FIXED_PENALTY_WITNESS_SUMMONS_APPLICATION, SysInfConstant.SYSINF_MSG_TYPE_CD_GFPI, SysInfConstant.SYSINF_MSG_MSGNAT_IN);
	}

	@Override
	public CommonWsDTO handleMsg(GFPIMsgD2J msg) throws SysInfHandlerException {
		int seqNo = 0;
        int failCnt = 0;
        for (WitnessSummonsApplicationV20CT fixedPenaltyWitnessSummonsApp : msg.getFixedPenaltyWitnessSummonsApplication()) {
			try {
				WitnessSummonsApplicationV20CT_SysInfCaseDTO_Converter converter = new WitnessSummonsApplicationV20CT_SysInfCaseDTO_Converter();
	        	SysInfCaseDTO sysInfCaseDto = converter.convert(fixedPenaltyWitnessSummonsApp);
	        	String fileName = genFileName(fixedPenaltyWitnessSummonsApp);
	        	byte[] bytes = genByteArray(sysInfCaseDto);
	        	saveXml(getJudiciaryUser(), bytes, fileName + ".xml");
				try {
					insertSysInfRec(seqNo++, fileName, SysInfStatus.SUCCESS.code());
				} catch (DAOException e) {
					e.printStackTrace();
				}
			} catch (Exception e) {
				failCnt++;
				try {
					String errMsg = e.getMessage() != null ? e.getMessage() : e.getClass().getSimpleName();
					insertSysInfErr(insertSysInfRec(seqNo++, genFileName(fixedPenaltyWitnessSummonsApp), SysInfStatus.FAIL.code()), errMsg);
				} catch (DAOException e1) {
					e1.printStackTrace();
				}
			}
        }
        CommonWsDTO returnVal = new CommonWsDTO();
        returnVal.setReturnCode(ReturnStatus.SUCCESS.code());
        returnVal.setReturnDesc(failCnt > 0 ? "partially processed" : "all records had been processed successfully");
	    return returnVal;
	}
	
	private String genFileName(WitnessSummonsApplicationV20CT fixedPenaltyDistressWarrant) {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    	String type = "WS"; //TODO TBC
    	return getPartyCd() + "-" + type + "-" + sdf.format(timestamp);
	}
	
	private byte[] genByteArray(SysInfCaseDTO sysInfCaseDto) throws ParserConfigurationException, IllegalArgumentException, IllegalAccessException, TransformerException {
		CriminalCaseXMLWriter xmlWriter = new CriminalCaseXMLWriter(CriminalCaseElementField.ELEMENT_DRAFT_CRIMINAL_CASES, getJudiciaryUser());
		xmlWriter.genContent(sysInfCaseDto);
		return xmlWriter.exportToByteArray();
	}
}
