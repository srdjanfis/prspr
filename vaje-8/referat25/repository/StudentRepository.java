package si.unm.fis.prspr.referat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.referat.model.Student;
import si.unm.fis.prspr.referat.model.StudyProgram;


public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByStudyProgram(StudyProgram studyProgram);
}
