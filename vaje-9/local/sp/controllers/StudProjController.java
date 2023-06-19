package local.sp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import local.sp.entities.ProjSel;
import local.sp.entities.Project;
import local.sp.entities.Student;
import local.sp.services.StudProjService;

@RestController
public class StudProjController {
	@Autowired
	StudProjService spService;
	
	@PostMapping("/addOrUpdateProject")
	public void addOrUpdateProject(@RequestBody Project p) {
		spService.addOrUpdateProject(p);
	}
	
	@PostMapping("/addOrUpdateStudent")
	public void addOrUpdateStudent(@RequestBody Student s) {
		spService.addOrUpdateStudent(s);
	}
	
	@GetMapping("/getAllProjects")
	public List<Project> getAllProjects(){
		return spService.getAllProjects();
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		return spService.getAllStudents();
	}
	
	@DeleteMapping("/deleteProject/{idProject}")
	public void deleteProject(@PathVariable int idProject) {
		spService.deleteProject(idProject);
	}
	
	@DeleteMapping("/deleteStudent/{idStudent}")
	public void deleteStudent(@PathVariable int idStudent) {
		spService.deleteStudent(idStudent);
	}
	
	@GetMapping("/getStudentsByProjectId/{idProject}")
	public List<Student> getStudentsByProjectId(@PathVariable int idProject){
		return spService.getStudentsByProjectId(idProject);
	}
	
	@GetMapping("/getProjectByStudentId/{idStudent}")
	public Project getProjectByStudentId(@PathVariable int idStudent){
		return spService.getProjectByStudentId(idStudent);
	}
	
	@GetMapping("/getProjectsForSelect")
	public List<ProjSel> getProjectsForSelect(){
		return spService.getProjectsForSelect();
	}
	
//	@PutMapping("/updateStudentProject/{idStudent}/{idProject}")
//	public void updateStudentProject(@PathVariable int idStudent,
//									 @PathVariable int idProject) {
//		spService.updateStudentProject(idStudent, idProject);
//	}
}
