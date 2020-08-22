package com.solution.MicroservicesPractice.service;

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

}
