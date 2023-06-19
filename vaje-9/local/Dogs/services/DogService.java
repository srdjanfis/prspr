package local.Dogs.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.Dogs.entities.Dog;
import local.Dogs.entities.Owner;
import local.Dogs.repositories.DogRepository;
import local.Dogs.repositories.OwnerRepository;

@Service
public class DogService {
	
	@Autowired
	DogRepository dogRepository;
	@Autowired
	OwnerRepository ownerRepository;
	
	public List<Owner> getAllOwners(){
		return ownerRepository.findAll();
	}
	
	public List<Dog> getAllDogs(){
		return dogRepository.findAll();
	}
	
	public void addUpdateOwner(Owner o) {
		ownerRepository.save(o);
	}
	
	public void addUpdateDog(Dog d) {
		dogRepository.save(d);
	}
	
	public void removeOwner(int ownerId) {
		ownerRepository.deleteById(ownerId);
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
		return dogRepository.findByLengthDogBetweenAndWeightDogGreaterThanOrderByBreedDog(
								lengthDogFrom, lengthDogTo, weightDog);
	}
}
