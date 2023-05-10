package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Account;
import com.bank.entity.Signup;
import com.bank.entity.Transaction;
import com.bank.model.Login;
import com.bank.model.TransactionModel;
import com.bank.service.AccountLoginService;

@RestController
public class BankController {
	
	@Autowired
	private AccountLoginService accLogin;
	
	@GetMapping("/login")
	String login(@RequestBody Login log){
		return accLogin.login(log);
	}
	
	@PostMapping("/signup")
	Signup signup(@RequestBody Signup sig){
		return accLogin.signup(sig);
	}
	
	@PostMapping("/create/account")
	Account createAccount(Account acc){
		return accLogin.createAccount(acc);
	}
	
	@PostMapping()
	Transaction createTransaction(TransactionModel tm) {
		
		return accLogin.createTransaction(tm);
	}
	

}
