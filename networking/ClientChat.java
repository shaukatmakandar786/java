//Chatting application

import java.net.*;

import java.io.*;

class ClientChat
{
	public static void main(String args[])
	{
		try
		{
			
			Socket s=new Socket("localhost",1182);
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			String msg;
			
			while(true)
			{
				msg=dis.readUTF();
				System.out.println("Server says..........:"+msg);
				if(msg.equalsIgnoreCase("bye"))
				{
					break;
				}
				System.out.println("Client:");
				msg=br.readLine();

				dos.writeUTF(msg);
				if(msg.equalsIgnoreCase("bye"))
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
