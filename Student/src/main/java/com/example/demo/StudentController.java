package com.example.demo;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@GetMapping
	public Student getStudent() {
		return new Student("Harsha","Vardhan");
	}
}
