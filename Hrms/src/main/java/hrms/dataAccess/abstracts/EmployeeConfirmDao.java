package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.EmployeeConfirm;

public interface EmployeeConfirmDao extends JpaRepository<EmployeeConfirm,Integer>{

}
