package com;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HrDao {
	public static int hr(User1 u) throws SQLException {
		
		Connection con = null;
	    PreparedStatement ps = null;
		int status=0;
		
		   try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "root", "8451086651");
		        String action = u.getAction();
		        if ("Insert".equals(action)) {
		            ps = con.prepareStatement("INSERT INTO USER84510 (id, name, email, pass, type, dept, date, week1, week2, week3, week4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		            ps.setString(1, u.getEid());
		            ps.setString(2, u.getEname());
		            ps.setString(3, u.getEemail());
		            ps.setString(4, u.getEpass());
		            ps.setString(5, u.getEtype());
		            ps.setString(6, u.getEdept());
		            ps.setString(7, u.getEdate());
		            ps.setString(8, u.getEweek1());
		            ps.setString(9, u.getEweek2());
		            ps.setString(10, u.getEweek3());
		            ps.setString(11, u.getEweek4());
		            ps.executeUpdate();
		            System.out.println("Record Inserted Successfully!");
		            

		        } else if ("Update".equals(action)) {
		            ps = con.prepareStatement("UPDATE USER84510 SET name=?, email=?, pass=?, type=?, dept=?, date=?, week1=?, week2=?, week3=?, week4=? WHERE id=?");
		            ps.setString(1, u.getEname());
		            ps.setString(2, u.getEemail());
		            ps.setString(3, u.getEpass());
		            ps.setString(4, u.getEtype());
		            ps.setString(5, u.getEdept());
		            ps.setString(6, u.getEdate());
		            ps.setString(7, u.getEweek1());
		            ps.setString(8, u.getEweek2());
		            ps.setString(9, u.getEweek3());
		            ps.setString(10, u.getEweek4());
		            ps.setString(11, u.getEid());
		            ps.executeUpdate();
		            System.out.println("Record Updated Successfully!");

		        } else if ("Delete".equals(action)) {
		           

		        } else if ("View".equals(action)) {
		            ps = con.prepareStatement("SELECT * FROM USER84510");
		            ResultSet rs = ps.executeQuery();
		            System.out.println("<h3>Users List:</h3><ul>");
		            while (rs.next()) {
		            	System.out.println("<li>" + rs.getString("name") + " - " + rs.getString("email") + "</li>");
		            }
		            System.out.println("</ul>");
		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		        System.out.println("Error: " + e.getMessage());
		    } finally {
		        if (ps != null) ps.close();
		        if (con != null) con.close();
		    }
		   return status;
	}
	public static List<User1> viewData()
	{
		
	List<User1> list=new ArrayList<User1>();
		Connection con = null;
	    PreparedStatement ps = null;
		int status=0;
		
		   try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "root", "8451086651");
		        ps = con.prepareStatement("SELECT * FROM USER84510");
		        ResultSet rs= ps.executeQuery();
		        while(rs.next())
		        {
		        	User1 u=new User1();
		        	u.setEid(rs.getString(1));
		        	u.setEname(rs.getString(2));
		        	u.setEemail(rs.getString(3));
		        	u.setEpass(rs.getString(4));
		        	u.setEtype(rs.getString(5));
		        	u.setEdept(rs.getString(6));
		        	u.setEdate(rs.getString(7));
		        	u.setEweek1(rs.getString(8));
		        	u.setEweek2(rs.getString(9));
		        	u.setEweek3(rs.getString(10));
		        	u.setEweek4(rs.getString(11));
		        	
		        	list.add(u);
		        }
		   }
		   catch (Exception e) {
		        e.printStackTrace();
		        System.out.println("Error: " + e.getMessage());
		    } 
		   return list;
	}
	public static int delete(int id)
	{
		Connection con = null;
	    PreparedStatement ps = null;
	    int status=0;
		
		   try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "root", "8451086651");
		        
		 ps = con.prepareStatement("DELETE FROM USER84510 WHERE id=?");
         ps.setInt(1, id);
         status=ps.executeUpdate();
         
		   }
		   catch (Exception e) {
		        e.printStackTrace();
		        System.out.println("Error: " + e.getMessage());
		    } 
		   return status;
	}
	public static int update(User1 u)
	{
		Connection con = null;
	    PreparedStatement ps = null;
	    int status=0;
		
		   try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "root", "8451086651");
		        
		        ps = con.prepareStatement("UPDATE USER84510 SET name=?, email=?, pass=?, type=?, dept=?, date=?, week1=?, week2=?, week3=?, week4=? WHERE id=?");
	            ps.setString(1, u.getEname());
	            ps.setString(2, u.getEemail());
	            ps.setString(3, u.getEpass());
	            ps.setString(4, u.getEtype());
	            ps.setString(5, u.getEdept());
	            ps.setString(6, u.getEdate());
	            ps.setString(7, u.getEweek1());
	            ps.setString(8, u.getEweek2());
	            ps.setString(9, u.getEweek3());
	            ps.setString(10, u.getEweek4());
	            ps.setString(11, u.getEid());
	           status= ps.executeUpdate();
         
		   }
		   catch (Exception e) {
		        e.printStackTrace();
		        System.out.println("Error: " + e.getMessage());
		    } 
		   return status;
	}
	public static User1 searchById(int id)
	{
		User1 u=new User1();
		Connection con = null;
	    PreparedStatement ps = null;
	    int status=0;
		
		   try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "root", "8451086651");
		        
		 ps = con.prepareStatement("select * FROM USER84510 WHERE id=?");
         ps.setInt(1, id);
         ResultSet rs= ps.executeQuery();
	        while(rs.next())
	        {
	        	
	        	u.setEid(rs.getString(1));
	        	u.setEname(rs.getString(2));
	        	u.setEemail(rs.getString(3));
	        	u.setEpass(rs.getString(4));
	        	u.setEtype(rs.getString(5));
	        	u.setEdept(rs.getString(6));
	        	u.setEdate(rs.getString(7));
	        	u.setEweek1(rs.getString(8));
	        	u.setEweek2(rs.getString(9));
	        	u.setEweek3(rs.getString(10));
	        	u.setEweek4(rs.getString(11));
	        	
	        	
	        }
         
		   }
		   catch (Exception e) {
		        e.printStackTrace();
		        System.out.println("Error: " + e.getMessage());
		    } 
		   return u;
	}
	
}
