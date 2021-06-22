package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.JobExperienceService;
import hrms.bussiness.abstracts.LanguageService;
import hrms.core.results.DataResult;
import hrms.core.results.Result;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Language> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Language>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
