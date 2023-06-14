package local.ski.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.ski.entity.Country;
import local.ski.entity.SkiResort;
import local.ski.entity.Slope;
import local.ski.repository.CountryRepository;
import local.ski.repository.SkiResortRepository;
import local.ski.repository.SlopeRepository;

@Service
public class SkiService {
	
	@Autowired
	CountryRepository countryRepository;
	@Autowired
	SkiResortRepository skiResortRepository;
	@Autowired
	SlopeRepository slopeRepository;

	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}
	
	public List<SkiResort> getAllSkiResorts(){
		return skiResortRepository.findAll();
	}
	
	public List<Slope> getAllSlopes(){
		return slopeRepository.findAll();
	}
	
	public List<Country> getCountriesThatStartWith(String startsWith){
		return countryRepository.findByNameCountryStartsWith(startsWith);
	}
	
	public List<Country> getSpecialCountries(String startsWith, String contains){
		return countryRepository.findByNameCountryStartsWithAndDescCountryContainsOrderByNameCountry(startsWith, contains);
	}
	
	public List<SkiResort> getSkiResortsByCountry(int idCountry){
		Optional<Country> optCountry = countryRepository.findById(idCountry);
		if(optCountry.isPresent()) {
			return optCountry.get().getSkiResorts();
		} else {
			return new ArrayList<SkiResort>();
		}
	}
	
	public Country getCountryBySkiResort(int idSkiResort) {
		Optional<SkiResort> optSkiResort = skiResortRepository.findById(idSkiResort);
		if(optSkiResort.isPresent()) {
			return optSkiResort.get().getCountry();
		} else {
			return null;
		}
	}
	
	public List<Slope> getSlopesBySkiResort(int idSkiResort){
		Optional<SkiResort> optSkiResort = skiResortRepository.findById(idSkiResort);
		if(optSkiResort.isPresent()) {
			return optSkiResort.get().getSlopes();
		} else {
			return new ArrayList<Slope>();
		}
	}
	
	public List<Slope> getSlopesBetween(int odLength, int doLength){
		return slopeRepository.findBySlopeLengthBetween(odLength, doLength);
	}
	
	public void addCountry(Country c) {
		countryRepository.save(c);
	}
	
	public void addSkiResort(SkiResort s) {
		skiResortRepository.save(s);
	}
	
	public void addSlope(Slope s) {
		slopeRepository.save(s);
	}
	
	public void removeCountry(int idCountry) {
		countryRepository.deleteById(idCountry);
	}
	
	public void removeSkiResort(int idSkiResort) {
		skiResortRepository.deleteById(idSkiResort);
	}
	
	public void removeSlope(int idSlope) {
		slopeRepository.deleteById(idSlope);;
	}
	
	public void updateCountry(Country c) {
		countryRepository.save(c);
	}
	
	public void updateSkiResort(SkiResort s) {
		skiResortRepository.save(s);
	}
	
	public void updateSlope(Slope s) {
		slopeRepository.save(s);
	}
}
