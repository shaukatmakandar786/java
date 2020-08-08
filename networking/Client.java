import java.net.*;
import java.io.*;

public class Client
{
public static void main(String args[]) throws UnknownHostException,
IOException
{
Socket s = new Socket ("localhost", 4444);
System.out.println (s.getInetAddress());
System.out.println (s.getPort());
System.out.println (s.getLocalPort());
s.close();
}
}
