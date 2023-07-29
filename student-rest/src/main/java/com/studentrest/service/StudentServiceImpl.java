package com.studentrest.service;


import com.studentrest.repo.*;
import com.studentrest.model.*;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

import com.studentrest.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	

    private StudentRepository studentRepository;
    
    @Autowired
    public void StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


}