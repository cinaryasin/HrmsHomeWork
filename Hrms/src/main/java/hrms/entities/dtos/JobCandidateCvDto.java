package hrms.entities.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import hrms.entities.concretes.Image;
import hrms.entities.concretes.JobCandidate;
import hrms.entities.concretes.JobExperience;
import hrms.entities.concretes.Language;
import hrms.entities.concretes.School;
import hrms.entities.concretes.SocialNetwork;

public class JobCandidateCvDto {

	@JsonIgnore
	public JobCandidate jobCandidate;
	
	public School schools;
	
	public SocialNetwork socialNetworks;
	
	public Language languages;
	
	public JobExperience jobExperiences;

	@JsonIgnore
	public Image image;
}
