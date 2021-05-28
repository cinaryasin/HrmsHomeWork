package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.core.entities.User;


public interface UserDao extends JpaRepository<User,Integer>{
	
	User findByEmail(String email);
} 
