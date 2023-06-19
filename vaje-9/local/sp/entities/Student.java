package local.sp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private int idStudent;
	private String firstNameStudent;
	private String lastNameStudent;
	@ManyToOne
	
	private Project project;
	
	public Student() {
		super();
	}
	
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getFirstNameStudent() {
		return firstNameStudent;
	}
	public void setFirstNameStudent(String firstNameStudent) {
		this.firstNameStudent = firstNameStudent;
	}
	public String getLastNameStudent() {
		return lastNameStudent;
	}
	public void setLastNameStudent(String lastNameStudent) {
		this.lastNameStudent = lastNameStudent;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
