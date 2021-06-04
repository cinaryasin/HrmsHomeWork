package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.EmployerService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
import hrms.dataAccess.abstracts.EmployerDao;
import hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;

	}
	
	@Override
	public Result add(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<Employer> getById(int userId) {
		var result = employerDao.findById(userId);
		if (result != null) {
			return new ErrorDataResult<>("kullanıcı bulunamadı");
		}
		return new SuccessDataResult<>(result,"kullanıcı listelendi");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		var result = employerDao.findAll();
		return new SuccessDataResult<>(result, "Data Listelendi");
	}

}
