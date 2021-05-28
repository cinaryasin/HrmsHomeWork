package hrms.bussiness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.JobCandidateService;

import hrms.core.results.Result;
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
		return new SuccessResult("eklendi");
	}

}
