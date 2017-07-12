package hk.judiciary.icmsint.model;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.fmk.ejb.biz.AbstractBO;
import hk.judiciary.fmk.logging.FmkLogger;
import hk.judiciary.icms.model.dao.entity.Pd;
import hk.judiciary.icms.model.dao.entity.SysInfBat;
import hk.judiciary.icms.model.dao.entity.SysInfMsg;
import hk.judiciary.icms.model.dao.entity.SysInfRec;

import hk.judiciary.icmsint.model.sysinf.dao.SysInfBatDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlTypeDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfErrDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfMsgDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfMsgTypeDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfRecDAO;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;
import hk.judiciary.icmsint.model.sysinf.dao.CaseTypeDAO;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.dao.DfCriminalCaseDAO;
import hk.judiciary.icmsint.model.sysinf.dao.PdDAO;

public class BaseBO extends AbstractBO {
	
    private final FmkLogger logger = new FmkLogger(this.getClass());

    protected void debug(String msg) {
        if (logger.isDebugEnabled()) {
            logger.debug(msg);
        }
    }

    protected void info(String msg) {
        if (logger.isInfoEnabled()) {
            logger.info(msg);
        }
    }

    protected void error(String msg) {
        if (logger.isErrorEnabled()) {
            logger.error(msg);
        }
    }

    protected void error(String msg, Throwable e) {
        if (logger.isErrorEnabled()) {
            logger.error(msg, e);
        }
    }
    
    
    protected PdDAO getPdDAO() {
        info("executing getPdDAO()");
        return getDAO(PdDAO.PD_DAO, PdDAO.class);
    }
    protected CaseTypeDAO getCaseTypeDAO() {
    	info("executing getCaseTypeDAO()");
    	return getDAO(CaseTypeDAO.CASE_TYPE_DAO, CaseTypeDAO.class);
    }
    protected SysInfBatDAO getSysInfBatDAO() {
        info("executing getSysInfBatDAO()");
        return getDAO(SysInfBatDAO.SYSINF_BAT_DAO, SysInfBatDAO.class);
    }
    protected SysInfCtrlDAO getSysInfCtrlDAO() {
        info("executing getSysInfCtrlDAO()");
        return getDAO(SysInfCtrlDAO.SYSINF_CTRL_DAO, SysInfCtrlDAO.class);
    }

    protected SysInfCtrlTypeDAO getSysInfCtrlTypeDAO() {
        info("executing getSysInfCtrlTypeDAO()");
        return getDAO(SysInfCtrlTypeDAO.SYSINF_CTRL_TYPE_DAO, SysInfCtrlTypeDAO.class);
    }
    protected SysInfErrDAO getSysInfErrDAO() {
        info("executing getSysInfErrDAO()");
        return getDAO(SysInfErrDAO.SYSINF_ERR_DAO, SysInfErrDAO.class);
    }
    protected SysInfMsgDAO getSysInfMsgDAO(){
        info("executing getsysInfMsgTypeDAO()");
        return getDAO(SysInfMsgDAO.SYSINF_MSG_DAO, SysInfMsgDAO.class);    	
    }
    protected SysInfMsgTypeDAO getSysInfMsgTypeDAO(){
        info("executing getsysInfMsgTypeDAO()");
        return getDAO(SysInfMsgTypeDAO.SYSINF_MSG_TYPE_DAO, SysInfMsgTypeDAO.class);	
    }
    protected SysInfRecDAO getSysInfRecDAO() {
        info("executing getSysInfRecDAO()");
        return getDAO(SysInfRecDAO.SYSINF_REC_DAO, SysInfRecDAO.class);
    }
    protected DfCriminalCaseDAO getDfCriminalCaseDAO(){
    	info("executing getDfCriminalCaseDAO()");
    	return getDAO(DfCriminalCaseDAO.DF_CRIMINAL_CASE_DAO, DfCriminalCaseDAO.class);
    }
    
    protected SysInfBat createSysInfBat(Integer batSerNo, Date sysInfDate, String pdCd, SysInfMsg sysInfMsg){
    	SysInfBat sysInfBat = new SysInfBat();
    	
    	try {
	    	Pd pd= getPdDAO().findPd(pdCd);
	    	
	    	if (!CommonUtil.isNullOrEmpty(pd)){
	    		sysInfBat.setBatSerNo(batSerNo);
	    		sysInfBat.setSysInfMsg(sysInfMsg);
	    		sysInfBat.setSysInfDate(sysInfDate);
	    		sysInfBat.setPd(pd);
	    	}
    	}
    	catch(DAOException de){
    		
    	}
    	
    	return sysInfBat;
    }
    
    
    protected SysInfRec createSysInfRec(SysInfBat sysInfBat, Integer seqNo, SysInfStatus sysInfStatus ){
    	SysInfRec sysInfRec=new SysInfRec();
    	sysInfRec.setSysInfBat(sysInfBat);
    	sysInfRec.setSeqNo(seqNo);
    	sysInfRec.setSysInfStatus(sysInfStatus.code());
    	return sysInfRec;
    }
    /*
     * Converts XMLGregorianCalendar to java.util.Date in Java
     */
    public Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }
    
}
