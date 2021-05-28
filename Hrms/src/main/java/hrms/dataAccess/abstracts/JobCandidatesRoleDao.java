package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.JobCandidatesRole;

public interface JobCandidatesRoleDao extends JpaRepository<JobCandidatesRole,Integer>{

}
