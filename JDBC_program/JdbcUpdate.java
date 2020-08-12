import java.sql.*;
import java.util.*;

class JdbcUpdate
{
	public static void main(String args[]) 
	{

		
		Connection con;
		Statement st;
		

		int no;
		String name;
		float sal;
		
		try
		{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:abc1");
			st=con.createStatement();

			Scanner sc=new Scanner(System.in);
			System.out.println("enter the details");
			no=sc.nextInt();
			name=sc.next();
			sal=sc.nextFloat();

			String s="update emp set ename=' "+name+" ',salary="+sal+" where eno="+no;
			int i=st.executeUpdate(s);
			if(i==1)
			{
				System.out.println("record updated......");
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
