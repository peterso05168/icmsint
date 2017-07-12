package hk.judiciary.icmsint.model.sysinf.converter.gdsnij2d;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import hk.judiciary.icmsint.model.sysinf.converter.impl.AbstractPopulatingConverter;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.CaseNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.CaseSerialNumberV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.CaseTypeV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.CaseYearV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.CourtSysV10CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.WarrantStatusChangeV20CT;
import hk.judiciary.icmswar.model.warrant.biz.dto.ws.CaseWsDTO;
import hk.judiciary.icmswar.model.warrant.biz.dto.ws.WarrantWsDTO;

public class WarrantWsDTOConvert extends AbstractPopulatingConverter<WarrantWsDTO, WarrantStatusChangeV20CT> {

	@Override
	protected WarrantStatusChangeV20CT createTarget() {
		return new WarrantStatusChangeV20CT();
	}
	
	@Override
	public void populate(final WarrantWsDTO warrant, final WarrantStatusChangeV20CT warrantStatusChangeV20CT){
		
		CaseWsDTO warrantCase=warrant.getMainCase();

		CaseNumberV10CT caseNumber=new CaseNumberV10CT();
		
		CourtSysV10CT courtSysV10CT=new CourtSysV10CT();
		courtSysV10CT.setValue(warrantCase.getCompsCourtCd());
		caseNumber.setCourtSys(courtSysV10CT);
		
		CaseTypeV10CT caseTypeV10CT = new CaseTypeV10CT();
		caseTypeV10CT.setValue(warrantCase.getCaseTypeCd());
		caseNumber.setCaseType(caseTypeV10CT);
		
		CaseSerialNumberV10CT caseSerialNumberV10CT=new CaseSerialNumberV10CT();
		caseSerialNumberV10CT.setValue(BigInteger.valueOf(Long.parseLong(warrantCase.getCaseSerNo())));
		caseNumber.setCaseSerialNumber(caseSerialNumberV10CT);
		
		CaseYearV10CT caseYearV10CT=new CaseYearV10CT();
		XMLGregorianCalendar xmlDate=null;
		try {
			DateFormat df=new SimpleDateFormat("yyyy");
			Date year=df.parse( warrantCase.getCaseYear());
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(year);
			xmlDate=DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		}
		catch(Exception e){
			
		}
		caseYearV10CT.setValue(xmlDate);
		caseNumber.setCaseYear(caseYearV10CT);
		
		warrantStatusChangeV20CT.setCaseNumber(caseNumber);
	}

}
