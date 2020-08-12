import java.sql.*;
import java.util.*;

class JdbcDemo
{
	public static void main(String args[]) throws Exception
	{

	
		Connection con;
		Statement st;
		ResultSet rs;
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:abc1");
		st=con.createStatement();
		String s="insert into emp values("+104+",' "+"shaukat"+" '," +1000+")";
		int i=st.executeUpdate(s);
		System.out.println(i);


		rs=st.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));	
		}  	
		con.close();

		
	}
}
