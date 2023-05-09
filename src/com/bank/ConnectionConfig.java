package com.bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfig {
	
	static Connection con;

	public static Connection create() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "root";
			String password = "pass123";
			String url = "jdbc:mysql://localhost:3306/banking?useSSL=false";
			con = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
