package si.unm.fis.prspr.haircut.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Timeslot {
    private int year;
	private int month;
	private int day;
	private int hour;
	private String username;
}
