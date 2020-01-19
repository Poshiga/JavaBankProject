 package com.abc.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.Model.Model;

public class GetRegister extends HttpServlet
{
	public void service(HttpServletRequest x,HttpServletResponse y)
	{
	            String name = x.getParameter("name");
	           // Inside the braces ("name") --> Is name of the TextField given in the htmlfile as the Attribute Value.
	            String uname = x.getParameter("username");
	            String pass = x.getParameter("password");
	          //Creating object for model class
	            Model m = new Model();
	          //sets the parameter collected from user through getparameter method  
	            m.setName(name);
	            m.setUname(uname);
	            m.setPass(pass);
	            boolean val = m.getRegister();
	            if(val==true)
	            {
	            	try 
	            	{
						y.sendRedirect("/MiniProject/success.html");
					}
	            	catch (IOException e)
	            	{
						System.out.println("Unable to Redirect");
					}
	            }
	            else
	            {
	            	try 
	            	{
						y.sendRedirect("/MiniProject/Failure.html");
					}
	            	catch (IOException e)
	            	{
						System.out.println("Unable to Redirect");
					}
	            }
	           
	}
}