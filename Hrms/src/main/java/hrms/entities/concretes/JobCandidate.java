package hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import hrms.core.entities.User;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "job_candidates")
public class JobCandidate{

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	
	@Column(name = "identification_no")
	private String identificationNo;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "birth_date")
	private LocalDate birthDate;

	@Column(name = "create_date")
	private LocalDate createDate;

	@Column(name = "search_status")
	private boolean searchStatus;
	
	
}
