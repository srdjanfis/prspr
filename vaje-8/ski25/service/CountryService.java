package si.unm.fis.prspr.ski.service;

import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.ski.entity.Country;
import si.unm.fis.prspr.ski.repository.CountryRepository;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    public List<Country> getCountriesThatStartWith(String givenString){
        return countryRepository.findAllByNameStartsWith(givenString);
    }

    public void addCountry(Country country){
        countryRepository.save(country);
    }

    public void deleteCountry(Integer id){
        countryRepository.deleteById(id);
    }

    public void updateCountry(Country country) {
        countryRepository.save(country);
    }

}
