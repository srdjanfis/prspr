package si.unm.fis.prspr.haircut.controller;

import java.util.List;

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

import si.unm.fis.prspr.haircut.model.Timeslot;
import si.unm.fis.prspr.haircut.service.TimeslotService;



@RestController
@RequestMapping("/timeslot")
public class TimeslotController {

	@Autowired
    private TimeslotService timeslotService;
	
	@GetMapping("/getTimeslots")
	public List<Timeslot> getTimeslots(){
		return timeslotService.getTimeslots();
	}
	
	@GetMapping("/getTimeslotsForDate")
	public List<Timeslot> getTimeslotsForDate(@RequestParam int year,
									          @RequestParam int month,
									          @RequestParam int day){
		return timeslotService.getTimeslotsForDate(year, month, day);
	}
	@GetMapping("/reserve")
	public String addReservation(@RequestParam int year,
							     @RequestParam int month,
								 @RequestParam int day,
								 @RequestParam int hour,
								 @RequestParam String username) {
		return timeslotService.addReservation(year, month, day, hour, username);
	}

	@PostMapping("/addTimeslot")
	public void addTimeslot(@RequestBody Timeslot timeslot) {
		timeslotService.addTimeslot(timeslot);
	}
	
	@PutMapping("updateTimeslot/{id}")
	public String updateTimeslot(@PathVariable int id, 
	                             @RequestBody Timeslot timeslot) {
		return timeslotService.updateTimeslot(id, timeslot);
	}

	@DeleteMapping("/deleteTimeslot/{id}")
	public String deleteTimeslot(@PathVariable int id) {
		return timeslotService.deleteTimeslot(id);
	}	
	
}
