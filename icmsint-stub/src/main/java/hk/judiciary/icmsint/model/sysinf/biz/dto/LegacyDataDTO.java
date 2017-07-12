package hk.judiciary.icmsint.model.sysinf.biz.dto;

public class LegacyDataDTO {
	private String fileName;
	private String fileData;
	private Boolean forCaseman;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileData() {
		return fileData;
	}
	public void setFileData(String fileData) {
		this.fileData = fileData;
	}
	public Boolean isForCaseman() {
		return forCaseman;
	}
	public void setForCaseman(Boolean forCaseman) {
		this.forCaseman = forCaseman;
	}
	
}
