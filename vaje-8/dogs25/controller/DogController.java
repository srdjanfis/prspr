package si.unm.fis.prspr.dogs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.dogs.entity.Dog;
import si.unm.fis.prspr.dogs.service.DogService;

@RestController
@RequestMapping("/dog")
public class DogController {
    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/getDogs")
    public List<Dog> getDogs(){
        return dogService.getDogs();
    }

    @PostMapping("/addDog")
    public void addDog(@RequestBody Dog d){
        dogService.addDog(d);
    }

    @PutMapping("/updateDog")
    public void updateDog(@RequestBody Dog d){
        dogService.updateDog(d);
    }

    @DeleteMapping("/deleteDog")
    public void deleteDog(Integer id){
        dogService.deleteDog(id);
    }
}
