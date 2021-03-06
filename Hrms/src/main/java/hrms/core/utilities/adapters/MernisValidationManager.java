package hrms.core.utilities.adapters;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import hrms.core.utilities.security.FakeMernisHelper;


@Service
public class MernisValidationManager implements MernisValidationService{

	@Override
	public boolean validateByMernis(String identificationNo, String firstName, String lastName, LocalDate bithDate) {
		
		FakeMernisHelper fakeMernisHelper = new FakeMernisHelper();
		
		boolean result = true;
		try {
			result = fakeMernisHelper.ValidateByPersonal(identificationNo, firstName, lastName, bithDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
		
		
	}
	
}
