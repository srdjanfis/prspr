package si.unm.fis.prspr.ski.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.ski.model.SkiSlope;

@Service
public class SkiSlopeService {
    
    ArrayList<SkiSlope> skiSlopes = new ArrayList<>();
    
    public SkiSlopeService(){
        skiSlopes.add(new SkiSlope(1, "Kekec", "modra", 1));
        skiSlopes.add(new SkiSlope(2, "Vitranc", "rdeča", 1));
        skiSlopes.add(new SkiSlope(3, "Podkoren", "črna", 1));
    }

    public ArrayList<SkiSlope> getSkiSlopes(){
        return skiSlopes;
    }

    public void addSkiSlope(SkiSlope skiSlope){
        skiSlopes.add(skiSlope);
    }

    public String updateSkiSlope(Integer id,
                                 SkiSlope skiSlope){
        for(SkiSlope s: skiSlopes){
            if(s.getId().equals(id)){
                s.setName(skiSlope.getName());
                s.setHardness(skiSlope.getHardness());
                s.setIdSkiResort(skiSlope.getIdSkiResort());
                return "Proga je uspešno posodobljena.";
            }
        }
        return "Takšne proge ni na seznamu.";
    }

    public String deleteSkiSlope(Integer id){
        int index = 0;
        for(SkiSlope s: skiSlopes){
            if(s.getId().equals(id)){
                skiSlopes.remove(index);
                return "Proga je uspešno izbrisana.";
            }
            index++;
        }
        return "Takšne proge ni na seznamu.";
    }

}
