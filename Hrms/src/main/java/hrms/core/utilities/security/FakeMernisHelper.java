package hrms.core.utilities.security;

import java.time.LocalDate;

public class FakeMernisHelper {

	public boolean ValidateByPersonal(String identificationNo, String firstName, String lastName, LocalDate bithDate) {
		System.out.println(identificationNo + " " + " Kimlik numaralı" + " " + firstName + " " + lastName
				+ " isimli personel onaylandı");
		return true;
	}

}
