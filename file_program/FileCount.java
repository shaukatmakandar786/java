/*
write a program to read data from a file and append to another file
(use command line argument)
 
*/

import java.io.*;
class FileCount
{
	public static void main(String args[])
	{
		File f1=new File("sample.txt");
		
		if(f1.exists())
		{
			
			try
			{
				FileReader fr=new FileReader("sample.txt");
			
				int len=(int)f1.length();
				char ch[]=new char[len];
				fr.read(ch);
				
				String s=new String(ch);
				
				StringBuffer sb=new StringBuffer(s);
				
				System.out.println("reverse string is"+sb.reverse());
				
				
				
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








