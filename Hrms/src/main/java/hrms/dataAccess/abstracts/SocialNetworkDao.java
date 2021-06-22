package hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.SocialNetwork;

public interface SocialNetworkDao extends JpaRepository<SocialNetwork,Integer>{

	SocialNetwork findById(int id);
	List<SocialNetwork> findAllByJobCandidateId(int jobCandidateId);
}
