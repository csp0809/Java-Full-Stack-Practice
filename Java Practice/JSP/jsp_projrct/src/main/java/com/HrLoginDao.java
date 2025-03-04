package com;
import java.sql.*;  
public class HrLoginDao {
	public static boolean validate(User bean){  
		boolean status=false;  
		try{  
		    Class.forName("com.mysql.cj.jdbc.Driver");
		   // System.out.println("welcome");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB","root","8451086651");

		PreparedStatement ps=con.prepareStatement(  
				"SELECT * FROM USER8451 WHERE id=? AND email=? AND pass=? AND type=?");  
		ps.setString(1, bean.getUid()); 
		ps.setString(2, bean.getUemail());  
		ps.setString(3, bean.getUpass());  
		ps.setString(4, bean.getType());  

		ResultSet rs=ps.executeQuery();  
		status=rs.next();  

		}catch(Exception e){}  

		return status;  

		}  

}
