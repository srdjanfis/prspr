package si.unm.fis.prspr.referat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.referat.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
