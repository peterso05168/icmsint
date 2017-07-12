package hk.judiciary.icmsint.model.sysinf.biz.handler;

public class SysInfHandlerException extends Exception {
	private static final long serialVersionUID = -1;

	public SysInfHandlerException(final String msg, final Throwable cause)
	{
		super(msg, cause);
	}

	public SysInfHandlerException(final String msg)
	{
		super(msg);
	}

}
