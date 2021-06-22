package hrms.bussiness.abstracts;

import java.util.List;

import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.entities.concretes.SocialNetwork;

public interface SocialNetworkService {


	Result add(SocialNetwork socialNetwork);
    Result update(SocialNetwork socialNetwork);
    DataResult<SocialNetwork> findById(int id);
    DataResult<List<SocialNetwork>> findAll();
}
