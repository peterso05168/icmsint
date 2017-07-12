package hk.judiciary.icmsint.model.sysinf.biz.generator;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icms.model.dao.entity.Pd;
import hk.judiciary.icms.model.dao.entity.SysInfCtrl;
import hk.judiciary.icms.model.dao.entity.SysInfCtrlType;
import hk.judiciary.icmsint.model.common.SysInfConstant;
import hk.judiciary.icmsint.model.sysinf.biz.GxxiXmlParser;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.dao.PdDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlTypeDAO;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfCtrlStatus;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.DateCT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.GDSNIMsgJ2D;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.InterfaceFileHeaderV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.PrefixV13CT;
import hk.judiciary.icmsint.model.sysinf.inf.gdsnij2d.XMLRecordCountV10CT;

public abstract class BaseGDSNIMsgGenerator extends AbstractGDSNIMsgGenerator {
	abstract public GDSNIMsgJ2D generateGDSNIMsg() throws SysInfGeneratorException, DAOException;
	
	public BaseGDSNIMsgGenerator(JudiciaryUser judiciaryUser, String partyCd,
			String sysInfCtrlTypeCd, String headerPrefix,
			SysInfCtrlDAO sysInfCtrlDao, SysInfCtrlTypeDAO sysInfCtrlTypeDao, PdDAO pdDao) {
		super(judiciaryUser, partyCd, sysInfCtrlTypeCd, headerPrefix, sysInfCtrlDao, sysInfCtrlTypeDao, pdDao);
	}

	@Override
	public CommonWsDTO generate() throws SysInfGeneratorException {
		GDSNIMsgDTO retval = new GDSNIMsgDTO();
		try {
			GDSNIMsgJ2D gdsni = generateGDSNIMsg();
			gdsni.setInterfaceFileHeader(genInterfaceFileHeader(gdsni));
			GxxiXmlParser<GDSNIMsgJ2D> gdsniXmlParser = new GxxiXmlParser<GDSNIMsgJ2D>(GDSNIMsgJ2D.class);
			ByteArrayOutputStream baos = gdsniXmlParser.toByteArrayOutputStream(gdsni);
			retval.setData(baos.toString("UTF-8"));
		} catch (DAOException e) {
			retval.setReturnCode(e.getStatus().code());
			retval.setReturnDesc(e.getStatus().desc());
		} catch (DatatypeConfigurationException e) {
			retval.setReturnCode("12347"); //TODO TBC
			retval.setReturnDesc(e.getMessage());
		} catch (SysInfGeneratorException e) {
			retval.setReturnCode("12348"); //TODO TBC
			retval.setReturnDesc(e.getMessage());
		} catch (UnsupportedEncodingException | JAXBException e) {
			retval.setReturnCode("12349"); //TODO TBC
			retval.setReturnDesc(e.getMessage());
		}
		return retval;
	}
	
	protected List<SysInfCtrl> getSysInfCtrlList() throws DAOException {
		Pd pd = getPdDAO().findPd(getPartyCd());
		SysInfCtrlType sysInfCtrlType = getSysInfCtrlTypeDAO().findSysInfCtrlType(getSysInfCtrlTypeCd());
		return getSysInfCtrlDAO().searchSysInfCtrl(pd, sysInfCtrlType, SysInfCtrlStatus.NEW, SysInfStatus.CHANGE);
	}
	
	private InterfaceFileHeaderV13CT genInterfaceFileHeader(GDSNIMsgJ2D msg) throws DatatypeConfigurationException {
		InterfaceFileHeaderV13CT interfaceFileHeaderV13CT = new InterfaceFileHeaderV13CT();
		PrefixV13CT prefixV13CT = new PrefixV13CT();
		prefixV13CT.setValue(getHeaderPrefix());
		interfaceFileHeaderV13CT.setPrefix(prefixV13CT);
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(new Date());
		XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		DateCT dateCT = new DateCT();
		dateCT.setValue(xmlGregorianCalendar);
		interfaceFileHeaderV13CT.setInterfaceDate(dateCT);
		XMLRecordCountV10CT xmlRecordCountV10CT = new XMLRecordCountV10CT();
		xmlRecordCountV10CT.setValue(BigInteger.valueOf(getRecordCount(msg)));
		interfaceFileHeaderV13CT.setRecordCount(xmlRecordCountV10CT);
		return interfaceFileHeaderV13CT;
	}
	
	private int getRecordCount(GDSNIMsgJ2D msg) {
		if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_SUMMON_ALLOCATION) == 0) {
			return msg.getSummonsAllocation().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_SUMMON_HEARING_RESULT) == 0) {
			return msg.getSummonsHearingResult().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_APPEAL_REVIEW_GRANT) == 0) {
			return msg.getAppealReviewGrant().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GFPI_J2D_WARRANT_STATUS_CHANGE) == 0) {
			return msg.getWarrantStatusChange().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_WITNESS_SUMMONS_ALLOCATION) == 0) {
			return msg.getWitnessSummonsAllocation().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_NEXT_HEARING) == 0) {
			return msg.getNextHearing().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_RESERVICE_RESULT) == 0) {
			return msg.getReServiceResult().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_COURT_PAYMENT) == 0) {
			return msg.getCourtPayment().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_SOD_APPLICATION_RESULT) == 0) {
			return msg.getSODApplicationResult().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDNI_J2D_NOTICE_OF_ORDER_ALLOCATION) == 0) {
			return msg.getNoticeOfOrderAllocation().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_NOTICE_OF_ORDER_HEARING_RESULT) == 0) {
			return msg.getNoticeOfOrderHearingResult().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_CASE_DOCUMENT_ACK) == 0) {
			return msg.getCaseDocumentAcknowledgement().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_COURT_DOCUMENT) == 0) {
			return msg.getCourtDocument().size();
		} else if (getHeaderPrefix().compareTo(SysInfConstant.SYSINF_MSG_CD_GDSNI_J2D_SOD_DETAILS_UPDATE) == 0) {
			return msg.getSODDetailsUpdate().size();
		} else {
			return 0;
		}
	}
}
