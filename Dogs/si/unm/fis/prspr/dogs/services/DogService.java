package si.unm.fis.prspr.dogs.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import si.unm.fis.prspr.dogs.entities.Dog;
import si.unm.fis.prspr.dogs.entities.Owner;
import si.unm.fis.prspr.dogs.repositories.DogRepository;
import si.unm.fis.prspr.dogs.repositories.OwnerRepository;

@Service
public class DogService {
	
	OwnerRepository ownerRepository;
	DogRepository dogRepository;
	public DogService(DogRepository dogRepository,
					  OwnerRepository ownerRepository) {
		this.dogRepository = dogRepository;
		this.ownerRepository = ownerRepository;
	}
	
	public List<Dog> getAllDogs(){
		return dogRepository.findAll();
	}
	
	public void addUpdateDog(Dog d) {
		dogRepository.save(d);
	}
	
	public void removeDog(int dogId) {
		dogRepository.deleteById(dogId);
	}
	
	public List<Dog> getDogsByOwnerId(int ownerId){
		Optional<Owner> optOwner = ownerRepository.findById(ownerId);
		if(optOwner.isPresent()) {
			return optOwner.get().getDogs();
		} else {
			return new ArrayList<Dog>();
		}
	}
	
	public List<Dog> getSpecialDogs(int lengthDogFrom, 
									int lengthDogTo, 
									int weightDog){
		return dogRepository.findByLengthBetweenAndWeightGreaterThanOrderByBreed(
								lengthDogFrom, lengthDogTo, weightDog);
	}
}
