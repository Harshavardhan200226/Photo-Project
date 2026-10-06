package com.bank.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.Service.AccountServiceImpl;
import com.bank.app.entity.Account;
@RestController
public class AccountController{
	@Autowired AccountServiceImpl accountService;
	@PostMapping("/create")
	public Account createAccount(@RequestBody Long accountNumber){
		Account Acc=accountService.getAccountDetailsByAccountNumber(accountNumber);
		return Acc;
	}
	@GetMapping("/fetchAll")
	public List<Account> getAllAccounts(){
		return accountService.getAllAccounts();
	}
	@PostMapping("/deposit")
	public Account depositAmount(@PathVariable Long accountNumber, @PathVariable double amount) {
		Account account=accountService.depositAmount(accountNumber, amount);
		return account;
	}
	@GetMapping("/withdraw")
	public Account withdrawAmount(@PathVariable Long accountNumber, @PathVariable double amount) {
		Account account=accountService.withdrawAmount(accountNumber, amount);
		return account;
	}
	@GetMapping("/fetchBankName")
	public Account getBankNameDetails(@PathVariable String BankName) {
		Account account=accountService.getBankNameDetails(BankName);
		return account;
	}
	@GetMapping("/fetchBankAddress")
	public Account getBankAddressDetails(@PathVariable String BankAddress) {
		Account account=accountService.getBankAddress(BankAddress);
		return account;
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteAccount(@PathVariable Long accountNumber){
		accountService.closeAccount(accountNumber);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Account is closed");
	}
}



