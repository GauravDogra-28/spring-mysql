package com.example.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="student1")

public class Student {

@Override
	public String toString() {
		return "Student [ID=" + ID + ", contact=" + contact + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob
				+ ", age=" + age + ", college=" + college + ", branch=" + branch + "]";
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long ID;
@Column(name = "contact")
private long contact;//contact number
@Column(name = "fname", nullable = false)
private String fname;//first name
@Column(name = "lname")
private String lname;//last name
@Column(name = "dob")
private String dob;
@Column(name = "age")
private double age;
@Column(name = "college")
private String college;
@Column(name = "branch")
private String branch;
public Student() {
	super();
	
}
public Student(long Id, long contact, String fname, String lname, String dob, double age, String college, String branch) {
	super();
	this.ID = Id;
	this.contact=contact;
	this.fname = fname;
	this.lname = lname;
	this.dob = dob;
	this.age = age;
	this.college = college;
	this.branch = branch;
}
public long getId() {
	return ID;
}
public void setId(long Id) {
	this.ID = Id;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getfName() {
	return fname;
}
public void setfName(String fname) {
	this.fname = fname;
}
public String getlName() {
	return lname;
}
public void setlName(String lname) {
	this.lname = lname;
}
public String getDOB() {
	return dob;
}
public void setDOB(String dob) {
	this.dob = dob;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	this.age = age;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
}