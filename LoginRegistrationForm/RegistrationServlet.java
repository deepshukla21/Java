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
		
		
		String firstRegx = "^[A-Za-z]+$";
		String lastRegx = "^[A-Za-z]+$";
		String usernameRegx = "^[a-z0-9]{1,8}$";
		String emailIdRegx = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
		String contactNoRegx = "(0/91)?[7-9][0-9]{9}";
		String passwordRegx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
	
		boolean success = false;
		if((firstName.matches(firstRegx)) && (lastName.matches(lastRegx)) && (username.matches(usernameRegx)) && (emailId.matches(emailIdRegx))
				&& (contactNo.matches(contactNoRegx)) && (password.matches(passwordRegx))) {
			
			success = RegisterUser.insertUser(firstName, lastName, username, emailId, contactNo, gender, password);
		}
		if(success) {
			response.sendRedirect("Login.html");
		}
		else{
			out.println("Value present in fields are incorrect");
		}

				
		// If you directly want to show some response on browser related to user registration
//		if(success) {
//			out.println("User registered successfully");
//		}
//		else {
//			out.println("User already present");
//		}
		
	}

}
