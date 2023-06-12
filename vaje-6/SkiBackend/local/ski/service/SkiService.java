package local.ski.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.ski.entity.Country;
import local.ski.entity.SkiResort;
import local.ski.repository.CountryRepository;
import local.ski.repository.SkiResortRepository;

@Service
public class SkiService {
	
	@Autowired
	CountryRepository countryRepository;
	@Autowired
	SkiResortRepository skiResortRepository;

	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}

//	public List<Country> getCountry(int idCountry){
//		ArrayList<Country> result = new ArrayList<Country>();
//		for(Country c: countryList) {
//			if(c.getNameCountry().startsWith(startWith)) {
//				result.add(c);
//			}
//		}
//		return result;
//	}

	public void addCountry(Country c) {
		countryRepository.save(c);
	}
	
	public List<SkiResort> getAllSkiResorts(){
		return skiResortRepository.findAll();
	}
	
//	public List<SkiResort> getAllSkiResorts(int idCountry){
//		ArrayList<SkiResort> result = new ArrayList<SkiResort>();
//		for(SkiResort s: skiResortList) {
//			if(s.getCountryId() == idCountry) {
//				result.add(s);
//			}
//		}
//		return result;
//	}
	
	public void addSkiResort(SkiResort s) {
		skiResortRepository.save(s);
	}
	
	public void removeCountry(int idCountry) {
		countryRepository.deleteById(idCountry);
	}
	
	public void removeSkiResort(int idSkiResort) {
		skiResortRepository.deleteById(idSkiResort);
	}
	
	public void updateCountry(Country c) {
		countryRepository.save(c);
	}
	
	public void updateSkiResort(SkiResort s) {
		skiResortRepository.save(s);
	}
}
