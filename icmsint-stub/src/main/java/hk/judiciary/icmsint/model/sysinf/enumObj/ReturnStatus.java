package hk.judiciary.icmsint.model.sysinf.enumObj;

public enum ReturnStatus {

	SUCCESS ("0000", "Success"),

	CODE_NOT_FOUND ("0101", "Code Not Found"),
	CODE_FOUND_MORE_THAN_ONE("0102","Code Found More Than One Entry" ),
	SEARCH_KEY_NOT_DEFINED("0103","Search Key Not Defined"),
	SEARCH_KEY_MORE_THAN_DEFINED("0104","Search Key More Than Defined"),
	SEARCH_MORE_THAN_ONE_RESULT("0105","Search Found More Than One Result"),
	INCOMPLETE_DATA ("INC_DATA", "Incomplete data"),
	UNKNOWN_ERROR ("UNKNOWN", "Unknown error")
	;
	
	
	private String code;
	private String desc;
	private ReturnStatus(String code, String desc) {
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
