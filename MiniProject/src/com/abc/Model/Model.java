package com.abc.Model;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model
{
	// Declaring Instance Variables--> techincal word (FORUM BEANS) 
	String name;
	String uname;
	String pass;
	String drv="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String user="system";
	String password="oracle";
	Connection con;
	PreparedStatement psm;
	ResultSet rs;
	
	//Creating Zero parameterized Constructor
	public Model()
	{
		try
		{ 
			//Driver Loading and Getting Connection
			Class.forName(drv);
			con=DriverManager.getConnection(url, user, password);
		} 
		catch (Exception e)
		{
			System.out.println("Driver not Loaded and Connection Failed");
		}
		
	}
	
    //Creating  getRegister() Method
	public boolean getRegister()
	{
		try 
		{
			psm=con.prepareStatement("INSERT INTO PROJECT VALUES(?,?,?)");
			psm.setString(1, name);
			psm.setString(2, uname);
			psm.setString(3, pass);
			int rows = psm.executeUpdate();
			if(rows>0)
			{
				return true;
			}
			
		}
		catch (SQLException e) 
		{
			System.out.println("Query not Executed");
		}
		return false;
	}
	
	//Creating getLogin() Method
	public boolean getLogin()
	{
		 try 
		 {
			psm = con.prepareStatement("SELECT * FROM PROJECT WHERE uname=? AND password=?");
			psm.setString(1, uname);
			psm.setString(2, pass);
			rs = psm.executeQuery();
			if(rs.next()==true)
			{
				return true;
			}
		}
		 catch (SQLException e)
		 {
			System.out.println("Query not executed");
		}
		 return false;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public void setUname(String uname)
	{
		this.uname = uname;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}

	public String getName()
	{
		return name;
	}

	public String getUname()
	{
		return uname;
	}

	public String getPass()
	{
		return pass;
	}
}
