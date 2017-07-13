package hk.judiciary.icmsint.model.sysinf.converter.gfpid2j;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.common.ConverterUtil;
import hk.judiciary.icmsint.model.sysinf.converter.impl.AbstractPopulatingConverter;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.ComprisingCourtDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CourtLvlTypeDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDetailsDTO;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.AdditionalSectionV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.ApplyPartyV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.BailiffDistrictCodeV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.CaseNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.DateCT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.DefendantSequenceNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.DemandNoteNumberV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.DepartmentReferenceNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.InformantV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.ProsecutionDepartmentCodeV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.TimeCT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.WitnessSummonsApplicationV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.WitnessV12CT;

public class WitnessSummonsApplicationV20CT_SysInfCaseDTO_Converter extends AbstractPopulatingConverter<WitnessSummonsApplicationV20CT, SysInfCaseDTO> {

	@Override
	protected SysInfCaseDTO createTarget() {
		return new SysInfCaseDTO();
	}

	@Override
	public void populate(final WitnessSummonsApplicationV20CT witnessSummons, final SysInfCaseDTO sysInfCase) {
		
		/**
		 * =================================================FILL IN CASE DETAILS=================================================
		 **/
		SysInfCaseDetailsDTO sysInfCaseDetailsDto = new SysInfCaseDetailsDTO();
		
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();
		compsCourt.setCourtLvlType(courtLvlType);
		//THIS IS CM SOMETHING, NOT RELATED TO CASE PROBABLY.
//		PrefixV13CT prefixV = witnessSummons.getRecordPrefix();
//		if(!CommonUtil.isNullOrEmpty(prefixV)) {
//		    compsCourt.setCompsCourtPrfx(prefixV.getValue());
//		}
		
		CaseNumberV10CT caseNumber = witnessSummons.getCaseNumber();
		if(!CommonUtil.isNullOrEmpty(caseNumber)) {
		} //TODO TBC
		
		ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode =witnessSummons.getProsecutionDepartmentCode();
		if(!CommonUtil.isNullOrEmpty(prosecutionDepartmentCode)) {
			sysInfCaseDetailsDto.setProsDept(new CodeTableDTO(prosecutionDepartmentCode.getCodeName()));
		}
		
		DepartmentReferenceNumberV10CT departmentReferenceNumber = witnessSummons.getDepartmentReferenceNumber();
		if(!CommonUtil.isNullOrEmpty(departmentReferenceNumber)) {
			sysInfCaseDetailsDto.setProsRefNo(departmentReferenceNumber.getValue());
		}
		
		DemandNoteNumberV11CT demandNoteNumber = witnessSummons.getDemandNoteNumber();
		if(!CommonUtil.isNullOrEmpty(departmentReferenceNumber)) {
			sysInfCaseDetailsDto.setDemandNoteNo(demandNoteNumber.getValue());
		}
		
		DateCT hearingDate = witnessSummons.getHearingDate();
		if(!CommonUtil.isNullOrEmpty(hearingDate)) {
		}//TODO TBC
		
		TimeCT hearingTime = witnessSummons.getHearingTime();
		if(!CommonUtil.isNullOrEmpty(hearingTime)) {
		}//TODO TBC
		
		ApplyPartyV10CT applyParty = witnessSummons.getApplyParty();
		if(!CommonUtil.isNullOrEmpty(applyParty)) {
		}//TODO TBC
		
		DefendantSequenceNumberV10CT defendantSequenceNumber = witnessSummons.getDefendantSequenceNumber();
		if(!CommonUtil.isNullOrEmpty(defendantSequenceNumber)) {
		}//TODO TBC
		
		WitnessV12CT witnessDetails = witnessSummons.getWitnessDetails();
		if(!CommonUtil.isNullOrEmpty(witnessDetails)) {
		}//TODO TBC
		
		BailiffDistrictCodeV10CT bailiffDistrict = witnessSummons.getBailiffDistrict();
		if(!CommonUtil.isNullOrEmpty(bailiffDistrict)) {
		}//TODO TBC
		
		InformantV12CT informantDetails = witnessSummons.getInformantDetails();
		if(!CommonUtil.isNullOrEmpty(informantDetails)) {
			sysInfCaseDetailsDto.setInformant(ConverterUtil.toSysInfPartcpDto(informantDetails));
		}
		AdditionalSectionV10CT additionalSection = witnessSummons.getAdditionalSection();
		if(!CommonUtil.isNullOrEmpty(additionalSection)) {
		}//TODO TBC
	}
//		sysInfCase.setDefendants(defendants);
//		sysInfCase.setCaseOffence(caseOffence);
}
