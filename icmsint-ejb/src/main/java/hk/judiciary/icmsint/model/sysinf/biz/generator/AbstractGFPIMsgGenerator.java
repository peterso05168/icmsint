package hk.judiciary.icmsint.model.sysinf.biz.generator;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icmsint.model.sysinf.dao.PdDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlDAO;
import hk.judiciary.icmsint.model.sysinf.dao.SysInfCtrlTypeDAO;

public abstract class AbstractGFPIMsgGenerator implements GxxiMsgGenerator {
	private JudiciaryUser judiciaryUser;
	private String partyCd;
	private String sysInfCtrlTypeCd;
	private String headerPrefix;
	private SysInfCtrlDAO sysInfCtrlDao;
	private SysInfCtrlTypeDAO sysInfCtrlTypeDao;
	private PdDAO pdDao;
	
	public JudiciaryUser getJudiciaryUser() {
		return judiciaryUser;
	}
	
	public String getPartyCd() {
		return partyCd;
	}
	
	public String getSysInfCtrlTypeCd() {
		return sysInfCtrlTypeCd;
	}
	
	public String getHeaderPrefix() {
		return headerPrefix;
	}
	
	public SysInfCtrlDAO getSysInfCtrlDAO() {
		return sysInfCtrlDao;
	}
	
	public SysInfCtrlTypeDAO getSysInfCtrlTypeDAO() {
		return sysInfCtrlTypeDao;
	}

	public PdDAO getPdDAO() {
		return pdDao;
	}

	public AbstractGFPIMsgGenerator(JudiciaryUser judiciaryUser, String partyCd,
			String sysInfCtrlTypeCd, String headerPrefix,
			SysInfCtrlDAO sysInfCtrlDao, SysInfCtrlTypeDAO sysInfCtrlTypeDao, PdDAO pdDao) {
		this.judiciaryUser = judiciaryUser;
		this.partyCd = partyCd;
		this.sysInfCtrlTypeCd = sysInfCtrlTypeCd;
		this.headerPrefix = headerPrefix;
		this.sysInfCtrlDao = sysInfCtrlDao;
		this.sysInfCtrlTypeDao = sysInfCtrlTypeDao;
		this.pdDao = pdDao;
	}
}
