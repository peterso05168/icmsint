package hk.judiciary.icmsint.model.sysinf.inf.cmc;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;

public class CodeTableDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CODE)
	private String code;
	public CodeTableDTO(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
