package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;

public class SysInfSodVarDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CODE)
	private String cd;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_NAME)
	private String name;
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
