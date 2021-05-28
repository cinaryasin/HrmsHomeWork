package hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import hrms.bussiness.abstracts.UserService;
import hrms.core.entities.User;
import hrms.core.results.Result;

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
}