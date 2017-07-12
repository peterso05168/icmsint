package hk.judiciary.icmsint.model.sysinf.converter.gccid2j;

import hk.judiciary.icms.model.dao.entity.DfCriminalCase;
import hk.judiciary.icmsint.model.sysinf.converter.impl.AbstractPopulatingConverter;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.ChargeCaseV10CT;

public class ChargeCaseV10CT_DfCriminalCase_Converter
		extends AbstractPopulatingConverter<ChargeCaseV10CT, DfCriminalCase> {

	@Override
	protected DfCriminalCase createTarget() {
		return new DfCriminalCase();
	}
	
	@Override
	public void populate(final ChargeCaseV10CT chargeCase, final DfCriminalCase dfCriminalCase){
	
	}

}
