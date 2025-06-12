package si.unm.fis.prspr.ski.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.ski.model.SkiResort;
import si.unm.fis.prspr.ski.service.SkiResortService;


@RestController
@RequestMapping("/skiresort")
public class SkiResortController {

    @Autowired
    private SkiResortService skiResortService;

    @GetMapping("/getSkiResorts")
    public ArrayList<SkiResort> getSkiResorts(){
        return skiResortService.getSkiResorts();
    }

    @GetMapping("/getSkiResortsInCountry")
    public ArrayList<SkiResort> getSkiResortsInCountry(@RequestParam Integer idCountry){
        return skiResortService.getSkiResortsInCountry(idCountry);
    }

    @PostMapping("/add")
    public void addSkiResort(@RequestBody SkiResort skiResort){
        skiResortService.addSkiResort(skiResort);
    }

    @PutMapping("/update/{id}")
    public String updateSkiResort(@PathVariable Integer id, 
                                @RequestBody SkiResort skiResort) {
        return skiResortService.updateSkiResort(id, skiResort);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSkiResort(@PathVariable Integer id){
        return skiResortService.deleteSkiResort(id);
    }

}
