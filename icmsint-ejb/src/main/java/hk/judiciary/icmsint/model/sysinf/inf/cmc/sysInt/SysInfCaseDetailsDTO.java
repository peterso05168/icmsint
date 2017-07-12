package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import java.util.Date;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.ComprisingCourtDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CourtLvlTypeDTO;

public class SysInfCaseDetailsDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_COURT_LEVEL_TYPE)
	private CourtLvlTypeDTO courtLvlType;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_COMPS_COURT)
	private ComprisingCourtDTO compsCourt;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CASE_TYPE)
	private CodeTableDTO caseType;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_REVC_DATE)
	private Date receiveDate;
	@DraftCriminalCase(tag=CriminalCaseElementField.ELEMENT_INFORMANT)
	private SysInfPartcpDTO informant;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PROSECUTION_REF_NO)
	private String prosRefNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_INIT_DEPARTMENT)
	private CodeTableDTO prosDept;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DEMAND_NOTE_NO)
	private String demandNoteNo;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_DEMAND_NOTE_DATE)
	private Date demandNoteIssueDate;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_TIME_BAR_CALCULATION_TYPE)
	private CodeTableDTO timeBarCalculationType = new CodeTableDTO("OD");
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CASE_SER_NO)
	private String caseSerNo = "[AUTO]";
	public CourtLvlTypeDTO getCourtLvlType() {
		return courtLvlType;
	}
	public void setCourtLvlType(CourtLvlTypeDTO courtLvlType) {
		this.courtLvlType = courtLvlType;
	}
	public ComprisingCourtDTO getCompsCourt() {
		return compsCourt;
	}
	public void setCompsCourt(ComprisingCourtDTO compsCourt) {
		this.compsCourt = compsCourt;
	}
	public CodeTableDTO getCaseType() {
		return caseType;
	}
	public void setCaseType(CodeTableDTO caseType) {
		this.caseType = caseType;
	}
	public Date getReceiveDate() {
		return receiveDate;
	}
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}
	public SysInfPartcpDTO getInformant() {
		return informant;
	}
	public void setInformant(SysInfPartcpDTO informant) {
		this.informant = informant;
	}
	public String getProsRefNo() {
		return prosRefNo;
	}
	public void setProsRefNo(String prosRefNo) {
		this.prosRefNo = prosRefNo;
	}
	public CodeTableDTO getProsDept() {
		return prosDept;
	}
	public void setProsDept(CodeTableDTO prosDept) {
		this.prosDept = prosDept;
	}
	public String getDemandNoteNo() {
		return demandNoteNo;
	}
	public void setDemandNoteNo(String demandNoteNo) {
		this.demandNoteNo = demandNoteNo;
	}
	public Date getDemandNoteIssueDate() {
		return demandNoteIssueDate;
	}
	public void setDemandNoteIssueDate(Date demandNoteIssueDate) {
		this.demandNoteIssueDate = demandNoteIssueDate;
	}
	
}
