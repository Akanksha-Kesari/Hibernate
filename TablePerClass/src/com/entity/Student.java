package com.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Student_Data")
public class Student extends Person {
   String course;
   int fee;
public Student(String name, String course, int fee) {
	super(name);
	this.course = course;
	this.fee = fee;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return "Student [course=" + course + ", fee=" + fee + "]";
}
   
   
}
