package hk.judiciary.icmsint.model.sysinf.biz;



import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.icmsint.model.BaseBO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.GDSNIMsgDTO;
import hk.judiciary.icmsint.model.sysinf.biz.generator.GxxiMsgGenerator;
import hk.judiciary.icmsint.model.sysinf.biz.generator.ReserviceResultGenerator;


/**
 * 
 * @version $Revision: 14 $ $Date: 2017-05-24 17:33:30 +0800 (Wed, 24 May 2017) $
 * @author $Author: gordonhclam@judiciary.gov.hk $
 */
public class ReserviceBO extends BaseBO {

	public static final String RESERVICE_BO = "reserviceBO";

	public GDSNIMsgDTO sendReserviceResult(JudiciaryUser user,String partyCd) throws Exception {
		GxxiMsgGenerator generator = new ReserviceResultGenerator(user, partyCd, getSysInfCtrlDAO(), getSysInfCtrlTypeDAO(), getPdDAO());
		return (GDSNIMsgDTO) generator.generate();
	}	
}
