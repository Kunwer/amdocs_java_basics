package com.training.adi;

public class Student {
	private String stuName;
	private int grade;
	private int age;
	private int stuId;
	public Student(String stuName, int grade, int age, int stuId) {
		this.stuName = stuName;
		this.grade = grade;
		this.age = age;
		this.stuId = stuId;
	}
	public String getName() {
		return stuName;
	}
	public void setName(String stuName) {
		this.stuName = stuName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	@Override
	public String toString() {
		return "Student [Name=" + this.stuName + ", grade=" + this.grade + ", age=" + this.age + ", stuId=" + this.stuId + "]";
	}
	
}
	
