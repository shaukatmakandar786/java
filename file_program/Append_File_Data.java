// append one file data into another file accept file name from cmd


import java.io.*;
class Append_File_Data
{
	public static void main(String[] args)
	{
		File f1=new File(args[0]);
		if(f1.exists())
		{
		
			try
			{
				FileReader fr=new FileReader(args[0]);
				FileWriter fw=new FileWriter(args[1],true);
				
				int len=(int)f1.length();
				char[] ch=new char[len];
				
				fr.read(ch);
				
				fw.write(ch);
				
				
				fr.close();
				fw.close();
	
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
