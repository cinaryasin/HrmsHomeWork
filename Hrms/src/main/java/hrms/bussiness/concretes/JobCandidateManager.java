package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import hrms.bussiness.abstracts.JobCandidateService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
import hrms.dataAccess.abstracts.JobCandidateDao;
import hrms.entities.concretes.JobCandidate;

@Service
public class JobCandidateManager implements JobCandidateService {

	private JobCandidateDao jobCandidateDao;

	@Autowired
	public JobCandidateManager(JobCandidateDao jobCandidateDao) {
		super();
		this.jobCandidateDao = jobCandidateDao;

	}

	
	
	@Override
	public Result add(JobCandidate jobCandidate) {

		jobCandidateDao.save(jobCandidate);
		return new SuccessResult("Eklendi");
	}



	@Override
	public Result update(JobCandidate jobCandidate) {
		jobCandidateDao.save(jobCandidate);
		return new SuccessResult("Güncellendi");
	}



	@Override
	public DataResult<JobCandidate> getById(int userId) {
		var result = jobCandidateDao.findById(userId);
		if (result == null) {
			return new ErrorDataResult<>("kullanıcı bulunamadı");
		}
		return new SuccessDataResult<>(result, "kullanıcı listelendi");
	}



	@Override
	public DataResult<List<JobCandidate>> getAll() {
		var result = jobCandidateDao.findAll();
		return new SuccessDataResult<>(result,"Data Listelendi");
	}

}
