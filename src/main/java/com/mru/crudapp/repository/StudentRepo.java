package com.mru.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mru.crudapp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    
} 
