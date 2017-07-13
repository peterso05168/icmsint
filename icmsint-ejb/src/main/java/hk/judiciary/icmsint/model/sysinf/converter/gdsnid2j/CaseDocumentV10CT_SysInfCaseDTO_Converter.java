package hk.judiciary.icmsint.model.sysinf.converter.gdsnid2j;

import java.util.ArrayList;
import java.util.List;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.sysinf.converter.impl.AbstractPopulatingConverter;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.ComprisingCourtDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CourtLvlTypeDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDefendantDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDetailsDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.CaseDocumentV10CT;

public class CaseDocumentV10CT_SysInfCaseDTO_Converter extends AbstractPopulatingConverter<CaseDocumentV10CT, SysInfCaseDTO> {

	@Override
	protected SysInfCaseDTO createTarget() {
		return new SysInfCaseDTO();
	}
	
	@Override
	public void populate(final CaseDocumentV10CT caseDoc, final SysInfCaseDTO sysInfCase){
		
		/**
		 * =================================================FILL IN CASE DETAILS=================================================
		 **/
		SysInfCaseDetailsDTO details = new SysInfCaseDetailsDTO();
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();
		compsCourt.setCourtLvlType(courtLvlType);	
		if (!CommonUtil.isNullOrEmpty(caseDoc.getCaseNumber())) {
			if (!CommonUtil.isNullOrEmpty(caseDoc.getCaseNumber().getCourtSys())) {
				compsCourt.setCompsCourtCode(caseDoc.getCaseNumber().getCourtSys().getValue());
				details.setCompsCourt(compsCourt);
			}
		}
		
		details.setCaseType(new CodeTableDTO(caseDoc.getCaseNumber().getCaseType().getCodeName()));
		details.setReceiveDate(null);
		
		if (!CommonUtil.isNullOrEmpty(caseDoc.getDepartmentReferenceNumber())) {
			details.setProsRefNo(caseDoc.getDepartmentReferenceNumber().getValue());
		}
		
		if (!CommonUtil.isNullOrEmpty(caseDoc.getProsecutionDepartmentCode())) {
			if (!CommonUtil.isNullOrEmpty(caseDoc.getProsecutionDepartmentCode().getCodeName())) {
				details.setProsDept( new CodeTableDTO(caseDoc.getProsecutionDepartmentCode().getCodeName()));
			}
		}		
		
		
		/**
		 * =================================================FILL IN DEFENDANTS=================================================
		 **/
		
		List<SysInfCaseDefendantDTO> defendants = new ArrayList<SysInfCaseDefendantDTO>();
		SysInfCaseDefendantDTO defendant = new SysInfCaseDefendantDTO();
		SysInfPartcpDTO partcp = new SysInfPartcpDTO();
				
		if (!CommonUtil.isNullOrEmpty(caseDoc.getDocumentReferenceNumber())) {
			partcp.setDocumentNo(caseDoc.getDocumentReferenceNumber().getValue());
		}
		
		if (!CommonUtil.isNullOrEmpty(caseDoc.getDocumentType())) {
			if (!CommonUtil.isNullOrEmpty(caseDoc.getDocumentType().getLanguageCode())) {
				partcp.setDocumentType(new CodeTableDTO(caseDoc.getDocumentType().getLanguageCode()));
			}
		}

		defendant.setDefendant(partcp);
		defendants.add(defendant);		
		
		sysInfCase.setDetails(details);
		sysInfCase.setDefendants(defendants);

	}

}
