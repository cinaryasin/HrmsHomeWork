package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.ImageService;
import hrms.bussiness.abstracts.JobExperienceService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
import hrms.dataAccess.abstracts.JobExperienceDao;
import hrms.entities.concretes.JobExperience;


@Service
public class JobExperienceManager implements JobExperienceService {

	private JobExperienceDao jobExperienceDao;
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

		@Override
		public Result add(JobExperience jobExperience) {
			var result = jobExperienceDao.save(jobExperience);
			return new SuccessResult("Eklendi");
		}

		@Override
		public Result update(JobExperience jobExperience) {
			var result = jobExperienceDao.save(jobExperience);
			return new SuccessResult("Güncellendi");
		}

		@Override
		public DataResult<JobExperience> findById(int id) {
			var result = jobExperienceDao.findById(id);
			if(result==null) {
				return new ErrorDataResult<>("Bulunamadı");
			}
			
			return new SuccessDataResult<>(result,"Getirildi");
		}

		@Override
		public DataResult<List<JobExperience>> findAll() {
			var result = jobExperienceDao.findAll();
			if(result==null) {
				return new ErrorDataResult<>("Bulunamadı");
			}
			
			return new SuccessDataResult<>(result,"Data Getirildi");
		}
}
