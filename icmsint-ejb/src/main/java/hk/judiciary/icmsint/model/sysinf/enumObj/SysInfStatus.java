package hk.judiciary.icmsint.model.sysinf.enumObj;

public enum SysInfStatus {
	
	SUCCESS("S","Success"),
	FAIL("F","Fail"),
	ACCEPT("A","Accept"),
	REJECT("J","Reject"),
	NORMAL("N","Normal"),
	CHANGE("C","Change"),
	ROLLBACK("R","Rollback")
	;
	
	private String code;
	private String desc;
	private SysInfStatus(String code, String desc) {
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
