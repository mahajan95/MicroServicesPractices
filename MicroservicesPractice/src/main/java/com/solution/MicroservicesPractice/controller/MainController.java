package com.solution.MicroservicesPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solution.MicroservicesPractice.model.Student;
import com.solution.MicroservicesPractice.service.StudentService;

@RestController
public class MainController {

	@Autowired
	StudentService studentService;
	
	
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String greeting() {
		return "Hello SpringBoot";
	}
	
	@RequestMapping(value="/students", method=RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return studentService.saveStudent(student);
		
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public ResponseEntity<Student> fetchStudent(@RequestParam int id){
		Student student=studentService.fetchStudentById(id);
		if(student==null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok().body(student);
		}	
	}
	
	
	
	
	
}
