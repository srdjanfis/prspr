package local.sa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import local.sa.entity.Student;
import local.sa.entity.User;
import local.sa.service.StudentService;

@RestController
@RequestMapping("stud")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/authenticate")
	public String authUser(@RequestBody User u) {
		return studentService.authUser(u.getUsername(),
									   u.getPassword());
	}
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student s) {
		studentService.addStudent(s);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{idStudent}")
	public Student getAllStudents(@PathVariable int idStudent){
		return studentService.getAllStudents(idStudent);
	}
	
	@PutMapping("/updateStudent")
	public boolean updateStudent(@RequestBody Student s) {
		return studentService.updateStudent(s);
	}
	
	@DeleteMapping("/removeStudent/{id}")
	public boolean removeStudent(@PathVariable int id) {
		return studentService.removeStudent(id);
	}
}
