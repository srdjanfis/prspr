package local.Dogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import local.Dogs.entities.Dog;
import java.util.List;


public interface DogRepository extends JpaRepository<Dog, Integer>{
	List<Dog> findByLengthDogBetweenAndWeightDogGreaterThanOrderByBreedDog(int lengthDogFrom, int lengthDogTo, int weightDog);
}
