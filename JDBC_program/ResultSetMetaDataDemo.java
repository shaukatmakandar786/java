import java.sql.*;

class ResultSetMetaDataDemo
{
		public static void main(String args[])
		{
			Connection con;
			ResultSet rs;
			ResultSetMetaData rsmd;
			Statement st;
			
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con=DriverManager.getConnection("jdbc:odbc:abc1");
				st=con.createStatement();
				
				rs=st.executeQuery("select * from emp");
				rsmd=rs.getMetaData();
				int c=rsmd.getColumnCount();
				System.out.println("Total columns="+c);
				
				for(int i=1;i<=c;i++)
				{
					System.out.println("column number="+i);	
					System.out.println("column name="+rsmd.getColumnName(i));	
					System.out.println("column type name="+rsmd.getColumnTypeName(i));	
					System.out.println("column display size="+rsmd.getColumnDisplaySize(i));	
				}
				
			}
			catch(Exception e)
			{
					System.out.println(e);
			}
		}
}
