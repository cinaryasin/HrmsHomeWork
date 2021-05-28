package hrms.entities.concretes;

import javax.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="employers_roles")
public class EmployersRole {

	@Column(name="employers_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employersId;
	
	@Column(name="roles_id")
	private int roleId;

}

