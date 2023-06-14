package local.ski.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import local.ski.entity.Country;
import local.ski.entity.SkiResort;
import local.ski.service.SkiService;

@RestController
@RequestMapping("ski")
public class SkiController {
	
	@Autowired
	SkiService skiService;
	
	@GetMapping("/countries")
	public List<Country> getAllCountries(){
		return skiService.getAllCountries();
	}
	
	@GetMapping("/getCountries/{startWith}")
	public List<Country> getCountriesThatStartWith(@PathVariable String startWith){
		return skiService.getCountriesThatStartWith(startWith);
	}
	
	@GetMapping("/getSpecialCountries/{startWith}/{contains}")
	public List<Country> getCountriesThatStartWith(@PathVariable String startWith,
												   @PathVariable String contains){
		return skiService.getSpecialCountries(startWith, contains);
	}
	
	@PostMapping("/addCountry")
	public void addCountry(@RequestBody Country c) {
		skiService.addCountry(c);
	}
	
	@GetMapping("/skiResorts")
	public List<SkiResort> getAllSkiResorts(){
		return skiService.getAllSkiResorts();
	}
	
	@GetMapping("/skiResorts/{idCountry}")
	public List<SkiResort> getSkiResortsByCountry(@PathVariable int idCountry){
		return skiService.getSkiResortsByCountry(idCountry);
	}
	
	@GetMapping("/country/{idSkiResort}")
	public Country getCountryBySkiResort(@PathVariable int idSkiResort){
		return skiService.getCountryBySkiResort(idSkiResort);
	}
	
	@PostMapping("/addSkiResort")
	public void addSkiResort(@RequestBody SkiResort s) {
		skiService.addSkiResort(s);
	}
	
	@DeleteMapping("/removeCountry/{id}")
	public void removeCountry(@PathVariable int id) {
		skiService.removeCountry(id);
	}
	
	@DeleteMapping("/removeSkiResort/{id}")
	public void removeSkiResort(@PathVariable int idSkiResort) {
		skiService.removeSkiResort(idSkiResort);
	}
	
	@PutMapping("/updateCountry")
	public void updateCountry(@RequestBody Country c) {
		skiService.updateCountry(c);
	}
	
	@PutMapping("/updateSkiResort")
	public void updateSkiResort(@RequestBody SkiResort s) {
		skiService.updateSkiResort(s);
	}

}
