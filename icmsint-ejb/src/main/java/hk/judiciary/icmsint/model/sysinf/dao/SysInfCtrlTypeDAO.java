package hk.judiciary.icmsint.model.sysinf.dao;

import java.util.List;

import javax.persistence.TypedQuery;


import hk.judiciary.icms.model.dao.entity.SysInfCtrlType;
import hk.judiciary.icmsint.model.BaseDAO;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;

public class SysInfCtrlTypeDAO extends BaseDAO<SysInfCtrlType> {
	
	public static final String SYSINF_CTRL_TYPE_DAO = "sysInfCtrlTypeDAO";
		
	public static final String QUERY_FIND_SYSINF_CTRL_TYPE = "SysInfCtrlType.findSysInfCtrlType";
	
	public static final String PARAM_SYSINF_CTRL_TYPE_CD = "sysInfCtrlTypeCd";
	
	
	
    /**
     * retrieve the SysInfCtrlType
     * 
     * @param sysInfCtrlTypeCd
     * @return SysInfCtrlType
     */
	public  SysInfCtrlType findSysInfCtrlType(String sysInfCtrlTypeCd) throws DAOException {
		info("findSysInfCtrlType() start- and sysInfCtrlTypeCd:" + sysInfCtrlTypeCd);
		SysInfCtrlType returnVal = null;
		
		TypedQuery<SysInfCtrlType> query = getEntityManager().createNamedQuery(QUERY_FIND_SYSINF_CTRL_TYPE,SysInfCtrlType.class);
		query.setParameter(PARAM_SYSINF_CTRL_TYPE_CD, sysInfCtrlTypeCd);
		List<SysInfCtrlType>  lstResult = this.getResultList(query);
		
        if (lstResult.size()==1){
        	returnVal=lstResult.get(0);
        }
        else {
        	if (lstResult.size()==0){
        		throw new DAOException("SysInfCtrlType", ReturnStatus.CODE_NOT_FOUND);
        	}
        	if (lstResult.size() > 1){
        		throw new DAOException("SysInfCtrlType", ReturnStatus.CODE_FOUND_MORE_THAN_ONE);
        	}
        }
	    info("findSysInfStatus() end- and returnVal:" + returnVal);
	    return returnVal;
	}

}
