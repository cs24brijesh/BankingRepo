package com.bank.controller;

import java.util.Scanner;

import com.bank.repository.LoginDao;

public class Login {
	private Scanner sc;
	private String username = null;
	private String password = null;
	

	public void Login(Scanner sc) {
		this.sc = sc;
	}
	
	public void insertData() {
		System.out.println("Enter username: ");
		username = sc.nextLine();
		System.out.println("Enter password: ");
		password = sc.nextLine();
		
		LoginDao.validate(username, password);
	}

}
