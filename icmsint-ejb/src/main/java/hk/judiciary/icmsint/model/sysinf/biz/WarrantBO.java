package hk.judiciary.icmsint.model.sysinf.biz;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icmsint.model.BaseBO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;
import hk.judiciary.icmsint.model.sysinf.biz.generator.GxxiMsgGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.WarrantStatusChangeGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.WarrantStatusUpdateGenerator;
/**
 * 
 * @version $Revision: 14 $ $Date: 2017-05-24 17:33:30 +0800 (Wed, 24 May 2017) $
 * @author $Author: gordonhclam@judiciary.gov.hk $
 */
public class WarrantBO extends BaseBO {

	public static final String WARRANT_BO = "warrantBO";

	public GDSNIMsgDTO GDSNIMsgJ2D_CM_GI05(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator gxxiMsgGenerator = new WarrantStatusUpdateGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) gxxiMsgGenerator.generate();
	}
	
	public GDSNIMsgDTO GDSNIMsgJ2D_CM_G05(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator gxxiMsgGenerator = new WarrantStatusChangeGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) gxxiMsgGenerator.generate();
	}
}
