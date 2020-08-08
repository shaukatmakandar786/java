import java.net.*;
import java.io.*;


public class Server
{
	public static void main(String args[])throws UnknownHostException ,IOException
	{
	ServerSocket ss = new ServerSocket(4444);
	System.out.println("Server Started");
	Socket s = ss.accept();
	System.out.println("Connected to client");
	}
}
