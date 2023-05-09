package com.bank.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.repository.AccountDao;

public class Start {
	public static void main(String[] args) throws IOException {

		while(true) {
			System.out.println("Press 1 to add Account");
			System.out.println("Press 2 to delete Account");
			System.out.println("Press 3 to add Account");
			System.out.println("Press 4 to exit from App");
			
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			switch(c) {
			
			case 1: 
				//Add Account
				System.out.println("Enter first Name");
				String firstName = br.readLine();
				System.out.println("Enter last Name");
				String lastName = br.readLine();
				System.out.println("Enter userName Name");
				String userName = br.readLine();
				System.out.println("Enter password Name");
				String password = br.readLine();
				System.out.println("Enter emailId Name");
				String emailId = br.readLine();
				System.out.println("Enter dob Name");
				String dob = br.readLine();
				System.out.println("Enter pancard Name");
				String panCard = br.readLine();
				System.out.println("Enter aadhar Name");
				long aadhaarNumber = Long.parseLong(br.readLine());
				System.out.println("Enter postal Address Name");
				String postalAddress = br.readLine();
				System.out.println("Enter account Number Name");
				long accountNumber = Long.parseLong(br.readLine());
				System.out.println("Enter mobile Name");
				long mobileNumber = Long.parseLong(br.readLine());
				
				Account ac = new Account(firstName, lastName, userName, password, emailId, dob, panCard, aadhaarNumber, postalAddress, accountNumber, mobileNumber);
				System.out.println(ac);
				boolean isInserted = AccountDao.insertAccountToDB(ac);
				if(isInserted) {
					System.out.println("Account added successfully");
				}else {
					System.out.println("Something wrong happened");
				}
				break;
			
			case 2: 
				//Delete Account
				break;
			case 3:
				//Show balance
				break;
			case 4: 
				//exit
				break;
			}
		}
	}

}
