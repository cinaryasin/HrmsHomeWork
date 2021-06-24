package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.SchoolService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
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
		schoolDao.save(school);
		return new SuccessResult("okul bilgileri eklendi");
	}

	@Override
	public Result update(School school) {
		schoolDao.save(school);
		return new SuccessResult("okul bilgileri güncellendi");
	}

	@Override
	public DataResult<School> findById(int id) {
		var result = schoolDao.findById(id).get();
		if (result==null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Okul getirildi");
	}

	@Override
	public DataResult<List<School>> findAll() {
		var result = schoolDao.findAll();
		if (result==null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Data getirildi");
	}

}
