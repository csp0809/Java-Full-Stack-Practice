package com;
import java.sql.*;  
public class LoginDao {
	public static boolean validate(User1 bean){  
		boolean status=false;  
		try{  
		    Class.forName("com.mysql.cj.jdbc.Driver");
		   // System.out.println("welcome");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB","root","8451086651");

		PreparedStatement ps=con.prepareStatement(  
				"select * from USER84510 where id=? and email=? and pass=?"); 
		
		ps.setString(1, bean.getEtype());
		ps.setString(2, bean.getEemail());  
		ps.setString(3, bean.getEpass());    

		ResultSet rs=ps.executeQuery();  
		status=rs.next();  

		}catch(Exception e){}  

		return status;  

		}  

}
