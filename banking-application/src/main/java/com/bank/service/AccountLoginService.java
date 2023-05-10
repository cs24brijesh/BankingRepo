package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.dao.AccountLoginDao;
import com.bank.entity.Account;
import com.bank.entity.Signup;
import com.bank.entity.Transaction;
import com.bank.model.Login;
import com.bank.model.TransactionModel;

@Component
public class AccountLoginService {

	@Autowired
	private AccountLoginDao loginDao;

	public String login(Login log) {

		return loginDao.login(log);

	}

	public Signup signup(Signup sign) {

		return loginDao.signup(sign);

	}

	public Account createAccount(Account acc) {
		return loginDao.createAccount(acc);
	}

	public Transaction createTransaction(TransactionModel tm) {
		
		return loginDao.createTransaction(tm);
	}

}
