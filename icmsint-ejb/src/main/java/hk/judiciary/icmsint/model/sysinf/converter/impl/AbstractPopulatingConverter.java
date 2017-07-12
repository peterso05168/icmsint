package hk.judiciary.icmsint.model.sysinf.converter.impl;

import java.util.List;

import hk.judiciary.icmsint.model.sysinf.converter.Populator;

public abstract class AbstractPopulatingConverter<SOURCE, TARGET> extends AbstractConverter<SOURCE, TARGET> {

	private List<Populator<SOURCE, TARGET>> populators;
	
	protected List<Populator<SOURCE, TARGET>> getPopulators()
	{
		return populators;
	}

	// Optional
	public void setPopulators(final List<Populator<SOURCE, TARGET>> populators)
	{
		this.populators = populators;
	}
	
	/**
	 * Populate the target instance from the source instance.
	 * Calls a list of injected populators to populate the instance.
	 *
	 * @param source the source item
	 * @param target the target item to populate
	 */
	@Override
	public void populate(final SOURCE source, final TARGET target)
	{
		if (getPopulators() != null)
		{
			for (final Populator<SOURCE, TARGET> populator : getPopulators())
			{
				populator.populate(source, target);
			}
		}
	}
	
//	@Override
//	protected TARGET createTarget() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void populate(SOURCE source, TARGET target) {
//		// TODO Auto-generated method stub
//
//	}

}
