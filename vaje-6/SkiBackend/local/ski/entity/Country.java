package local.ski.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
	@Id
	private int idCountry;
	private String nameCountry;
	private String descCountry;	
	
	public Country() {
		super();
	}

	public Country(int idCountry, String nameCountry, String descCountry) {
		super();
		this.idCountry = idCountry;
		this.nameCountry = nameCountry;
		this.descCountry = descCountry;
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
