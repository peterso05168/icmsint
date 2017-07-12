package hk.judiciary.icmsint.model.sysinf.inf.cmc;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;

public class ComprisingCourtDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_CODE)
	private String compsCourtCode;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_PREFIX)
	private String compsCourtPrfx;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_COURT_LEVEL_TYPE)
	private CourtLvlTypeDTO courtLvlType;
	public String getCompsCourtCode() {
		return compsCourtCode;
	}
	public void setCompsCourtCode(String compsCourtCode) {
		this.compsCourtCode = compsCourtCode;
	}
	public String getCompsCourtPrfx() {
		return compsCourtPrfx;
	}
	public void setCompsCourtPrfx(String compsCourtPrfx) {
		this.compsCourtPrfx = compsCourtPrfx;
	}
	public CourtLvlTypeDTO getCourtLvlType() {
		return courtLvlType;
	}
	public void setCourtLvlType(CourtLvlTypeDTO courtLvlType) {
		this.courtLvlType = courtLvlType;
	}
}
