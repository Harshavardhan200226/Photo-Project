package com.normal.model;

import java.util.ArrayList;

public class Section {
	private int id;
	private ArrayList<Product> products;
	private String description;
	private String name;
	public Section() {
		
	}
	public Section(int id, ArrayList<Product> products, String description, String name) {
		this.id=id;
		this.products=products;
		this.description=description;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
}
