package si.unm.fis.prspr.dogs.controllers;

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

import si.unm.fis.prspr.dogs.entities.Dog;
import si.unm.fis.prspr.dogs.entities.Owner;
import si.unm.fis.prspr.dogs.services.DogService;
import si.unm.fis.prspr.dogs.services.OwnerService;

@RestController
@RequestMapping("dog")
public class DogController {
	DogService dogService;

	public DogController(DogService dogService) {
		this.dogService = dogService;
	}
	
	@GetMapping("/getAllDogs")
	public List<Dog> getAllDogs(){
		return dogService.getAllDogs();
	}
	
	@PostMapping("/addDog")
	public void addDog(@RequestBody Dog d) {
		dogService.addUpdateDog(d);
	}
	
	@PostMapping("/updateDog")
	public void updateDog(@RequestBody Dog d) {
		dogService.addUpdateDog(d);
	}
	
	@DeleteMapping("/removeDog")
	public void removeDog(int idDog) {
		dogService.removeDog(idDog);
	}
	
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

}
