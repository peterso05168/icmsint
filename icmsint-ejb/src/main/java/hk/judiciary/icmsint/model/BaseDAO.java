package hk.judiciary.icmsint.model;

import hk.judiciary.fmk.ejb.dao.AbstractJpaDAO;
import hk.judiciary.fmk.ejb.dao.entity.AbstractEntity;
import hk.judiciary.fmk.logging.FmkLogger;

public class BaseDAO<T extends AbstractEntity> extends AbstractJpaDAO<T> {
	
    protected static final String PARAM_EFFV_START_DATE = "effvStartDate";
    protected static final String PARAM_EFFV_END_DATE = "effvEndDate";
    protected static final String PARAM_ACTIVE_FLAG = "activeFlag";
    protected static final String PARAM_CREATE_BY = "createBy";
    protected static final String PARAM_CREATE_DT = "createDt";
    protected static final String PARAM_LAST_UPD_BY = "lastUpdBy";
    protected static final String PARAM_VERSION_DT = "versionDt";
	
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

}
