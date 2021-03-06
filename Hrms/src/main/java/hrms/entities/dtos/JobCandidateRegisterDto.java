package hrms.entities.dtos;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobCandidateRegisterDto {

	private String email;
	private String password;
	private String confirmedPassword;
	private String firstName;
	private String lastName;

	private String identificationNo;
	private LocalDate birthDate;
	private String phoneNumber;
	
	
	
	
	
}
