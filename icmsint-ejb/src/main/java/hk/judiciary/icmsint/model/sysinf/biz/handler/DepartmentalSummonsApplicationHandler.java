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
import hk.judiciary.icmsint.model.sysinf.converter.gdsnid2j.DeptSummonsV20CT_SysInfCaseDTO_Converter;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DeptSummonsV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.GDSNIMsgD2J;

public class DepartmentalSummonsApplicationHandler extends BaseGDSNIMsgHandler {
	
	public DepartmentalSummonsApplicationHandler(
			JudiciaryUser judiciaryUser,
			String partyCd) {
		super(judiciaryUser, partyCd, SysInfConstant.SYSINF_MSG_CD_GDSNI_D2J_SUMMON_APPLICATION, SysInfConstant.SYSINF_MSG_TYPE_CD_GDSI, SysInfConstant.SYSINF_MSG_MSGNAT_IN);
	}

	@Override
	public CommonWsDTO handleMsg(GDSNIMsgD2J msg) throws SysInfHandlerException {
		int seqNo = 0;
		int failCnt = 0;
        for (DeptSummonsV20CT deptSummons : msg.getSummonsApplication()) {
			try {
	        	DeptSummonsV20CT_SysInfCaseDTO_Converter converter = new DeptSummonsV20CT_SysInfCaseDTO_Converter();
	        	SysInfCaseDTO sysInfCaseDto = converter.convert(deptSummons);
	        	String fileName = genFileName(deptSummons);
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
					insertSysInfErr(insertSysInfRec(seqNo++, genFileName(deptSummons), SysInfStatus.FAIL.code()), errMsg);
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
	
	private String genFileName(DeptSummonsV20CT deptSummons) {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    	return getPartyCd() + "-" + deptSummons.getCaseType().getValue() + "-" + sdf.format(timestamp);
	}
	
	private byte[] genByteArray(SysInfCaseDTO sysInfCaseDto) throws ParserConfigurationException, IllegalArgumentException, IllegalAccessException, TransformerException {
		CriminalCaseXMLWriter xmlWriter = new CriminalCaseXMLWriter(CriminalCaseElementField.ELEMENT_DRAFT_CRIMINAL_CASES, getJudiciaryUser());
		xmlWriter.genContent(sysInfCaseDto);
		return xmlWriter.exportToByteArray();
	}
}
