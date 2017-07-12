package hk.judiciary.icmsint.model.sysinf.dao;

import javax.persistence.TypedQuery;

import hk.judiciary.icms.model.dao.entity.SysInfMsg;
import hk.judiciary.icmsint.model.BaseDAO;

public class SysInfMsgDAO extends BaseDAO<SysInfMsg> {
	
	public static final String SYSINF_MSG_DAO = "sysInfMsgDAO";
	
	public static final String QUERY_FIND_SYSINF_MSG = "SysInfMsg.findSysInfMsg";
	
	public static final String PARAM_SYSINF_MSG_CD= "sysInfMsgCd";
	
	public static final String PARAM_SYSINF_MSG_TYPE_CD= "sysInfMsgTypeCd";
	
	public static final String PARAM_SYSINF_MSGNAT="msgNat";
	
	
    /**
     * retrieve the SysInfMsg
     * 
     * @param sysInfMsgCd, sysInfMsgTypeCd, msgNat
     * @return SysInfMsg
     */
	public SysInfMsg findSysInfMsg(String sysInfMsgCd, String sysInfMsgTypeCd, String msgNat) {
		info("findSysInfMsg() start- and sysInfMsgCd:" + sysInfMsgCd+" sysInfMsgTypeCd:"+sysInfMsgTypeCd+" msgNat:"+msgNat);
		
        TypedQuery<SysInfMsg> query = getEntityManager().createNamedQuery(QUERY_FIND_SYSINF_MSG,SysInfMsg.class);
        query.setParameter(PARAM_SYSINF_MSG_CD, sysInfMsgCd);
        query.setParameter(PARAM_SYSINF_MSG_TYPE_CD,sysInfMsgTypeCd);
        query.setParameter(PARAM_SYSINF_MSGNAT,msgNat);
        SysInfMsg returnVal = getSingleResult(query);
        
        info("findSysInfMsg() end- and returnVal:" + returnVal);
        return returnVal;
	}

}
