package local.hc.entity;

public class Timeslot {
	private int year;
	private int month;
	private int day;
	private int hour;
	private String username;
	
	public Timeslot(int year, int month, int day, int hour, String username) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.username = username;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
