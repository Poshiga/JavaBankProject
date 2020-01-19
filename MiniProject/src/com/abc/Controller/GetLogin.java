package com.abc.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.Model.Model;

public class GetLogin extends HttpServlet
 {
	 public void service(HttpServletRequest x,HttpServletResponse y)
	 {
		 String uname = x.getParameter("username");
		 String pass = x.getParameter("password");
		 Model m = new Model();
		 m.setUname(uname);
		 m.setPass(pass);
		 boolean val = m.getLogin();
		 if(val==true)
		 {
			 try
			 {
				y.sendRedirect("/MiniProject/Lsuccess.html");
			 }
			 catch (IOException e)
			 {
				System.out.println("Unable to redirect");
			 }
		 }
			 else
			 {
				 try 
				 {
					y.sendRedirect("/MiniProject/Lfailed.html");
				 }
				 catch (IOException e)
				 {
					System.out.println("Unable to Redirect");
				 }
			 }
		 }
	 }
 
