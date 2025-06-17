package si.unm.fis.prspr.referat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.referat.model.AuthRequest;
import si.unm.fis.prspr.referat.model.Referent;
import si.unm.fis.prspr.referat.repository.ReferentRepository;

@Service
public class ReferentService {

    private final ReferentRepository referentRepository;

    public ReferentService(ReferentRepository referentRepository){
        this.referentRepository = referentRepository;
    }

    public String authenticate(AuthRequest authRequest){
        List<Referent> foundReferents = referentRepository
            .findByUsernameAndPassword(authRequest.getUsername(), 
                                       authRequest.getPassword());
        if(foundReferents.isEmpty()){
            return "Takšnega uporabnika ni.";
        } else {
            return foundReferents.toString();
        }
    }

    public List<Referent> getReferents(){
        return referentRepository.findAll();
    }

    public void addReferent(Referent r){
        referentRepository.save(r);
    }

    public void updateReferent(Referent r){
        referentRepository.save(r);
    }

    public void deleteReferent(Integer id){
        referentRepository.deleteById(id);
    }

}
