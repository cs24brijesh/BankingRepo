package com.bank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Account;
import com.bank.entity.Signup;
import com.bank.entity.Transaction;
import com.bank.model.Login;
import com.bank.model.TransactionModel;
import com.bank.repository.IAccount;
import com.bank.repository.ILogin;
import com.bank.repository.ISignup;
import com.bank.repository.ITransaction;

@Repository
public class AccountLoginDao {

	@Autowired
	private ILogin iLog;
	
	@Autowired
	private ISignup iSign;
	
	@Autowired
	private IAccount iAcc;
	
	@Autowired
	private ITransaction iTrans;

	public String login(Login log) {
		String s = iLog.findByUsernameAndPassword(log.getUsername(), log.getPassword());
		return s;
	}
	
	public Signup signup(Signup log) {
		 
		return iSign.save(log);
	}
	
	public Account createAccount(Account acc) {
		 
		return iAcc.save(acc);
	}

	public Transaction createTransaction(TransactionModel tm) {
		
//		Transaction ts = new Transaction();
//		ts
//		return iTrans.save(acc);
		return  new Transaction();
	}

}
