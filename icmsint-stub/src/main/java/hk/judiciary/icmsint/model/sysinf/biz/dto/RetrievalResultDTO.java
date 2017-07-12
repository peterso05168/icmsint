package hk.judiciary.icmsint.model.sysinf.biz.dto;

import java.util.List;

public class RetrievalResultDTO extends CommonWsDTO {
	private List<LegacyDataDTO> dataList;

	public List<LegacyDataDTO> getDataList() {
		return dataList;
	}

	public void setDataList(List<LegacyDataDTO> dataList) {
		this.dataList = dataList;
	}
	
}
