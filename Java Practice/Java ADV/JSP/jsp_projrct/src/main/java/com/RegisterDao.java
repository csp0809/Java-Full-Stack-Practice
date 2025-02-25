package com;
import java.sql.*;
public class RegisterDao {
	public static int register(User u)
	{
	    Connection con;
	int status=0;  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","8451086651");  
	PreparedStatement ps=con.prepareStatement("insert into user432 values(?,?,?)");  
	ps.setString(1,u.getUname());  
	ps.setString(2,u.getUemail());  
	ps.setString(3,u.getUpass());  

	status=ps.executeUpdate();  
	}catch(Exception e){}  

	return status;  
	}  

	}  

