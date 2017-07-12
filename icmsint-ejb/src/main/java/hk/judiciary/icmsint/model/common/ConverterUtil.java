package hk.judiciary.icmsint.model.common;

import java.util.ArrayList;
import java.util.List;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfAddrDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfAddrDTO.AddressTypeEnum;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO.DefendantTypeEnum;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.AddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.AgeV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.ChineseAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.ChineseAddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DefendantV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.EnglishAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.EnglishAddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyChineseGivenNameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyChineseSurnameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyEnglishGivenNameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PartyEnglishSurnameV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PersonGenderCodeV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PhoneNumberV11CT;

public class ConverterUtil {
	
	public static SysInfPartcpDTO toSysInfPartcpDto(
			hk.judiciary.icmsint.model.sysinf.inf.gccid2j.InformantV12CT informant) {
		SysInfPartcpDTO sysInfPartcpDto = new SysInfPartcpDTO();
		sysInfPartcpDto.setDefendantType(DefendantTypeEnum.ADULT);
		sysInfPartcpDto.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.INFORMANT);
		if (!CommonUtil.isNullOrEmpty(informant.getPartyEnglishSurname())) {
			sysInfPartcpDto.setSurnameEng(informant.getPartyEnglishSurname().getValue());					
		}
		if (!CommonUtil.isNullOrEmpty(informant.getPartyEnglishGivenName())) {
			sysInfPartcpDto.setGivenNameEng(informant.getPartyEnglishGivenName().getValue());					
		}
		if (!CommonUtil.isNullOrEmpty(informant.getPartyChineseSurname())) {
			sysInfPartcpDto.setSurnameChi(informant.getPartyChineseSurname().getValue());					
		}
		if (!CommonUtil.isNullOrEmpty(informant.getPartyChineseGivenName())) {
			sysInfPartcpDto.setGivenNameChi(informant.getPartyChineseGivenName().getValue());					
		}	
		if (!CommonUtil.isNullOrEmpty(informant.getPhoneNumber())) {
			sysInfPartcpDto.setTelNo(informant.getPhoneNumber().getValue());					
		}	
		if (!CommonUtil.isNullOrEmpty(informant.getAge())) {
			sysInfPartcpDto.setPersonAge(informant.getAge().getValue().toString());
		}	
		if (!CommonUtil.isNullOrEmpty(informant.getGender())) {
			if (!CommonUtil.isNullOrEmpty(informant.getGender().getCodeName())) {
				sysInfPartcpDto.setGendrType(new CodeTableDTO(informant.getGender().getCodeName()));
			}				
		}	
		if (!CommonUtil.isNullOrEmpty(informant.getPhoneNumber())) {
			sysInfPartcpDto.setTelNo(informant.getPhoneNumber().getValue());
		}
		
		//FIXME: FILL IN WHEN THE FIELDS IS CLARIFIED, CANNOT BE FOUND IN chargeCase
		sysInfPartcpDto.setAddresses(null);
		sysInfPartcpDto.setDefendantIndex(0);
		sysInfPartcpDto.setDocumentNo(null);
		sysInfPartcpDto.setLangType(new CodeTableDTO("PUT"));
		sysInfPartcpDto.setOfficerInChargeNo(null);
		return sysInfPartcpDto;
	}

	public static SysInfPartcpDTO toSysInfPartcpDto(
			hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.InformantV12CT informant) {
		SysInfPartcpDTO sysInfPartcpDto = new SysInfPartcpDTO();
		sysInfPartcpDto.setDefendantType(DefendantTypeEnum.ADULT);
		sysInfPartcpDto.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.INFORMANT);
		if (!CommonUtil.isNullOrEmpty(informant.getPartyEnglishSurname())) {
			sysInfPartcpDto.setSurnameEng(informant.getPartyEnglishSurname().getValue());					
		} 
		if (!CommonUtil.isNullOrEmpty(informant.getPartyEnglishGivenName())) {
			sysInfPartcpDto.setGivenNameEng(informant.getPartyEnglishGivenName().getValue());					
		}
		if (!CommonUtil.isNullOrEmpty(informant.getPartyChineseSurname())) {
			sysInfPartcpDto.setSurnameChi(informant.getPartyChineseSurname().getValue());					
		}
		if (!CommonUtil.isNullOrEmpty(informant.getPartyChineseGivenName())) {
			sysInfPartcpDto.setGivenNameChi(informant.getPartyChineseGivenName().getValue());					
		}	
		if (!CommonUtil.isNullOrEmpty(informant.getPhoneNumber())) {
			sysInfPartcpDto.setTelNo(informant.getPhoneNumber().getValue());					
		}	
		if (!CommonUtil.isNullOrEmpty(informant.getAge())) {
			sysInfPartcpDto.setPersonAge(informant.getAge().getValue().toString());
		}	
		if (!CommonUtil.isNullOrEmpty(informant.getGender())) {
			if (!CommonUtil.isNullOrEmpty(informant.getGender().getCodeName())) {
				sysInfPartcpDto.setGendrType(new CodeTableDTO(informant.getGender().getCodeName()));
			}				
		}	
		if (!CommonUtil.isNullOrEmpty(informant.getPhoneNumber())) {
			sysInfPartcpDto.setTelNo(informant.getPhoneNumber().getValue());
		}
		
		//FIXME: FILL IN WHEN THE FIELDS IS CLARIFIED, CANNOT BE FOUND IN chargeCase
		sysInfPartcpDto.setAddresses(null);
		sysInfPartcpDto.setDefendantIndex(0);
		sysInfPartcpDto.setDocumentNo(null);
		sysInfPartcpDto.setLangType(new CodeTableDTO("PUT"));
		sysInfPartcpDto.setOfficerInChargeNo(null);
		return sysInfPartcpDto;
	}
	
	public static SysInfPartcpDTO toSysInfPartcpDto(DefendantV13CT defendant) {
		SysInfPartcpDTO sysInfPartcpDto = new SysInfPartcpDTO();
		PartyEnglishSurnameV10CT partyEnglishSurname = defendant.getPartyEnglishSurname();
		if (!CommonUtil.isNullOrEmpty(partyEnglishSurname)) {
			sysInfPartcpDto.setSurnameEng(partyEnglishSurname.getValue());
		}
		PartyEnglishGivenNameV10CT partyEnglishGivenName = defendant.getPartyEnglishGivenName();
		if (!CommonUtil.isNullOrEmpty(partyEnglishGivenName)) {
			sysInfPartcpDto.setGivenNameEng(partyEnglishGivenName.getValue());
		}
		PartyChineseSurnameV10CT partyChineseSurname = defendant.getPartyChineseSurname();
		if (!CommonUtil.isNullOrEmpty(partyChineseSurname)) {
			sysInfPartcpDto.setSurnameChi(partyChineseSurname.getValue());
		}
		PartyChineseGivenNameV10CT partyChineseGivenName = defendant.getPartyChineseGivenName();
		if (!CommonUtil.isNullOrEmpty(partyChineseGivenName)) {
			sysInfPartcpDto.setGivenNameChi(partyChineseGivenName.getValue());
		}
		AddressV12CT address = defendant.getAddress();
		if (!CommonUtil.isNullOrEmpty(address)) {
			List<SysInfAddrDTO> sysInfAddrDtoList = new ArrayList<>();
			sysInfAddrDtoList.add(toSysInfAddrDto(address));
			sysInfPartcpDto.setAddresses(sysInfAddrDtoList);
		}
		sysInfPartcpDto.setDocumentType(null); //TODO TBC
		sysInfPartcpDto.setDocumentNo(null); //TODO TBC
		AgeV11CT age = defendant.getAge();
		if (!CommonUtil.isNullOrEmpty(age)) {
			sysInfPartcpDto.setPersonAge(age.getValue().toString());
			if (age.getValue().intValue() >= 16) {
				sysInfPartcpDto.setDefendantType(DefendantTypeEnum.ADULT);
			} else {
				sysInfPartcpDto.setDefendantType(DefendantTypeEnum.JUVENILE);
			}
		} else {
			sysInfPartcpDto.setDefendantType(DefendantTypeEnum.COMPANY);
		}
		sysInfPartcpDto.setLangType(new CodeTableDTO("PUT")); //TODO TBC
		PersonGenderCodeV10CT personGenderCode = defendant.getGender();
		if (!CommonUtil.isNullOrEmpty(personGenderCode)) {
			sysInfPartcpDto.setGendrType(new CodeTableDTO(personGenderCode.getValue()));
		}
		sysInfPartcpDto.setOfficerInChargeNo(null); //TODO TBC
		PhoneNumberV11CT phoneNumber = defendant.getPhoneNumber();
		if (!CommonUtil.isNullOrEmpty(phoneNumber)) {
			sysInfPartcpDto.setTelNo(phoneNumber.getValue());
		}
		sysInfPartcpDto.setDefendantIndex(0);
		sysInfPartcpDto.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.INFORMANT);
		return sysInfPartcpDto;
	}
	
	public static SysInfAddrDTO toSysInfAddrDto(AddressV12CT address) {
		SysInfAddrDTO sysInfAddrDto = new SysInfAddrDTO();
		EnglishAddressV12CT englishAddress = address.getEnglishAddress();
		if (!CommonUtil.isNullOrEmpty(englishAddress)) {
			List<EnglishAddressLineV11CT> englishAddressLineList = englishAddress.getEnglishAddressLine();
			if (!CommonUtil.isNullOrEmpty(englishAddressLineList)) {
				if (englishAddressLineList.size() > 0) {
					sysInfAddrDto.setAddrLine1Eng(address.getEnglishAddress().getEnglishAddressLine().get(0).getValue());
				}
				if (englishAddressLineList.size() > 1) {
					sysInfAddrDto.setAddrLine2Eng(address.getEnglishAddress().getEnglishAddressLine().get(1).getValue());
				}
				if (englishAddressLineList.size() > 2) {
					sysInfAddrDto.setAddrLine3Eng(address.getEnglishAddress().getEnglishAddressLine().get(2).getValue());
				}
			}

		}
		ChineseAddressV12CT chineseAddress = address.getChineseAddress();
		if (!CommonUtil.isNullOrEmpty(chineseAddress)) {
			List<ChineseAddressLineV11CT> chineseAddressLineList = chineseAddress.getChineseAddressLine();
			if (!CommonUtil.isNullOrEmpty(chineseAddressLineList)) {
				if (chineseAddressLineList.size() > 0) {
					sysInfAddrDto.setAddrLine1Chi(address.getChineseAddress().getChineseAddressLine().get(0).getValue());
				}
				if (chineseAddressLineList.size() > 1) {
					sysInfAddrDto.setAddrLine2Chi(address.getChineseAddress().getChineseAddressLine().get(1).getValue());
				}
				if (chineseAddressLineList.size() > 2) {
					sysInfAddrDto.setAddrLine3Chi(address.getChineseAddress().getChineseAddressLine().get(2).getValue());
				}
			}
		}
		sysInfAddrDto.setRegion(new CodeTableDTO(address.getAddressTerritory().getCodeName()));
		sysInfAddrDto.setAddressIndex(0);
		sysInfAddrDto.setAddressType(AddressTypeEnum.DEFENDANT_ADDRESS);
		return sysInfAddrDto;
	}
}
