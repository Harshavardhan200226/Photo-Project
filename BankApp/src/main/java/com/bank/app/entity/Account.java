package com.bank.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Account")
public class Account{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountNumber;
	@Column
	private String accountHolder;
	@Column
	private double amount;
	@Column
	private String BankAddress;
	@Column
	private String BankName;
	public Account(Long accountNumber, String accountHolder, double amount, String BankAddress, String BankName) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.amount=amount;
		this.BankAddress=BankAddress;
		this.BankName=BankName;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getBankAddress() {
		return BankAddress;
	}
	public void setBankAddress(String BankAddress) {
		this.BankAddress = BankAddress;
	}
	public String getBankName() {
		return BankName;
	}
	public void setAccountBankName(String BankName) {
		this.BankName = BankName;
	}
	
}
	

