package com;
import java.sql.*;  
public class LoginDao {
	public static boolean validate(User bean){  
		boolean status=false;  
		try{  
		    Class.forName("com.mysql.cj.jdbc.Driver");
		   // System.out.println("welcome");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB","root","8451086651");

		PreparedStatement ps=con.prepareStatement(  
		    "select * from user432 where email=? and pass=?");  

		ps.setString(1,bean.getUemail());  
		ps.setString(2, bean.getUpass());  

		ResultSet rs=ps.executeQuery();  
		status=rs.next();  

		}catch(Exception e){}  

		return status;  

		}  

}
