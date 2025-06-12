package si.unm.fis.prspr.ski.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.ski.model.SkiSlope;
import si.unm.fis.prspr.ski.service.SkiSlopeService;


@RestController
@RequestMapping("/skislope")
public class SkiSlopeController {

    private final SkiSlopeService skiSlopeService;

    public SkiSlopeController(SkiSlopeService skiSlopeService){
        this.skiSlopeService = skiSlopeService;
    }

    @GetMapping("/getSkiSlopes")
    public ArrayList<SkiSlope> getSkiSlopes(){
        return skiSlopeService.getSkiSlopes();
    }

    @PostMapping("/addSkiSlope")
    public void addSkiSlope(@RequestBody SkiSlope skiSlope){
        skiSlopeService.addSkiSlope(skiSlope);
    }

    @PutMapping("updateSkiSlope/{id}")
    public String updateSkiSlope(@PathVariable Integer id, 
                                 @RequestBody SkiSlope skiSlope) {
        return skiSlopeService.updateSkiSlope(id, skiSlope);
    }

    @DeleteMapping("/deleteSkiSlope/{id}")
    public String deleteSkiSlope(@PathVariable Integer id){
        return skiSlopeService.deleteSkiSlope(id);
    }

}
