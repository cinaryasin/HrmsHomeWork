package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.core.entities.OperationClaimUser;

public interface OperationClaimUserDao extends JpaRepository<OperationClaimUser,Integer>{

}
