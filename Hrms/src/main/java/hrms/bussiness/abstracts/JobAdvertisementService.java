package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.JobAdvertisement;


public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
    Result update(JobAdvertisement jobAdvertisement);
    Result delete(JobAdvertisement jobAdvertisement);
    DataResult<JobAdvertisement> findById(int id);
    DataResult<List<JobAdvertisement>> findAll();
}
