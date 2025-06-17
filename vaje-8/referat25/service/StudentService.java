package si.unm.fis.prspr.referat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.referat.model.Student;
import si.unm.fis.prspr.referat.model.StudyProgram;
import si.unm.fis.prspr.referat.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student s){
        studentRepository.save(s);
    }

    public void updateStudent(Student s){
        studentRepository.save(s);
    }

    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }

    public List<Student> getStudentsByStudyProgram(StudyProgram studyProgram){
        return studentRepository.findAllByStudyProgram(studyProgram);
    }

}
