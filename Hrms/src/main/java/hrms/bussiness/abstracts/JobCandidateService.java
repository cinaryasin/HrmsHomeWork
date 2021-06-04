package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.JobCandidate;

public interface JobCandidateService {

	Result add(JobCandidate jobCandidate);
    Result update(JobCandidate jobCandidate);
    DataResult<JobCandidate> getById(int userId);
    DataResult<List<JobCandidate>> getAll();
	
}
