package hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.Image;


public interface ImageDao extends JpaRepository<Image,Integer>{

	Image findById(int id);
	Image findAllByJobCandidateId(int jobCandidateId);
	
	
}
