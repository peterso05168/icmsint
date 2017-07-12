package hk.judiciary.icmsint.model.sysinf.converter;

public class ConversionException extends RuntimeException {
	private static final long serialVersionUID = -1;

	public ConversionException(final String msg, final Throwable cause)
	{
		super(msg, cause);
	}

	public ConversionException(final String msg)
	{
		super(msg);
	}

}
