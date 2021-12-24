package com.example.test.StudentRepo;
import  org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.entities.Student;
public interface studentRepo extends JpaRepository<Student,Long> {

}
