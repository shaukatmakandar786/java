/*
	print Server machine date on client machine

*/

import java.net.*;
import java.io.*;
import java.util.*;
class ClientDate{
	
	public static void main(String args[])
	{
		try
		{
			
			Socket s=new Socket("localhost",1285);
			DataInputStream dis=new DataInputStream(s.getInputStream());
			
			String date=dis.readUTF();
			System.out.println("Server date is:="+date);
			
			
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
