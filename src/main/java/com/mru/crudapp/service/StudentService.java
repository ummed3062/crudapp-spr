package com.mru.crudapp.service;

import java.util.List;
import java.util.Optional;

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


    public List<Student> getStudents(){

        List<Student> studentList = studentRepo.findAll();
        return studentList;
    }

    public Optional<Student> getStudent(int id){

        Optional<Student> student = studentRepo.findById(id);
        return student;
    }


    public String deleteStudent(int id){

        studentRepo.deleteById(id);
        return "Student deleted Successfully....";
    }


    public Student updateStudent(Student student){


        Student existingStudent = studentRepo.getById(student.getId());
        
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        studentRepo.save(existingStudent);
        return existingStudent;
    }
}
