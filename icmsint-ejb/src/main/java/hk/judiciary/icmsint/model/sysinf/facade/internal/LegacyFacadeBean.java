package hk.judiciary.icmsint.model.sysinf.facade.internal;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.ejb.Stateless;

import javax.interceptor.Interceptors;
import javax.persistence.PersistenceContext;

import hk.judiciary.fmk.common.security.user.JudiciaryUser;

import hk.judiciary.fmk.ejb.facade.DefaultFacadeInterceptor;
import hk.judiciary.icmsint.model.BaseFacade;

import hk.judiciary.icmsint.model.sysinf.biz.dto.CommonWsDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.ConversionResultDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.LegacyDataDTO;
import hk.judiciary.icmsint.model.sysinf.biz.dto.RetrievalResultDTO;

import hk.judiciary.icmsint.model.sysinf.facade.LegacyFacade;

/**
 * 
 * @version $Revision: 14 $ $Date: 2015-02-25 09:31:08 +0800 (Wed, 25 Feb 2015)$
 * @author $Author: gordonhclam@judiciary.gov.hk $
 */

@Stateless(mappedName = "ejb/legacyFacade")
@Interceptors(DefaultFacadeInterceptor.class)
@PersistenceContext(name = "icmsintPU", unitName = "icmsintPU")
public class LegacyFacadeBean extends BaseFacade implements LegacyFacade {


	

	@Override
	public CommonWsDTO receiveDataFromParty(JudiciaryUser user, String partyCd, String filePath, Date uploadDate,
			List<LegacyDataDTO> dataList) throws Exception {
		// TODO replace dummy code
		return statusOK(new CommonWsDTO());
	}

	@Override
	public RetrievalResultDTO retrieveDataToParty(JudiciaryUser user, String partyCd, String filePath)
			throws Exception {
		// TODO replace dummy code
		RetrievalResultDTO dto = new RetrievalResultDTO();
		List<LegacyDataDTO> dataList = new ArrayList<LegacyDataDTO>();
		LegacyDataDTO ldDto = new LegacyDataDTO();
		ldDto.setFileName("CM-GI02.xml");
		ldDto.setFileData("<?xml version=\"1.0\" encoding=\"UTF-8\" ?><GDSNIMsgJ2D><InterfaceFileHeader><Prefix>CM-GI02</Prefix><BatchSerialNumber>10</BatchSerialNumber><InterfaceDate>2016-09-15</InterfaceDate><RecordCount>1</RecordCount></InterfaceFileHeader><SummonsAllocation><CourtSys>FL</CourtSys><CaseType>S</CaseType><CaseSerialNumber>80</CaseSerialNumber><CaseYear>2016</CaseYear><ProsecutionDepartmentCode>AFCD</ProsecutionDepartmentCode><DepartmentReferenceNumber>PU0666/2016/8</DepartmentReferenceNumber><RecordPrefix>CM-GI02</RecordPrefix><FirstHearingDate>2016-10-15</FirstHearingDate><FirstHearingTime>09:30:00</FirstHearingTime><HearingCourtNumber>2</HearingCourtNumber><ApplicationStatus>A</ApplicationStatus></SummonsAllocation></GDSNIMsgJ2D>");
		ldDto.setForCaseman(false);
		dataList.add(ldDto);
		dto.setDataList(dataList);
		return (RetrievalResultDTO) statusOK(dto);
	}

	@Override
	public ConversionResultDTO splitFlatFile(JudiciaryUser user, String fileType, List<String> rolloutCourtCode,
			LegacyDataDTO content) throws Exception {
		// TODO replace dummy code
		ConversionResultDTO dto = new ConversionResultDTO();
		List<LegacyDataDTO> dataList = new ArrayList<LegacyDataDTO>();
		dataList.add(content);
		LegacyDataDTO ldDto = new LegacyDataDTO();
		ldDto.setFileName(content.getFileName());
		ldDto.setFileData(content.getFileData());
		ldDto.setForCaseman(true);
		dataList.add(ldDto);
		dto.setDataList(dataList);
		return (ConversionResultDTO) statusOK(dto);
	}

	@Override
	public ConversionResultDTO mergeFlatFile(JudiciaryUser user, String fileType, List<LegacyDataDTO> content)
			throws Exception {
		// TODO replace dummy code
		ConversionResultDTO dto = new ConversionResultDTO();
		List<LegacyDataDTO> dataList = new ArrayList<LegacyDataDTO>();
		dataList.add(content.get(0));
		dto.setDataList(dataList);
		return (ConversionResultDTO) statusOK(dto);
	}
	
	@Override
	public CommonWsDTO processSampleZip(JudiciaryUser user, String partyCd) throws Exception {
		String zipFilePath = "xxxx.zip";
		ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
		ZipEntry entry = zipIn.getNextEntry();
		while (entry != null) {
			if (!entry.isDirectory()) {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(baos);
				byte[] bytesIn = new byte[4086];
				int read = 0;
				while ((read = zipIn.read(bytesIn)) != -1) {
					bos.write(bytesIn, 0, read);
				}
				bos.close();
				//getCaseAppBO().receiveDepartmentalSummonsApplication(user, partyCd, baos.toByteArray());
			}
			zipIn.closeEntry();
			entry = zipIn.getNextEntry();
		}
		zipIn.close();
		return null;
	}
}
