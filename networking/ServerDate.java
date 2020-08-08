/*
	print Server machine date on client machine

*/

import java.net.*;
import java.io.*;
import java.util.*;

class ServerDate{
	
	public static void main(String args[])
	{
		try
		{
			
			ServerSocket st=new ServerSocket(1285);
			Socket s=st.accept();
			String date;

			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			
			Date d=new Date();
			
			date=d.toString();
			
			dos.writeUTF(date);
		
			st.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
