package hrms.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_titles")
public class JobTitle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title_name")
	private String roleName;
	
}
