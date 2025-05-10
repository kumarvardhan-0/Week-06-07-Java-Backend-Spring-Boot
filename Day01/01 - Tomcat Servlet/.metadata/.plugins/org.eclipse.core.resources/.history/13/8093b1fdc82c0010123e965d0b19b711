package com.example;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet {
	private static final String USERNAME="admin";
	private static final String PASSWORD="1234";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(USERNAME.equals(username) && PASSWORD.equals(password)) {
			out.println("<h2>Login successful!</h2>");
		} else {
			out.println("<h2>Login failed. Invalid credentials.</h2>");
		}
	}
}