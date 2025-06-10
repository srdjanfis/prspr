package si.unm.fis.prspr.ski.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.ski.model.Country;

@Service
public class CountryService {
    
    ArrayList<Country> countries = new ArrayList<>();
    
    public CountryService(){
        countries.add(new Country(1, "Slovenija", "SLO"));
        countries.add(new Country(2, "Italija", "ITA"));
        countries.add(new Country(3, "Avstrija", "AUT"));
    }

    public ArrayList<Country> getCountries(){
        return countries;
    }

    public ArrayList<Country> getCountriesThatStartWith(String givenString){
        ArrayList<Country> countriesThatStartWith = new ArrayList<>();
        for(Country country: countries){
            if(country.getName().startsWith(givenString)){
                countriesThatStartWith.add(country);
            }
        }
        return countriesThatStartWith;
    }

    public void addCountry(Integer id,
                           String name,
                           String description){
        countries.add(new Country(id, name, description));
    }

}
