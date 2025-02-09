//update data
package jdbcpack;
import java.sql.*;
public class Pract4 {

	public static void main(String args[])throws Exception
	{
		Connection con;
    	PreparedStatement ps;
    	ResultSet rs;
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iiht","root","8451086651");
    	ps=con.prepareStatement("update students set name=?,fees=? where id=?");
    	
    	ps.setString(1, "Chait");
    	ps.setInt(2, 9990);
    	ps.setInt(3, 11);
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

