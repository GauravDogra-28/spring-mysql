package com.example.test.services;

import java.util.*;

import com.example.test.entities.Student;
public interface StudentService {
	
	List<Student> getStudent();
	Student getStudent(long id);
	Student addStudent(Student Std);
	Student updateStudent(Student student, long id);
	void deleteStudent(long id);
}
