package com.solution.MicroservicesPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solution.MicroservicesPractice.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer>{

}
