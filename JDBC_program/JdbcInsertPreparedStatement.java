import java.sql.*;
import java.util.*;

class JdbcInsertPreparedStatement
{
	public static void main(String args[]) 
	{

		
		Connection con;
		PreparedStatement ps;
		

		int eno;
		String name;
		float sal;
		
		try
		{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:abc1");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the details");
			eno=sc.nextInt();
			name=sc.next();
			sal=sc.nextFloat();
			
			


			String s="insert into emp values(?,?,?)";
			ps=con.prepareStatement(s);
			ps.setInt(1,eno);
			ps.setString(2,name);
			ps.setFloat(3,sal);

			ps.executeUpdate();
			System.out.println("record inserted......");

			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		

		
	}
}
