package hrms.core.entities;

import javax.persistence.*;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "operation_claims_users")
public class OperationClaimUser {

	
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="operation_claim_id")
	private int operationClaimId;
	
	
	@Column(name="user_id")
	private int userId;
	


}
