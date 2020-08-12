import java.sql.*;

class JdbcScrollable
{
	public static void main(String args[])
	{

		Connection con;
		Statement st;
		ResultSet rs;
		String s;


		try
		{

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:abc1");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

			


			s="select * from emp";
			rs=st.executeQuery(s);
			
			System.out.println("display record in forward direction");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			}
			
			rs.afterLast();
			System.out.println("display record in backward direction");
			
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				System.out.println();
			}
			 
			
			con.close();
			
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
	}
}
