package hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.Language;


public interface LanguageDao extends JpaRepository<Language,Integer>{

	Language findById(int id);
	List<Language> findAllByJobCandidateId(int jobCandidateId);
}
