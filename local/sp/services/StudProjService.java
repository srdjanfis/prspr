package local.sp.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import local.sp.entities.Project;
import local.sp.entities.Student;
import local.sp.repositories.ProjectRepository;
import local.sp.repositories.StudentRepository;

@Service
public class StudProjService {
	@Autowired
	ProjectRepository pRepo;
	@Autowired
	StudentRepository sRepo;
	
	public void addOrUpdateProject(Project p) {
		pRepo.save(p);
	}
	
	public void addOrUpdateStudent(Student s) {
		sRepo.save(s);
	}
	
	public List<Project> getAllProjects(){
		return pRepo.findAll();
	}
	
	public List<Student> getAllStudents(){
		return sRepo.findAll();
	}
	
	public void deleteProject(int idProject) {
		pRepo.deleteById(idProject);
	}
	
	public void deleteStudent(int idStudent) {
		sRepo.deleteById(idStudent);
	}
	
	public List<Student> getStudentsByProjectId(int idProject){
		Optional<Project> optProj = pRepo.findById(idProject);
		if(optProj.isPresent()) {
			return optProj.get().getStudents();
		} else {
			return new ArrayList<Student>();
		}
	}
	
	public Project getProjectByStudentId(int idStudent) {
		Optional<Student> optStud = sRepo.findById(idStudent);
		if(optStud.isPresent()) {
			return optStud.get().getProject();
		} else {
			return null;
		}
	}
}
