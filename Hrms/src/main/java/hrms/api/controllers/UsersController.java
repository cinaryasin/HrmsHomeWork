package hrms.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;


import hrms.bussiness.abstracts.UserService;
import hrms.core.entities.User;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.JobCandidate;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	
private UserService userService;
	
	
	@Autowired
	public UsersController(UserService userService ) {
		
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody User user){
		return this.userService.add(user);
		
	}
	

	@PostMapping("/findById")
	public DataResult<User> findById(@RequestBody int id){
		return this.userService.findById(id);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String, String>();
		for (FieldError fieldError: exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Doğrulama Hataları");
		
		return errors;
	
	}
}