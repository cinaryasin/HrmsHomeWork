package hrms.bussiness.abstracts;

import hrms.core.results.Result;
import hrms.entities.concretes.JobCandidate;

public interface JobCandidateService {

	Result add(JobCandidate jobCandidate);
	
}
