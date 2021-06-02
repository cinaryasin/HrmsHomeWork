package hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import hrms.core.entities.User;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee extends User {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "create_date")
	private LocalDate createDate;

	@Column(name = "is_active")
	private boolean isActive;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="users", joinColumns = {@JoinColumn(name= "user_id")}, 
//	inverseJoinColumns = {@JoinColumn(name="id")})
//	private User user;
}
