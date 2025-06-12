package si.unm.fis.prspr.referat.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.referat.model.Student;

@Service
public class StudentService {

    ArrayList<Student> studentList = new ArrayList<>();

    public StudentService(){
        studentList.add(new Student(1, "FIS40001", "Aleš", "Vrtačnik", "RST"));
        studentList.add(new Student(2, "FIS40404", "Ana", "Dular", "ISD"));
        studentList.add(new Student(3, "FIS40222", "Katja", "Vrečar", "KV"));
    }

    public ArrayList<Student> getStudents(){
        return studentList;
    }

    public void addStudent(Student s){
        studentList.add(s);
    }

    public String updateStudent(Integer id,
                                Student student){
        for(Student s: studentList){
            if(s.getId().equals(id)){
                s.setIdIskaznice(student.getIdIskaznice());
                s.setIme(student.getIme());
                s.setPriimek(student.getPriimek());
                s.setStudijskiProgram(student.getStudijskiProgram());
                return "Uspesno posodobljen";
            }
        }
        return "Student ni najden";
    }

    public String deleteStudent(Integer id){
        int index = 0;
        for(Student s: studentList){
            if(s.getId().equals(id)){
                studentList.remove(index);
                return "Uspesno izbrisan";
            }
            index++;
        }
        return "Student ni najden";
    }

}
