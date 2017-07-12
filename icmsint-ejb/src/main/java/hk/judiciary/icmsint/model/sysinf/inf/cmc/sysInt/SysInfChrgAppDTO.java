package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import java.util.Date;
import java.util.List;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;

public class SysInfChrgAppDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_OFFENCE_ID)
	private Integer id;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_OFFENCE_SEQ_NO)
	private String seqNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CHARGE_TYPE)
	private CodeTableDTO chargeType = new CodeTableDTO("PR");
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CHAP_NO)
	private String chapNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SUB_LEG)
	private String subLeg;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SECT_NO)
	private String sectNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SUB_SECT_NO)
	private String subSectNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PARA)
	private String para;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SUB_PARA)
	private String subPara;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SUPP_CODE)
	private String supplCd;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_VERSION_NO)
	private String verNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_OFFENCE_DESC_ENG)
	private String ofncDesc;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_OFFENCE_DESC_CHI)
	private String ofncDescChin;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CONTRARY_TO_LAW_ENG)
	private String contryToLaw;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CONTRARY_TO_LAW_CHI)
	private String contryToLawChin;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CHARGE_PARTICULAR_ENG)
	private String chrgPartcr;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CHARGE_PARTICULAR_CHI)
	private String chrgPartcrChin;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_OFFENCE_LOCATION)
	private SysInfAddrDTO offenceLocation;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DATE_OF_OCC_TYPE)
	private CodeTableDTO dateOfOccType;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DATE_OF_OCC_START_DATE)
	private Date dateOfOccStartDate;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DATE_OF_OCC_END_DATE)
	private Date dateOfOccEndDate;
	@DraftCriminalCase(listTag=CriminalCaseElementField.ELEMENT_CHRG_TO_PARTCPS,
			           tag=CriminalCaseElementField.ELEMENT_CHRG_TO_PARTCP, parent=CriminalCaseElementField.ELEMENT_CHRG_TO_PARTCPS,
			           childTags={CriminalCaseElementField.TAG_PARTCP_ROLE_ID})
	private List<SysInfPartcpDTO> chargeToPartcps;
	@DraftCriminalCase(listTag=CriminalCaseElementField.ELEMENT_SOD_VARIABLES,
					   tag=CriminalCaseElementField.ELEMENT_SOD_VARIABLE, parent=CriminalCaseElementField.ELEMENT_SOD_VARIABLES)
	List<SysInfSodVarValueDTO> sodVarValues;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_HEARING_TIME_WEIGHT)
	private CodeTableDTO hearingTimeWeight = new CodeTableDTO("1");
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PENALTY_WEIGHT)
	private CodeTableDTO penaltyWeight = new CodeTableDTO("1");
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChapNo() {
		return chapNo;
	}
	public void setChapNo(String chapNo) {
		this.chapNo = chapNo;
	}
	public String getSubLeg() {
		return subLeg;
	}
	public void setSubLeg(String subLeg) {
		this.subLeg = subLeg;
	}
	public String getSectNo() {
		return sectNo;
	}
	public void setSectNo(String sectNo) {
		this.sectNo = sectNo;
	}
	public String getSubSectNo() {
		return subSectNo;
	}
	public void setSubSectNo(String subSectNo) {
		this.subSectNo = subSectNo;
	}
	public String getPara() {
		return para;
	}
	public void setPara(String para) {
		this.para = para;
	}
	public String getSubPara() {
		return subPara;
	}
	public void setSubPara(String subPara) {
		this.subPara = subPara;
	}
	public String getSupplCd() {
		return supplCd;
	}
	public void setSupplCd(String supplCd) {
		this.supplCd = supplCd;
	}
	public String getVerNo() {
		return verNo;
	}
	public void setVerNo(String verNo) {
		this.verNo = verNo;
	}
	public String getOfncDesc() {
		return ofncDesc;
	}
	public void setOfncDesc(String ofncDesc) {
		this.ofncDesc = ofncDesc;
	}
	public String getOfncDescChin() {
		return ofncDescChin;
	}
	public void setOfncDescChin(String ofncDescChin) {
		this.ofncDescChin = ofncDescChin;
	}
	public String getContryToLaw() {
		return contryToLaw;
	}
	public void setContryToLaw(String contryToLaw) {
		this.contryToLaw = contryToLaw;
	}
	public String getContryToLawChin() {
		return contryToLawChin;
	}
	public void setContryToLawChin(String contryToLawChin) {
		this.contryToLawChin = contryToLawChin;
	}
	public String getChrgPartcr() {
		return chrgPartcr;
	}
	public void setChrgPartcr(String chrgPartcr) {
		this.chrgPartcr = chrgPartcr;
	}
	public String getChrgPartcrChin() {
		return chrgPartcrChin;
	}
	public void setChrgPartcrChin(String chrgPartcrChin) {
		this.chrgPartcrChin = chrgPartcrChin;
	}
	public SysInfAddrDTO getOffenceLocation() {
		return offenceLocation;
	}
	public void setOffenceLocation(SysInfAddrDTO offenceLocation) {
		this.offenceLocation = offenceLocation;
	}
	public CodeTableDTO getDateOfOccType() {
		return dateOfOccType;
	}
	public void setDateOfOccType(CodeTableDTO dateOfOccType) {
		this.dateOfOccType = dateOfOccType;
	}
	public Date getDateOfOccStartDate() {
		return dateOfOccStartDate;
	}
	public void setDateOfOccStartDate(Date dateOfOccStartDate) {
		this.dateOfOccStartDate = dateOfOccStartDate;
	}
	public Date getDateOfOccEndDate() {
		return dateOfOccEndDate;
	}
	public void setDateOfOccEndDate(Date dateOfOccEndDate) {
		this.dateOfOccEndDate = dateOfOccEndDate;
	}
	public List<SysInfPartcpDTO> getChargeToPartcps() {
		return chargeToPartcps;
	}
	public void setChargeToPartcps(List<SysInfPartcpDTO> chargeToPartcps) {
		this.chargeToPartcps = chargeToPartcps;
	}
	public List<SysInfSodVarValueDTO> getSodVarValues() {
		return sodVarValues;
	}
	public void setSodVarValues(List<SysInfSodVarValueDTO> sodVarValues) {
		this.sodVarValues = sodVarValues;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	
}
