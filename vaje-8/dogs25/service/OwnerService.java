package si.unm.fis.prspr.dogs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.dogs.entity.Owner;
import si.unm.fis.prspr.dogs.repository.OwnerRepository;

@Service
public class OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> getOwners(){
        return ownerRepository.findAll();
    }

    public void addOwner(Owner o){
        ownerRepository.save(o);
    }

    public void updateOwner(Owner o){
        ownerRepository.save(o);
    }

    public void deleteOwner(Integer id){
        ownerRepository.deleteById(id);
    }
}
