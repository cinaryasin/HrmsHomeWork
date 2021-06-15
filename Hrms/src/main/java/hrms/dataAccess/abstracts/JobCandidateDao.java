package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.JobCandidate;

public interface JobCandidateDao extends JpaRepository<JobCandidate,Integer>{

	JobCandidate findById(int userId);
	JobCandidate findByEmail(String email);
	JobCandidate findByIdentificationNo(String identificationNo);
}
