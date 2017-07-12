package hk.judiciary.icmsint.model.sysinf.biz.dto;

import java.util.List;

public class ConversionResultDTO extends CommonWsDTO {
	private List<LegacyDataDTO> dataList;
	private Integer totalCount;

	public List<LegacyDataDTO> getDataList() {
		return dataList;
	}
	public void setDataList(List<LegacyDataDTO> dataList) {
		this.dataList = dataList;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
}
