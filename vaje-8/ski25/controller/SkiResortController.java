package si.unm.fis.prspr.ski.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.ski.entity.Country;
import si.unm.fis.prspr.ski.entity.SkiResort;
import si.unm.fis.prspr.ski.service.SkiResortService;


@RestController
@RequestMapping("/skiresort")
public class SkiResortController {

    private final SkiResortService skiResortService;

    public SkiResortController(SkiResortService skiResortService){
        this.skiResortService = skiResortService;
    }

    @GetMapping("/getSkiResorts")
    public List<SkiResort> getSkiResorts(){
        return skiResortService.getSkiResorts();
    }

     @PostMapping("/getSkiResortsByCountry")
     public List<SkiResort> getSkiResortsByCountry(@RequestBody Country country){
         return skiResortService.getSkiResortsByCountry(country);
     }

     @GetMapping("/getSkiResortsByNoOfSlopes")
     public List<SkiResort> getSkiResortsByNoOfSlopes(@RequestParam Integer givenNumber){
        return skiResortService.getSkiResortsByNoOfSlopesGreaterEqual(givenNumber);
     }

    @PostMapping("/add")
    public void addSkiResort(@RequestBody SkiResort skiResort){
        skiResortService.addSkiResort(skiResort);
    }

    @PutMapping("/update")
    public void updateSkiResort(@RequestBody SkiResort skiResort) {
        skiResortService.updateSkiResort(skiResort);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkiResort(@PathVariable Integer id){
        skiResortService.deleteSkiResort(id);
    }

}
