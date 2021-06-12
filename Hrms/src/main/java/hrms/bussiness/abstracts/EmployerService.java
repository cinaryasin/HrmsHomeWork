package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);
    Result update(Employer employer);
    DataResult<Employer> findById(int userId);
    DataResult<List<Employer>> findAll();
}
