package com.studentrest.service;

import java.util.List;

import com.studentrest.model.Student;


public interface StudentService {

	 Student addStudent(Student student);
	    List<Student> getAllStudents();
}