package si.unm.fis.prspr.referat.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.referat.model.AuthRequest;
import si.unm.fis.prspr.referat.model.Referent;
import si.unm.fis.prspr.referat.service.ReferentService;




@RestController
@RequestMapping("/referent")
public class ReferentController {

    private final ReferentService referentService;

    public ReferentController(ReferentService referentService) {
        this.referentService = referentService;
    }

    @PostMapping("/auth")
    public String authenticate(@RequestBody AuthRequest authRequest) {
        return referentService.authenticate(authRequest);
    }
    

    @GetMapping("/getReferents")
    public List<Referent> getReferents() {
        return referentService.getReferents();
    }

    @PostMapping("/addReferent")
    public void addReferent(@RequestBody Referent referent) {
        referentService.addReferent(referent);
    }

    @PutMapping("/updateReferent")
    public void updateReferent(@RequestBody Referent referent) {
        referentService.updateReferent(referent);
    }
    
    @DeleteMapping("/deleteReferent/{id}")
    public void deleteReferent(@PathVariable Integer id) {
        referentService.deleteReferent(id);
    }
    
}
