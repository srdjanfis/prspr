package si.unm.fis.prspr.ski.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/addCountry")
    public void addCountry(@RequestParam Integer id,
                           @RequestParam String name,
                           @RequestParam String description){
        countryService.addCountry(id, name, description);
    }

}
