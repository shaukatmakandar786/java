//Client123.java

import java.net.*;
import java.io.*;
class ClientEcho{
	
	public static void main(String args[])
	{
		try
		{
			
			Socket s=new Socket("localhost",1285);
			

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String msg;
			
			while(true)
			{
				System.out.println("enter a msg");
				msg=br.readLine();
				
				dos.writeUTF(msg);
				System.out.println("waiting for echo msg");
				msg=dis.readUTF();
				System.out.println(msg);

				if(msg.equalsIgnoreCase("end"))
				{
					break;
				}
			}
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
