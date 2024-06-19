package si.unm.fis.prspr.dogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.dogs.entities.Dog;
import java.util.List;


public interface DogRepository extends JpaRepository<Dog, Integer>{
	List<Dog> findByLengthBetweenAndWeightGreaterThanOrderByBreed(int lengthFrom, int lengthTo, int weight);
}
