package cts.student.selflearningtask.controller;

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


import cts.student.selflearningtask.entity.Student;
import cts.student.selflearningtask.service.StudentService;
import lombok.extern.slf4j.Slf4j;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    
    @GetMapping("/students/{id}")
    public Student findStudentbyId(@PathVariable("id") Long studentId) {
        return studentService.findStudentbyId(studentId);
    }
    
    @GetMapping("/students")
    public List<Student> fetchStudentList(){
    	return studentService.fetchStudentList();
    }

    
    @DeleteMapping("/students/{id}")
    public String deleteStudentbyId(@PathVariable("id") Long studentId) {
    	studentService.deleteStudentbyId(studentId);
    	return "Deleted Successfully";
    }
    
    @PutMapping()
    public Student updateStudent(@PathVariable("id") Long StudentId, @RequestBody Student student) {
    	return studentService.updateStudent(StudentId, student);
    	
    }
    
}
