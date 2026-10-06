package com.example.demo;

public class Student {
	String firstName;
	String lastName;
	Student(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
}
