package hrms.bussiness.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import hrms.bussiness.abstracts.UserService;
import hrms.core.entities.User;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;

import hrms.dataAccess.abstracts.UserDao;


@Service
public class UserManager implements UserService {

	
	private UserDao userDao;


	@Autowired
	public UserManager(UserDao userDao) {

		this.userDao = userDao;
		
	}
	
	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		return new SuccessResult();
	}

	@Override
	public DataResult<User> findByEmail(String email) {

		
		return new SuccessDataResult<User>(userDao.findByEmail(email),"getirildi");
		
	}
	@Override
	public DataResult<User> findById(int id) {

		
		var result = this.userDao.findById(id);
		if(result==null) {
			return new ErrorDataResult<>("Bulunamadı");
		}
		
		return new SuccessDataResult<>(result,"getirildi");
		
	}

	@Override
	public DataResult<List<User>> findAll() {
		var result = userDao.findAll();
		return new SuccessDataResult<>(result,"Data Listelendi");
	}
	
	

}
