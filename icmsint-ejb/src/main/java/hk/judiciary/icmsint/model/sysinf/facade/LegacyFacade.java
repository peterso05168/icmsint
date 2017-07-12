package hk.judiciary.icmsint.model.sysinf.facade;

import java.util.Date;
import java.util.List;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
//import hk.judiciary.icmsint.model.sample.biz.dto.ProjectSearchResultDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.ConversionResultDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.LegacyDataDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.RetrievalResultDTO;

/**
 * 
 * @version $Revision: 14 $ $Date: 2015-02-25 09:31:08 +0800 (Wed, 25 Feb 2015)$
 * @author $Author: gordonhclam@judiciary.gov.hk $
 */
public interface LegacyFacade {
	
	
	/**
	 * receive system interface data from external party
	 * 
	 * @param user.
	 * @return status code, desc
	 */
	public CommonWsDTO receiveDataFromParty(JudiciaryUser user, String partyCd, String filePath, Date uploadDate, List<LegacyDataDTO> dataList)
			throws Exception;
	
	/**
	 * retrieve system interface data to external party
	 * 
	 * @param user.
	 * @return status code, desc
	 */
	public RetrievalResultDTO retrieveDataToParty(JudiciaryUser user, String partyCd, String filePath) 
			throws Exception;
	
	/**
	 * split flat file (FICS, FPAL) for 1. Charge Case/ Hawker Case, 2. Progressive Roll-out
	 * 
	 * @param user.
	 * @return status code, desc
	 */
	public ConversionResultDTO splitFlatFile(JudiciaryUser user, String fileType, List<String> rolloutCourtCode, LegacyDataDTO content)
			throws Exception;

	/**
	 * merge flat file (FICS, FPAL) for 1. Charge Case/ Hawker Case, 2. Progressive Roll-out
	 * 
	 * @param user.
	 * @return status code, desc
	 */
	public ConversionResultDTO mergeFlatFile(JudiciaryUser user, String fileType, List<LegacyDataDTO> content) 
			throws Exception;
	
	public CommonWsDTO processSampleZip(JudiciaryUser user, String partyCd) throws Exception;
	
}
