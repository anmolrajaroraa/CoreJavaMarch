package com.company.billing.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.company.billing.utils.CommonDAO;

public class UserDAO {
	
	

	public boolean loginCheck(String email, String password) throws SQLException, ClassNotFoundException {
		ResultSet resultSet = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = CommonDAO.getConnection();
			preparedStatement = connection.prepareStatement("select userid from user_mst where email = ? and password = ?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			}
			else {
				return false;
			}
		}
		finally {
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}
	}
	
	public boolean isUserExists(String email) throws ClassNotFoundException, SQLException {
		ResultSet resultSet = null;
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection = CommonDAO.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select email from user_mst where email = '" + email + "'");
			if(resultSet.next()) {
				return true;
			}
			else {
				return false;
			}
		}
		finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
	}

	public boolean register(String userid, String email, String password) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Statement statement = null;
		
		try {
//		
			connection = CommonDAO.getConnection();
			statement = connection.createStatement();
			int recordsCount = statement.executeUpdate("insert into user_mst (userid, email, password) values ('" + userid + "', '" + email + "', '" + password + "'");
			
			if(recordsCount == 1) {
				return true;
			}
			else {
				return false;
			}
		}
		finally {
			statement.close();
			connection.close();
		}
		//                                                                              'ramkumar', 'ram@gmail.com', 'ram1234')
		
//		System.out.println("insert into user_mst (userid, email, password) values ('" + userid + "', '" + email + "', '" + password + "')" );
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		register("ramkumar", "ram@gmail.com", "ram1234");
//	}

}
