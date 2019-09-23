package com.bridgelabz.webapplications;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
//	private static String url = "jdbc:mysql://localhost:3306/deep";    
//    private static String driverName = "com.mysql.cj.jdbc.Driver";   
//    private static String username = "root";   
//    private static String password = "Deep123";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/deep", "root", "Deep123");
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
//            System.out.println("Driver not found."); 
            ex.printStackTrace();
        }
        System.out.println(con);
        return con;
    }
}

