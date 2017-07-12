package hk.judiciary.icmsint.model.sysinf.converter.gdsnid2j;

import java.util.ArrayList;
import java.util.List;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.sysinf.converter.impl.AbstractPopulatingConverter;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.ComprisingCourtDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CourtLvlTypeDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDetailsDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseOffenceDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfChrgAppDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfSodVarDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfSodVarValueDTO;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.SODApplicationV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.SODVariableSelectionItemV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.VariableDetailV10CT;

public class SODApplicationV20CT_SysInfCaseDTO_Converter extends AbstractPopulatingConverter<SODApplicationV20CT, SysInfCaseDTO> {

	@Override
	protected SysInfCaseDTO createTarget() {
		return new SysInfCaseDTO();
	}

	@Override
	public void populate(final SODApplicationV20CT SODApplication, final SysInfCaseDTO sysInfCase) {
		/**
		 * =================================================FILL IN CASE DETAILS=================================================
		 **/
		SysInfCaseDetailsDTO details = new SysInfCaseDetailsDTO();
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();
		CodeTableDTO caseType = null;
		CodeTableDTO prosDept = null;
		
		//FIXME: NOT SURE SETTING NULL OR NEW OBJECT TO THE FOLLOWING FIELDS
		compsCourt.setCourtLvlType(courtLvlType);		
		details.setCourtLvlType(courtLvlType);
		details.setCompsCourt(compsCourt);
		details.setCaseType(caseType);
		details.setReceiveDate(null);
		details.setInformant(null);
		details.setProsRefNo(null);		
		if (!CommonUtil.isNullOrEmpty(SODApplication.getProsecutionDepartmentCode())) {
			prosDept = new CodeTableDTO(SODApplication.getProsecutionDepartmentCode().getValue());	
			details.setProsDept(prosDept);
		}	
		details.setDemandNoteNo(null);	
		details.setDemandNoteIssueDate(null);		
		
		//=================================================DOES NOT CONTAIN ANY INFORMANT AND DEFENDANT INFORMATION==============
		
		/**
		 * =================================================FILL IN CASE OFFENCE=================================================
		 **/
		List<SysInfChrgAppDTO> offences = new ArrayList<SysInfChrgAppDTO>();
		SysInfCaseOffenceDTO caseOffence = new SysInfCaseOffenceDTO();
		SysInfChrgAppDTO caseNature = new SysInfChrgAppDTO();			

		caseNature.setId(null);
		if (!CommonUtil.isNullOrEmpty(SODApplication)) {
			if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey())) {
				if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey().getChapter())) {
					caseNature.setChapNo(SODApplication.getSODKey().getChapter().getValue().toString());
				}
				if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey().getSubLegislative())) {
					caseNature.setSubLeg(SODApplication.getSODKey().getSubLegislative().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey().getSection())) {
					caseNature.setSectNo(SODApplication.getSODKey().getSection().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey().getSubSection())) {
					caseNature.setSubSectNo(SODApplication.getSODKey().getSubSection().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey().getParagraph())) {
					caseNature.setPara(SODApplication.getSODKey().getParagraph().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey().getSubParagraph())) {
					caseNature.setSubPara(SODApplication.getSODKey().getSubParagraph().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey().getSupplementCode())) {
					caseNature.setSupplCd(SODApplication.getSODKey().getSupplementCode().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(SODApplication.getSODKey().getVersionNumber())) {
					caseNature.setVerNo(SODApplication.getSODKey().getVersionNumber().getValue());
				}
			}
			if (!CommonUtil.isNullOrEmpty(SODApplication.getOffenceDescription())) {
				caseNature.setOfncDesc(SODApplication.getOffenceDescription().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(SODApplication.getOffenceDescriptionChinese())) {
				caseNature.setOfncDescChin(SODApplication.getOffenceDescriptionChinese().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(SODApplication.getContraryToLaw())) {
				caseNature.setContryToLaw(SODApplication.getContraryToLaw().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(SODApplication.getContraryToLawChinese())) {
				caseNature.setContryToLawChin(SODApplication.getContraryToLawChinese().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(SODApplication.getChargeParticular())) {
				caseNature.setChrgPartcr(SODApplication.getChargeParticular().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(SODApplication.getChargeParticularChinese())) {
				caseNature.setChrgPartcrChin(SODApplication.getChargeParticularChinese().getValue());
			}
		}			

		caseNature.setOffenceLocation(null);	
		caseNature.setDateOfOccType(null);
		caseNature.setDateOfOccStartDate(null);
		caseNature.setDateOfOccEndDate(null);
		caseNature.setChargeToPartcps(null);
		
		List<SysInfSodVarValueDTO> sodVarValues = new ArrayList<SysInfSodVarValueDTO>();
		//FIXME: FIRST GUESSS ATTEMPT
//		for (VariableDetailV10CT varDetail : SODApplication.getSODVariable().getVariableDetail()) {
//			//FIXME: NOT SURE HOW TO GET SOD VAR CD AND NAME
//			SysInfSodVarDTO sodVar = new SysInfSodVarDTO();
//			sodVar.setCd(null);
//			sodVar.setName(varDetail.getCSODVarDetail().getVariableDescription().getValue());
//			for (SODVariableSelectionItemV10CT sodVarSelectedItem:varDetail.getSODVariableSelection().getSODVariableSelectionItem()) {				
//				SysInfSodVarValueDTO sodVarValue = new SysInfSodVarValueDTO();
//				sodVarValue.setSodVarValueId(sodVarSelectedItem.getSODVarSelectionSequenceNumber().getValue().intValue());
//				sodVarValue.setSodVarDTO(sodVar);
//				sodVarValue.setVarValue(sodVarSelectedItem.getSODVarSelectionValue().getValue());
//				sodVarValue.setVarValueChin(sodVarSelectedItem.getSODVarSelectionValueChinese().getValue());		
//				sodVarValues.add(sodVarValue);
//			}			
//		}
		
		//FIXME: GUESS FROM XML SAMPLE
		for (VariableDetailV10CT varDetail : SODApplication.getSODVariable().getVariableDetail()) {
			//FIXME: NOT SURE HOW TO GET SOD VAR CD AND NAME
			SysInfSodVarDTO sodVar = new SysInfSodVarDTO();
			sodVar.setCd(null);
			sodVar.setName(null);
			SysInfSodVarValueDTO sodVarValue = new SysInfSodVarValueDTO();
			sodVarValue.setSodVarValueId(null);
			sodVarValue.setSodVarDTO(sodVar);
			sodVarValue.setVarValue(varDetail.getCSODVarDetail().getVariableDescription().getValue());
			sodVarValue.setVarValueChin(varDetail.getCSODVarDetail().getVariableDescriptionChinese().getValue());		
			sodVarValues.add(sodVarValue);				
		}

		caseNature.setSodVarValues(sodVarValues);
		caseNature.setSeqNo(null);
		caseOffence.setCaseNature(caseNature);
		offences.add(caseNature);
		caseOffence.setOffences(offences);
		
		sysInfCase.setDetails(details);
		sysInfCase.setDefendants(null);
		sysInfCase.setCaseOffence(caseOffence);
	}
		
	
}
