package hk.judiciary.icmsint.model.sysinf.biz.generator;

import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;

public interface GxxiMsgGenerator {
	public CommonWsDTO generate() throws SysInfGeneratorException;
}
