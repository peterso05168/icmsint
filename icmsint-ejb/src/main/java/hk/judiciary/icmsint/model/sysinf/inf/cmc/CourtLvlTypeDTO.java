package hk.judiciary.icmsint.model.sysinf.inf.cmc;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;

public class CourtLvlTypeDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CODE)
	private String code = "MC";
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
