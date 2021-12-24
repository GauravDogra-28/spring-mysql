package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entities.Student;
import com.example.test.services.StudentService;

@RestController
@RequestMapping("/student")
public class Mycontroller {
	@Autowired

	private StudentService studentService;

	public Mycontroller(StudentService studentSevice) {
		super();
		this.studentService = studentSevice;
	}
  //Build get all student REST API
	@GetMapping
  public List<Student> getStudent(){
	  return studentService.getStudent();
  }
  
  //build get student by ID REST API
 
  @GetMapping("{id}")
  public ResponseEntity<Student> getStudent(@PathVariable("id") long studentId){
	  return new ResponseEntity<Student>(studentService.getStudent(studentId), HttpStatus.OK); 
  }

  //Build create REST API
	@PostMapping
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.OK);
	}
	
  //build update student REST API
  @PutMapping("{id}")
  public ResponseEntity<Student> updateStudent(@PathVariable("id") long id , @RequestBody Student student){
	  return new ResponseEntity<Student>(studentService.updateStudent(student, id), HttpStatus.OK);
  }
  
  //build delete student REST API
  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
	studentService.deleteStudent(id);
		return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
  }
}