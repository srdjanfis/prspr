package si.unm.fis.prspr.dogs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.dogs.entity.Owner;
import si.unm.fis.prspr.dogs.service.OwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/getOwners")
    public List<Owner> getOwners(){
        return ownerService.getOwners();
    }

    @PostMapping("/addOwner")
    public void addOwner(Owner o){
        ownerService.addOwner(o);
    }

    @PutMapping("/updateOwner")
    public void updateOwner(Owner o){
        ownerService.addOwner(o);
    }

    @DeleteMapping("/deleteOwner")
    public void deleteOwner(Integer id){
        ownerService.deleteOwner(id);
    }


}
