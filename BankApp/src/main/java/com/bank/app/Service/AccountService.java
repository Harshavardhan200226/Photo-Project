package com.bank.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.app.entity.Account;
@Service
public interface AccountService{
	public Account createAccount(Account account);
	public Account getAccountDetailsByAccountNumber(Long accountNumber);
	public List<Account> getAllAccounts();
	public Account depositAmount(Long accountNumber, double amount);
	public Account withdrawAmount(Long accountNumber, double amount);
	public Account getBankNameDetails(String BankName);
	public Account getBankAddress(String BankAddress);
	public void closeAccount(Long accountNumber);
}

