package local.ski.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Country {
	@Id
	private int idCountry;
	private String nameCountry;
	private String descCountry;	
	
	@OneToMany(mappedBy="country")
	private List<SkiResort> skiResorts;
	
	public Country() {
		super();
	}
	
	public List<SkiResort> getSkiResorts() {
		return skiResorts;
	}

	public void setSkiResorts(List<SkiResort> skiResorts) {
		this.skiResorts = skiResorts;
	}

	public int getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}
	public String getNameCountry() {
		return nameCountry;
	}
	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}
	public String getDescCountry() {
		return descCountry;
	}
	public void setDescCountry(String descCountry) {
		this.descCountry = descCountry;
	}
}
