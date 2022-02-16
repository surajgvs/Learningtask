package cts.student.selflearningtask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cts.student.selflearningtask.entity.Student;
import cts.student.selflearningtask.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;



@Service

public class StudentService  {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentbyId(Long studentId) {
                return studentRepository.findByStudentId(studentId);
    }

	public List<Student> fetchStudentList() {
		return studentRepository.findAll();
	}

	public void deleteStudentbyId(Long studentId) {
		studentRepository.deleteById(studentId);
	}

	public Student updateStudent(Long studentId, Student student) {
		 Student sDB = studentRepository.findById(studentId).get();
		  sDB.setCourseName(student.getCourseName());
		  sDB.setStudentName(student.getStudentName());
		return studentRepository.save(sDB);
	}

		
}
