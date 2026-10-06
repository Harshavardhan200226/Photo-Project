package com.normal.model;

import java.lang.foreign.Linker.Option;

public abstract class Employee {
protected int id;
protected String firstName;
protected String lastName;
protected String email;
protected int number;
protected String address;
protected double salary;
protected Option[] options;
public Employee() {
	
}
public Employee(int id, String firstName, String lastName, String email, int number, String address, double salary ) {
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.email=email;
	this.number=number;
	this.address=address;
	this.salary=salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
