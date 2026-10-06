package com.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Service.StudentService;
import com.student.entity.Student;
@CrossOrigin(origins = "*")
@RestController
public class StudentController {
	@Autowired
   private StudentService studentService;
   public StudentController(StudentService studentService) {
	   this.studentService=studentService;
   }
   @GetMapping("/students")
   public List<Student> listStudents() {
       return studentService.getAllStudents(); 
   }
   @PostMapping("/add")
   public Student createStudent(@RequestBody Student student) {
	   return studentService.createStudent(student);
   }
   @PutMapping("/students/{id}")
   public Student updateStudent(@PathVariable Long id,@RequestBody Student student) {
	   return studentService.updateStudent(id,student);
   }
   @DeleteMapping("/delete/{id}")
   public String deleteStudent(@PathVariable Long id) {
	   return studentService.deleteStudent(id);
   }
}
