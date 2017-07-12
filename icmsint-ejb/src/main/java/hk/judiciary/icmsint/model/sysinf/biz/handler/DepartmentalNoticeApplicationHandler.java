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
import hk.judiciary.icmsint.model.sysinf.converter.gdsnid2j.DeptNoticeOfOrderV20CT_SysInfCaseDTO_Converter;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DeptNoticeOfOrderV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.GDSNIMsgD2J;

public class DepartmentalNoticeApplicationHandler extends BaseGDSNIMsgHandler {
	
	public DepartmentalNoticeApplicationHandler(JudiciaryUser judiciaryUser, String partyCd) {
		super(judiciaryUser, partyCd, SysInfConstant.SYSINF_MSG_CD_GDSNI_D2J_DEPARTMENTAL_NOTICE_APPLICATION, SysInfConstant.SYSINF_MSG_TYPE_CD_GDSI, SysInfConstant.SYSINF_MSG_MSGNAT_IN);
	}

	@Override
	public CommonWsDTO handleMsg(GDSNIMsgD2J msg) throws SysInfHandlerException {
		int seqNo = 0;
        int failCnt = 0;
        for (DeptNoticeOfOrderV20CT deptNoticeOfOrder : msg.getNoticeOfOrderApplication()) {
			try {
				DeptNoticeOfOrderV20CT_SysInfCaseDTO_Converter converter = new DeptNoticeOfOrderV20CT_SysInfCaseDTO_Converter();
	        	SysInfCaseDTO sysInfCaseDto = converter.convert(deptNoticeOfOrder);
	        	String fileName = genFileName(deptNoticeOfOrder);
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
					insertSysInfErr(insertSysInfRec(seqNo++, genFileName(deptNoticeOfOrder), SysInfStatus.FAIL.code()), errMsg);
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
	
	private String genFileName(DeptNoticeOfOrderV20CT deptNoticeOfOrder) {
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
