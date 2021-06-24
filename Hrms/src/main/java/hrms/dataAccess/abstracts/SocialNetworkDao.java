package hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.SocialNetwork;

public interface SocialNetworkDao extends JpaRepository<SocialNetwork,Integer>{

	
	List<SocialNetwork> findAllByJobCandidateId(int jobCandidateId);
}
