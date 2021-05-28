package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.core.entities.OperationClaim;



public interface OperationClaimDao extends JpaRepository<OperationClaim,Integer>{

}
