package hk.judiciary.icmsint.model.sysinf.converter.gfpid2j;

import java.util.ArrayList;
import java.util.List;

import hk.judiciary.fmk.common.util.CommonUtil;
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
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.AddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.ChineseAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.ChineseAddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.DefendantV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.DemandNoteNumberV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.FixedPenaltyApplicationNatureV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.EnglishAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.EnglishAddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.InformantV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.MWISNoticeNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.OffenceVariableV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.PreferredWarrantTypeV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.PartyChineseGivenNameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.PartyChineseSurnameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.PartyEnglishGivenNameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.PartyEnglishSurnameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.ProsecutionDepartmentCodeV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.StaffNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.AdditionalSectionV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.CaseNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.CaseOffenceV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.CaseOffenceV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.CaseSODV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.DateCT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.FixedPenaltyNoticeOfOrderV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.PrefixV13CT;

public class FixedPenaltyNoticeOfOrderV20CT_SysInfCaseDTO_Converter extends AbstractPopulatingConverter<FixedPenaltyNoticeOfOrderV20CT, SysInfCaseDTO> {

	@Override
	protected SysInfCaseDTO createTarget() {
		return new SysInfCaseDTO();
	}

	@Override
	public void populate(final FixedPenaltyNoticeOfOrderV20CT fixedPenaltyNoticeSummons, final SysInfCaseDTO sysInfCase) {
		SysInfCaseDetailsDTO sysInfCaseDetailsDto = new SysInfCaseDetailsDTO();
		
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();
		
		SysInfChrgAppDTO sysInfChrgAppDto = new SysInfChrgAppDTO();
		SysInfCaseOffenceDTO caseOffence = new SysInfCaseOffenceDTO();
		List<SysInfCaseDefendantDTO> defendants = new ArrayList<SysInfCaseDefendantDTO>();
		
		
		compsCourt.setCourtLvlType(courtLvlType);
		PrefixV13CT recordPrefix = fixedPenaltyNoticeSummons.getRecordPrefix();
		if (!CommonUtil.isNullOrEmpty(recordPrefix)) {
			 compsCourt.setCompsCourtPrfx(recordPrefix.getValue());
		}
		
		CaseNumberV10CT caseNumber = fixedPenaltyNoticeSummons.getCaseNumber();
		if(!CommonUtil.isNullOrEmpty(caseNumber)) {
		} //TODO TBC
		
		ProsecutionDepartmentCodeV11CT prosecutionDepartmentCode =fixedPenaltyNoticeSummons.getProsecutionDepartmentCode();
		if(!CommonUtil.isNullOrEmpty(prosecutionDepartmentCode)) {
		}//TODO TBC
		
		DemandNoteNumberV11CT demandNoteNumber = fixedPenaltyNoticeSummons.getDemandNoteNumber();
		if(!CommonUtil.isNullOrEmpty(fixedPenaltyNoticeSummons)) {
			sysInfCaseDetailsDto.setDemandNoteNo(demandNoteNumber.getValue());
		}
		
		DateCT demandNoteIssueDate = fixedPenaltyNoticeSummons.getDemandNoteIssueDate();
		if(!CommonUtil.isNullOrEmpty(demandNoteIssueDate)) {
//			sysInfCaseDetailsDto.setDemandNoteIssueDate((demandNoteIssueDate.getValue()));
		}//TODO TBC
		
		InformantV12CT informantDetails = fixedPenaltyNoticeSummons.getInformantDetails();
		if(!CommonUtil.isNullOrEmpty(informantDetails)) {
				sysInfCaseDetailsDto.setInformant(toSysInfPartcpDto(informantDetails));
		}
		
		DefendantV13CT defendantDetails = fixedPenaltyNoticeSummons.getDefendantDetails();
		if(!CommonUtil.isNullOrEmpty(defendantDetails)) {
	    }//TODO TBC
		
		CaseSODV12CT caseSODDetails = fixedPenaltyNoticeSummons.getCaseSODDetails();
		if(!CommonUtil.isNullOrEmpty(caseSODDetails)) {
	    }//TODO TBC
		
		CaseOffenceV10CT caseOffencev = fixedPenaltyNoticeSummons.getCaseOffence();
		if(!CommonUtil.isNullOrEmpty(caseOffencev)) {
	    }//TODO TBC
		
		CaseOffenceV11CT caseOffenceExtended = fixedPenaltyNoticeSummons.getCaseOffenceExtended();
		if(!CommonUtil.isNullOrEmpty(caseOffenceExtended)) {
	    }//TODO TBC
		
		MWISNoticeNumberV10CT mwisNoticeNumber = fixedPenaltyNoticeSummons.getMWISNoticeNumber();
        if(!CommonUtil.isNullOrEmpty(mwisNoticeNumber)) {
	    }//TODO TBC
		
        DateCT mwisNoticeDate = fixedPenaltyNoticeSummons.getMWISNoticeDate();
        if(!CommonUtil.isNullOrEmpty(mwisNoticeDate)) {
	    }//TODO TBC
        
        AdditionalSectionV10CT additionalSection = fixedPenaltyNoticeSummons.getAdditionalSection();
        if(!CommonUtil.isNullOrEmpty(additionalSection)) {
	    }//TODO TBC
		
        PreferredWarrantTypeV10CT preferredWarrantType = fixedPenaltyNoticeSummons.getPreferredWarrantType();
        if(!CommonUtil.isNullOrEmpty(preferredWarrantType)) {
	    }//TODO TBC
        
        List<OffenceVariableV10CT> offenceVariable = fixedPenaltyNoticeSummons.getOffenceVariable();
        if(!CommonUtil.isNullOrEmpty(offenceVariable)) {
	    }//TODO TBC
        
        FixedPenaltyApplicationNatureV10CT fixedPenaltyApplicationNature = fixedPenaltyNoticeSummons.getFixedPenaltyApplicationNature();
        if(!CommonUtil.isNullOrEmpty(fixedPenaltyApplicationNature)) {
	    }//TODO TBC
        
        caseOffence.setCaseNature(sysInfChrgAppDto);
		sysInfCase.setDetails(sysInfCaseDetailsDto);
		sysInfCase.setDefendants(defendants);
		sysInfCase.setCaseOffence(caseOffence);
		
		
	}
	
	private SysInfPartcpDTO toSysInfPartcpDto(InformantV12CT informant) {
		SysInfPartcpDTO sysInfPartcpDto = new SysInfPartcpDTO();
		PartyEnglishSurnameV10CT partyEnglishSurname = informant.getPartyEnglishSurname();
		if (!CommonUtil.isNullOrEmpty(partyEnglishSurname)) {
			sysInfPartcpDto.setSurnameEng(partyEnglishSurname.getValue());
		}
		PartyEnglishGivenNameV10CT partyEnglishGivenName = informant.getPartyEnglishGivenName();
		if (!CommonUtil.isNullOrEmpty(partyEnglishGivenName)) {
			sysInfPartcpDto.setGivenNameEng(partyEnglishGivenName.getValue());
		}
		PartyChineseSurnameV10CT partyChineseSurname = informant.getPartyChineseSurname();
		if (!CommonUtil.isNullOrEmpty(partyChineseSurname)) {
			sysInfPartcpDto.setSurnameChi(partyChineseSurname.getValue());
		}
		PartyChineseGivenNameV10CT partyChineseGivenName = informant.getPartyChineseGivenName();
		if (!CommonUtil.isNullOrEmpty(partyChineseGivenName)) {
			sysInfPartcpDto.setGivenNameChi(partyChineseGivenName.getValue());
		}
		StaffNumberV10CT staffNumber = informant.getStaffNumber();
		if (!CommonUtil.isNullOrEmpty(staffNumber)) {
			sysInfPartcpDto.setOfficerInChargeNo(staffNumber.getValue());
		}
		sysInfPartcpDto.setAddresses(null); //TODO TBC
		sysInfPartcpDto.setDocumentType(null); //TODO TBC
		sysInfPartcpDto.setDocumentNo(null); //TODO TBC
		sysInfPartcpDto.setPersonAge(null); //TODO TBC
		sysInfPartcpDto.setLangType(new CodeTableDTO("PUT")); //TODO TBC
		sysInfPartcpDto.setGendrType(null); //TODO TBC
		sysInfPartcpDto.setTelNo(null); //TODO TBC
		sysInfPartcpDto.setDefendantIndex(0); //TODO TBC
		sysInfPartcpDto.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.INFORMANT);
		sysInfPartcpDto.setDefendantType(DefendantTypeEnum.ADULT);
		return sysInfPartcpDto;
	}
	
//	private SysInfPartcpDTO toSysInfPartcpDto(DefendantV13CT defendant) {
//		SysInfPartcpDTO sysInfPartcpDto = new SysInfPartcpDTO();
//		PartyEnglishSurnameV10CT partyEnglishSurname = defendant.getPartyEnglishSurname();
//		if (!CommonUtil.isNullOrEmpty(partyEnglishSurname)) {
//			sysInfPartcpDto.setSurnameEng(partyEnglishSurname.getValue());
//		}
//		PartyEnglishGivenNameV10CT partyEnglishGivenName = defendant.getPartyEnglishGivenName();
//		if (!CommonUtil.isNullOrEmpty(partyEnglishGivenName)) {
//			sysInfPartcpDto.setGivenNameEng(partyEnglishGivenName.getValue());
//		}
//		PartyChineseSurnameV10CT partyChineseSurname = defendant.getPartyChineseSurname();
//		if (!CommonUtil.isNullOrEmpty(partyChineseSurname)) {
//			sysInfPartcpDto.setSurnameChi(partyChineseSurname.getValue());
//		}
//		PartyChineseGivenNameV10CT partyChineseGivenName = defendant.getPartyChineseGivenName();
//		if (!CommonUtil.isNullOrEmpty(partyChineseGivenName)) {
//			sysInfPartcpDto.setGivenNameChi(partyChineseGivenName.getValue());
//		}
//		AddressV12CT address = defendant.getAddress();
//		if (!CommonUtil.isNullOrEmpty(address)) {
//			List<SysInfAddrDTO> sysInfAddrDtoList = new ArrayList<>();
//			sysInfAddrDtoList.add(toSysInfAddrDto(address));
//			sysInfPartcpDto.setAddresses(sysInfAddrDtoList);
//		}
//		sysInfPartcpDto.setDocumentType(null); //TODO TBC
//		sysInfPartcpDto.setDocumentNo(null); //TODO TBC
//		AgeV11CT age = defendant.getAge();
//		if (!CommonUtil.isNullOrEmpty(age)) {
//			sysInfPartcpDto.setPersonAge(age.getValue().toString());
//			if (age.getValue().intValue() >= 16) {
//				sysInfPartcpDto.setDefendantType(DefendantTypeEnum.ADULT);
//			} else {
//				sysInfPartcpDto.setDefendantType(DefendantTypeEnum.JUVENILE);
//			}
//		} else {
//			sysInfPartcpDto.setDefendantType(DefendantTypeEnum.COMPANY);
//		}
//		sysInfPartcpDto.setLangType(new CodeTableDTO("PUT")); //TODO TBC
//		PersonGenderCodeV10CT personGenderCode = defendant.getGender();
//		if (!CommonUtil.isNullOrEmpty(personGenderCode)) {
//			sysInfPartcpDto.setGendrType(new CodeTableDTO(personGenderCode.getValue()));
//		}
//		sysInfPartcpDto.setOfficerInChargeNo(null); //TODO TBC
//		PhoneNumberV11CT phoneNumber = defendant.getPhoneNumber();
//		if (!CommonUtil.isNullOrEmpty(phoneNumber)) {
//			sysInfPartcpDto.setTelNo(phoneNumber.getValue());
//		}
//		sysInfPartcpDto.setDefendantIndex(0); //TODO TBC
//		sysInfPartcpDto.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.INFORMANT);
//		return sysInfPartcpDto;
//	}
	
	private SysInfAddrDTO toSysInfAddrDto(AddressV12CT address) {
		SysInfAddrDTO sysInfAddrDto = new SysInfAddrDTO();
		EnglishAddressV12CT englishAddress = address.getEnglishAddress();
		if (!CommonUtil.isNullOrEmpty(englishAddress)) {
			List<EnglishAddressLineV11CT> englishAddressLineList = englishAddress.getEnglishAddressLine();
			if (!CommonUtil.isNullOrEmpty(englishAddressLineList)) {
				sysInfAddrDto.setAddrLine1Eng(address.getEnglishAddress().getEnglishAddressLine().get(0).getValue());
				sysInfAddrDto.setAddrLine2Eng(address.getEnglishAddress().getEnglishAddressLine().get(1).getValue());
				sysInfAddrDto.setAddrLine3Eng(address.getEnglishAddress().getEnglishAddressLine().get(2).getValue());
			}

		}
		ChineseAddressV12CT chineseAddress = address.getChineseAddress();
		if (!CommonUtil.isNullOrEmpty(chineseAddress)) {
			List<ChineseAddressLineV11CT> chineseAddressLineList = chineseAddress.getChineseAddressLine();
			if (!CommonUtil.isNullOrEmpty(chineseAddressLineList)) {
				sysInfAddrDto.setAddrLine1Chi(address.getChineseAddress().getChineseAddressLine().get(0).getValue());
				sysInfAddrDto.setAddrLine2Chi(address.getChineseAddress().getChineseAddressLine().get(1).getValue());
				sysInfAddrDto.setAddrLine3Chi(address.getChineseAddress().getChineseAddressLine().get(2).getValue());
			}
		}
		sysInfAddrDto.setRegion(null); //TODO TBC
		sysInfAddrDto.setAddressIndex(0); //TODO TBC
		sysInfAddrDto.setAddressType(AddressTypeEnum.DEFENDANT_ADDRESS);
		return sysInfAddrDto;
	}
}
