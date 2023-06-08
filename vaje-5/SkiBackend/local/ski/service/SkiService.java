package local.ski.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import local.ski.entity.Country;
import local.ski.entity.SkiResort;

@Service
public class SkiService {
	ArrayList<Country> countryList = new ArrayList<Country>();
	ArrayList<SkiResort> skiResortList = new ArrayList<SkiResort>();

	public SkiService() {
		countryList.add(new Country(1,"Slovenija","fdsfasdfsa"));
		countryList.add(new Country(2,"Avstrija","dflkgjlsfjgk"));
		countryList.add(new Country(3,"Italija","gsdfgsdffdsfasdfsa"));
		skiResortList.add(new SkiResort(1,
										"Kranjska gora",
										12,
										1));
		skiResortList.add(new SkiResort(2,
				"Krvavec",
				25,
				1));
		skiResortList.add(new SkiResort(3,
				"Sella Ronda",
				60,
				3));
		skiResortList.add(new SkiResort(4,
				"Gerlitzen",
				30,
				2));
		skiResortList.add(new SkiResort(5,
				"Nassfeld",
				45,
				2));
	}

	public List<Country> getAllCountries(){
		return countryList;
	}

	public List<Country> getCountries(String startWith){
		ArrayList<Country> result = new ArrayList<Country>();
		for(Country c: countryList) {
			if(c.getNameCountry().startsWith(startWith)) {
				result.add(c);
			}
		}
		return result;
	}

	public void addCountry(Country c) {
		countryList.add(c);
	}
	
	public List<SkiResort> getAllSkiResorts(){
		return skiResortList;
	}
	
	public List<SkiResort> getAllSkiResorts(int idCountry){
		ArrayList<SkiResort> result = new ArrayList<SkiResort>();
		for(SkiResort s: skiResortList) {
			if(s.getCountryId() == idCountry) {
				result.add(s);
			}
		}
		return result;
	}
	
	public void addSkiResort(SkiResort s) {
		skiResortList.add(s);
	}
}
