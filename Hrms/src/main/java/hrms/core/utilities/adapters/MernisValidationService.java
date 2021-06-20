package hrms.core.utilities.adapters;

import java.time.LocalDate;

public interface MernisValidationService {
	boolean validateByMernis(String identificationNo, String firstName, String lastName, LocalDate bithDate);
}
