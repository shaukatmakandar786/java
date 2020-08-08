//Chatting application

import java.net.*;
import java.io.*;


class ServerChat
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket st=new ServerSocket(1182);
			Socket s=st.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String msg;
			
			while(true)
			{
				
				System.out.println("Server:");
				msg=br.readLine();
				dos.writeUTF(msg);
				if(msg.equalsIgnoreCase("bye"))
				{
					break;
				}
				msg=dis.readUTF();
				System.out.println("Client says..........:"+msg);
				if(msg.equalsIgnoreCase("bye"))
				{
					break;
				}
				
			}
			s.close();
			st.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
