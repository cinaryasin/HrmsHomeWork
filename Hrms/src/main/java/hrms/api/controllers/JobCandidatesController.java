package hrms.api.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import hrms.bussiness.abstracts.JobCandidateService;

import hrms.core.results.Result;
import hrms.entities.concretes.JobCandidate;


@RestController
@RequestMapping("/api/jobcandidates")
public class JobCandidatesController {

	
private JobCandidateService candidateService;
	
	
	@Autowired
	public JobCandidatesController(JobCandidateService candidateService) {
		
		this.candidateService = candidateService;
	}
	
	
	@PostMapping("/add")
	public Result add(@Valid  @RequestBody JobCandidate candidate){
		return this.candidateService.add(candidate);
		
	}
}
