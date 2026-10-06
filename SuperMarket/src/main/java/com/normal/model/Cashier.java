package com.normal.model;

import java.lang.foreign.Linker.Option;

public class Cashier extends Employee{
	public Cashier() {
		
	}

	public Cashier(int id, String firstName, String lastName, String email, int number, String address, double salary ) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.number=number;
		this.address=address;
		this.salary=salary;
		this.options=new Option[] {};
	}
}
