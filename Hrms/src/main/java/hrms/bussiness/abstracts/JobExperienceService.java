package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.JobExperience;

public interface JobExperienceService {

	Result add(JobExperience jobExperience);
    Result update(JobExperience jobExperience);
    DataResult<JobExperience> findById(int id);
    DataResult<List<JobExperience>> findAll();
}
