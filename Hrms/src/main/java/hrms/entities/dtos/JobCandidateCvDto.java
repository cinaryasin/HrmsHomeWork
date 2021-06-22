package hrms.entities.dtos;

import java.util.List;

import hrms.entities.concretes.Image;
import hrms.entities.concretes.JobCandidate;
import hrms.entities.concretes.JobExperience;
import hrms.entities.concretes.Language;
import hrms.entities.concretes.School;
import hrms.entities.concretes.SocialNetwork;

public class JobCandidateCvDto {

	public JobCandidate jobCandidate;
	
	public List<School> schools;
	
	public List<SocialNetwork> socialNetworks;
	
	public List<Language> languages;
	
	public List<JobExperience> jobExperiences;
		
	public Image image;
}
