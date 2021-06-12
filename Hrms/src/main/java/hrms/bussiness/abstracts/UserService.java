package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.entities.User;
import hrms.core.results.DataResult;
import hrms.core.results.Result;

public interface UserService {

	Result add(User user);
	DataResult<User> findByEmail(String email);
	DataResult<User> findById(int id);
	DataResult<List<User>> findAll();
	
}
