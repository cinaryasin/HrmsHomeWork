package hrms.api.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import hrms.bussiness.abstracts.ImageService;
import hrms.bussiness.abstracts.JobCandidateService;
import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.Image;
import hrms.entities.concretes.JobCandidate;

@RestController
@RequestMapping("/api/auth")
public class ImagesController {

	private ImageService imageService;
	private JobCandidateService jobCandidateService;

	@Autowired
	public ImagesController(ImageService imageService,JobCandidateService jobCandidateService) {
		super();
		this.imageService = imageService;
		this.jobCandidateService = jobCandidateService;
	}
	
	@PostMapping("/addImage")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "multipartFile") MultipartFile multipartFile){
		JobCandidate jobCandidate = jobCandidateService.findById(id).getData();
		Image image = new Image();
		image.setJobCandidate(jobCandidate);
		return this.imageService.add(image, multipartFile);
		
	}
	
	@GetMapping("/findByIdImage")
	public DataResult<Image> findById(@RequestParam int id){
		
		
		return this.imageService.findById(id);
		
	}
	
	@GetMapping("/findAllImage")
    public DataResult<List<Image>> findAll(){
        return this.imageService.findAll();
    }
	

	
}
