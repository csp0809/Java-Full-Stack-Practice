package com;

import java.sql.*;

public class HrDao {
	public static int hr(User1 u) {
		String action = request.getParameter();
		Connection con = null;
	    PreparedStatement ps = null;
		int status=0;
		
		   try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CompanyDB", "root", "password");

		        if ("Insert".equals(action)) {
		            ps = con.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)");
		            ps.setString(1, "John Doe");
		            ps.setString(2, "john@example.com");
		            ps.executeUpdate();
		            out.println("Record Inserted Successfully!");

		        } else if ("Update".equals(action)) {
		            ps = con.prepareStatement("UPDATE users SET email=? WHERE name=?");
		            ps.setString(1, "updated@example.com");
		            ps.setString(2, "John Doe");
		            ps.executeUpdate();
		            out.println("Record Updated Successfully!");

		        } else if ("Delete".equals(action)) {
		            ps = con.prepareStatement("DELETE FROM users WHERE name=?");
		            ps.setString(1, "John Doe");
		            ps.executeUpdate();
		            out.println("Record Deleted Successfully!");

		        } else if ("View".equals(action)) {
		            ps = con.prepareStatement("SELECT * FROM users");
		            ResultSet rs = ps.executeQuery();
		            out.println("<h3>Users List:</h3><ul>");
		            while (rs.next()) {
		                out.println("<li>" + rs.getString("name") + " - " + rs.getString("email") + "</li>");
		            }
		            out.println("</ul>");
		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		        out.println("Error: " + e.getMessage());
		    } finally {
		        if (ps != null) ps.close();
		        if (con != null) con.close();
		    }
	}
}
