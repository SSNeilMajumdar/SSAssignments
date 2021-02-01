package com.ss.nmajumdar.week3.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * 
 * @author Neil Majumdar
 *
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String setUsername = "admin";
		String setPassword = "password";
		
		PrintWriter out = response.getWriter();
		
		out.println("<form action='/LoginForm/LoginServlet' method = 'POST'>");
		out.println("Username: <input type='text' name='username'/");
		out.println("</br></br>");
		out.println("Password: <input type='password' name='password'/");
		out.println("</br></br>");
		out.println("<input type='submit' value='Login'/");
		out.println("</form>");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//test sample username and password
		if(setUsername.equals(username) && setPassword.equals(password))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		}
		else
		{
			out.println("</br></br>");
			if((username != null) || (password != null))
			  out.println("Incorrect username or password");
		}
				
		
	}

}
