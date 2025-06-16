package si.unm.fis.prspr.ski.controller;

import java.util.ArrayList;
import java.util.List;

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

import si.unm.fis.prspr.ski.entity.Country;
import si.unm.fis.prspr.ski.service.CountryService;


@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService){
        this.countryService = countryService;
    }
    
    @GetMapping("/getCountries")
    public List<Country> getCountries(){
        return countryService.getCountries();
    }

    // @GetMapping("/getCountriesThatStartWith")
    // public ArrayList<Country> getCountriesThatStartWith(@RequestParam String givenString){
    //     return countryService.getCountriesThatStartWith(givenString);
    // }

    @PostMapping("/addCountry")
    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }

    @PutMapping("/update")
    public void updateCountry(@RequestBody Country country){
        countryService.updateCountry(country);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCountry(@PathVariable Integer id){
        countryService.deleteCountry(id);
    }

}
