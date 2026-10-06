package com.normal.model;

import java.util.ArrayList;

public class Receipt {
	private int id;
	private Employee cashier;
	private ArrayList<Product> products;
	private double total;
	private String payment;
	private double paid;
	private double change;
	public Receipt() {
		
	}
	public Receipt(int id, Employee cashier, ArrayList<Product> products, double total, String payment, double paid, double change) {
		this.id=id;
		this.cashier=cashier;
		this.products=products;
		this.total=total;
		this.payment=payment;
		this.paid=paid;
		this.change=change;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getCashier() {
		return cashier;
	}
	public void setCashier(Employee cashier) {
		this.cashier = cashier;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public double getPaid() {
		return paid;
	}
	public void setPaid(double paid) {
		this.paid = paid;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	
}
