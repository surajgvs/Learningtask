package cts.student.selflearningtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cts.student.selflearningtask.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByStudentId(long studentId);
	

}
