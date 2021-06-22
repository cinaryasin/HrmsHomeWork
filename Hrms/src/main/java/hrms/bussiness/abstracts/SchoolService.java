package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;

import hrms.entities.concretes.School;

public interface SchoolService {

	Result add(School school);
    Result update(School school);
    DataResult<School> findById(int id);
    DataResult<List<School>> findAll();
}
