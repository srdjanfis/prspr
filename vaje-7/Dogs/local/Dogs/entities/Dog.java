package local.Dogs.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Dog {
	@Id
	private int idDog;
	private String nameDog;
	private String breedDog;
	private int lengthDog;
	private int weightDog;
	@ManyToOne
	@JsonIgnore
	private Owner owner;
	
	public Dog() {
		super();
	}
	
	public String getBreedDog() {
		return breedDog;
	}

	public void setBreedDog(String breedDog) {
		this.breedDog = breedDog;
	}

	public int getLengthDog() {
		return lengthDog;
	}

	public void setLengthDog(int lengthDog) {
		this.lengthDog = lengthDog;
	}

	public int getWeightDog() {
		return weightDog;
	}

	public void setWeightDog(int weightDog) {
		this.weightDog = weightDog;
	}

	public int getIdDog() {
		return idDog;
	}
	public void setIdDog(int idDog) {
		this.idDog = idDog;
	}
	public String getNameDog() {
		return nameDog;
	}
	public void setNameDog(String nameDog) {
		this.nameDog = nameDog;
	}

	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	
}
