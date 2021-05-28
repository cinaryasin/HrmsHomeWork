package hrms.entities.concretes;

import java.sql.Date;

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
	@Column(name="user_id")
	private int userId;
	@Column(name="code")
	private String code;
	@Column(name="create_date")
	private Date createDate;
	@Column(name="is_verifed")
	private boolean isVerifed;
	
}