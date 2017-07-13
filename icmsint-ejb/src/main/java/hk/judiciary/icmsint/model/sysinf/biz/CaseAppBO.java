package hk.judiciary.icmsint.model.sysinf.biz;

import java.io.File;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icmsint.model.BaseBO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;
import hk.judiciary.icmsint.model.sysinf.biz.generator.CourtPaymentGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.AcknowledgementofCaseDocumentGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.DepartmentalNoticeAllocationResultGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.FixedPenaltyDistressWarrantAllocationGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.FixedPenaltyDistressWarrantStatusChangeGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.FixedPenaltyNoticeSummonsAllocationGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.FutureHearingAllocationGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.GxxiMsgGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.PaymentUpdateGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.SODApplicationResultGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.SummonsAllocationResultGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.SummonsHearingResultGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.handler.ChargeCaseApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.DefendantAddressApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.DepartmentalNoticeApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.DepartmentalSummonsApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.FixedPenaltyDistressWarrantApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.FixedPenaltyNoticeOfOrderApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.FixedPenaltySummonsApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.FixedPenaltyWitnessSummonsApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.GFPICaseDocumentHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.GxxiMsgHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.SODApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.biz.handler.WitnessSummonsApplicationHandler;
import hk.judiciary.icmsint.model.sysinf.inf.gccid2j.GCCIMsgD2J;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnid2j.GDSNIMsgD2J;
import hk.judiciary.icmsint.model.sysinf.inf.gfpid2j.GFPIMsgD2J;


/**
 * 
 * @version $Revision: 14 $ $Date: 2017-05-24 17:33:30 +0800 (Wed, 24 May 2017) $
 * @author $Author: gordonhclam@judiciary.gov.hk $
 */
public class CaseAppBO extends BaseBO {

	public static final String CASE_APP_BO = "caseAppBO";
	
	public CommonWsDTO receiveDepartmentalSummonsApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("D:/Harry/projects/judiciary/JUD-Summons/30 SI&I/01_Coding/trunk/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI01(2).xml");
		File schemaFile = getSchemaFile("gxxi/jud/gdsni_d2j.xsd");
    	GDSNIMsgD2J gdsniMsgD2J = new GxxiXmlParser<GDSNIMsgD2J>(GDSNIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GDSNIMsgD2J> handler = new DepartmentalSummonsApplicationHandler(user, partyCd);
    	return handler.handle(gdsniMsgD2J);
	}
	
	public CommonWsDTO receiveWitnessSummonsApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI14.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gdsni_d2j.xsd");
    	GDSNIMsgD2J gdsniMsgD2J = new GxxiXmlParser<GDSNIMsgD2J>(GDSNIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GDSNIMsgD2J> handler = new WitnessSummonsApplicationHandler(user, partyCd);
    	return handler.handle(gdsniMsgD2J);
	}
	
	public CommonWsDTO receiveDepartmentalNoticeApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI14.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gdsni_d2j.xsd");
    	GDSNIMsgD2J gdsniMsgD2J = new GxxiXmlParser<GDSNIMsgD2J>(GDSNIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GDSNIMsgD2J> handler = new DepartmentalNoticeApplicationHandler(user, partyCd);
    	return handler.handle(gdsniMsgD2J);
	}
	
	public CommonWsDTO receiveDefendantAddressApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI08.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gdsni_d2j.xsd");
    	GDSNIMsgD2J gdsniMsgD2J = new GxxiXmlParser<GDSNIMsgD2J>(GDSNIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GDSNIMsgD2J> handler = new DefendantAddressApplicationHandler(user, partyCd);
    	return handler.handle(gdsniMsgD2J);
	}
	
	public CommonWsDTO receiveSODApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI12.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gdsni_d2j.xsd");
    	GDSNIMsgD2J gdsniMsgD2J = new GxxiXmlParser<GDSNIMsgD2J>(GDSNIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GDSNIMsgD2J> handler = new SODApplicationHandler(user, partyCd);
    	return handler.handle(gdsniMsgD2J);
	}
	
	public CommonWsDTO receiveCaseDocument(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI17.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gdsni_d2j.xsd");
    	GFPIMsgD2J gcciMsgD2J = new GxxiXmlParser<GFPIMsgD2J>(GFPIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GFPIMsgD2J> handler = new GFPICaseDocumentHandler(user, partyCd);
    	return handler.handle(gcciMsgD2J);
	}
	
	public CommonWsDTO receiveFixedPenaltyWitnessSummonsApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI17.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gdsni_d2j.xsd");
    	GFPIMsgD2J gcciMsgD2J = new GxxiXmlParser<GFPIMsgD2J>(GFPIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GFPIMsgD2J> handler = new FixedPenaltyWitnessSummonsApplicationHandler(user, partyCd);
    	return handler.handle(gcciMsgD2J);
	}
	
	public CommonWsDTO receiveFixedPenaltyNoticeOfOrderApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI14.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gfpi_d2j.xsd");
		GFPIMsgD2J gfpiMsgD2J = new GxxiXmlParser<GFPIMsgD2J>(GFPIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GFPIMsgD2J> handler = new FixedPenaltyNoticeOfOrderApplicationHandler(user, partyCd);
    	return handler.handle(gfpiMsgD2J);
	}
	
	public CommonWsDTO receiveFixedPenaltySummonsApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI14.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gfpi_d2j.xsd");
		GFPIMsgD2J gfpiMsgD2J = new GxxiXmlParser<GFPIMsgD2J>(GFPIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GFPIMsgD2J> handler = new FixedPenaltySummonsApplicationHandler(user, partyCd);
    	return handler.handle(gfpiMsgD2J);
	}
	
	public CommonWsDTO receiveFixedPenaltyDistressWarrantApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("E:/icmsint/icmsint-ejb/src/test/resources/sample/GDSNIMsgD2J/CM-GI14.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gfpi_d2j.xsd");
		GFPIMsgD2J gfpiMsgD2J = new GxxiXmlParser<GFPIMsgD2J>(GFPIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GFPIMsgD2J> handler = new FixedPenaltyDistressWarrantApplicationHandler(user, partyCd);
    	return handler.handle(gfpiMsgD2J);
	}
	
	public CommonWsDTO receiveChargeCaseApplication(JudiciaryUser user,String partyCd) throws Exception {
		//TODO remove hard code file path
		//TODO xml validation will be moved into Handler class later
		File xmlFile = new File("D:/Harry/projects/judiciary/JUD-Summons/30 SI&I/01_Coding/trunk/icmsint/icmsint-ejb/src/test/resources/sample/GCCIMsgD2J/CM-CC01.xml");
		File schemaFile = getSchemaFile("gxxi/jud/gcci_d2j.xsd");
    	GCCIMsgD2J gcciMsgD2J = new GxxiXmlParser<GCCIMsgD2J>(GCCIMsgD2J.class).toObject(xmlFile, schemaFile);
    	GxxiMsgHandler<GCCIMsgD2J> handler = new ChargeCaseApplicationHandler(user, partyCd);
    	return handler.handle(gcciMsgD2J);
	}
	
	public GDSNIMsgDTO sendSummonsAllocationResult(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new SummonsAllocationResultGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	public GDSNIMsgDTO sendDepartmentalNoticeAllocationResult(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new DepartmentalNoticeAllocationResultGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}	
	
	public GDSNIMsgDTO sendFixedPenaltyNoticeSummonsAllocation(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new FixedPenaltyNoticeSummonsAllocationGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	public GDSNIMsgDTO sendFixedPenaltyDistressWarrantStatusChangeGenerator(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new FixedPenaltyDistressWarrantStatusChangeGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	
	public GDSNIMsgDTO sendFixedPenaltyDistressWarrantAllocationGenerator(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new FixedPenaltyDistressWarrantAllocationGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	public GDSNIMsgDTO sendSummonsHearingResultGenerator(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new SummonsHearingResultGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	public GDSNIMsgDTO sendSODApplicationResultGenerator(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new SODApplicationResultGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	public GDSNIMsgDTO sendFutureHearingAllocationGenerator(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new FutureHearingAllocationGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	public GDSNIMsgDTO sendPaymentUpdateGenerator(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new PaymentUpdateGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}
	
	public GDSNIMsgDTO sendCourtPaymentGenerator(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new CourtPaymentGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}

	public GDSNIMsgDTO sendAcknowledgementofCaseDocumentGenerator(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new AcknowledgementofCaseDocumentGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}

	
	
	private File getSchemaFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		return new File(classLoader.getResource(fileName).getFile());
	}
}
