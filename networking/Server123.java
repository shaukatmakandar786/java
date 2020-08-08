//Server123.java

import java.net.*;
import java.io.*;

class ServerEcho{
	
	public static void main(String args[])
	{
		try
		{
			System.out.println("waiting for request........");
			ServerSocket st=new ServerSocket(1285);
			Socket s=st.accept();
			System.out.println("Connected");

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String msg;
			
			while(true)
			{
				msg=dis.readUTF();
				Thread.sleep(2000);
				dos.writeUTF(msg);
				if(msg.equalsIgnoreCase("end"))
				{
					break;
				}
			}
			st.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
