import java.sql.*;
import java.util.*;

class JdbcInsert
{
	public static void main(String args[]) 
	{

		
		Connection con;
		Statement st;
		

		int eno;
		String name;
		float sal;
		
		try
		{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:abc1");
			st=con.createStatement();

			Scanner sc=new Scanner(System.in);
			System.out.println("enter the details");
			eno=sc.nextInt();
			name=sc.next();
			sal=sc.nextFloat();

			String s="insert into emp values("+eno+",' "+name+" '," +sal+")";
			st.executeUpdate(s);
			System.out.println("record inserted......");

			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		

		
	}
}
