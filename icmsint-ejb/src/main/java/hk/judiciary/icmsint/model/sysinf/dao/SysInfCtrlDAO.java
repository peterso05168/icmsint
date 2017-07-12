package hk.judiciary.icmsint.model.sysinf.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


import hk.judiciary.icms.model.dao.entity.CaseType;
import hk.judiciary.icms.model.dao.entity.Pd;
import hk.judiciary.icms.model.dao.entity.SysInfCtrl;

import hk.judiciary.icms.model.dao.entity.SysInfCtrlType;
import hk.judiciary.icmsint.model.BaseDAO;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfCtrlStatus;
import hk.judiciary.icmsint.model.sysinf.enumObj.SysInfStatus;

public class SysInfCtrlDAO extends BaseDAO<SysInfCtrl> {
	
	public static final String SYSINF_CTRL_DAO = "sysInfCtrlDAO";

	public static final String QUERY_FIND_SYSINF_CTRL = "SysInfCtrl.findSysInfCtrl";
//	public static final String QUERY_FIND_SYSINF_CTRL_FOR_UPDATE = "SysInfCtrl.findSysInfCtrlForUpdate";
	
	private static final String PARAM_SYSINF_CTRL_TYPE = "sysInfCtrlType";
	private static final String PARAM_SYSINF_CTRL_STATUS = "sysInfCtrlStatus";
	private static final String PARAM_SYSINF_STATUS = "sysInfStatus";
	private static final String PARAM_PD= "pd";
	private static final String PARAM_CASE_TYPE= "caseType";
	private static final String PARAM_KEY1 = "key1";
	private static final String PARAM_KEY2 = "key2";
	private static final String PARAM_KEY3 = "key3";
	
	
    /**
     * searchSysInfCtrl List of SysInfCtrl
     * 
     * @param String pdCd, String sysInfCtrlTypeCd, SysInfCtrlStatus sysInfCtrlStatuss
     * @return List<SysInfCtrl>
     */
	
	public List<SysInfCtrl> searchSysInfCtrl(Pd pd, SysInfCtrlType sysInfCtrlType, SysInfCtrlStatus sysInfCtrlStatus, SysInfStatus sysInfStatus)  throws DAOException {
		info("searchSysInfCtrl() Start- and pd: " + pd + " sysInfCtrlType: "+sysInfCtrlType+" SysInfCtrlStatus:"+sysInfCtrlStatus);		
		List<SysInfCtrl> lstSysInfCtrl = null;
		
		TypedQuery<SysInfCtrl> query = getEntityManager().createNamedQuery(QUERY_FIND_SYSINF_CTRL,SysInfCtrl.class);
		query.setParameter(PARAM_PD, pd);
		query.setParameter(PARAM_SYSINF_CTRL_TYPE, sysInfCtrlType);
		query.setParameter(PARAM_SYSINF_CTRL_STATUS, sysInfCtrlStatus.code());
		query.setParameter(PARAM_SYSINF_STATUS, sysInfStatus.code());
		lstSysInfCtrl = this.getResultList(query);
		
        info("searchSysInfCtrl() End- and list: " + lstSysInfCtrl);
        return lstSysInfCtrl;
	}
	
	
	public SysInfCtrl findSysInfCtrl(Pd pd, CaseType caseType, SysInfCtrlType sysInfCtrlType, SysInfCtrlStatus sysInfCtrlStatus, SysInfStatus sysInfStatus, Integer[] keys) throws DAOException {
		info("findSysInfCtrl() start- and pdCd: " + pd + " caseType: "+caseType+" SysInfCtrlType: "+sysInfCtrlType+" sysInfCtrlStatus: "+sysInfCtrlStatus+" keys:"+keys);
        SysInfCtrl retVal = null;
        
        CriteriaBuilder builder = getEntityManager().getEntityManagerFactory().getCriteriaBuilder();
        CriteriaQuery<SysInfCtrl> criteria = builder.createQuery(SysInfCtrl.class);
        Root<SysInfCtrl> sysInfCtrlRoot= criteria.from(SysInfCtrl.class);
        criteria = criteria.select(sysInfCtrlRoot);       

        List<Predicate> conditions = new ArrayList<Predicate>();
        conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_PD), pd));
        conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_CASE_TYPE), caseType));
        conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_SYSINF_CTRL_TYPE), sysInfCtrlType));
        conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_SYSINF_CTRL_STATUS), sysInfCtrlStatus.code()));
        conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_SYSINF_STATUS), sysInfStatus.code()));
        
        int noOfKey=keys.length;
        if ( noOfKey> 0) {
        	switch (noOfKey) {
	        	case 1:
	        		conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_KEY1), keys[0]));
	        		conditions.add(builder.isNull(sysInfCtrlRoot.get(PARAM_KEY2)));
	        		conditions.add(builder.isNull(sysInfCtrlRoot.get(PARAM_KEY3)));
	        		break;
	        		
	        	case 2:
	        		conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_KEY1), keys[0]));
	        		conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_KEY2), keys[1]));
	        		conditions.add(builder.isNull(sysInfCtrlRoot.get(PARAM_KEY3)));
	        		break;
	        		
	        	case 3:
	        		conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_KEY1), keys[0]));
	        		conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_KEY2), keys[1]));
	        		conditions.add(builder.equal(sysInfCtrlRoot.get(PARAM_KEY3), keys[2]));
	        		break;
        		
	        	default:
	        		throw new DAOException("SysInfCtrl", ReturnStatus.SEARCH_KEY_MORE_THAN_DEFINED);	
        	}
        }
        else {
        	throw new DAOException("SysInfCtrl", ReturnStatus.SEARCH_KEY_NOT_DEFINED);
        }
        
        if (conditions.size()>1) {
            criteria.where(conditions.toArray(new Predicate[0]));
        }
        TypedQuery<SysInfCtrl> query = getEntityManager().createQuery(criteria);
        List<SysInfCtrl> lstResult = query.getResultList();
	
    	if(lstResult.size()==1){
    		retVal=lstResult.get(0);
    	}
    	else {
        	if (lstResult.size() > 1){
        		throw new DAOException("SysInfCtrl", ReturnStatus.SEARCH_MORE_THAN_ONE_RESULT);
        	}
        	// <1 return null
    	}
 
        info("searchSysInfCtrl() End- and list: " + retVal);
        return retVal;
	}

}
