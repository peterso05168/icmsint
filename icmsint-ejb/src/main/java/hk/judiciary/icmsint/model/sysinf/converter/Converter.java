package hk.judiciary.icmsint.model.sysinf.converter;

public interface Converter<SOURCE, TARGET> {
	/**
	 * Converts the source object, creating a new instance of the destination type
	 * 
	 * @param source
	 *           the source object
	 * @return the converted object
	 * @throws ConversionException
	 *            if an error occurs
	 */
	TARGET convert(SOURCE source) throws ConversionException;

	/**
	 * Convert the source object by filling the prototype
	 * 
	 * 
	 * @param source
	 *           the source object
	 * @param prototype
	 *           the prototype to fill
	 * @return the converted object, identical to the prototype
	 * @throws ConversionException
	 *            if an error occurs
	 */
	TARGET convert(SOURCE source, TARGET prototype) throws ConversionException;

}
