package hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.core.entities.User;

import hrms.entities.dtos.UserForLoginDto;


public interface UserDao extends JpaRepository<User,Integer>{
	
	User findById(int id);
	
	User findByEmail(String email);
	
	@Query("Select new hrms.entities.dtos.UserForLoginDto"
			+ "(c.email, c.password) "
			+ "From User c ")
	List<UserForLoginDto> getUserDto();
	

} 
