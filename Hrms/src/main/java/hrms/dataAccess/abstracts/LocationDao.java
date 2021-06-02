package hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.entities.concretes.Location;

public interface LocationDao extends JpaRepository<Location,Integer>{

}
