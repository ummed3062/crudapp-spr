package com.mru.crudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mru.crudapp.entity.Student;
import com.mru.crudapp.repository.StudentRepo;

@Service
public class StudentService {


    @Autowired
    StudentRepo studentRepo;
    
    public String createStudent(Student student){

        studentRepo.save(student);

        return "Create student service....";
    }
}
