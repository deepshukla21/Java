package com.bridgelabz.webapplications;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String userRegex = "^[a-z0-9]{1,8}$";
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
		boolean login = false;
		
		// Validating data
		if(username.matches(userRegex) && password.matches(passwordRegex)) {
			
		 login = UserLogin.checkUser(username, password);
		}	    
	    if(login){
	    	out.println("Welcome " + username);        	
	    }
	    else {
	    	out.println("Username or password is incorrect");
	    }
	}

}
