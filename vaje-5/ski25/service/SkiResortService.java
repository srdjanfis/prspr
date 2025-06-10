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

    public void addSkiResort(Integer id,
                             String name,
                             Integer noOfSlopes,
                             Integer idCountry){
        skiResorts.add(new SkiResort(id, name, noOfSlopes, idCountry));
    }

}
