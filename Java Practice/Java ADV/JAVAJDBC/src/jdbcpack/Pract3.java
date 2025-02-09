package jdbcpack;
import java.sql.*;

public class Pract3 {
	public static void main (String args [])throws Exception
	{
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iiht","root","8451086651");
		ps=con.prepareStatement("insert into students values(?,?,?)");
		ps.setInt(1,11);
		ps.setString(2, "Chait");
		ps.setInt(3,11000);
		ps.executeUpdate();
		//to show table
		rs=ps.executeQuery("select * from students");
		
		while(rs.next())
		{
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getString(3)+"\t");
		}
	}
}
