package si.unm.fis.prspr.dogs.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.dogs.entities.Owner;
import si.unm.fis.prspr.dogs.services.OwnerService;

@RestController
@RequestMapping("owner")
public class OwnerController {
	
	OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}
	
	@GetMapping("/getAllOwners")
	public List<Owner> getAllOwners(){
		return ownerService.getAllOwners();
	}
	
	@PostMapping("/addOwner")
	public void addOwner(@RequestBody Owner o) {
		ownerService.addUpdateOwner(o);
	}
	
	@PutMapping("/updateOwner")
	public void updateOwner(@RequestBody Owner o) {
		ownerService.addUpdateOwner(o);
	}
	
	@DeleteMapping("/removeOwner")
	public void removeOwner(int idOwner) {
		ownerService.removeOwner(idOwner);
	}
}
