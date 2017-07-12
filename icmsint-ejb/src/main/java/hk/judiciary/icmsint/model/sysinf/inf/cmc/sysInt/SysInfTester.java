package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseXMLWriter;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.ComprisingCourtDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CourtLvlTypeDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfAddrDTO.AddressTypeEnum;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO.DefendantTypeEnum;


public class SysInfTester {
	public static void main(String[] args) {
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();
		compsCourt.setCourtLvlType(courtLvlType);
		compsCourt.setCompsCourtCode("TW");
		
		CodeTableDTO caseType = new CodeTableDTO("FN");
		
		SysInfPartcpDTO informant = new SysInfPartcpDTO();
		informant.setGivenNameEng("TAI NAME");//EnglishName("CHAN TAI NAME");
		informant.setSurnameEng("CHAN");
		informant.setGivenNameChi("X");
		informant.setSurnameChi("X");
		informant.setOfficerInChargeNo("OIC-XXXX");
		informant.setTelNo("1112-3334");
		informant.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.INFORMANT);
		informant.setDefendantType(DefendantTypeEnum.ADULT);
		
		CodeTableDTO prosDept = new CodeTableDTO("EPD");
		
		SysInfCaseDetailsDTO details = new SysInfCaseDetailsDTO();
		details.setCourtLvlType(courtLvlType);
		details.setCompsCourt(compsCourt);
		details.setCaseType(caseType);
		details.setInformant(informant);
		details.setProsDept(prosDept);
		details.setDemandNoteNo("7700004057200116");
		details.setDemandNoteIssueDate(new Date());
		
		List<SysInfAddrDTO> d1Addrs = new ArrayList<SysInfAddrDTO>();
		
		List<SysInfCaseDefendantDTO> defendants = new ArrayList<SysInfCaseDefendantDTO>();
		
		CodeTableDTO region = new CodeTableDTO("K");
		
		SysInfAddrDTO d1Addr = new SysInfAddrDTO();
		d1Addr.setAddrLine1Eng("FLAT/RM B1 G/F SUI CHEUNG BLDG");
		d1Addr.setAddrLine2Eng("1-7 CHIU KWONG ST SAI WAN HK");
		d1Addr.setAddrLine1Chi("XXXXXXXX");
		d1Addr.setAddrLine2Chi("XXXXXXX");
		d1Addr.setRegion(region);
		d1Addr.setAddressIndex(1);
		d1Addr.setAddressType(AddressTypeEnum.DEFENDANT_ADDRESS);
		
		d1Addrs.add(d1Addr);
		
		CodeTableDTO documentType = new CodeTableDTO("B");
		
		SysInfPartcpDTO d1 = new SysInfPartcpDTO();
		d1.setAddresses(d1Addrs);
		d1.setDocumentType(documentType);
		d1.setDefendantIndex(1);
		d1.setGivenNameEng("Toys'R'Us");//EnglishName("Toys'R'Us");
		d1.setDocumentNo("10248581017");
		d1.setPartcpRoleType(SysInfPartcpDTO.PartcpRoleTypeEnum.DEFENDANT);
		d1.setDefendantType(DefendantTypeEnum.COMPANY);
		
		SysInfCaseDefendantDTO d1Group = new SysInfCaseDefendantDTO();
		d1Group.setDefendant(d1);
		
		defendants.add(d1Group);
		
		List<SysInfChrgAppDTO> offences = new ArrayList<SysInfChrgAppDTO>();
		
		SysInfAddrDTO ofncLoc = new SysInfAddrDTO();
		ofncLoc.setAddrLine1Eng("FLAT/RM B1 G/F SUI CHEUNG BLDG");
		ofncLoc.setAddrLine2Eng("1-7 CHIU KWONG ST SAI WAN HK");
		ofncLoc.setAddrLine1Chi("XXXXXXXX");
		ofncLoc.setAddrLine2Chi("XXXXXXX");
		ofncLoc.setRegion(region);
		ofncLoc.setAddressType(AddressTypeEnum.OFFENCE_LOCATION);
		
		CodeTableDTO dateOfOccType = new CodeTableDTO("ON");
		
		List<SysInfPartcpDTO> chargeToPartcps = new ArrayList<SysInfPartcpDTO>();
		chargeToPartcps.add(d1);
		
		List<SysInfSodVarValueDTO> sodVarValues = new ArrayList<SysInfSodVarValueDTO>();
		
		SysInfSodVarDTO sodVar = new SysInfSodVarDTO();
		sodVar.setName("Details");
		
		SysInfSodVarValueDTO sodVarValue1 = new SysInfSodVarValueDTO();
		sodVarValue1.setSodVarValueId(-1);
		sodVarValue1.setSodVarDTO(sodVar);
		sodVarValue1.setVarValue("ABC");
		sodVarValue1.setVarValueChin("lalala");
		
		sodVarValues.add(sodVarValue1);
		
		sodVar = new SysInfSodVarDTO();
		sodVar.setCd("D");
		
		SysInfSodVarValueDTO sodVarValue2 = new SysInfSodVarValueDTO();
		sodVarValue2.setSodVarValueId(-2);
		sodVarValue2.setSodVarDTO(sodVar);
		sodVarValue2.setVarValue("2");
		
		sodVarValues.add(sodVarValue2);
		
		SysInfChrgAppDTO c1 = new SysInfChrgAppDTO();
		c1.setOffenceLocation(ofncLoc);
		
		c1.setSeqNo("1");
		c1.setId(-1);
		c1.setChapNo("132");
		c1.setSectNo("83B");
		c1.setSubSectNo("1");
		c1.setSupplCd("A");
		c1.setVerNo("1");
		c1.setOfncDesc("plastic shopping bag");
		c1.setOfncDescChin("plastic shopping bag (C)");
		c1.setContryToLaw("Contrary to Law");
		c1.setContryToLawChin("Contrary to Law (C)");
		c1.setChrgPartcr("Charge Particular");
		c1.setChrgPartcrChin("Charge Particular (C)");
		c1.setDateOfOccType(dateOfOccType);
		c1.setDateOfOccStartDate(new Date());
		c1.setChargeToPartcps(chargeToPartcps);
		c1.setSodVarValues(sodVarValues);
		
		offences.add(c1);
		
		SysInfCaseOffenceDTO caseOffence = new SysInfCaseOffenceDTO();
		caseOffence.setCaseNature(c1);
		caseOffence.setOffences(offences);
		
		SysInfCaseDTO dataObject = new SysInfCaseDTO();
		dataObject.setDetails(details);
		dataObject.setDefendants(defendants);
		dataObject.setCaseOffence(caseOffence);
		
		try {
			CriminalCaseXMLWriter xmlWriter = new CriminalCaseXMLWriter(CriminalCaseElementField.ELEMENT_DRAFT_CRIMINAL_CASES, null);
			xmlWriter.genContent(dataObject);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.US);
			String fileName = sdf.format(new Date())+".xml";
			xmlWriter.exportToFile("C:/icms/draftCase/criminalCase/SysInf"+fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
