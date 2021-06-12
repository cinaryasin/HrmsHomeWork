package hrms.bussiness.abstracts;

import hrms.core.entities.User;
import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Employee;
import hrms.entities.concretes.Employer;
import hrms.entities.concretes.JobCandidate;
import hrms.entities.dtos.UserForLoginDto;

public interface AuthService {

	DataResult<Employee> employeeRegister(Employee employee);
	DataResult<Employer> employerRegister(Employer employer);
	DataResult<JobCandidate> jobCandidateRegister(JobCandidate jobCandidate);
	
	DataResult<User> login(UserForLoginDto userForLoginDto);
	
	Result userExists(String email);
	
    
}
