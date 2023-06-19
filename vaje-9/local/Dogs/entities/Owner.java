package local.Dogs.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	
	@Id
	private int idOwner;
	private String firstNameOwner;
	private String lastNameOwner;
	private String cityOwner;
	
	@OneToMany(mappedBy="owner")
	private List<Dog> dogs;

	public Owner() {
		super();
	}
	
	public int getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}

	public String getFirstNameOwner() {
		return firstNameOwner;
	}

	public void setFirstNameOwner(String firstNameOwner) {
		this.firstNameOwner = firstNameOwner;
	}

	public String getLastNameOwner() {
		return lastNameOwner;
	}

	public void setLastNameOwner(String lastNameOwner) {
		this.lastNameOwner = lastNameOwner;
	}

	public String getCityOwner() {
		return cityOwner;
	}

	public void setCityOwner(String cityOwner) {
		this.cityOwner = cityOwner;
	}

	public List<Dog> getDogs() {
		return dogs;
	}

	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;
	}
	
	
}
