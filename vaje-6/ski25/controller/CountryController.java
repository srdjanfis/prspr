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

import si.unm.fis.prspr.ski.model.Country;
import si.unm.fis.prspr.ski.service.CountryService;


@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/getCountries")
    public ArrayList<Country> getCountries(){
        return countryService.getCountries();
    }

    @GetMapping("/getCountriesThatStartWith")
    public ArrayList<Country> getCountriesThatStartWith(@RequestParam String givenString){
        return countryService.getCountriesThatStartWith(givenString);
    }

    @PostMapping("/addCountry")
    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }

    @PutMapping("/update/{id}")
    public String updateCountry(@PathVariable Integer id,
                                @RequestBody Country country){
        return countryService.updateCountry(id, country);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCountry(@PathVariable Integer id){
        return countryService.deleteCountry(id);
    }

}
