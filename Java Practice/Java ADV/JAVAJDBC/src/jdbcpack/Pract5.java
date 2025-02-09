//delete data
package jdbcpack;
import java.sql.*;
public class Pract5 {

	public static void main(String args[])throws Exception
	{
		Connection con;
    	PreparedStatement ps;
    	ResultSet rs;
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iiht","root","8451086651");
    	ps=con.prepareStatement("delete from students  where id=?");
    	
    	ps.setInt(1, 11);
    	ps.executeUpdate();
    	//to show table
    	rs=ps.executeQuery("select * from students");
    	
    	while(rs.next()) 
    	{
    		System.out.print(rs.getString(1)+"\t");
    		System.out.print(rs.getString(2)+"\t");
    		System.out.println(rs.getString(3));
    		
    	}
    	}

	}