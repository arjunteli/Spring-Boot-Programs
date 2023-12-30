package com.kn.fullstack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int roll;
	private String name;
	private int marks;

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public int getRollNumber() {
		return roll;
	}

	public void setRollNumber(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

}
