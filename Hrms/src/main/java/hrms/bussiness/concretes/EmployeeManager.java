package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.bussiness.abstracts.EmployeeService;
import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.dataAccess.abstracts.EmployeeDao;
import hrms.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;

	}
	
	@Override
	public Result add(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employee> getById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
