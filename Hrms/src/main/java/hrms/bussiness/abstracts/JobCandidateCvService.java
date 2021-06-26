package hrms.bussiness.abstracts;

import org.springframework.web.multipart.MultipartFile;

import hrms.core.results.Result;
import hrms.entities.dtos.JobCandidateCvDto;

public interface JobCandidateCvService {

	Result add(JobCandidateCvDto jobCandidateCvDto,MultipartFile multipartFile);
}
