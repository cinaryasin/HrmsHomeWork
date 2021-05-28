package hrms.bussiness.abstracts;

import hrms.core.entities.User;
import hrms.core.results.DataResult;
import hrms.core.results.Result;

public interface UserService {

	DataResult<User> getByEmail(String email);
	Result add(User user);
}
