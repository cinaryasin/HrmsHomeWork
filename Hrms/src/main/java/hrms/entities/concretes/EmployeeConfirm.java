package hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employee_confirms")
public class EmployeeConfirm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="is_confirmed")
	@JsonIgnore
	private Boolean isConfirmed;
	
	@Column(name="confirmed_date")
	@JsonIgnore
	private Date confirmedDate;
	
}
