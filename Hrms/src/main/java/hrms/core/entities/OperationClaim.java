package hrms.core.entities;

import javax.persistence.*;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "operation_claims")
public class OperationClaim {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

}
