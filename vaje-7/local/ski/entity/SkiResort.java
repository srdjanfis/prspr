package local.ski.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class SkiResort {
	@Id
	private int idSkiResort;
	private String nameSkiResort;
	private int noOfSlopes;
	@ManyToOne
	@JsonIgnore
	private Country country;
	
	public SkiResort() {
		super();
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
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

	
}
