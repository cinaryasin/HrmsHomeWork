package hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.*;

import hrms.core.entities.User;
import lombok.*;


@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee{

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "create_date")
	private Date createDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="users", joinColumns = {@JoinColumn(name= "user_id")}, 
//	inverseJoinColumns = {@JoinColumn(name="id")})
//	private User user;
}
