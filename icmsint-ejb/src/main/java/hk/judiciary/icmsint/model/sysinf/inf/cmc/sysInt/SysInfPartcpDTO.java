package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import java.util.List;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;

public class SysInfPartcpDTO {
	public static class PartcpRoleTypeEnum {
		public static String INFORMANT = "OCC";
		public static String DEFENDANT = "D";
		public static String ACCUSED = "A";
	}
	public static class DefendantTypeEnum {
		public static String ADULT = "A";
		public static String COMPANY = "C";
		public static String JUVENILE = "J";
	}
	private static class PartcpTypeEnum {
		public static String PERSON = "P";
		public static String ORGANIZATION = "O";
	}
	private static class LangTypeEnum {
		public static String PUNTI = "PUT";
	}
	private static class GenderEnum {
		public static String UNKNOWN = "U";
	}
	
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DEFT_ID)
	private Integer deftDtlId;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PARTCP_ROLE_ID)
	private Integer partcpRoleId;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SURNAME_ENG)
	private String surnameEng;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SURNAME_CHI)
	private String surnameChi;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_GIVEN_NAME_ENG)
	private String givenNameEng;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_GIVEN_NAME_CHI)
	private String givenNameChi;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DOCUMENT_TYPE)
	private CodeTableDTO documentType;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DOCUMENT_NO)
	private String documentNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PARTCP_TYPE)
	private CodeTableDTO partcpType;
	@DraftCriminalCase(listTag=CriminalCaseElementField.ELEMENT_ADDRESSES, 
			           tag=CriminalCaseElementField.ELEMENT_ADDRESS, parent=CriminalCaseElementField.ELEMENT_ADDRESSES)
	private List<SysInfAddrDTO> addresses;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PARTCP_ROLE_TYPE_IND)
	private String partcpRoleTypeIndicator;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PARTY_CAT_IND)
	private String ptyCatIndicator = "IND";
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_JUVENILE_FLAG)
	private String juvFlag;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PARTCP_TYPE_IND)
	private String partcpTypeIndicator;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_AGE)
	private String personAge;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DIALECT)
	private CodeTableDTO langType = new CodeTableDTO(LangTypeEnum.PUNTI);
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_GENDER)
	private CodeTableDTO gendrType = new CodeTableDTO(GenderEnum.UNKNOWN);
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DEFT_SEQ_NO)
	private String respondentSeqNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_OFFICER_IC_NO)
	private String officerInChargeNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_TEL_NO)
	private String telNo;
	public String getSurnameEng() {
		return surnameEng;
	}
	public void setSurnameEng(String surnameEng) {
		this.surnameEng = surnameEng;
	}
	public String getSurnameChi() {
		return surnameChi;
	}
	public void setSurnameChi(String surnameChi) {
		this.surnameChi = surnameChi;
	}
	public String getGivenNameEng() {
		return givenNameEng;
	}
	public void setGivenNameEng(String givenNameEng) {
		this.givenNameEng = givenNameEng;
	}
	public String getGivenNameChi() {
		return givenNameChi;
	}
	public void setGivenNameChi(String givenNameChi) {
		this.givenNameChi = givenNameChi;
	}
	public List<SysInfAddrDTO> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<SysInfAddrDTO> addresses) {
		this.addresses = addresses;
	}
	public CodeTableDTO getDocumentType() {
		return documentType;
	}
	public void setDocumentType(CodeTableDTO documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNo() {
		return documentNo;
	}
	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}
	public String getPersonAge() {
		return personAge;
	}
	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	public CodeTableDTO getLangType() {
		return langType;
	}
	public void setLangType(CodeTableDTO langType) {
		this.langType = langType;
	}
	public CodeTableDTO getGendrType() {
		return gendrType;
	}
	public void setGendrType(CodeTableDTO gendrType) {
		this.gendrType = gendrType;
	}
	public String getOfficerInChargeNo() {
		return officerInChargeNo;
	}
	public void setOfficerInChargeNo(String officerInChargeNo) {
		this.officerInChargeNo = officerInChargeNo;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	// Setup Function
	public void setDefendantIndex(int index) {
		this.deftDtlId = index * -1;
		this.partcpRoleId = index * -1;
		this.respondentSeqNo = String.valueOf(index);
	}
	public void setPartcpRoleType(String partcpRoleTypeEnum) {
		this.partcpRoleTypeIndicator = partcpRoleTypeEnum;
	}
	public void setDefendantType(String defendantTypeEnum) {
		if (defendantTypeEnum.equals(DefendantTypeEnum.ADULT)) {
			this.juvFlag = "0";
			this.partcpTypeIndicator = PartcpTypeEnum.PERSON;
		} else if (defendantTypeEnum.equals(DefendantTypeEnum.COMPANY)) {
			this.juvFlag = null;
			this.partcpTypeIndicator = PartcpTypeEnum.ORGANIZATION;
		} else if (defendantTypeEnum.equals(DefendantTypeEnum.JUVENILE)) {
			this.juvFlag = "1";
			this.partcpTypeIndicator = PartcpTypeEnum.PERSON;
		}
	}
}
