package hk.judiciary.icmsint.model.sysinf.converter.impl;

import hk.judiciary.icmsint.model.sysinf.converter.ConversionException;
import hk.judiciary.icmsint.model.sysinf.converter.Converter;
import hk.judiciary.icmsint.model.sysinf.converter.Populator;

public abstract class AbstractConverter<SOURCE, TARGET>
		implements Converter<SOURCE, TARGET>, Populator<SOURCE, TARGET> {
	
	/**
	 * Override this method to create the instance of target type.
	 * 
	 * @return the new target instance
	 */
	protected abstract TARGET createTarget();
	
//	@Override
//	public void populate(SOURCE source, TARGET target) throws ConversionException {
//		// TODO Auto-generated method stub
//
//	}
	/**
	 * Override this method to populate the target from the source
	 * 
	 * @param source
	 *           the source instance
	 * @param target
	 *           the target instance to fill
	 */
	@Override
	public abstract void populate(final SOURCE source, final TARGET target);

	@Override
	public TARGET convert(SOURCE source) throws ConversionException {
		return convert(source, createTarget());
	}

	@Override
	public TARGET convert(SOURCE source, TARGET prototype) throws ConversionException {
		populate(source, prototype);
		return prototype;
	}

}
