package hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@Column(name="create_date")
	@JsonIgnore
	private LocalDate createDate;
	
	@Column(name="is_active", columnDefinition = "boolean default false") 
	@JsonIgnore
	private Boolean isActive;
	
}
