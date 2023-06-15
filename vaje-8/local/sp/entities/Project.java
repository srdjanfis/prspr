package local.sp.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Project {
	@Id
	private int idProject;
	private String nameProject;
	private String descProject;
	@OneToMany(mappedBy="project")
	private List<Student> students;
	
	public Project() {
		super();
	}
	
	public int getIdProject() {
		return idProject;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public String getNameProject() {
		return nameProject;
	}
	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}
	public String getDescProject() {
		return descProject;
	}
	public void setDescProject(String descProject) {
		this.descProject = descProject;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
