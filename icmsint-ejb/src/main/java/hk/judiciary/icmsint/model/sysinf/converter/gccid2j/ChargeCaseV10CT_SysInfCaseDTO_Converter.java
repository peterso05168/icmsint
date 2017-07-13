package hk.judiciary.icmsint.model.sysinf.converter.gccid2j;

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
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfSodVarDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfSodVarValueDTO;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.AddressV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.CaseSODV12CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.ChargeCaseDefendantV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.ChargeCaseOffenceV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.ChargeCaseV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.ChineseAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.EnglishAddressLineV11CT;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.InformantV12CT;

public class ChargeCaseV10CT_SysInfCaseDTO_Converter extends AbstractPopulatingConverter<ChargeCaseV10CT, SysInfCaseDTO> {

	@Override
	protected SysInfCaseDTO createTarget() {
		return new SysInfCaseDTO();
	}
	
	@Override
	public void populate(final ChargeCaseV10CT chargeCase, final SysInfCaseDTO sysInfCase){
		
		/**
		 * =================================================FILL IN CASE DETAILS=================================================
		 **/
		SysInfCaseDetailsDTO details = new SysInfCaseDetailsDTO();
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();
		CodeTableDTO caseType = null;
		CodeTableDTO prosDept = null;
		
		//FIXME: COURT LVL TYPE NOT FOUND IN chargeCase
		compsCourt.setCourtLvlType(courtLvlType);		
		details.setCourtLvlType(courtLvlType);
		if (!CommonUtil.isNullOrEmpty(chargeCase.getCourtSys())) {
			compsCourt.setCompsCourtCode(chargeCase.getCourtSys().getValue());
			details.setCompsCourt(compsCourt);
		}
		
		if (!CommonUtil.isNullOrEmpty(chargeCase.getCaseType())) {
			caseType = new CodeTableDTO(chargeCase.getCaseType().getValue());
			details.setCaseType(caseType);
		}

		//FIXME: RECEIVED DATE NOT FOUND IN chargeCase
		details.setReceiveDate(null);

		SysInfPartcpDTO informant = new SysInfPartcpDTO();
		InformantV12CT inf = chargeCase.getInformantDetails();
		informant.setDefendantType(DefendantTypeEnum.ADULT);
		informant.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.INFORMANT);		
		if (!CommonUtil.isNullOrEmpty(inf)) {			
			details.setInformant(ConverterUtil.toSysInfPartcpDto(inf));
		}		

		if (!CommonUtil.isNullOrEmpty(chargeCase.getDepartmentReferenceNumber())) {
			details.setProsRefNo(chargeCase.getDepartmentReferenceNumber().getValue());
		}
		
		if (!CommonUtil.isNullOrEmpty(chargeCase.getProsecutionDepartmentCode())) {
			if (!CommonUtil.isNullOrEmpty(chargeCase.getProsecutionDepartmentCode().getCodeName())) {
				details.setProsDept(new CodeTableDTO(chargeCase.getProsecutionDepartmentCode().getCodeName()));
			}
		}	

		//FIXME: DEMAND NOTE AND DEMAND NOTE ISSUE DATE NO NOT FOUND IN chargeCase
		details.setDemandNoteNo(null);	
		details.setDemandNoteIssueDate(null);
		
		
		
		/**
		 * =================================================FILL IN DEFENDANTS=================================================
		 **/
		List<ChargeCaseDefendantV10CT> lstDef = chargeCase.getDefendantDetails();
		List<SysInfCaseDefendantDTO> defendants = new ArrayList<SysInfCaseDefendantDTO>();
		
		int defendantIdx = 0;		
		for (ChargeCaseDefendantV10CT def:lstDef) {
			AddressV12CT addr = def.getAddress();		
			SysInfCaseDefendantDTO defendantGroup = new SysInfCaseDefendantDTO();
			SysInfAddrDTO defendantAddr = new SysInfAddrDTO();
			List<SysInfAddrDTO> defendantAddrs = new ArrayList<SysInfAddrDTO>();
			SysInfPartcpDTO defendant = new SysInfPartcpDTO();
			
			if (!CommonUtil.isNullOrEmpty(def.getPartyEnglishSurname())) {
				defendant.setSurnameEng(def.getPartyEnglishSurname().getValue());
			}	
			if (!CommonUtil.isNullOrEmpty(def.getPartyEnglishGivenName())) {
				defendant.setGivenNameEng(def.getPartyEnglishGivenName().getValue());
			}	
			if (!CommonUtil.isNullOrEmpty(def.getPartyChineseSurname())) {
				defendant.setSurnameChi(def.getPartyChineseSurname().getValue());
			}	
			if (!CommonUtil.isNullOrEmpty(def.getPartyChineseGivenName())) {
				defendant.setGivenNameChi(def.getPartyChineseGivenName().getValue());
			}
			List<EnglishAddressLineV11CT> lstEngAddrLine = new ArrayList<EnglishAddressLineV11CT>();
			List<ChineseAddressLineV11CT> lstChiAddrLine = new ArrayList<ChineseAddressLineV11CT>();
			if (!CommonUtil.isNullOrEmpty(addr.getEnglishAddress())) {
				if (!CommonUtil.isNullOrEmpty(addr.getEnglishAddress().getEnglishAddressLine())) {
					lstEngAddrLine.addAll(addr.getEnglishAddress().getEnglishAddressLine());
				}
				if (lstEngAddrLine.size() > 0) {
					defendantAddr.setAddrLine1Eng(lstEngAddrLine.get(0).getValue());
				}
				if (lstEngAddrLine.size() > 1) {
					defendantAddr.setAddrLine2Eng(lstEngAddrLine.get(1).getValue());
				}
				if (lstEngAddrLine.size() > 2) {
					defendantAddr.setAddrLine3Eng(lstEngAddrLine.get(2).getValue());
				}
				
				if (!CommonUtil.isNullOrEmpty(addr.getChineseAddress().getChineseAddressLine())) {
					lstChiAddrLine.addAll(addr.getChineseAddress().getChineseAddressLine());
				}
				if (lstChiAddrLine.size() > 0) {
					defendantAddr.setAddrLine1Chi(lstChiAddrLine.get(0).getValue());
				}
				if (lstChiAddrLine.size() > 1) {
					defendantAddr.setAddrLine2Chi(lstChiAddrLine.get(1).getValue());
				}
				if (lstChiAddrLine.size() > 2) {
					defendantAddr.setAddrLine3Chi(lstChiAddrLine.get(2).getValue());
				}
			}
			if (!CommonUtil.isNullOrEmpty(def.getDefendantType())) {	
				defendant.setDefendantType(def.getDefendantType().getValue());
			}			
			
			//FIXME: REGION NOT FOUND IN chargeCase
			defendantAddr.setRegion(null);
			//FIXME: UNKNOWN PURPOSE FOR ADDRESS INDEX
			defendantAddr.setAddressIndex(0);
			defendantAddr.setAddressType(AddressTypeEnum.DEFENDANT_ADDRESS);
			defendantAddrs.add(defendantAddr);
			defendant.setAddresses(defendantAddrs);
			
			//FIXME: DOCUMENT TYPE NOT FOUND IN chargeCase
			defendant.setDocumentType(null);
			//FIXME: DOCUMENT NO NOT FOUND IN chargeCase
			defendant.setDocumentNo(null);
			if (!CommonUtil.isNullOrEmpty(def.getAge())) {
				defendant.setPersonAge(def.getAge().getValue().toString());
			}
			if (!CommonUtil.isNullOrEmpty(def.getInterpretLanguage())) {
					defendant.setLangType(new CodeTableDTO(def.getInterpretLanguage().getValue()));			
			}
			if (!CommonUtil.isNullOrEmpty(def.getGender())) {
				if (!CommonUtil.isNullOrEmpty(def.getGender().getCodeName())) {
					defendant.setGendrType(new CodeTableDTO(def.getGender().getCodeName()));				
				}
			}
			defendant.setOfficerInChargeNo(null);
			if (!CommonUtil.isNullOrEmpty(def.getPhoneNumber())) {
				defendant.setTelNo(def.getPhoneNumber().getValue());
			}
			defendant.setDefendantIndex(defendantIdx++);
			defendant.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.DEFENDANT);
			if (!CommonUtil.isNullOrEmpty(def.getDefendantType())) {
				defendant.setDefendantType(def.getDefendantType().getValue());
			}
			defendantGroup.setDefendant(defendant);
			defendants.add(defendantGroup);
		}
		
		
		
		/**
		 * =================================================FILL IN CASE OFFENCE=================================================
		 **/
		List<SysInfChrgAppDTO> offences = new ArrayList<SysInfChrgAppDTO>();
		SysInfCaseOffenceDTO caseOffence = new SysInfCaseOffenceDTO();

		List<ChargeCaseOffenceV10CT> chargeCaseOffenceList = chargeCase.getOffenceDetails();
		for (ChargeCaseOffenceV10CT chargeCaseOffence: chargeCaseOffenceList) {
			SysInfChrgAppDTO caseNature = new SysInfChrgAppDTO();			
			CaseSODV12CT caseSOD = chargeCaseOffence.getCaseSODDetails();
			//FIXME: ID CANNOT BE FOUND IN chargeCase
			caseNature.setId(null);
			if (!CommonUtil.isNullOrEmpty(caseSOD)) {
				if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey())) {
					if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey().getChapter())) {
						caseNature.setChapNo(caseSOD.getSODKey().getChapter().getValue().toString());
					}
					if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey().getSubLegislative())) {
						caseNature.setSubLeg(caseSOD.getSODKey().getSubLegislative().getValue());
					}
					if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey().getSection())) {
						caseNature.setSectNo(caseSOD.getSODKey().getSection().getValue());
					}
					if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey().getSubSection())) {
						caseNature.setSubSectNo(caseSOD.getSODKey().getSubSection().getValue());
					}
					if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey().getParagraph())) {
						caseNature.setPara(caseSOD.getSODKey().getParagraph().getValue());
					}
					if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey().getSubParagraph())) {
						caseNature.setSubPara(caseSOD.getSODKey().getSubParagraph().getValue());
					}
					if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey().getSupplementCode())) {
						caseNature.setSupplCd(caseSOD.getSODKey().getSupplementCode().getValue());
					}
					if (!CommonUtil.isNullOrEmpty(caseSOD.getSODKey().getVersionNumber())) {
						caseNature.setVerNo(caseSOD.getSODKey().getVersionNumber().getValue());
					}
				}
				if (!CommonUtil.isNullOrEmpty(caseSOD.getOffenceDescription())) {
					caseNature.setOfncDesc(caseSOD.getOffenceDescription().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(caseSOD.getOffenceDescriptionChinese())) {
					caseNature.setOfncDescChin(caseSOD.getOffenceDescriptionChinese().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(caseSOD.getContraryToLaw())) {
					caseNature.setContryToLaw(caseSOD.getContraryToLaw().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(caseSOD.getContraryToLawChinese())) {
					caseNature.setContryToLawChin(caseSOD.getContraryToLawChinese().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(caseSOD.getChargeParticular())) {
					caseNature.setChrgPartcr(caseSOD.getChargeParticular().getValue());
				}
				if (!CommonUtil.isNullOrEmpty(caseSOD.getChargeParticularChinese())) {
					caseNature.setChrgPartcrChin(caseSOD.getChargeParticularChinese().getValue());
				}
			}			
			
			SysInfAddrDTO ofncLoc = new SysInfAddrDTO();
			//FIXME: ADDR CANNOT BE FOUND IN chargeCase
			ofncLoc.setAddrLine1Eng(null);
			ofncLoc.setAddrLine2Eng(null);
			ofncLoc.setAddrLine3Eng(null);
			ofncLoc.setAddrLine1Chi(null);
			ofncLoc.setAddrLine2Chi(null);
			ofncLoc.setAddrLine3Chi(null);
			ofncLoc.setRegion(null);
			ofncLoc.setAddressIndex(0);
			ofncLoc.setAddressType(AddressTypeEnum.OFFENCE_LOCATION);
			//Assign null if no values is found
			caseNature.setOffenceLocation(null);	
			
			//FIXME: DATE OF OCC RELATED CANNOT BE FOUND IN chargeCase
			caseNature.setDateOfOccType(null);
			caseNature.setDateOfOccStartDate(null);
			caseNature.setDateOfOccEndDate(null);
			
			//FIXME: CHARGE TO PARTCPS CANNOT BE FOUND IN chargeCase
			List<SysInfPartcpDTO> chargeToPartcps = new ArrayList<SysInfPartcpDTO>();
			SysInfPartcpDTO chargeToPartcp = new SysInfPartcpDTO();
			//chargeToPartcps.add(chargeToPartcp);
			//caseNature.setChargeToPartcps(chargeToPartcps);
			//Assign null if no values is found
			caseNature.setChargeToPartcps(null);
			
			//FIXME: SOD VAR VALUES CANNOT BE FOUND IN chargeCase
			List<SysInfSodVarValueDTO> sodVarValues = new ArrayList<SysInfSodVarValueDTO>();
			SysInfSodVarDTO sodVar = new SysInfSodVarDTO();			
			SysInfSodVarValueDTO sodVarValue1 = new SysInfSodVarValueDTO();
			sodVarValue1.setSodVarValueId(null);
			//Assign null if no values is found
			//sodVarValue1.setSodVarDTO(sodVar);
			sodVarValue1.setSodVarDTO(null);
			sodVarValue1.setVarValue(null);
			sodVarValue1.setVarValueChin(null);			
			sodVarValues.add(sodVarValue1);
			//Assign null if no values is found
			//caseNature.setSodVarValues(sodVarValues);
			caseNature.setSodVarValues(null);
			caseNature.setSeqNo(chargeCaseOffence.getOffenceSequenceNumber().getValue().toString());
			caseOffence.setCaseNature(caseNature);
			offences.add(caseNature);
		}
		
		caseOffence.setOffences(offences);
	
		sysInfCase.setDetails(details);
		sysInfCase.setDefendants(defendants);
		sysInfCase.setCaseOffence(caseOffence);

	}

}
