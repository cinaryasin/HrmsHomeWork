package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Language;

public interface LanguageService {

	Result add(Language language);
    Result update(Language language);
    DataResult<Language> findById(int id);
    DataResult<List<Language>> findAll();
}
