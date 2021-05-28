package hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.*;

import hrms.core.entities.User;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@Entity
@Table(name = "employers")
public class Employer {

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;


	@Column(name = "company_name")
	private String companyName;

	@Column(name = "web_address")
	private String webAddress;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "search_status")
	private boolean searchStatus;

	
}