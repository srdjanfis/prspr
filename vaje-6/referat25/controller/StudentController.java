package si.unm.fis.prspr.referat.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.referat.model.Student;
import si.unm.fis.prspr.referat.service.StudentService;





@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getStudents")
    public ArrayList<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
    
    @PutMapping("updateStudent/{id}")
    public String updateStudent(@PathVariable Integer id, 
                                @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        return studentService.deleteStudent(id);
    }
    
}
