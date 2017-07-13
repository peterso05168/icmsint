package hk.judiciary.icmsint.model.sysinf.converter.gdsnid2j;

import java.util.ArrayList;
import java.util.List;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.common.ConverterUtil;
import hk.judiciary.icmsint.model.sysinf.converter.impl.AbstractPopulatingConverter;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.ComprisingCourtDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CourtLvlTypeDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfAddrDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfAddrDTO.AddressTypeEnum;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDefendantDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDetailsDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseOffenceDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfChrgAppDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO.DefendantTypeEnum;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.AddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.AgeV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.ChineseAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.ChineseAddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DateCT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DefendantV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DeptNoticeOfOrderV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.EnglishAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.EnglishAddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.HearingCourtNumberV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.InformantV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.OffenceDateTimeV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.OffenceDescFormatV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.OffenceDescV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyChineseGivenNameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyChineseSurnameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyEnglishGivenNameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyEnglishSurnameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PersonGenderCodeV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PhoneNumberV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PrefixV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.SODKeyV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.StaffNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.TimeCT;

public class DeptNoticeOfOrderV20CT_SysInfCaseDTO_Converter extends AbstractPopulatingConverter<DeptNoticeOfOrderV20CT, SysInfCaseDTO> {

	@Override
	protected SysInfCaseDTO createTarget() {
		return new SysInfCaseDTO();
	}

	@Override
	public void populate(final DeptNoticeOfOrderV20CT deptNoticeOfOrder, final SysInfCaseDTO sysInfCase) {
		
		/**
		 * =================================================FILL IN CASE DETAILS=================================================
		 **/
		SysInfCaseDetailsDTO sysInfCaseDetailsDto = new SysInfCaseDetailsDTO();
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();		
		
		compsCourt.setCourtLvlType(courtLvlType);
		//THIS IS CM SOMETHING, NOT RELATED TO CASE PROBABLY.
//		PrefixV13CT prefixV = deptNoticeOfOrder.getRecordPrefix();
//		if(!CommonUtil.isNullOrEmpty(prefixV)) {
//		    compsCourt.setCompsCourtPrfx(prefixV.getValue());
//		}
		
		InformantV12CT informantDetails = deptNoticeOfOrder.getInformantDetails();
		if(!CommonUtil.isNullOrEmpty(informantDetails)) {
			sysInfCaseDetailsDto.setInformant(ConverterUtil.toSysInfPartcpDto(informantDetails));
		}
		
		
		
		/**
		 * =================================================FILL IN DEFENDANTS=================================================
		 **/		
		List<SysInfCaseDefendantDTO> defendants = new ArrayList<SysInfCaseDefendantDTO>();
		SysInfCaseDefendantDTO caseDefendantDto = new SysInfCaseDefendantDTO();
		DefendantV13CT defendant = deptNoticeOfOrder.getDefendantDetails();
		if(!CommonUtil.isNullOrEmpty(defendant)) {
			caseDefendantDto.setDefendant(ConverterUtil.toSysInfPartcpDto(defendant));
		} 
		defendants.add(caseDefendantDto);
		
		
		
		/**
		 * =================================================FILL IN CASE OFFENCE=================================================
		 **/
		SysInfChrgAppDTO sysInfChrgAppDto = new SysInfChrgAppDTO();
		SysInfCaseOffenceDTO caseOffence = new SysInfCaseOffenceDTO();
		OffenceDateTimeV10CT offenceDateTime = deptNoticeOfOrder.getOffenceDateTime();
		if(!CommonUtil.isNullOrEmpty(offenceDateTime)) {
		}//TODO TBC
		
		OffenceDescFormatV10CT offenceDescFormat = deptNoticeOfOrder.getOffenceDescFormat();
		if(!CommonUtil.isNullOrEmpty(offenceDescFormat)) {
		}//TODO TBC
		
		AddressV12CT offenceLocation = deptNoticeOfOrder.getOffenceLocation();
		if(!CommonUtil.isNullOrEmpty(offenceLocation)) {
			sysInfChrgAppDto.setOffenceLocation(ConverterUtil.toSysInfAddrDto(offenceLocation));
		}
		
		SODKeyV11CT sodDetails= deptNoticeOfOrder.getSODDetails();
		if(!CommonUtil.isNullOrEmpty(sodDetails)) {
			if (!CommonUtil.isNullOrEmpty(sodDetails.getChapter())) {
				sysInfChrgAppDto.setChapNo(sodDetails.getChapter().getValue().toString());
			}
			if (!CommonUtil.isNullOrEmpty(sodDetails.getSubLegislative())) {
				sysInfChrgAppDto.setSubLeg(sodDetails.getSubLegislative().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(sodDetails.getSection())) {
				sysInfChrgAppDto.setSectNo(sodDetails.getSection().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(sodDetails.getSubSection())) {
				sysInfChrgAppDto.setSubSectNo(sodDetails.getSubSection().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(sodDetails.getParagraph())) {
				sysInfChrgAppDto.setPara(sodDetails.getParagraph().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(sodDetails.getSubParagraph())) {
				sysInfChrgAppDto.setSubPara(sodDetails.getSubParagraph().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(sodDetails.getSupplementCode())) {
				sysInfChrgAppDto.setSupplCd(sodDetails.getSupplementCode().getValue());
			}
			if (!CommonUtil.isNullOrEmpty(sodDetails.getVersionNumber())) {
				sysInfChrgAppDto.setVerNo(sodDetails.getVersionNumber().getValue());
			}			
		}
	
		
		OffenceDescV12CT offenceDesc = deptNoticeOfOrder.getOffenceDesc();
		if(!CommonUtil.isNullOrEmpty(offenceDesc)) {
			sysInfChrgAppDto.setOfncDesc(offenceDesc.toString());
		}
		
		DateCT issueDate = deptNoticeOfOrder.getIssueDate();
		if(!CommonUtil.isNullOrEmpty(issueDate)) {
		}//TODO TBC
		
		HearingCourtNumberV11CT hearingCourtNumber = deptNoticeOfOrder.getHearingCourtNumber();
		if(!CommonUtil.isNullOrEmpty(hearingCourtNumber)) {
		}//TODO TBC
		
		DateCT firstHearingDate = deptNoticeOfOrder.getFirstHearingDate();
		if(!CommonUtil.isNullOrEmpty(firstHearingDate)) {
		}//TODO TBC
		
		TimeCT firstHearingTime = deptNoticeOfOrder.getFirstHearingTime();
		if(!CommonUtil.isNullOrEmpty(firstHearingTime)) {
		}//TODO TBC
		
		caseOffence.setCaseNature(sysInfChrgAppDto);
		sysInfCase.setDetails(sysInfCaseDetailsDto);
		sysInfCase.setDefendants(defendants);
		sysInfCase.setCaseOffence(caseOffence);
		
	}
}
