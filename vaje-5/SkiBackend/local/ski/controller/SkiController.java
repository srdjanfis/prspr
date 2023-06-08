package local.ski.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public List<Country> getCountries(@PathVariable String startWith){
		return skiService.getCountries(startWith);
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
	public List<SkiResort> getAllSkiResorts(@PathVariable int idCountry){
		return skiService.getAllSkiResorts(idCountry);
	}
	
	@PostMapping("/addSkiResort")
	public void addSkiResort(@RequestBody SkiResort s) {
		skiService.addSkiResort(s);
	}

}
