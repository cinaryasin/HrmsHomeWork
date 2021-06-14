package hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="verification_codes")
public class VerificationCode {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="id")
	private int id;

	
	private int userId;
	@Column(name="code")
	private String code;
	@Column(name="create_date")
	private LocalDate createDate = LocalDate.now();
	@Column(name="is_active")
	private boolean isActive;
	@Column(name="is_delete")
	private boolean isDelete;
	@Column(name="confirmed_date")
	private LocalDate confirmedDate;
	@Column(name="expired_date")
	private LocalDate expiredDate;
	
	
	
}
