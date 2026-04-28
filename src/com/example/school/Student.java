package com.example.school;

public class Student {
	String name;
	int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void introduction() {
		System.out.println("名前は" + name + "で、学年は" + grade + "年生です");
	}

}
