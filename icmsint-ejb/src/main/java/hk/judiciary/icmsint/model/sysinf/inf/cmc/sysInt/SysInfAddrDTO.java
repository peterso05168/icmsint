package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;

public class SysInfAddrDTO {
	public static class AddressTypeEnum {
		public static String DEFENDANT_ADDRESS = "DEFT_ADDR";
		public static String OFFENCE_LOCATION = "OFNC_LOC";
	}
	private static class AddressRoleTypeEnum {
		public static String RESIDENT_ADDRESS = "RA";
	}
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_ADDR_LINE_1_ENG)
	private String addrLine1Eng;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_ADDR_LINE_2_ENG)
	private String addrLine2Eng;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_ADDR_LINE_3_ENG)
	private String addrLine3Eng;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_ADDR_LINE_1_CHI)
	private String addrLine1Chi;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_ADDR_LINE_2_CHI)
	private String addrLine2Chi;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_ADDR_LINE_3_CHI)
	private String addrLine3Chi;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_ADDR_SEQ_NO)
	private String addrSeqNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_REGION)
	private CodeTableDTO region;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_POSTAL_SERVICE_FLAG)
	private String postalServFlag;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PERSON_SERVICE_FLAG)
	private String personServFlag;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_EXECUTION_FLAG)
	private String execServFlag;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_ADDR_ROLE_TYPE_IND)
	private String addrRoleTypeIndicator;
	public String getAddrLine1Eng() {
		return addrLine1Eng;
	}
	public void setAddrLine1Eng(String addrLine1Eng) {
		this.addrLine1Eng = addrLine1Eng;
	}
	public String getAddrLine2Eng() {
		return addrLine2Eng;
	}
	public void setAddrLine2Eng(String addrLine2Eng) {
		this.addrLine2Eng = addrLine2Eng;
	}
	public String getAddrLine3Eng() {
		return addrLine3Eng;
	}
	public void setAddrLine3Eng(String addrLine3Eng) {
		this.addrLine3Eng = addrLine3Eng;
	}
	public String getAddrLine1Chi() {
		return addrLine1Chi;
	}
	public void setAddrLine1Chi(String addrLine1Chi) {
		this.addrLine1Chi = addrLine1Chi;
	}
	public String getAddrLine2Chi() {
		return addrLine2Chi;
	}
	public void setAddrLine2Chi(String addrLine2Chi) {
		this.addrLine2Chi = addrLine2Chi;
	}
	public String getAddrLine3Chi() {
		return addrLine3Chi;
	}
	public void setAddrLine3Chi(String addrLine3Chi) {
		this.addrLine3Chi = addrLine3Chi;
	}
	public CodeTableDTO getRegion() {
		return region;
	}
	public void setRegion(CodeTableDTO region) {
		this.region = region;
	}
	// Setup Function
	public void setAddressIndex(int index) {
		this.addrSeqNo = String.valueOf(index);
	}
	public void setAddressType(String addressTypeEnum) {
		if (addressTypeEnum.equals(AddressTypeEnum.DEFENDANT_ADDRESS)) {
			this.addrRoleTypeIndicator = AddressRoleTypeEnum.RESIDENT_ADDRESS;
			this.postalServFlag = "1";
			this.personServFlag = "1";
			this.execServFlag = "1";
		} else if (addressTypeEnum.equals(AddressTypeEnum.OFFENCE_LOCATION)) {
			this.addrRoleTypeIndicator = AddressRoleTypeEnum.RESIDENT_ADDRESS;
		}
	}
}
