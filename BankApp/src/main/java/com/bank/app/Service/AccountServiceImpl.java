package com.bank.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.app.Repository.AccountRepository;
import com.bank.app.entity.Account;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired AccountRepository accountRepository;
	@Override
	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}
	@Override
	public Account getAccountDetailsByAccountNumber(Long accountNumber) {
		Optional<Account> account=accountRepository.findById(accountNumber);
		if(account.isEmpty()) {
			throw new RuntimeException("Account number is empty");
		}
		Account accountsaved=account.get();
		return accountsaved;
	}
	@Override
	public List<Account> getAllAccounts(){
		return accountRepository.findAll();
	}
	@Override
	public Account depositAmount(Long accountNumber, double amount) {
		Optional <Account>account=accountRepository.findById(accountNumber);
		if(account.isEmpty()) {
			throw new RuntimeException("Account is empty");
		}
		Account savedAccount=account.get();
		double totalBalance=savedAccount.getAmount();
		savedAccount.setAmount(amount);
		accountRepository.save(savedAccount);
		return savedAccount;
	}
	@Override
	public Account withdrawAmount(Long accountNumber, double amount) {
		Optional<Account> account=accountRepository.findById(accountNumber);
		if(account.isEmpty()) {
			throw new RuntimeException("Account is empty");
		}
		Account savedAccount=account.get();
		double totalBalance=savedAccount.getAmount();
		savedAccount.setAmount(amount);
		accountRepository.save(savedAccount);
		return savedAccount;
	}
	@Override
	public Account getBankNameDetails(String BankName) {
		return accountRepository.findByBankName(BankName);
	}
	@Override
	public Account getBankAddress(String BankAddress) {
		return accountRepository.findByBankAddress(BankAddress);
	}
	@Override
	public void closeAccount(Long accountNumber) {
		getAccountDetailsByAccountNumber(accountNumber);
		accountRepository.deleteById(accountNumber);
	}
}


