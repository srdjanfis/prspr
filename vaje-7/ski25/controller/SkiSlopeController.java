package si.unm.fis.prspr.ski.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.ski.entity.SkiSlope;
import si.unm.fis.prspr.ski.service.SkiSlopeService;


@RestController
@RequestMapping("/skislope")
public class SkiSlopeController {

    private final SkiSlopeService skiSlopeService;

    public SkiSlopeController(SkiSlopeService skiSlopeService){
        this.skiSlopeService = skiSlopeService;
    }

    @GetMapping("/getSkiSlopes")
    public List<SkiSlope> getSkiSlopes(){
        return skiSlopeService.getSkiSlopes();
    }

    @PostMapping("/addSkiSlope")
    public void addSkiSlope(@RequestBody SkiSlope skiSlope){
        skiSlopeService.addSkiSlope(skiSlope);
    }

    @PutMapping("updateSkiSlope")
    public void updateSkiSlope(@RequestBody SkiSlope skiSlope) {
        skiSlopeService.updateSkiSlope(skiSlope);
    }

    @DeleteMapping("/deleteSkiSlope/{id}")
    public void deleteSkiSlope(@PathVariable Integer id){
        skiSlopeService.deleteSkiSlope(id);
    }

}
