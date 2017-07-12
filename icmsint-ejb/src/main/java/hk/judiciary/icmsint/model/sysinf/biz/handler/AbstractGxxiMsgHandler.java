package hk.judiciary.icmsint.model.sysinf.biz.handler;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.activation.DataHandler;

import com.sun.istack.ByteArrayDataSource;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.fmk.common.springcontext.ApplicationEJBContextProvider;
import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.fmk.ejb.dao.AbstractJpaDAO;
import hk.judiciary.fmk.logging.FmkLogger;
import hk.judiciary.fmk.model.cfs.biz.dto.FileDTO;
import hk.judiciary.icms.model.dao.entity.Pd;
import hk.judiciary.icms.model.dao.entity.SysInfBat;
import hk.judiciary.icms.model.dao.entity.SysInfErr;
import hk.judiciary.icms.model.dao.entity.SysInfMsg;
import hk.judiciary.icms.model.dao.entity.SysInfRec;
import hk.judiciary.icmsint.model.common.DocumentFileUtil;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.dao.DAOException;
import hk.judiciary.icmsint.model.sysinf.dao.PdDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfBatDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfErrDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfMsgDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfRecDAO;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;

public abstract class AbstractGxxiMsgHandler<T> implements GxxiMsgHandler<T> {
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
    
	private JudiciaryUser judiciaryUser;
	private String partyCd;
	private String sysInfMsgCd;
	private String sysInfMsgTypeCd;
	private String msgNat;
	private SysInfMsg sysInfMsg;
	private SysInfBat sysInfBat;
	
	public JudiciaryUser getJudiciaryUser() {
		return judiciaryUser;
	}
	
	public String getPartyCd() {
		return partyCd;
	}
	
	public SysInfMsg getSysInfMsg() {
		return sysInfMsg;
	}
	
	public SysInfBat getSysInfBat() {
        return sysInfBat;
	}

	public SysInfMsgDAO getSysInfMsgDAO() {
        info("executing getsysInfMsgTypeDAO()");
        return getDAO(SysInfMsgDAO.SYSINF_MSG_DAO, SysInfMsgDAO.class);   
	}
	
	public SysInfBatDAO getSysInfBatDAO() {
        info("executing getSysInfBatDAO()");
        return getDAO(SysInfBatDAO.SYSINF_BAT_DAO, SysInfBatDAO.class);
	}
	
	public SysInfRecDAO getSysInfRecDAO() {
        info("executing getSysInfRecDAO()");
        return getDAO(SysInfRecDAO.SYSINF_REC_DAO, SysInfRecDAO.class);
	}
	
	public SysInfErrDAO getSysInfErrDAO() {
        info("executing getSysInfErrDAO()");
        return getDAO(SysInfErrDAO.SYSINF_ERR_DAO, SysInfErrDAO.class);
	}
	
	public PdDAO getPdDAO() {
        info("executing getPdDAO()");
        return getDAO(PdDAO.PD_DAO, PdDAO.class);
	}
	
	abstract public CommonWsDTO handleMsg(T msg) throws SysInfHandlerException;

	public AbstractGxxiMsgHandler(JudiciaryUser judiciaryUser, String partyCd, 
			String sysInfMsgCd, String sysInfMsgTypeCd, String msgNat) {
		this.judiciaryUser = judiciaryUser;
		this.partyCd = partyCd;
		this.sysInfMsgCd = sysInfMsgCd;
		this.sysInfMsgTypeCd = sysInfMsgTypeCd;
		this.msgNat = msgNat;
		prepareSysInfMsg();
	}
	
	protected <T> T getDAO(String name, Class<T> clazz) {
		Object obj = ApplicationEJBContextProvider.getBean(name, clazz);
		((AbstractJpaDAO) obj).setJudiciaryUser(judiciaryUser);
		return clazz.cast(obj);
	}
	
	private void prepareSysInfMsg() {
		sysInfMsg = getSysInfMsgDAO().findSysInfMsg(sysInfMsgCd, sysInfMsgTypeCd, msgNat);
	}
	
	protected void validateHeader(Object header) throws SysInfHandlerException {
        if (CommonUtil.isNullOrEmpty(header)) {
        	throw new SysInfHandlerException("interface file header is null");
        }
	}
	
	protected void validateRecordCount(int recordCount, List<?> items) throws SysInfHandlerException {
		if (recordCount != items.size()) {
			throw new SysInfHandlerException("header record count not match");
	    }
	}
	
	protected boolean insertSysInfBat(int batSerNo, Date sysInfDate, int recordCount) throws DAOException {
    	boolean isSuccess = false;
		Pd pd = getPdDAO().findPd(getPartyCd());
    	if (!CommonUtil.isNullOrEmpty(pd)) {
    		sysInfBat = new SysInfBat();
    		sysInfBat.setBatSerNo(batSerNo);
    		sysInfBat.setSysInfMsg(getSysInfMsg());
    		sysInfBat.setSysInfDate(sysInfDate);
    		sysInfBat.setPd(pd);
        	sysInfBat.setProcStartTime(new Date());
        	sysInfBat.setRecCnt(recordCount);	
        	sysInfBat.setProcEndTime(new Date());
        	sysInfBat.setSysInfStatus(SysInfStatus.FAIL.code());
        	getSysInfBatDAO().persist(sysInfBat);
        	isSuccess = true;
    	}
		return isSuccess;
	}
	
	protected boolean updateSysInfBatStatus(String sysInfStatus) {
		boolean isSuccess = false;
		if (!CommonUtil.isNullOrEmpty(sysInfBat)) {
	        sysInfBat.setProcEndTime(new Date());
	        sysInfBat.setSysInfStatus(sysInfStatus);
	        sysInfBat.setPreviousVersion(sysInfBat.getVersion());
	        isSuccess = true;
		}
        return isSuccess;
	}
    
    protected SysInfRec insertSysInfRec(Integer seqNo, String fileName, String status) throws DAOException {
    	SysInfRec sysInfRec = new SysInfRec();
    	sysInfRec.setSysInfBat(sysInfBat);
    	sysInfRec.setSeqNo(seqNo);
    	sysInfRec.setSysInfStatus(status);
    	sysInfRec.setExtRefNo(fileName);
    	getSysInfRecDAO().persist(sysInfRec);
    	return sysInfRec;
    }
    
    protected SysInfErr insertSysInfErr(SysInfRec sysInfRec, String errMsg) throws DAOException {
    	SysInfErr sysInfErr = new SysInfErr();
    	sysInfErr.setSysInfBat(sysInfBat);
    	sysInfErr.setSysInfRec(sysInfRec);
    	sysInfErr.setErrMsg(errMsg.length() > 100 ? errMsg.substring(0, 100) : errMsg);
    	sysInfErr.setVersion(getCurrentTimestamp());
    	getSysInfErrDAO().persist(sysInfErr);
    	return sysInfErr;
    }
    
	protected void saveXml(JudiciaryUser user, byte[] bytes, String fileName) throws Exception {
    	ByteArrayDataSource rawData= new ByteArrayDataSource(bytes, "text/xml");
    	DataHandler handler = new DataHandler(rawData);
    	FileDTO fileDto = new FileDTO();
    	fileDto.setFilename(fileName);
    	fileDto.setVersion(getCurrentTimestamp());
    	fileDto.setContent(handler);
    	DocumentFileUtil.addCfsFile(user, fileName, fileDto);
	}
	
	private Timestamp getCurrentTimestamp() {
		return new Timestamp(new Date().getTime());
	}
}
