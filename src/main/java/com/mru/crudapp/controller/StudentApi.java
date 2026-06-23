package com.mru.crudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mru.crudapp.entity.Student;
import com.mru.crudapp.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentApi {


    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    String createStudent(@RequestBody Student student){

        studentService.createStudent(student);

        return "Create student api....";
    }
    
}
