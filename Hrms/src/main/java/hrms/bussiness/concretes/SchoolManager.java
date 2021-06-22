package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.SchoolService;
import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.dataAccess.abstracts.SchoolDao;
import hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService{
	private SchoolDao schoolDao;

	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(School school) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<School> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<School>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
