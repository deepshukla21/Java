package com.bridgelabz.webapplications;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterUser {
	
	public static boolean insertUser(String firstName , String lastName , String username, String emailId, 
			String contactNo, String gender , String password)
	{
		System.out.println("RegisterUser.insertUser()");	
		boolean recordInserted = false;
		String query = "SELECT * FROM USER WHERE USERNAME = ? AND EMAILID = ?";
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = Util.getConnection();
			
			 statement = connection.prepareStatement(query);
			
			statement.setString(1, username);
			statement.setString(2, emailId);
			resultSet = statement.executeQuery();
			
			String insert = "INSERT INTO USER VALUES(? , ? , ? , ? , ? , ? , ?)";
			
			if(!(resultSet.next())) {
				recordInserted = true;
				try(PreparedStatement prepStatement = connection.prepareStatement(insert)){
					
					prepStatement.setString(1, firstName);
					prepStatement.setString(2,lastName);
					prepStatement.setString(3, username);
					prepStatement.setString(4, emailId);
					prepStatement.setString(5, contactNo);
					prepStatement.setString(6, gender);
					prepStatement.setString(7, password);
					prepStatement.executeUpdate();
					
				}catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		catch(SQLException ex) {
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
		
		return recordInserted;
	}

}
