package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.EmployersRole;

public interface EmployersRoleDao extends JpaRepository<EmployersRole,Integer>{

}
