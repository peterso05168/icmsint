package hk.judiciary.icmsint.model.sysinf.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import hk.judiciary.icms.model.dao.entity.Pd;
import hk.judiciary.icmsint.model.BaseDAO;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;

public class PdDAO extends BaseDAO<Pd> {
	
	public static final String PD_DAO = "pdDAO";
	
	public static final String QUERY_FIND_PD = "Pd.findPd";
	
	public static final String PARAM_PD_CD = "pdCd";
	
    /**
     * retrieve the Pd
     * 
     * @param pdCd
     * @return Pd
     */
	public  Pd findPd(String pdCd) throws DAOException{
		info("findPd() start- and pdCd:" + pdCd);
		Pd returnVal=null; 
		
        TypedQuery<Pd> query = getEntityManager().createNamedQuery(QUERY_FIND_PD, Pd.class);
        query.setParameter(PARAM_PD_CD, pdCd);
        List<Pd> lstResult = this.getResultList(query);
        
        if (lstResult.size()==1){
        	returnVal=lstResult.get(0);
        }
        else {
        	if (lstResult.size()==0){
        		throw new DAOException("Pd", ReturnStatus.CODE_NOT_FOUND);
        	}
        	if (lstResult.size() > 1){
        		throw new DAOException("Pd", ReturnStatus.CODE_FOUND_MORE_THAN_ONE);
        	}
        }
        info("findPd() end- and returnVal:" + returnVal);
        return returnVal;
	}

	
}
