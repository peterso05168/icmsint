package hk.judiciary.icmsint.model.common;

public class SysInfConstant {
	
	public static final String WARRANT_WEBSERVICE_CONFIG_CODE="WarWS";
	
	//Message Type
	public static final String SYSINF_MSG_TYPE_CD_GDSI="GDSI";
	public static final String SYSINF_MSG_TYPE_CD_GDNI="GDNI";
	public static final String SYSINF_MSG_TYPE_CD_GFPI="GFPI";
	public static final String SYSINF_MSG_TYPE_CD_GCCI="GCCI";
	public static final String SYSINF_MSG_TYPE_CD_FICS="FICS";
	public static final String SYSINF_MSG_TYPE_CD_VALID="VALID";
	public static final String SYSINF_MSG_TYPE_CD_FPCS="FPCS";
	
	//GCCI Message
	public static final String SYSINF_MSG_CD_GCCI_D2J_CHARGE_CASE="CM-CC01";
	public static final String SYSINF_MSG_CD_GCCI_J2D_CHARGE_CASE_ALLOCATION="CM-CC02";
	public static final String SYSINF_MSG_CD_GCCI_D2J_BAIL_REGISTER="CM-CC05";
	public static final String SYSINF_MSG_CD_GCCI_J2D_CHARGE_CASE_COURT_RESULT="CM-CC06";
//	public static final String SYSINF_MSG_CD_GCCI_J2D_NEXT_HEARING="CM-GI09";
	
	//GDSNI Message
	public static final String SYSINF_MSG_CD_GDSNI_D2J_SUMMON_APPLICATION="CM-GI01";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_SUMMON_ALLOCATION="CM-GI02";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_SUMMON_HEARING_RESULT="CM-GI03";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_APPEAL_REVIEW_GRANT="CM-GI04";
	public static final String SYSINF_MSG_CD_GFPI_J2D_WARRANT_STATUS_CHANGE="CM-G05";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_WARRANT_STATUS_UPDATE="CM-GI05";
	public static final String SYSINF_MSG_CD_GDSNI_D2J_WITNESS_SUMMONS_APPLICATION="CM-GI06";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_WITNESS_SUMMONS_ALLOCATION="CM-GI07";
	public static final String SYSINF_MSG_CD_GDSNI_D2J_DEFENDANT_ADDRESS_APPLICATION="CM-GI08";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_FUTURE_HEARING_ALLOCATION="CM-GI09";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_NEXT_HEARING="CGM-GI09";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_RESERVICE_RESULT="CM-GI10";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_COURT_PAYMENT="CM-GI11";
	public static final String SYSINF_MSG_CD_GDSNI_D2J_SOD_APPLICATION="CM-GI12";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_SOD_APPLICATION_RESULT="CM-GI13";
	public static final String SYSINF_MSG_CD_GDSNI_D2J_DEPARTMENTAL_NOTICE_APPLICATION="CM-GI14";
	public static final String SYSINF_MSG_CD_GDNI_J2D_NOTICE_OF_ORDER_ALLOCATION="CM-GI15";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_NOTICE_OF_ORDER_HEARING_RESULT="CM-GI16";
	public static final String SYSINF_MSG_CD_GDSNI_D2J_CASE_DOCUMENT="CM-GI17";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_CASE_DOCUMENT_ACK="CM-GI18";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_COURT_DOCUMENT="CM-GI19";
	public static final String SYSINF_MSG_CD_GDSNI_J2D_SOD_DETAILS_UPDATE="CM-GI20";
	
	public static final String SYSINF_MSG_CD_GFPI_D2J_FIXED_PENALTY_NOTICE_OF_ORDER_APPLICATION="CM-FP01";
	public static final String SYSINF_MSG_CD_GFPI_D2J_FIXED_PENALTY_SUMMONS_APPLICATION="CM-FP02";
	public static final String SYSINF_MSG_CD_GFPI_D2J_FIXED_PENALTY_WITNESS_SUMMONS_APPLICATION="CM-G03";
	public static final String SYSINF_MSG_CD_GFPI_J2D_FIXED_PENALTY_NOTICE_SUMMONS_ALLOCATION="CM-FP04";
	public static final String SYSINF_MSG_CD_GFPI_J2D_FIXED_PENALTY_NOTICE_OF_ORDER_COURT_RESULT="CM-FP05";
	public static final String SYSINF_MSG_CD_GFPI_J2D_FIXED_PENALTY_SUMMONS_COURT_RESULT="CM-FP06";
	public static final String SYSINF_MSG_CD_GFPI_J2D_APPEAL_REVIEW_GRANT="CM-FP08";
	public static final String SYSINF_MSG_CD_GFPI_J2D_FIXED_PENALTY_WITNESS_SUMMONS_ALLOCATION="CM-G04";
	public static final String SYSINF_MSG_CD_GFPI_J2D_COURT_PAYMENT="CM-G06";
	public static final String SYSINF_MSG_CD_GFPI_D2J_FIXED_PENALTY_DISTRESS_WARRANT_APPLICATION="CM-FP10";
	public static final String SYSINF_MSG_CD_GFPI_J2D_FIXED_PENALTY_DISTRESS_WARRANT_ALLOCATION="CM-FP11";
	public static final String SYSINF_MSG_CD_GFPI_J2D_FIXED_PENALTY_DISTRESS_WARRANT_STATUS_CHANGE="CM-FP12";
	public static final String SYSINF_MSG_CD_GFPI_J2D_FIXED_PENALTY_DISTRESS_WARRANT_COURT_PAYMENT="CM-FP13";
	public static final String SYSINF_MSG_CD_GFPI_J2D_COURT_DOCUMENT="CM-GI17";
	public static final String SYSINF_MSG_MSGNAT_IN="I";
	public static final String SYSINF_MSG_MSGNAT_OUT="O";
	
//	public static final String SYSINF_STATUS_CD_SUCCESS="S";
//	public static final String SYSINF_STATUS_CD_FAIL="F";
//	public static final String SYSINF_STATUS_CD_ACCEPT="A";
//	public static final String SYSINF_STATUS_CD_REJECT="J";
//	public static final String SYSINF_STATUS_CD_NORMAL="N";
//	public static final String SYSINF_STATUS_CD_CHANGE="C";
//	public static final String SYSINF_STATUS_CD_ROLLBACK="R";
	
//	public static final String SYSINF_CTRL_TYPE_CD_CASE_ALLOCATION="CA";
//	public static final String SYSINF_CTRL_TYPE_CD_COURT_RESULT_UPDATE="CRU";
//	public static final String SYSINF_CTRL_TYPE_CD_PAYMENT_UPDATE="PU";
//	public static final String SYSINF_CTRL_TYPE_CD_APPEAL_REVIEW_GRANT_UPDATE="ARGU";
//	public static final String SYSINF_CTRL_TYPE_CD_WARRANT_STATUS_UPDATE="WSU";
//	public static final String SYSINF_CTRL_TYPE_CD_WITNESS_SUMMONS_APPLICATION_RESULT="WSAR";
//	public static final String SYSINF_CTRL_TYPE_CD_FUTURE_HEARING_ALLOCATION="FHA";
//	public static final String SYSINF_CTRL_TYPE_CD_RESERVICE_RESULT="RSR";
//	public static final String SYSINF_CTRL_TYPE_CD_SOD_APPLICATION_RESULT="SODAR";
//	public static final String SYSINF_CTRL_TYPE_CD_PUBLIC_PAYMENT_TX_NUM="PPTN";
//	public static final String SYSINF_CTRL_TYPE_CD_ACK_OF_CASE_DOC="ACD";
//	public static final String SYSINF_CTRL_TYPE_CD_COURT_DOC="CD";
//	public static final String SYSINF_CTRL_TYPE_CD_SOD_DETAILS_UPDATE="SODU";
	
	
//	public static final String SYSINF_CTRL_STATUS_CD_NEW = "N";
//	public static final String SYSINF_CTRL_STATUS_CD_DONE = "D";
//	public static final String SYSINF_CTRL_STATUS_CD_SKIPPED = "S";
	
	public static final String COURT_LEVEL_TYPE_MAG_COURT = "MC";


}
