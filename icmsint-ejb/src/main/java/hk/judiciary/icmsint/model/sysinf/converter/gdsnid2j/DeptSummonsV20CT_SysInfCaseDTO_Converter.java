package hk.judiciary.icmsint.model.sysinf.converter.gdsnid2j;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.common.ConverterUtil;
import hk.judiciary.icmsint.model.sysinf.converter.impl.AbstractPopulatingConverter;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.ComprisingCourtDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CourtLvlTypeDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfAddrDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDefendantDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDetailsDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseOffenceDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfChrgAppDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfAddrDTO.AddressTypeEnum;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO.DefendantTypeEnum;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.AddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.AgeV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.ChineseAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.ChineseAddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.CourtSysV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DefendantV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DeptSummonsV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.EnglishAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.EnglishAddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.InformantV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyChineseGivenNameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyChineseSurnameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyEnglishGivenNameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyEnglishSurnameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PersonGenderCodeV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PhoneNumberV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.ProsecutionDepartmentCodeV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.StaffNumberV10CT;

public class DeptSummonsV20CT_SysInfCaseDTO_Converter extends AbstractPopulatingConverter<DeptSummonsV20CT, SysInfCaseDTO> {

	@Override
	protected SysInfCaseDTO createTarget() {
		return new SysInfCaseDTO();
	}

	@Override
	public void populate(final DeptSummonsV20CT deptSummons, final SysInfCaseDTO sysInfCase) {
		
		/**
		 * =================================================FILL IN CASE DETAILS=================================================
		 **/
		SysInfCaseDetailsDTO sysInfCaseDetailsDto = new SysInfCaseDetailsDTO();
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();
		compsCourt.setCourtLvlType(courtLvlType);
		if (!CommonUtil.isNullOrEmpty(deptSummons.getCourtSys())) {
			compsCourt.setCompsCourtCode(deptSummons.getCourtSys().getValue());
		}
		CodeTableDTO caseType = new CodeTableDTO("S");
		Date receiveDate = new Date();
		InformantV12CT informant = deptSummons.getInformantDetails();
		if (!CommonUtil.isNullOrEmpty(informant)) {
			sysInfCaseDetailsDto.setInformant(ConverterUtil.toSysInfPartcpDto(informant));
		}
		ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode = deptSummons.getProsecutionDepartmentCode();
		if (!CommonUtil.isNullOrEmpty(prosecutionDepartmentCode)) {
			sysInfCaseDetailsDto.setProsDept(new CodeTableDTO(prosecutionDepartmentCode.getValue()));
		}
		sysInfCaseDetailsDto.setCourtLvlType(courtLvlType);
		sysInfCaseDetailsDto.setCompsCourt(compsCourt);
		sysInfCaseDetailsDto.setCaseType(caseType);
		sysInfCaseDetailsDto.setReceiveDate(receiveDate);
		if (!CommonUtil.isNullOrEmpty(deptSummons.getDepartmentReferenceNumber())) {
			sysInfCaseDetailsDto.setProsRefNo(deptSummons.getDepartmentReferenceNumber().getValue());
		}
		sysInfCaseDetailsDto.setDemandNoteNo(null); //TODO TBC
		sysInfCaseDetailsDto.setDemandNoteIssueDate(null); //TODO TBC

		
		/**
		 * =================================================FILL IN DEFENDANTS=================================================
		 **/
		
		List<SysInfCaseDefendantDTO> defendants = new ArrayList<SysInfCaseDefendantDTO>();
		SysInfCaseDefendantDTO caseDefendantDto = new SysInfCaseDefendantDTO();
		caseDefendantDto.setDefendant(ConverterUtil.toSysInfPartcpDto(deptSummons.getDefendantDetails()));
		defendants.add(caseDefendantDto);
		
		
		/**
		 * =================================================FILL IN CASE OFFENCE=================================================
		 **/
		SysInfCaseOffenceDTO caseOffence = new SysInfCaseOffenceDTO();
		SysInfChrgAppDTO sysInfChrgAppDto = new SysInfChrgAppDTO();
		if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails())) {
			if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails().getChapter())) {
				sysInfChrgAppDto.setChapNo(deptSummons.getSODDetails().getChapter().getValue().toString());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails().getSubLegislative())) {
				sysInfChrgAppDto.setSubLeg(deptSummons.getSODDetails().getSubLegislative().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails().getSection())) {
				sysInfChrgAppDto.setSectNo(deptSummons.getSODDetails().getSection().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails().getSubSection())) {
				sysInfChrgAppDto.setSubSectNo(deptSummons.getSODDetails().getSubSection().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails().getParagraph())) {
				sysInfChrgAppDto.setPara(deptSummons.getSODDetails().getParagraph().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails().getSubParagraph())) {
				sysInfChrgAppDto.setSubPara(deptSummons.getSODDetails().getSubParagraph().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails().getSupplementCode())) {
				sysInfChrgAppDto.setSupplCd(deptSummons.getSODDetails().getSupplementCode().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getSODDetails().getVersionNumber())) {
				sysInfChrgAppDto.setVerNo(deptSummons.getSODDetails().getVersionNumber().getValue());
			}			
		}
		if(!CommonUtil.isNullOrEmpty(deptSummons.getOffenceDesc())) {
			if (!CommonUtil.isNullOrEmpty(deptSummons.getOffenceDesc().getOffenceDescription())) {
				sysInfChrgAppDto.setOfncDesc(deptSummons.getOffenceDesc().getOffenceDescription().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getOffenceDesc().getOffenceDescriptionChinese())) {
				sysInfChrgAppDto.setOfncDescChin(deptSummons.getOffenceDesc().getOffenceDescriptionChinese().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getOffenceDesc().getContraryToLaw())) {
				sysInfChrgAppDto.setContryToLaw(deptSummons.getOffenceDesc().getContraryToLaw().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getOffenceDesc().getContraryToLawChinese())) {
				sysInfChrgAppDto.setContryToLawChin(deptSummons.getOffenceDesc().getContraryToLawChinese().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getOffenceDesc().getChargeParticular())) {
				sysInfChrgAppDto.setChrgPartcr(deptSummons.getOffenceDesc().getChargeParticular().getValue()); 
			}
			if (!CommonUtil.isNullOrEmpty(deptSummons.getOffenceDesc().getChargeParticularChinese())) {
				sysInfChrgAppDto.setChrgPartcrChin(deptSummons.getOffenceDesc().getChargeParticularChinese().getValue()); 
			}			
		}
		if (!CommonUtil.isNullOrEmpty(deptSummons.getOffenceDetails())) {
			sysInfChrgAppDto.setOffenceLocation(ConverterUtil.toSysInfAddrDto(deptSummons.getOffenceDetails().getOffenceLocation()));
		}
		sysInfChrgAppDto.setDateOfOccType(null); //TODO TBC
		sysInfChrgAppDto.setDateOfOccStartDate(null); //TODO TBC
		sysInfChrgAppDto.setDateOfOccEndDate(null); //TODO TBC
		sysInfChrgAppDto.setChargeToPartcps(null); //TODO TBC
		sysInfChrgAppDto.setSodVarValues(null); //TODO TBC
		sysInfChrgAppDto.setSeqNo(null); //TODO TBC
		
		caseOffence.setCaseNature(sysInfChrgAppDto);
		List<SysInfChrgAppDTO> offences = new ArrayList<>();
		offences.add(sysInfChrgAppDto);
		caseOffence.setOffences(offences);

		sysInfCase.setDetails(sysInfCaseDetailsDto);
		sysInfCase.setDefendants(defendants);
		sysInfCase.setCaseOffence(caseOffence);
	}		
}
