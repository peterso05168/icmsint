package hk.judiciary.icmsint.model.sysinf.biz.handler;

import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;

public interface GxxiMsgHandler<T> {
	public CommonWsDTO handle(T msg) throws SysInfHandlerException;
}
