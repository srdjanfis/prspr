package local.ski.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Slope {
	
	@Id
	private int slopeId;
	private String slopeName;
	private int slopeLength;
	private String slopeColor;
	
	@ManyToOne
	@JsonIgnore
	private SkiResort skiResort;
	
	public Slope() {
		super();
	}
	
	public SkiResort getSkiResort() {
		return skiResort;
	}

	public void setSkiResort(SkiResort skiResort) {
		this.skiResort = skiResort;
	}

	public int getSlopeId() {
		return slopeId;
	}
	public void setSlopeId(int slopeId) {
		this.slopeId = slopeId;
	}
	public String getSlopeName() {
		return slopeName;
	}
	public void setSlopeName(String slopeName) {
		this.slopeName = slopeName;
	}
	public int getSlopeLength() {
		return slopeLength;
	}
	public void setSlopeLength(int slopeLength) {
		this.slopeLength = slopeLength;
	}
	public String getSlopeColor() {
		return slopeColor;
	}
	public void setSlopeColor(String slopeColor) {
		this.slopeColor = slopeColor;
	}
	
}
