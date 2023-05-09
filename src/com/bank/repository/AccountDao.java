package com.bank.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bank.ConnectionConfig;
import com.bank.entity.Account;

public class AccountDao {

	public static boolean insertAccountToDB(Account ac) {
		boolean isInserted = false;
		try {
			Connection con = ConnectionConfig.create();
			String q = "insert into account(first_name, last_name, username, password, email_id, dob, pan_card,aadhar_card,postal_address,account_number, mobile_number) values(?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, ac.getFirstName());
			ps.setString(2, ac.getLastName());
			ps.setString(3, ac.getUserName());
			ps.setString(4, ac.getPassword());
			ps.setString(5, ac.getEmailId());
			ps.setString(6, ac.getDob());
			ps.setString(7, ac.getPanCard());
			ps.setLong(8, ac.getAadhaarNumber());
			ps.setString(9, ac.getPostalAddress());
			ps.setLong(10, ac.getAccountNumber());
			ps.setLong(11, ac.getMobileNumber());
			
			ps.executeUpdate();
			
			isInserted = true;
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isInserted;
	}
}
