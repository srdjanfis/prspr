package si.unm.fis.prspr.ski.service;

import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.ski.entity.Country;
import si.unm.fis.prspr.ski.entity.SkiResort;
import si.unm.fis.prspr.ski.repository.SkiResortRepository;

@Service
public class SkiResortService {

    private final SkiResortRepository skiResortRepository;    

    public SkiResortService(SkiResortRepository skiResortRepository){
        this.skiResortRepository = skiResortRepository;
    }

    public List<SkiResort> getSkiResorts(){
        return skiResortRepository.findAll();
    }

    public void addSkiResort(SkiResort skiResort){
        skiResortRepository.save(skiResort);
    }

    public void updateSkiResort(SkiResort skiResort){
        skiResortRepository.save(skiResort);
    }    

    public void deleteSkiResort(Integer id){
        skiResortRepository.deleteById(id);
    }

    public List<SkiResort> getSkiResortsByCountry(Country country){
        return skiResortRepository.findAllByCountry(country);
    }

    public List<SkiResort> getSkiResortsByNoOfSlopesGreaterEqual(Integer givenNumber){
        return skiResortRepository.findAllByNoOfSlopesGreaterThanEqual(givenNumber);
    }

}
