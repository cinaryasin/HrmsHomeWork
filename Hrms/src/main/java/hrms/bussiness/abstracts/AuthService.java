package hrms.bussiness.abstracts;

import hrms.core.entities.User;
import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Employee;
import hrms.entities.concretes.Employer;
import hrms.entities.concretes.JobCandidate;
import hrms.entities.dtos.EmployerRegisterDto;
import hrms.entities.dtos.JobCandidateRegisterDto;
import hrms.entities.dtos.UserForLoginDto;

public interface AuthService {


	Result employerRegister(EmployerRegisterDto employerRegisterDto);

	Result jobCandidateRegister(JobCandidateRegisterDto jobCandidateRegisterDto);

	DataResult<User> login(UserForLoginDto userForLoginDto);

	Result userExists(String email);




	Result verifyEmail(int user_id, String activationCode);

}
