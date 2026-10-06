package com.student.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Repository.StudentRepository;
import com.student.entity.Student;
@Service
public class StudentService {
     @Autowired
     private StudentRepository studentRepository;
     public List<Student> getAllStudents(){
    	 return studentRepository.findAll();
     } 
     public Student createStudent(Student student) {
  	   return studentRepository.save(student);
     }
	 public Student updateStudent(Long id,Student student) {
		 Student s=studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
		 s.setFirstName(student.getFirstName());
		 s.setLastName(student.getLastName());
		 s.setEmail(student.getEmail());
		 return studentRepository.save(s);
	 }
	 public String deleteStudent(Long id) {
		 Student s=studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
		 studentRepository.delete(s);
		 return "Student is deleted successfully";
	 }
}
