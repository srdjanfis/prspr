package si.unm.fis.prspr.ski.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.ski.model.SkiResort;

@Service
public class SkiResortService {

    ArrayList<SkiResort> skiResorts = new ArrayList<>();

    public SkiResortService(){
        skiResorts.add(new SkiResort(1, "Kranjska Gora", 12, 1));
        skiResorts.add(new SkiResort(2, "Gače", 3, 1));
        skiResorts.add(new SkiResort(3, "Nasfeld", 50, 3));
        skiResorts.add(new SkiResort(4, "Sella Ronda", 65, 2));
    }

    public ArrayList<SkiResort> getSkiResorts(){
        return skiResorts;
    }

    public ArrayList<SkiResort> getSkiResortsInCountry(Integer idCountry){
        ArrayList<SkiResort> skiResortsInCountry = new ArrayList<>();
        for(SkiResort s: skiResorts){
            if(s.getIdCountry().equals(idCountry)){
                skiResortsInCountry.add(s);
            }
        }
        return skiResortsInCountry;
    }

    public void addSkiResort(SkiResort skiResort){
        skiResorts.add(skiResort);
    }

    public String updateSkiResort(Integer id,
                                  SkiResort skiResort){
        for(SkiResort s: skiResorts){
            if(s.getId().equals(id)){
                s.setName(skiResort.getName());
                s.setNoOfSlopes(skiResort.getNoOfSlopes());
                s.setIdCountry(skiResort.getIdCountry());
                return "Smučišče je uspešno posodobljeno.";
            }
        }
        return "To smučišče ne obstaja.";
    }    

    public String deleteSkiResort(Integer id){
        int index = 0;
        for(SkiResort s: skiResorts){
            if(s.getId().equals(id)){
                skiResorts.remove(index);
                return "Smučišče je uspešno izbrisano.";
            } else{
                index++;
            }
        }
        return "To smučišče ne obstaja.";
    }

}
