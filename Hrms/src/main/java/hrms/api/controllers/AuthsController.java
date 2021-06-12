package hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.bussiness.abstracts.AuthService;
import hrms.core.entities.User;
import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Employee;
import hrms.entities.concretes.Employer;
import hrms.entities.concretes.JobCandidate;
import hrms.entities.dtos.UserForLoginDto;

@RestController
@RequestMapping("/api/auth")
public class AuthsController {

	AuthService authService;

	@Autowired
	public AuthsController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/employeeRegister")
	public Result employeeRegister(@RequestBody Employee employee){
		return this.authService.employeeRegister(employee);
		
	}
	
	@PostMapping("/employerRegister")
	public Result employerRegister(@RequestBody Employer employer){
		return this.authService.employerRegister(employer);
		
	}
	
	@PostMapping("/jobCandidateRegister")
	public Result jobCandidateRegister(@RequestBody JobCandidate jobCandidate){
		return this.authService.jobCandidateRegister(jobCandidate);
		
	}
	
	@PostMapping("/userLogin")
	public DataResult<User> userLogin(@RequestBody UserForLoginDto userForLoginDto){
		
		return this.authService.login(userForLoginDto);
	}
	
	
	
	
}
