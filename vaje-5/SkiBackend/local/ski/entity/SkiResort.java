package local.ski.entity;

public class SkiResort {
	private int idSkiResort;
	private String nameSkiResort;
	private int noOfSlopes;
	private int countryId;
	
	public SkiResort(int idSkiResort, String nameSkiResort, int noOfSlopes, int countryId) {
		super();
		this.idSkiResort = idSkiResort;
		this.nameSkiResort = nameSkiResort;
		this.noOfSlopes = noOfSlopes;
		this.countryId = countryId;
	}
	
	public int getIdSkiResort() {
		return idSkiResort;
	}
	public void setIdSkiResort(int idSkiResort) {
		this.idSkiResort = idSkiResort;
	}
	public String getNameSkiResort() {
		return nameSkiResort;
	}
	public void setNameSkiResort(String nameSkiResort) {
		this.nameSkiResort = nameSkiResort;
	}
	public int getNoOfSlopes() {
		return noOfSlopes;
	}
	public void setNoOfSlopes(int noOfSlopes) {
		this.noOfSlopes = noOfSlopes;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
}
