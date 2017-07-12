package hk.judiciary.icmsint.model.sysinf.dao;

import javax.persistence.TypedQuery;

import hk.judiciary.icms.model.dao.entity.SysInfMsgType;
import hk.judiciary.icmsint.model.BaseDAO;

public class SysInfMsgTypeDAO extends BaseDAO<SysInfMsgType> {
	
	public static final String SYSINF_MSG_TYPE_DAO = "sysInfMsgTypeDAO";
	
	public static final String QUERY_FIND_SYSINF_MSG_TYPE = "SysInfMsgType.findSysInfMsgType";
	
	public static final String PARAM_SYSINF_MSG_TYPE_CD= "msgTypeCd";
	
    /**
     * retrieve the SysInfMsgType
     * 
     * @param sysInfMsyTypeCd
     * @return SysInfMsgType
     */
	public SysInfMsgType findSysInfMsgType(String sysInfMsgTypeCd){
		info("findSysInfMsgType() start- and sysInfMsyTypeCd:" + sysInfMsgTypeCd);
		
		TypedQuery<SysInfMsgType> query = getEntityManager().createNamedQuery(QUERY_FIND_SYSINF_MSG_TYPE,SysInfMsgType.class);
		query.setParameter(PARAM_SYSINF_MSG_TYPE_CD,sysInfMsgTypeCd);
		SysInfMsgType returnVal = getSingleResult(query);
		
		info("findSysInfMsgType() end- and returnVal:" + returnVal);
        return returnVal;
	}

}
