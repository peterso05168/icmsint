package hk.judiciary.icmsint.model.sysinf.converter.gdsnid2j;

import java.util.ArrayList;
import java.util.List;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icmsint.model.common.ConverterUtil;
import hk.judiciary.icmsint.model.sysinf.converter.impl.AbstractPopulatingConverter;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CodeTableDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.ComprisingCourtDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.CourtLvlTypeDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfAddrDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDefendantDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfCaseDetailsDTO;
import hk.judiciary.icmsint.model.sysinf.inf.cmc.sysInt.SysInfPartcpDTO;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.ChargeCaseDefendantV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.DefendantAddressApplicationV20CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.PrefixV13CT;

public class DefendantAddressApplicationV20CT_SysInfCaseDTO_Converter extends AbstractPopulatingConverter<DefendantAddressApplicationV20CT, SysInfCaseDTO> {

	@Override
	protected SysInfCaseDTO createTarget() {
		return new SysInfCaseDTO();
	}

	@Override
	public void populate(final DefendantAddressApplicationV20CT defendantAddrApp, final SysInfCaseDTO sysInfCase) {
		
		/**
		 * =================================================FILL IN CASE DETAILS=================================================
		 **/
		SysInfCaseDetailsDTO sysInfCaseDetailsDto = new SysInfCaseDetailsDTO();
		CourtLvlTypeDTO courtLvlType = new CourtLvlTypeDTO();
		ComprisingCourtDTO compsCourt = new ComprisingCourtDTO();
		compsCourt.setCourtLvlType(courtLvlType);
		if (!CommonUtil.isNullOrEmpty(defendantAddrApp.getCourtSys())) {
			compsCourt.setCompsCourtCode(defendantAddrApp.getCourtSys().getValue());
			sysInfCaseDetailsDto.setCompsCourt(compsCourt);
		}
		
		sysInfCaseDetailsDto.setCaseType(new CodeTableDTO(defendantAddrApp.getCaseType().getCodeName()));
		sysInfCaseDetailsDto.setReceiveDate(null); //TODO: AddressUpdateDate?
		sysInfCaseDetailsDto.setProsDept(new CodeTableDTO(defendantAddrApp.getProsecutionDepartmentCode().getCodeName()));
		sysInfCaseDetailsDto.setProsRefNo(defendantAddrApp.getDepartmentReferenceNumber().getValue());
		
		

		/**
		 * =================================================FILL IN DEFENDANTS=================================================
		 **/
		
		List<SysInfCaseDefendantDTO> defendants = new ArrayList<SysInfCaseDefendantDTO>();
		SysInfCaseDefendantDTO defendant = new SysInfCaseDefendantDTO();
		SysInfPartcpDTO partcp = new SysInfPartcpDTO();
		SysInfAddrDTO addr = new SysInfAddrDTO();
		List<SysInfAddrDTO> addrs = new ArrayList<SysInfAddrDTO>();
		addr = ConverterUtil.toSysInfAddrDto(defendantAddrApp.getDefendantAddress());
		addrs.add(addr);
		partcp.setAddresses(addrs);
		defendant.setDefendant(partcp);
		defendants.add(defendant);
		
		sysInfCase.setDetails(sysInfCaseDetailsDto);
		sysInfCase.setDefendants(defendants);
		sysInfCase.setCaseOffence(null);
	}
}
