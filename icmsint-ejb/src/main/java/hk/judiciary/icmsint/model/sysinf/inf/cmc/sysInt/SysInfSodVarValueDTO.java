package hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt;

import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.DraftCriminalCase;
import hk.judiciary.icmscase.model.cmcCriminalEdi.biz.xmlWriter.CriminalCaseElementField;

public class SysInfSodVarValueDTO {
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SOD_VAR_VALUE_ID)
	private Integer sodVarValueId;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SOD_VAR)
	private SysInfSodVarDTO sodVarDTO;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SOD_VAR_VALUE_ENG)
	private String varValue;
	@DraftCriminalCase(tag=CriminalCaseElementField.TAG_SOD_VAR_VALUE_CHI)
	private String varValueChin;
	public Integer getSodVarValueId() {
		return sodVarValueId;
	}
	public void setSodVarValueId(Integer sodVarValueId) {
		this.sodVarValueId = sodVarValueId;
	}
	public SysInfSodVarDTO getSodVarDTO() {
		return sodVarDTO;
	}
	public void setSodVarDTO(SysInfSodVarDTO sodVarDTO) {
		this.sodVarDTO = sodVarDTO;
	}
	public String getVarValue() {
		return varValue;
	}
	public void setVarValue(String varValue) {
		this.varValue = varValue;
	}
	public String getVarValueChin() {
		return varValueChin;
	}
	public void setVarValueChin(String varValueChin) {
		this.varValueChin = varValueChin;
	}
	
}
