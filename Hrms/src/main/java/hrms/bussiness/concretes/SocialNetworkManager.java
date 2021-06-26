package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.SocialNetworkService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
import hrms.dataAccess.abstracts.SocialNetworkDao;
import hrms.entities.concretes.SocialNetwork;

@Service
public class SocialNetworkManager implements SocialNetworkService{

	private SocialNetworkDao socialNetworkDao;

	@Autowired
	public SocialNetworkManager(SocialNetworkDao socialNetworkDao) {
		super();
		this.socialNetworkDao = socialNetworkDao;
	}

	@Override
	public Result add(SocialNetwork socialNetwork) {
		socialNetworkDao.save(socialNetwork);
		return new SuccessResult("Sosyal ağlar eklendi");
	}

	@Override
	public Result update(SocialNetwork socialNetwork) {
		socialNetworkDao.save(socialNetwork);
		return new SuccessResult("Sosyal ağlar güncellendi");
	}

	@Override
	public DataResult<SocialNetwork> findById(int id) {
		var result = socialNetworkDao.findById(id).get();
		if (result==null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Data getirildi");
	}

	@Override
	public DataResult<List<SocialNetwork>> findAll() {
		var result = socialNetworkDao.findAll();
		if (result==null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Data getirildi");
	}
}
