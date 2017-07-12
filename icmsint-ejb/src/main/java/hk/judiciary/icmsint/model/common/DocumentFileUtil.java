package hk.judiciary.icmsint.model.common;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.activation.FileTypeMap;

import hk.judiciary.fmk.common.security.user.InternalUserPropertiesConstant;
import hk.judiciary.fmk.common.security.user.JudiciaryUser;
import hk.judiciary.fmk.common.util.CommonUtil;
import hk.judiciary.fmk.ejb.cfs.AdminSupFileService;
import hk.judiciary.fmk.ejb.cfs.CentralizedFileService;
import hk.judiciary.fmk.ejb.cfs.EcfGetDocService;
import hk.judiciary.fmk.ejb.cfs.EcfSaveDocService;
import hk.judiciary.fmk.ejb.webservice.WSClientHandler;
import hk.judiciary.fmk.logging.FmkLogger;
import hk.judiciary.fmk.model.cfs.biz.dto.FileDTO;
import hk.judiciary.fmk.model.cfs.biz.dto.PersonDTO;
import hk.judiciary.fmk.model.report.biz.dto.ReportResultDTO;
import hk.judiciary.icmscase.webservice.cmc.CaseService;
import hk.judiciary.icmsdocm.model.cmd.biz.dto.ws.CreateDocRequestDTO;
import hk.judiciary.icmsdocm.model.cmd.biz.dto.ws.JudiWsUser;
import hk.judiciary.icmsdocm.model.cmd.biz.dto.ws.JudiWsUserUtil;
import hk.judiciary.icmsdocm.webservice.cmd.DocService;
import hk.judiciary.fmk.model.cfs.biz.dto.AdminSupFileInfoDTO;
import hk.judiciary.fmk.model.cfs.biz.dto.CfsFileInfoDTO;
import hk.judiciary.fmk.model.cfs.biz.dto.DocumentMetadataDTO;
import hk.judiciary.fmk.model.cfs.biz.dto.DocumentMetadataDTO.CourtSecurityClassification;
import hk.judiciary.fmk.model.cfs.biz.dto.EcfDocumentCopyDTO;
import hk.judiciary.fmk.model.cfs.biz.dto.EcfDocumentCopyDTO.DocumentCopyType;

public class DocumentFileUtil {
	
	public static final FmkLogger logger = new FmkLogger(DocumentFileUtil.class);
	
	public static final String INCOMING_DOCUMENT = "IN";
	public static final String OUTGOING_DOCUMENT = "OUT";
	public static final String UNCLASSIFIED_DOCUMENT = "UNCL";
	
	private static final String DEFAULT_DOCUMENT_STATUS = "ACT";		
    private static final String REPOSITORY_CODE = "ICMSCASE"; // Temp use. Should be use the value of CfsConstant
    
    /**
     * Generate Document Meta Data
     */
    private static DocumentMetadataDTO genDocumentMetadataDTO(JudiciaryUser judiciaryUser) {
    	Set <PersonDTO> creators = new HashSet<PersonDTO>();
    	PersonDTO creator = new PersonDTO();    	
    	creator.setName((String) judiciaryUser.getInternalUserProperty(InternalUserPropertiesConstant.LOGIN_NAME));
    	creators.add(creator);
    	
    	DocumentMetadataDTO documentMetadata = new DocumentMetadataDTO();
    	documentMetadata.setHasBcc(false);
    	documentMetadata.setHasCc(false);
    	documentMetadata.setCreators(creators);
    	documentMetadata.setRecordNumber(1);
    	documentMetadata.setTitle("N/A");
    	documentMetadata.setCourtSecurityClassification(CourtSecurityClassification.RESTRICTED);
    	documentMetadata.setType("N/A");
    	documentMetadata.setDateCreated(new Date());
    	documentMetadata.setDateReceived(new Date());
    	return documentMetadata;
    }
    	
    /**
     * Generate DRN
     */
    public static String generateDrn(JudiciaryUser judiciaryUser) throws Exception {
    	logger.info("generateDrn() start : judiciaryUser = " + judiciaryUser);
        String endpoint = WSClientHandler.getEndpointByWSConfigCode(CaseService.WEBSERV_CD);
        CaseService caseService = WSClientHandler.handleMessage(judiciaryUser, CaseService.class, endpoint);
        String drn = caseService.genDrn();
        logger.info("generateDrn() end : drn = " + drn);
        return drn;
    }
        
    /**
     * Create Document with case Id and document type code
     */
    public static int createDocument(JudiciaryUser judiciaryUser, Integer caseId, String documentTypeCode) throws Exception {
    	return createDocument(judiciaryUser, caseId, documentTypeCode, INCOMING_DOCUMENT, null, null);
    }
    
    /**
     * Create Return Document with case Id and document type code
     */
    public static int createReturnDocument(JudiciaryUser judiciaryUser, Integer caseId, String documentTypeCode) throws Exception {
    	return createDocument(judiciaryUser, caseId, documentTypeCode, OUTGOING_DOCUMENT, null, null);
    }
 
    /**
     * Create Document with case Id, document type code and DRN
     */
    public static int createDocument(JudiciaryUser judiciaryUser, Integer caseId, String documentTypeCode, String drn) throws Exception {
    	return createDocument(judiciaryUser, caseId, documentTypeCode, INCOMING_DOCUMENT, null, drn);
    }
    
    /**
     * Create Return Document with case Id, document type code and DRN
     */
    public static int createReturnDocument(JudiciaryUser judiciaryUser, Integer caseId, String documentTypeCode, String drn) throws Exception {
    	return createDocument(judiciaryUser, caseId, documentTypeCode, OUTGOING_DOCUMENT, null, drn);
    }
        
    /**
     * Create Document with case Id, document type code, document class code, document status code and DRN
     */
    public static int createDocument(JudiciaryUser judiciaryUser, Integer caseId, String documentTypeCode, String documentClassCode, String documentStatusCode, String drn) throws Exception {
    	logger.info("createDocument() start : caseId = " + caseId + ", documentTypeCode = " + documentTypeCode + ", documentClassCode = " + documentClassCode
        		 	+ ", documentStatusCode = " + documentStatusCode + ", drn = " + drn + ", judiciaryUser = " + judiciaryUser);

        JudiWsUser judiWsUser = JudiWsUserUtil.toWsJudiUser(judiciaryUser);
        
        String caseIdOrNo = caseId.toString();
        
        if (CommonUtil.isNullOrEmpty(drn)) {
        	drn = generateDrn(judiciaryUser);
        }
        
        if (CommonUtil.isNullOrEmpty(documentClassCode)) {        	
        	documentClassCode = INCOMING_DOCUMENT;
        }
        
        if (CommonUtil.isNullOrEmpty(documentStatusCode)) {        	
        	documentStatusCode = DEFAULT_DOCUMENT_STATUS;
        }
        
        CreateDocRequestDTO createDocRequest = new CreateDocRequestDTO();
        createDocRequest.setDocTypeCd(documentTypeCode);
        createDocRequest.setDocRefNo(drn);
        createDocRequest.setDocClassCd(documentClassCode);
        createDocRequest.setDocStatusCd(documentStatusCode);
        
        int subFlrId = -1;
        
        String endpoint = WSClientHandler.getEndpointByWSConfigCode(DocService.WEBSERV_CD);
        DocService docService = WSClientHandler.handleMessage(judiciaryUser, DocService.class, endpoint);
       	
        int icmsDocId = docService.createDoc(judiWsUser, caseIdOrNo, createDocRequest, subFlrId);
        
       	logger.info("createDocument() end : icmsDocId = " + icmsDocId);
        return icmsDocId;
    }
    
    /**
     * Add file to ECF repository
     */
    public static void addEcfFile(JudiciaryUser judiciaryUser, int icmsDocId, FileDTO file) throws Exception {
    	logger.info("addEcfFile() start : icmsDocId = " + icmsDocId + ", file = " + file + ", judiciaryUser = " + judiciaryUser);
    	
    	String endpoint = WSClientHandler.getEndpointByWSConfigCode(EcfSaveDocService.WEBSERVICE_CONFIG_CODE);
    	EcfSaveDocService ecfSaveDocService = WSClientHandler.handleMessage(judiciaryUser, EcfSaveDocService.class, endpoint);
//    	ecfSaveDocService.addDocument(icmsDocId, file, genDocumentMetadataDTO(judiciaryUser));

    	 
       	logger.info("addEcfFile() end");
    }
   
    /**
     * Add file to Administration and Support repository
     */
    public static void addAdminSupFile(JudiciaryUser judiciaryUser, int sourceFileId, FileDTO file) throws Exception {
    	logger.info("addAdminSupFile() start : sourceFileId = " + sourceFileId + ", file = " + file + ", judiciaryUser = " + judiciaryUser);
    	
    	AdminSupFileInfoDTO adminSupFileInfo = new AdminSupFileInfoDTO();
    	adminSupFileInfo.setRepositoryCode(REPOSITORY_CODE);
    	adminSupFileInfo.setSourceFileId(sourceFileId);
    	
    	String endpoint = WSClientHandler.getEndpointByWSConfigCode(AdminSupFileService.WEBSERVICE_CONFIG_CODE);
    	AdminSupFileService adminSupFileService = WSClientHandler.handleMessage(judiciaryUser, AdminSupFileService.class, endpoint);
    	adminSupFileService.addFile(adminSupFileInfo, file, genDocumentMetadataDTO(judiciaryUser));
    	 
       	logger.info("addAdminSupFile() end");
    }    
    
    /**
     * Add miscellaneous file
     */
    public static void addCfsFile(JudiciaryUser judiciaryUser, String sourceFileId, FileDTO file) throws Exception {
    	logger.info("addCfsFile() start : sourceFileId = " + sourceFileId + ", file = " + file + ", judiciaryUser = " + judiciaryUser);

    	CfsFileInfoDTO cfsFileInfo = new CfsFileInfoDTO();
    	cfsFileInfo.setRepositoryCode(REPOSITORY_CODE);
    	cfsFileInfo.setSourceFileId(sourceFileId); 
    	
//    	String endpoint = WSClientHandler.getEndpointByWSConfigCode(CentralizedFileService.WEBSERVICE_CONFIG_CODE);
//    	CentralizedFileService centralizedFileService = WSClientHandler.handleMessage(judiciaryUser, CentralizedFileService.class, endpoint);
//    	centralizedFileService.saveFile(cfsFileInfo, file);
    	CentralizedFileService client = WSClientHandler.handleMessageByWSCode(judiciaryUser, CentralizedFileService.class, CentralizedFileService.WEBSERVICE_CONFIG_CODE, false);
    	client.saveFile(cfsFileInfo, file);
    	 
       	logger.info("addCfsFile() end");
    }
    
    
    /**
     * Get file from ECF repository
     */
    public static FileDTO getEcfFile(JudiciaryUser judiciaryUser, int cfsFileId) throws Exception {
    	logger.info("getEcfFile() start : cfsFileId = " + cfsFileId + ", judiciaryUser = " + judiciaryUser);
    	
		EcfDocumentCopyDTO ecfDocumentCopy = new EcfDocumentCopyDTO();
		ecfDocumentCopy.setDocumentCopyType(DocumentCopyType.MAIN);
		ecfDocumentCopy.setCfsFileId(String.valueOf(cfsFileId));
		
		String endpoint = WSClientHandler.getEndpointByWSConfigCode(EcfGetDocService.WEBSERVICE_CONFIG_CODE);
		EcfGetDocService ecfGetDocService = WSClientHandler.handleMessage(judiciaryUser, EcfGetDocService.class, endpoint);
		FileDTO file = ecfGetDocService.getDocument(ecfDocumentCopy);   
       	logger.info("getEcfFile() end : file = " + file.getFilename());
        return file;
    }
    
    /**
     * Get file from Administration and Support repository
     */
    public static FileDTO getAdminSupFile(JudiciaryUser judiciaryUser, int sourceFileId) throws Exception {
    	logger.info("getAdminSupFile() start : sourceFileId = " + sourceFileId + ", judiciaryUser = " + judiciaryUser);
    	
    	AdminSupFileInfoDTO adminSupFileInfo = new AdminSupFileInfoDTO();
    	adminSupFileInfo.setRepositoryCode(REPOSITORY_CODE);
    	adminSupFileInfo.setSourceFileId(sourceFileId);
    	
    	String endpoint = WSClientHandler.getEndpointByWSConfigCode(AdminSupFileService.WEBSERVICE_CONFIG_CODE);
    	AdminSupFileService adminSupFileService = WSClientHandler.handleMessage(judiciaryUser, AdminSupFileService.class, endpoint);
    	FileDTO file = adminSupFileService.getFile(adminSupFileInfo);  
       	logger.info("getAdminSupFile() end : file = " + file.getFilename());
        return file;
    }
    
    /**
     * Get miscellaneous file
     */
    public static FileDTO getCfsFile(JudiciaryUser judiciaryUser, String sourceFileId) throws Exception {
    	logger.info("getCfsFile() start : sourceFileId = " + sourceFileId + ", judiciaryUser = " + judiciaryUser);
    	
    	CfsFileInfoDTO cfsFileInfo = new CfsFileInfoDTO();
    	cfsFileInfo.setRepositoryCode(REPOSITORY_CODE);
    	cfsFileInfo.setSourceFileId(sourceFileId);
    	
    	String endpoint = WSClientHandler.getEndpointByWSConfigCode(CentralizedFileService.WEBSERVICE_CONFIG_CODE);
//    	CentralizedFileService centralizedFileService = WSClientHandler.handleMessageByWSCode(judiciaryUser, CentralizedFileService.class, endpoint);
    	CentralizedFileService centralizedFileService = WSClientHandler.handleMessage(judiciaryUser, CentralizedFileService.class, endpoint);
    	FileDTO file = centralizedFileService.getFile(cfsFileInfo); 
       	logger.info("getCfsFile() end : file = " + file.getFilename());
          
        return file;
    }
    
    /**
     * Generate FileDTO by file path 
     */
    public static FileDTO generateFileDTO(String filePath) {
    	DataSource dataSource = new FileDataSource(filePath);     
    	FileDTO file = new FileDTO();
    	file.setFilename(dataSource.getName());            	
    	file.setContent(new DataHandler(dataSource)); 
    	return file;
    }
    
    /**
     * Generate FileDTO by reportResult 
     */
    public static FileDTO generateFileDTO(ReportResultDTO reportResult) {
    	return generateFileDTO(reportResult, reportResult.getReportId());
    }
    
    /**
     * Generate FileDTO by reportResult with filename
     */
    public static FileDTO generateFileDTO(ReportResultDTO reportResult, String filename) {
    	FileDTO file = new FileDTO();
    	file.setFilename(filename);
    	file.setContent(new DataHandler(reportResult.getDocument(), FileTypeMap.getDefaultFileTypeMap().getContentType(reportResult.getDocument().toString())));
    	return file;
    }


}
