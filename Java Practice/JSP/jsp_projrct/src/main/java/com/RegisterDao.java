package com;
import java.sql.*;
public class RegisterDao {
	public static int register(User1 u)
	{
	    Connection con;
	int status=0;  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB","root","8451086651");  
	PreparedStatement ps=con.prepareStatement("insert into USER84510 (id , name , email , pass , type )values(?,?,?,?,?)");  
	ps.setString(1,u.getEid()); 	
	ps.setString(2,u.getEname());  
	ps.setString(3,u.getEemail());  
	ps.setString(4,u.getEpass());
	ps.setString(5,u.getEtype());
	

	status=ps.executeUpdate();  
	}catch(Exception e){}  

	return status;  
	}  

	}  

