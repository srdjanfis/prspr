package si.unm.fis.prspr.haircut.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.haircut.model.Timeslot;

@Service
public class TimeslotService {

    ArrayList<Timeslot> timeslotList = new ArrayList<>();
    
    public TimeslotService() {
        timeslotList.add(new Timeslot(2023, 6, 6, 12, ""));
        timeslotList.add(new Timeslot(2023, 6, 6, 13, ""));
        timeslotList.add(new Timeslot(2023, 6, 6, 14, ""));
        timeslotList.add(new Timeslot(2023, 6, 7, 12, ""));
        timeslotList.add(new Timeslot(2023, 6, 7, 13, ""));
    }

    public List<Timeslot> getTimeslots(){
		return timeslotList;
	}
	
	public List<Timeslot> getTimeslotsForDate(int year,
									          int month,
									          int day){
		ArrayList<Timeslot> result = new ArrayList<>();
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

    public String addReservation(int year,
							     int month,
								 int day,
								 int hour,
								 String username) {
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

}
