package hrms.entities.concretes;



import javax.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "job_candidates_roles")
public class JobCandidatesRole {

	@Id
	@Column(name="job_candidates_id")
	private int JobCadidatesId;
	
	@Column(name="roles_id")
	private int roleId;

	

}
