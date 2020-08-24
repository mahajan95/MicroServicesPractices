package com.solution.MicroservicesPractice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solution.MicroservicesPractice.model.Student;
import com.solution.MicroservicesPractice.repository.StudentRepository;

@Service
public class StudentImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	

	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student fetchStudentById(int id) {
		Optional<Student> student= studentRepository.findById(id);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
	}
	
	
	
	
	
	
}
