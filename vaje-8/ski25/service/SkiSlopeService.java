package si.unm.fis.prspr.ski.service;

import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.ski.entity.SkiSlope;
import si.unm.fis.prspr.ski.repository.SkiSlopeRepository;

@Service
public class SkiSlopeService {
    
    private final SkiSlopeRepository skiSlopeRepository;
    
    public SkiSlopeService(SkiSlopeRepository skiSlopeRepository){
        this.skiSlopeRepository = skiSlopeRepository;
    }

    public List<SkiSlope> getSkiSlopes(){
        return skiSlopeRepository.findAll();
    }

    public void addSkiSlope(SkiSlope skiSlope){
        skiSlopeRepository.save(skiSlope);
    }

    public void updateSkiSlope(SkiSlope skiSlope){
        skiSlopeRepository.save(skiSlope);
    }

    public void deleteSkiSlope(Integer id){
        skiSlopeRepository.deleteById(id);
    }

    public List<SkiSlope> getSkiSlopesByDifficulty(String difficulty){
        return skiSlopeRepository.findAllByDifficulty(difficulty);
    }

}
