/*display record from emp table*/

import java.sql.*;
import java.util.*;
class JdbcView
{
	public static void main(String args[])throws Exception
	{
		Connection con;
		PreparedStatement pst;
		int no;
		float sal;
		String s,name;

			Scanner sc=new Scanner(System.in);
			System.out.println("enter emp details");
			no=sc.nextInt();
			name=sc.next();
			sal=sc.nextFloat();
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:abc1");
			s="insert into emp values(?,?,?)";
			
			pst=con.prepareStatement(s);
			pst.setInt(1,no);
			pst.setString(2,name);
			pst.setFloat(3,sal);
			
			pst.executeUpdate();
			System.out.println("record inserted........");
			
			con.close();
				
	}
}
