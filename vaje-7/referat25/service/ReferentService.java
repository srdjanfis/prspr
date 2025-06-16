package si.unm.fis.prspr.referat.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.referat.model.AuthRequest;
import si.unm.fis.prspr.referat.model.Referent;

@Service
public class ReferentService {

    ArrayList<Referent> referentList = new ArrayList<>();

    public ReferentService(){
        referentList.add(new Referent(1, "Janez", "Novak", "janez", "janez123"));
        referentList.add(new Referent(2, "Mojca", "Vrečar", "vmojca", "prspr"));
        referentList.add(new Referent(3, "Katja", "Vitez", "katjav", "ljubljana"));
    }

    public String authenticate(AuthRequest authRequest){
        for(Referent r: referentList){
            if(r.getUsername().equals(authRequest.getUsername()) &&
               r.getPassword().equals(authRequest.getPassword())){
                return r.toString();
            }
        }
        return "Takšnega uporabnika ni na seznamu.";
    }

    public ArrayList<Referent> getReferents(){
        return referentList;
    }

    public void addReferent(Referent r){
        referentList.add(r);
    }

    public String updateReferent(Integer id,
                                 Referent referent){
        for(Referent r: referentList){
            if(r.getId().equals(id)){
                r.setIme(referent.getIme());
                r.setPriimek(referent.getPriimek());
                r.setUsername(referent.getUsername());
                r.setPassword(referent.getPassword());
                return "Referent je uspešno posodobljen.";
            }
        }
        return "Takšnega referenta ni.";
    }

    public String deleteReferent(Integer id){
        int index = 0;
        for(Referent r: referentList){
            if(r.getId().equals(id)){
                referentList.remove(index);
                return "Referent je uspešno izbrisan.";
            }
            index++;
        }
        return "Takšnega referenta ni.";
    }

}
