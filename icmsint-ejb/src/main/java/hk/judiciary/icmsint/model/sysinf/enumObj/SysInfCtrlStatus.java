package hk.judiciary.icmsint.model.sysinf.enumObj;

public enum SysInfCtrlStatus {
	NEW("N","New"),
	DONE("D","Done"),
	SKIPPED("S","Skipped")
	;
	
	
	private String code;
	private String desc;
	private SysInfCtrlStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	public String code() {
		return code;
	}
	public String desc() {
		return desc;
	}

}
