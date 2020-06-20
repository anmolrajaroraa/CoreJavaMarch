package com.company.billing.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CommonDAO extends ConfigReader{
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
//		String dbUserID = "root";
//		String connectionString = "jdbc:mysql://localhost:3306/billingdb?serverTimezone=IST";
////		"https://google.com:443"
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver loaded");
//		Connection connection = DriverManager.getConnection(connectionString, dbUserID, null);
//		System.out.println("Connection established...");
		
		Class.forName(rb.getString(DRIVER));
		System.out.println("Driver loaded");
		Connection connection = DriverManager.getConnection(rb.getString(DBURL), rb.getString(USERID), rb.getString(PASSWORD));
				
		return connection;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(getConnection());
	}
	
}
