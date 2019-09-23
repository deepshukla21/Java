package com.bridgelabz.webapplications;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String emailId = request.getParameter("emailId");
		String contactNo = request.getParameter("contactNo");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		
		System.out.println(firstName + " " + lastName + " " + username + " " + emailId + " " + contactNo +
				" " + gender + " " + password);
		boolean success = RegisterUser.insertUser(firstName, lastName, username, emailId, contactNo, gender, password);
//		if(success) {
//			out.println("User registered successfully");
//		}
//		else {
//			out.println("User already present");
//		}
		response.sendRedirect("Login.html");
	}

}
