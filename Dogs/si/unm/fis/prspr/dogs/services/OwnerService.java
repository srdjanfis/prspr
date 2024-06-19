package si.unm.fis.prspr.dogs.services;

import java.util.List;
import org.springframework.stereotype.Service;
import si.unm.fis.prspr.dogs.entities.Owner;
import si.unm.fis.prspr.dogs.repositories.OwnerRepository;

@Service
public class OwnerService {
	OwnerRepository ownerRepository;
	public OwnerService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	
	public List<Owner> getAllOwners(){
		return ownerRepository.findAll();
	}
	
	public void addUpdateOwner(Owner o) {
		ownerRepository.save(o);
	}
	
	public void removeOwner(int ownerId) {
		ownerRepository.deleteById(ownerId);
	}

}
