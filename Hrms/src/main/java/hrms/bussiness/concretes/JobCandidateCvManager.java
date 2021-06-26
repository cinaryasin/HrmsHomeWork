package hrms.bussiness.concretes;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hrms.bussiness.abstracts.ImageService;
import hrms.bussiness.abstracts.JobCandidateCvService;
import hrms.bussiness.abstracts.JobExperienceService;
import hrms.bussiness.abstracts.LanguageService;
import hrms.bussiness.abstracts.SchoolService;
import hrms.bussiness.abstracts.SocialNetworkService;
import hrms.core.results.Result;
import hrms.core.results.SuccessResult;
import hrms.entities.concretes.Employer;
import hrms.entities.concretes.Image;
import hrms.entities.concretes.JobExperience;
import hrms.entities.concretes.Language;
import hrms.entities.concretes.School;
import hrms.entities.concretes.SocialNetwork;
import hrms.entities.dtos.JobCandidateCvDto;

@Service
public class JobCandidateCvManager implements JobCandidateCvService{

	private SchoolService schoolService;
    private LanguageService languageService;
    private JobExperienceService jobExperinceService;
    private SocialNetworkService socialNetworkService;
    private ImageService imageService;
    private ModelMapper modelMapper;
	
	
	
	@Autowired
	public JobCandidateCvManager(SchoolService schoolService, LanguageService languageService,
			JobExperienceService jobExperinceService, SocialNetworkService socialNetworkService,
			ImageService imageService,ModelMapper modelMapper) {
		super();
		this.schoolService = schoolService;
		this.languageService = languageService;
		this.jobExperinceService = jobExperinceService;
		this.socialNetworkService = socialNetworkService;
		this.imageService = imageService;
		this.modelMapper = modelMapper;
	}




	@Override
	public Result add(JobCandidateCvDto jobCandidateCvDto,MultipartFile multipartFile) {
		
		School school = modelMapper.map(jobCandidateCvDto.schools, School.class);
		Language language = modelMapper.map(jobCandidateCvDto.languages, Language.class);
		JobExperience jobExperience = modelMapper.map(jobCandidateCvDto.jobExperiences, JobExperience.class);
		SocialNetwork socialNetwork = modelMapper.map(jobCandidateCvDto.socialNetworks, SocialNetwork.class);
		Image image = modelMapper.map(jobCandidateCvDto.image, Image.class);
		
		
		
		schoolService.add(school);
		languageService.add(language);
		jobExperinceService.add(jobExperience);
		socialNetworkService.add(socialNetwork);
		imageService.add(image, multipartFile);
		
		return new SuccessResult("Eklendi");
	}

}
