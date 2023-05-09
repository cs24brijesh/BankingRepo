package com.bank.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bank.ConnectionConfig;
import com.bank.controller.SignUp;

public class LoginDao {
	public static boolean validate(String username, String password) {
		try {
			Connection con = ConnectionConfig.create();
			Statement st = con.createStatement();
			String q = "select * from login where username='"+username+"' and password='"+password+"'";

			ResultSet rs = st.executeQuery(q);
			if(rs.next()) {
				
				System.out.println("Successfully Logged In");
				return true;
			}else {
				SignUp signup = new SignUp();
				SignUp su = getInputParameter(signup);
				String suq = "insert into signup(first_name, last_name, email_id, mobile_number) values(?,?,?,?)";

				PreparedStatement ps = con.prepareStatement(q);
				ps.setString(1, su.getFirstName());
				ps.setString(2, su.getLastName());
				ps.setString(5, su.getEmail());
				ps.setLong(11, su.getMobileNumber());
				
				int a = ps.executeUpdate();
				System.out.println("=======: "+a);
				System.out.println("Successfully SignedUp");
				return true;
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	private static SignUp getInputParameter(SignUp signup) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your firstName: ");
		String firstName = sc.nextLine();
		System.out.println("Please enter your lastName: ");
		String lastName = sc.nextLine();
		System.out.println("Please enter your emailId: ");
		String emailId = sc.nextLine();
		System.out.println("Please enter your mobileNumber: ");
		long mobileNumber = Long.parseLong(sc.next());
		signup.setFirstName(firstName);
		signup.setLastName(lastName);
		signup.setEmail(emailId);
		signup.setMobileNumber(mobileNumber);
		return signup;
	}

}
