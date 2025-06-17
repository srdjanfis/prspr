package si.unm.fis.prspr.dogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.dogs.entity.Dog;

public interface DogRepository extends JpaRepository<Dog, Integer> {

}
