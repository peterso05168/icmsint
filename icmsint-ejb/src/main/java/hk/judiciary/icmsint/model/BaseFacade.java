package hk.judiciary.icmsint.model;

import hk.judiciary.fmk.ejb.facade.AbstractFacade;
import hk.judiciary.fmk.logging.FmkLogger;
import hk.judiciary.icmsint.model.sysinf.biz.AppealReviewBO;
import hk.judiciary.icmsint.model.sysinf.biz.CaseAppBO;
import hk.judiciary.icmsint.model.sysinf.biz.ControlBO;
import hk.judiciary.icmsint.model.sysinf.biz.DocumentBO;
import hk.judiciary.icmsint.model.sysinf.biz.HearingBO;
import hk.judiciary.icmsint.model.sysinf.biz.PaymentBO;
import hk.judiciary.icmsint.model.sysinf.biz.ReserviceBO;
import hk.judiciary.icmsint.model.sysinf.biz.SodBO;
import hk.judiciary.icmsint.model.sysinf.biz.WarrantBO;
import hk.judiciary.icmsint.model.sysinf.biz.WitnessBO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;

public class BaseFacade extends AbstractFacade {
	
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
    
    protected CommonWsDTO statusOK(CommonWsDTO dto) {
		dto.setReturnCode(ReturnStatus.SUCCESS.code());
		dto.setReturnDesc(ReturnStatus.SUCCESS.desc());
		return dto;
	}
    
    protected CaseAppBO getCaseAppBO() {
		return getBO(CaseAppBO.CASE_APP_BO, CaseAppBO.class);
	}
	
    protected WarrantBO getWarrantBO() {
		return getBO(WarrantBO.WARRANT_BO, WarrantBO.class);
	}
	
    protected ReserviceBO getReserviceBO() {
		return getBO(ReserviceBO.RESERVICE_BO, ReserviceBO.class);
	}
	
    protected HearingBO getHearingBO() {
		return getBO(HearingBO.HEARING_BO, HearingBO.class);
	}
	
    protected SodBO getSodBO() {
		return getBO(SodBO.SOD_BO, SodBO.class);
	}
	
    protected AppealReviewBO getAppealReviewBO() {
		return getBO(AppealReviewBO.APPEAL_REVIEW_BO, AppealReviewBO.class);
	}
	
    protected PaymentBO getPaymentBO() {
		return getBO(PaymentBO.PAYMENT_BO, PaymentBO.class);
	}
	
    protected WitnessBO getWitnessBO() {
		return getBO(WitnessBO.WITNESS_BO, WitnessBO.class);
	}
	
    protected DocumentBO getDocumentBO() {
		return getBO(DocumentBO.DOCUMENT_BO, DocumentBO.class);
	}
    
    protected ControlBO getControlBO() {
    	return getBO(ControlBO.CONTROL_BO, ControlBO.class);
    }

}
