package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/addit")
public class Servlet_add extends HttpServlet{

		
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	PrintWriter out=res.getWriter();
	
	
//	int a= Integer.parseInt(req.getParameter("v1"));
//	int b= Integer.parseInt(req.getParameter("v2"));
	String name=req.getParameter("name");
	String pass=req.getParameter("pass");
	
	
//	int c=a*b;
	
//	cookie in servlets
	
//Cookie cookie =new Cookie("name",name);	
//res.addCookie(cookie);

 
	HttpSession session=req.getSession();
	session.setAttribute("k", name);
	session.setAttribute("pass", pass);
	
	res.sendRedirect("servlet_02");
	
	//Session in java


	
	

	
	
	
	
	
//p.println(c);

}



}

