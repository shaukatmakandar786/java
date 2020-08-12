import java.sql.*;
import java.util.*;

class JdbcDelete
{
	public static void main(String args[]) 
	{

		
		Connection con;
		Statement st;
		int no;
		
		try
		{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:abc1");
			st=con.createStatement();

			Scanner sc=new Scanner(System.in);
			System.out.println("enter no to be delete");
			no=sc.nextInt();
			

			String s="delete from emp where eno="+no;
			int i=st.executeUpdate(s);
			if(i==1)
			{
				System.out.println("record deleted......");
			}
			else
			{
				System.out.println("record not found......");
			}

			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		

		
	}
}
