package com.studentrest.controller;
import com.studentrest.model.Student;



import com.studentrest.repo.StudentRepository;
import com.studentrest.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {

	   @Autowired
	    private StudentRepository studentRepository;
	    
	    @PostMapping("/people")
	    public Student addPerson(@RequestBody Student student) {
	        return studentRepository.save(student);
	    }
	    
	    @GetMapping("/people")
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }
}