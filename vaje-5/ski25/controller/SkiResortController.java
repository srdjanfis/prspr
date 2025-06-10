package si.unm.fis.prspr.ski.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/addSkiResort")
    public void addSkiResort(@RequestParam Integer id,
                             @RequestParam String name,
                             @RequestParam Integer noOfSlopes,
                             @RequestParam Integer idCountry){
        skiResortService.addSkiResort(id, name, noOfSlopes, idCountry);
    }

}
