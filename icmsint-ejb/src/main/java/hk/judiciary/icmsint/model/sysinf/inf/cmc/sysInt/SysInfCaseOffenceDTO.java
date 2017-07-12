package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import java.util.List;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;

public class SysInfCaseOffenceDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PRIMARY_OFFENCE,
			   childTags={CriminalCaseElementField.TAG_OFFENCE_ID})
	private SysInfChrgAppDTO caseNature;
	@DraftCriminalCase(listTag=CriminalCaseElementField.ELEMENT_OFFENCES,
			   tag=CriminalCaseElementField.ELEMENT_OFFENCE, parent=CriminalCaseElementField.ELEMENT_OFFENCES)
	List<SysInfChrgAppDTO> offences;
	public SysInfChrgAppDTO getCaseNature() {
		return caseNature;
	}
	public void setCaseNature(SysInfChrgAppDTO caseNature) {
		this.caseNature = caseNature;
	}
	public List<SysInfChrgAppDTO> getOffences() {
		return offences;
	}
	public void setOffences(List<SysInfChrgAppDTO> offences) {
		this.offences = offences;
	}
}
