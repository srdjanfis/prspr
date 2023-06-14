package local.ski.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class SkiResort {
	
	@Id
	private int idSkiResort;
	private String nameSkiResort;
	private int noOfSlopes;
	
	@ManyToOne
	@JsonIgnore
	private Country country;
	
	@OneToMany(mappedBy="skiResort")
	List<Slope> slopes;
	
	public SkiResort() {
		super();
	}
	
	public List<Slope> getSlopes() {
		return slopes;
	}

	public void setSlopes(List<Slope> slopes) {
		this.slopes = slopes;
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
