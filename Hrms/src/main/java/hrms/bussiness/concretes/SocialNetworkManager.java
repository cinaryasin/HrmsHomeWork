package hrms.bussiness.concretes;

import java.util.List;

import hrms.bussiness.abstracts.SocialNetworkService;
import hrms.core.results.DataResult;
import hrms.core.results.Result;
import hrms.dataAccess.abstracts.SocialNetworkDao;
import hrms.entities.concretes.SocialNetwork;

public class SocialNetworkManager implements SocialNetworkService{

	private SocialNetworkDao socialNetworkDao;

	public SocialNetworkManager(SocialNetworkDao socialNetworkDao) {
		super();
		this.socialNetworkDao = socialNetworkDao;
	}

	@Override
	public Result add(SocialNetwork socialNetwork) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(SocialNetwork socialNetwork) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<SocialNetwork> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<SocialNetwork>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
