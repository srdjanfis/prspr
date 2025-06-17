package si.unm.fis.prspr.dogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.dogs.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
