package hrms.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.bussiness.abstracts.EmployerService;
import hrms.core.results.DataResult;
import hrms.core.results.ErrorDataResult;
import hrms.core.results.ErrorResult;
import hrms.core.results.Result;
import hrms.core.results.SuccessDataResult;
import hrms.core.results.SuccessResult;
import hrms.dataAccess.abstracts.EmployerDao;
import hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;

	}
	
	@Override
	public Result add(Employer employer) {
		if(!this.checkIfEmailExists(employer.getEmail())) {
			return new ErrorResult("Email already exist... ");
		}
	
		if(!this.checkIfEqualEmailAndDomain(employer.getEmail(),employer.getWebAddress())) {
			return new ErrorResult("Invalid mail adress...");
	}
		
		
		
		employerDao.save(employer);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<Employer> findById(int userId) {
		var result = employerDao.findById(userId);
		if (result == null) {
			return new ErrorDataResult<>("İşveren bulunamadı");
		}
		return new SuccessDataResult<>(result,"İşveren listelendi");
	}

	@Override
	public DataResult<List<Employer>> findAll() {
		var result = employerDao.findAll();
		if (result==null) {
			return new ErrorDataResult<>("İşverenler bulunamadı");
		}
		return new SuccessDataResult<>(result, "İşverenler Listelendi");
	}
	
	private boolean checkIfEmailExists(String email) {
		if(this.employerDao.findByEmail(email) !=null) {
			return false;
		}
		return true;
		
	}
	

	private boolean checkIfEqualEmailAndDomain(String email, String website) {
		String[] emailArr = email.split("@", 2);
		String domain = website.substring(4, website.length());

		if (emailArr[1].equals(domain)) {

			return true;
		}

		return false;
	}

}
