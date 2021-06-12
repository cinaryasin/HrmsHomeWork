package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Employee;

public interface EmployeeService {
	Result add(Employee employee);
    Result update(Employee employee);
    DataResult<Employee> findById(int userId);
    DataResult<List<Employee>> findAll();
}
