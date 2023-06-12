package local.sa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import local.sa.entity.Student;
import local.sa.entity.User;

@Service
public class StudentService {
	ArrayList<User> userList = new ArrayList<User>();
	ArrayList<Student> studentList = new ArrayList<Student>();

	public StudentService() {
		userList.add(new User("janez","janez1"));
		userList.add(new User("maja","maja1"));
		userList.add(new User("klara","klara2"));
		studentList.add(new Student("Janez","Novak",443));
		studentList.add(new Student("Maja","Bernik",221));
		studentList.add(new Student("Petra","Kocjan",333));
		studentList.add(new Student("Dušan","Sagadin",122));
	}

	public String authUser(String username,
						   String password) {
		for(User u: userList) {
			if(u.getUsername().equals(username) &&
					u.getPassword().equals(password)){
				return "Uporabnik je uspešno prijavljen.";
			}
		}
		return "Takega uporabnika ni.";
	}
	
	public List<Student> getAllStudents(){
		return studentList;
	}
	
	public Student getAllStudents(int idStudent){
		for(Student s: studentList) {
			if(s.getStudentId() == idStudent) {
				return s;
			}
		}
		return null;
	}
	
	public boolean addStudent(Student s) {
		try {
			studentList.add(s);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean updateStudent(Student s) {
		for(Student tempStudent: studentList) {
			if(tempStudent.getStudentId() == s.getStudentId()) {
				tempStudent.setStudentFirstName(s.getStudentFirstName());
				tempStudent.setStudentLastName(s.getStudentLastName());
				return true;
			}
		}
		return false;
	}
	
	public boolean removeStudent(int id) {
		for(int i=0; i<studentList.size();i++) {
			if(studentList.get(i).getStudentId() == id) {
				studentList.remove(i);
				return true;
			}
		}
		return false;
	}
}
