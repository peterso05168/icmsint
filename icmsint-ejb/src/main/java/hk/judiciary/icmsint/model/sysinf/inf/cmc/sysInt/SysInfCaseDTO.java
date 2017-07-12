package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import java.util.List;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.SourceEnum;

public class SysInfCaseDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SOURCE, parent=CriminalCaseElementField.ELEMENT_HEADER)
	private String source = SourceEnum.SYSTEM_INTERFACE.getCode();
	@DraftCriminalCase(tag=CriminalCaseElementField.ELEMENT_DETAILS, parent=CriminalCaseElementField.ELEMENT_DRAFT_CRIMINAL_CASE)
	private SysInfCaseDetailsDTO details;
	@DraftCriminalCase(listTag=CriminalCaseElementField.ELEMENT_DEFTS, listParent=CriminalCaseElementField.ELEMENT_DRAFT_CRIMINAL_CASE, 
			   tag=CriminalCaseElementField.ELEMENT_DEFT, parent=CriminalCaseElementField.ELEMENT_DEFTS)
	private List<SysInfCaseDefendantDTO> defendants;
	@DraftCriminalCase(tag=CriminalCaseElementField.ELEMENT_OFFENCE_SECTION, parent=CriminalCaseElementField.ELEMENT_DRAFT_CRIMINAL_CASE)
	private SysInfCaseOffenceDTO caseOffence;
	public SysInfCaseDetailsDTO getDetails() {
		return details;
	}
	public void setDetails(SysInfCaseDetailsDTO details) {
		this.details = details;
	}
	public List<SysInfCaseDefendantDTO> getDefendants() {
		return defendants;
	}
	public void setDefendants(List<SysInfCaseDefendantDTO> defendants) {
		this.defendants = defendants;
	}
	public SysInfCaseOffenceDTO getCaseOffence() {
		return caseOffence;
	}
	public void setCaseOffence(SysInfCaseOffenceDTO caseOffence) {
		this.caseOffence = caseOffence;
	}
}
