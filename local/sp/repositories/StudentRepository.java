package local.sp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import local.sp.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
