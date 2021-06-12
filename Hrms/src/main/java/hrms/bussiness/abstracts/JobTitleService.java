package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.JobTitle;

public interface JobTitleService {

	Result add(JobTitle jobTitle);
    Result update(JobTitle jobTitle);
    Result delete(JobTitle jobTitle);
    DataResult<List<JobTitle>> findAll();
}
