package hrms.bussiness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.AuthService;
import hrms.bussiness.abstracts.EmployeeService;
import hrms.bussiness.abstracts.EmployerService;
import hrms.bussiness.abstracts.JobCandidateService;
import hrms.bussiness.abstracts.UserService;
import hrms.core.entities.User;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;

import hrms.entities.concretes.Employee;
import hrms.entities.concretes.Employer;
import hrms.entities.concretes.JobCandidate;

import hrms.entities.dtos.UserForLoginDto;

@Service
public class AuthManager implements AuthService {

	private EmployeeService employeeService;
	private EmployerService employerService;
	private JobCandidateService jobCandidateService;
	private UserService userService;



	@Autowired
	public AuthManager(EmployeeService employeeService, EmployerService employerService,
			JobCandidateService jobCandidateService, UserService userService) {
		super();
		this.employeeService = employeeService;
		this.employerService = employerService;
		this.jobCandidateService = jobCandidateService;
		this.userService = userService;
		

	}

	@Override
	public DataResult<Employee> employeeRegister(Employee employee) {
		
		employeeService.add(employee);
		return new SuccessDataResult<Employee>(employee, "Kayıt gerçekleşti");
	}

	@Override
	public DataResult<Employer> employerRegister(Employer employer) {
		employerService.add(employer);
		return new SuccessDataResult<Employer>(employer, "Kayıt gerçekleşti");
	}

	@Override
	public DataResult<JobCandidate> jobCandidateRegister(JobCandidate jobCandidate) {
		jobCandidateService.add(jobCandidate);
		return new SuccessDataResult<JobCandidate>(jobCandidate, "Kayıt gerçekleşti");
	}

	@Override
	public DataResult<User> login(UserForLoginDto userForLoginDto) {
		var userToCheck = userService.findByEmail(userForLoginDto.getEmail());
		
        if (userToCheck.getData() == null )
        {
            return new ErrorDataResult<>("Giriş yapılamadı");
        }

        
        return new SuccessDataResult<User>(userToCheck.getData(), "Giriş yapıldı");
	}

	@Override
	public Result userExists(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
