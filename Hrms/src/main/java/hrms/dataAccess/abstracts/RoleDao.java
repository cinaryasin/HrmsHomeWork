package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.Role;

public interface RoleDao extends JpaRepository<Role,Integer>{

}
