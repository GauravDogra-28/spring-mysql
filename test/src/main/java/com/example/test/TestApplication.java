package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.test.StudentRepo.studentRepo;
import com.example.test.entities.Student;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Autowired
	private studentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setfName("qwertyui");
		student.setlName("sdfghj");
		student.setAge(123);
		student.setBranch("sdfg");
		student.setCollege("asdfg");
		student.setDOB("sdfghj");
		student.setContact(9876);
	}

}
