package hk.judiciary.icmsint.webservice.sample;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import hk.judiciary.icmsint.model.sample.biz.dto.ProjectSearchResultDTO;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ProjectService {

	@WebResult(name = "ProjectSearchResultDTOList")
	@WebMethod List<ProjectSearchResultDTO> getProject(
				@WebParam(name = "active") boolean active); //throws WebServiceException;
}



