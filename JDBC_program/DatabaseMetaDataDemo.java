import java.sql.*;
class DatabaseMetaDataDemo
{
		public static void main(String args[])
		{
			Connection con;
			ResultSet rs;
			DatabaseMetaData dbmd;
			
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con=DriverManager.getConnection("jdbc:odbc:abc1");
				dbmd=con.getMetaData();
				System.out.println("Database product name="+dbmd.getDatabaseProductName());
				System.out.println("Database product version="+dbmd.getDatabaseProductVersion());
				System.out.println("Database Driver name="+dbmd.getDriverName());
				System.out.println("Database version="+dbmd.getDriverVersion());
				System.out.println("Database user name="+dbmd.getUserName());
			}
			catch(Exception e)
			{
					System.out.println(e);
			}
		}
}
