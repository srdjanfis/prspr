package si.unm.fis.prspr.dogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.dogs.entities.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer>{

}
