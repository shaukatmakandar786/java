//read data from a file and display in reverse order

/*
import java.io.*;
class Display_Data_IN_Reverse_Order
{
	public static void main(String[] args)
	{
		File f1=new File(args[0]);
		if(f1.exists())
		{
		
			try
			{
				FileReader fr=new FileReader(args[0]);
				
				
				int len=(int)f1.length();
				char[] ch=new char[len];
				
				fr.read(ch);
				
				
				String s=new String(ch);
				StringBuffer sb=new StringBuffer(s);
				
				String rev=sb.reverse().toString();
				
				System.out.println("reverse string is"+rev);
				
				fr.close();
	
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{	
			System.out.println("file not found");
		}
	}
}
*/
