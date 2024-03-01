package com.session;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/servlet_02")
public class Servlet_02 extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{

		
		//cookie managing code in java
//	int name=0;
//		Cookie[] cookie=req.getCookies();
//		for(Cookie c:cookie) {
//			if(c.getName().equals("name")){
//				name=c.getValue();
//				
//		}
//	}
		
		
		
//		session management in second servlets
		HttpSession session=req.getSession();
		String name=(String) session.getAttribute("k");
		String pass=(String) session.getAttribute("pass");
		
		PrintWriter p=res.getWriter();
		p.println("Your Beutiful Name is :"+name);
		p.println("Your Beutiful Password is :"+pass);
		
		
	}
	
}











//class 2




