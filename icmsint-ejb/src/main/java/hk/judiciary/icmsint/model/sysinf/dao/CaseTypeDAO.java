package hk.judiciary.icmsint.model.sysinf.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.icms.model.dao.entity.CaseType;

import hk.judiciary.icmsint.model.BaseDAO;
import hk.judiciary.icmsint.model.common.SysInfConstant;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;

public class CaseTypeDAO extends BaseDAO<CaseType> {
	public static final String CASE_TYPE_DAO = "caseTypeDAO";
	
	public final static String QUERY_FIND_CASE_TYPE_BY_CD = "CaseType.findCaseTypeByCd";
    private final static String PARAM_COURT_LVLTYPE_CD = "courtLvlTypeCd";
    private final static String PARAM_CASE_TYPE_CD = "caseTypeCd";
    /**
     * retrieve the 
     * 
     * @param pdCd
     * @return Pd
     */
	public  CaseType findCaseType(String caseTypeCd) throws DAOException{
        info("findCaseType() start - and p_caseTypeCd:" + caseTypeCd);
        CaseType returnVal = null;
        if (!CommonUtil.isNullOrEmpty(caseTypeCd)) {
            TypedQuery<CaseType> query = getEntityManager().createNamedQuery(QUERY_FIND_CASE_TYPE_BY_CD,CaseType.class);
            query.setParameter(PARAM_COURT_LVLTYPE_CD, SysInfConstant.COURT_LEVEL_TYPE_MAG_COURT);
            query.setParameter(PARAM_CASE_TYPE_CD, caseTypeCd);
            List<CaseType> lstResult = this.getResultList(query);
            
            if (lstResult.size()==1){
            	returnVal=lstResult.get(0);
            }
            else {
            	if (lstResult.size()==0){
            		throw new DAOException("CaseType", ReturnStatus.CODE_NOT_FOUND);
            	}
            	if (lstResult.size() > 1){
            		throw new DAOException("CaseType", ReturnStatus.CODE_FOUND_MORE_THAN_ONE);
            	}
            }
        }
        info("findCaseType() end and returnVal = " + returnVal);
        return returnVal;
	}
	
}
