package local.ski.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import local.ski.entity.Country;

@RestController
public class SkiController {
	ArrayList<Country> countryList = new ArrayList<Country>();

	public SkiController() {
		super();
		countryList.add(new Country(1,"Slovenija","fdsfasdfsa"));
		countryList.add(new Country(2,"Avstrija","dflkgjlsfjgk"));
		countryList.add(new Country(3,"Italija","gsdfgsdffdsfasdfsa"));
	}
	
	@RequestMapping("/countries")
	public List<Country> getAllCountries(){
		return countryList;
	}
	@RequestMapping("/getCountries/{startWith}")
	public List<Country> getCountries(@PathVariable String startWith){
		ArrayList<Country> result = new ArrayList<Country>();
		for(Country c: countryList) {
			if(c.getNameCountry().startsWith(startWith)) {
				result.add(c);
			}
		}
		return result;
//		return countryList.stream()
//				   .filter(t->t.getNameCountry().startsWith(startWith))
//				   .toList();
	}
	@RequestMapping("/addCountry/{id}/{name}/{desc}")
	public void addCountry(@PathVariable int id,
						   @PathVariable String name,
						   @PathVariable String desc) {
		countryList.add(new Country(id,name,desc));
	}

}
