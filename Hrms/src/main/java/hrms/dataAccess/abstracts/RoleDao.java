package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.JobTitle;

public interface RoleDao extends JpaRepository<JobTitle,Integer>{

}
