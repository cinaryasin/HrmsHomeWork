package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.JobExperienceService;
import hrms.bussiness.abstracts.LanguageService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
import hrms.dataAccess.abstracts.JobExperienceDao;
import hrms.dataAccess.abstracts.LanguageDao;
import hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
			super();
			this.languageDao = languageDao;
		}

	@Override
	public Result add(Language language) {
		languageDao.save(language);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(Language language) {
		languageDao.save(language);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<Language> findById(int id) {
		var result = languageDao.findById(id).get();
		if (result == null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Getirildi");
	}

	@Override
	public DataResult<List<Language>> findAll() {
		var result = languageDao.findAll();
		if (result == null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Getirildi");
	}
}
