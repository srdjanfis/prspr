package local.hc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import local.hc.entity.User;
import local.hc.entity.Timeslot;

@RestController
public class HaircutController {
	ArrayList<User> userList = new ArrayList<User>();
	ArrayList<Timeslot> timeslotList = new ArrayList<Timeslot>();
	
	public HaircutController() {
		userList.add(new User("janez","janez1"));
		userList.add(new User("maja","maja1"));
		userList.add(new User("klara","klara2"));
		timeslotList.add(new Timeslot(2023, 6, 6, 12, ""));
		timeslotList.add(new Timeslot(2023, 6, 6, 13, ""));
		timeslotList.add(new Timeslot(2023, 6, 6, 14, ""));
		timeslotList.add(new Timeslot(2023, 6, 7, 12, ""));
		timeslotList.add(new Timeslot(2023, 6, 7, 13, ""));
	}
	
	@RequestMapping("/timeslots")
	public List<Timeslot> getTimeslots(){
		return timeslotList;
	}
	
	@RequestMapping("/timeslots/{year}/{month}/{day}")
	public List<Timeslot> getTimeslots(@PathVariable int year,
									   @PathVariable int month,
									   @PathVariable int day){
		ArrayList<Timeslot> result = new ArrayList<Timeslot>();
		for(Timeslot t: timeslotList) {
			if((t.getYear()==year) &&
			   (t.getMonth()==month) &&
			   (t.getDay()==day) &&
			   (t.getUsername().equals(""))){
				result.add(t);
			}
		}
		return result;
	}
	@RequestMapping("/reserve/{year}/{month}/{day}/{hour}/{username}")
	public String addReservation(@PathVariable int year,
							     @PathVariable int month,
								 @PathVariable int day,
								 @PathVariable int hour,
								 @PathVariable String username) {
		String result = "Takega termina ni";
		for(Timeslot t: timeslotList) {
			if((t.getYear()==year) &&
			   (t.getMonth()==month) &&
			   (t.getDay()==day) &&
			   (t.getHour()==hour)){
				if(t.getUsername().equals("")) {
					t.setUsername(username);
					result = "Uspešno ste se naročili";
				}else {
					result = "Termin je že zaseden";
				}
			}
		}
		return result;
	}
	
	@RequestMapping("/authenticate/{username}/{password}")
	public String authUser(@PathVariable String username,
						   @PathVariable String password) {
		for(User u: userList) {
			if(u.getUsername().equals(username) &&
			   u.getPassword().equals(password)){
				return "Uporabnik je uspešno prijavljen.";
			}
		}
		return "Takega uporabnika ni.";
	}
}
