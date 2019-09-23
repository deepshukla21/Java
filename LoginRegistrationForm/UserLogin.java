package com.bridgelabz.webapplications;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserLogin {
	
	public static boolean checkUser(String username , String password) {
		boolean userPresent = false;
		String query = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = Util.getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);
			resultSet = statement.executeQuery();
			if(resultSet.next()) {
				userPresent = true;
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(resultSet != null) {
					resultSet.close();
					resultSet = null;
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if(statement != null) {
					statement.close();
					statement = null;
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			try {
				if(connection != null) {
					connection.close();
					connection = null;
				}
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}		
		return userPresent;
	}
}
