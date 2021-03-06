package hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import hrms.bussiness.abstracts.SchoolService;
import hrms.core.results.DataResult;
import hrms.core.results.Result;

import hrms.entities.concretes.School;

@RestController
@RequestMapping("/api/auth")
public class SchoolsController {

	private SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	};
	
	@PostMapping("/addSchool")
	public Result add(@RequestBody School school){
		
		return this.schoolService.add(school);
		
	}
	
	@GetMapping("/findByIdSchool")
	public DataResult<School> findById(@RequestParam int id){
		
		return this.schoolService.findById(id);
		
	}
	
	@GetMapping("/findAllSchool")
    public DataResult<List<School>> findAll(){
        return this.schoolService.findAll();
    }
	
	
}
