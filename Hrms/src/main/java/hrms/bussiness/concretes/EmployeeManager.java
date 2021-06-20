package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.EmployeeService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.ErrorResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
import hrms.dataAccess.abstracts.EmployeeDao;
import hrms.entities.concretes.Employee;
import lombok.var;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;

	}
	
	@Override
	public Result add(Employee employee) {
		
		if(!this.checkIfEmailExists(employee.getEmail())) {
			return new ErrorResult("Email already exist... ");
		}
	
		employeeDao.save(employee);
		return new SuccessResult();
	}

	@Override
	public Result update(Employee employee) {
		employeeDao.save(employee);
		return new SuccessResult("güncellendi");
	}

	@Override
	public DataResult<Employee> findById(int userId) {
		var result = employeeDao.findById(userId);
		if (result==null) {
			return new ErrorDataResult<>("Sistem çalışanı bulunamadı");
		}
		return new SuccessDataResult<>(result,"Sistem çalışanı getirildi");
	}

	@Override
	public DataResult<List<Employee>> findAll() {
		var result = employeeDao.findAll();
		if (result == null) {
			return new ErrorDataResult<>("Sistem çalışanları bulunamadı");
		}
		return new SuccessDataResult<>(result,"Sistem çalışanları listelendi");
	}
	
	
	private boolean checkIfEmailExists(String email) {
		if(this.employeeDao.findByEmail(email) !=null) {
			return false;
		}
		return true;
		
	}
	

	

}
