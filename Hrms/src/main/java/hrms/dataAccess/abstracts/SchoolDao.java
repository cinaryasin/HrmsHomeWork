package hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School, Integer> {

	
	List<School> findAllByJobCandidateId(int jobCandidateId);
}
