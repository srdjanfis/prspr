package local.Dogs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import local.Dogs.entities.Dog;
import local.Dogs.entities.Owner;
import local.Dogs.services.DogService;

@RestController
@RequestMapping("dog")
public class DogController {
	@Autowired
	DogService dogService;
	
	@GetMapping("/getSpecialDogs/{f}/{t}/{w}")
	public List<Dog> getSpecialDogs(@PathVariable int f,
								    @PathVariable int t,
								    @PathVariable int w){
		return dogService.getSpecialDogs(f, t, w);
	}
	
	@GetMapping("/getDogsByOwnerId/{id}")
	public List<Dog> getDogsByOwnerId(@PathVariable int id){
		return dogService.getDogsByOwnerId(id);
	}
	
	@GetMapping("/getAllOwners")
	public List<Owner> getAllOwners(){
		return dogService.getAllOwners();
	}
	
	@GetMapping("/getAllDogs")
	public List<Dog> getAllDogs(){
		return dogService.getAllDogs();
	}
	
	@PostMapping("/addOwner")
	public void addOwner(@RequestBody Owner o) {
		dogService.addUpdateOwner(o);
	}
	
	@PostMapping("/addDog")
	public void addDog(@RequestBody Dog d) {
		dogService.addUpdateDog(d);
	}
	
	@PutMapping("/updateOwner")
	public void updateOwner(@RequestBody Owner o) {
		dogService.addUpdateOwner(o);
	}
	
	@PostMapping("/updateDog")
	public void updateDog(@RequestBody Dog d) {
		dogService.addUpdateDog(d);
	}
	
	@DeleteMapping("/removeDog")
	public void removeDog(int idDog) {
		dogService.removeDog(idDog);
	}
	
	@DeleteMapping("/removeOwner")
	public void removeOwner(int idOwner) {
		dogService.removeOwner(idOwner);
	}
}
